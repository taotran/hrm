package vn.com.ecopharma.hrm.util;

import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;

import javax.portlet.PortletRequest;

import org.json.JSONObject;

import com.liferay.portal.kernel.exception.PortalException;
import com.liferay.portal.kernel.exception.SystemException;
import com.liferay.portal.kernel.repository.model.FileEntry;
import com.liferay.portal.kernel.repository.model.FileVersion;
import com.liferay.portal.kernel.upload.UploadPortletRequest;
import com.liferay.portal.kernel.util.FileUtil;
import com.liferay.portal.kernel.util.MimeTypesUtil;
import com.liferay.portal.kernel.util.WebKeys;
import com.liferay.portal.service.ServiceContext;
import com.liferay.portal.service.ServiceContextFactory;
import com.liferay.portal.theme.ThemeDisplay;
import com.liferay.portal.util.PortalUtil;
import com.liferay.portlet.documentlibrary.model.DLFileEntry;
import com.liferay.portlet.documentlibrary.model.DLFolder;
import com.liferay.portlet.documentlibrary.service.DLAppServiceUtil;
import com.liferay.portlet.documentlibrary.service.DLFileEntryLocalServiceUtil;
import com.liferay.portlet.documentlibrary.service.DLFolderLocalServiceUtil;
import com.liferay.portlet.documentlibrary.util.DLUtil;
import com.liferay.portlet.documentlibrary.util.PDFProcessorUtil;

/**
 * @author TaoTran
 *
 */
public class HRMUtil {
	
	private static final String PREVIEW_FILE_INDEX="previewFileIndex";
	private static final String PREVIEW_FILE_COUNT="previewFileCount";
	private static final String PREVIEW_FILE_URL="previewFileURL";
	private static final String DOC_URL="docURL";
	
	/**
	 * @author TaoTran
	 * @param request
	 * @param inputFileId : html input field id
	 * @param title : file name
	 * @param description
	 * @param changeLog
	 * @param folderId
	 * @return DLFileEntry
	 * @throws PortalException
	 * @throws SystemException
	 * @throws IOException
	 */
	public static DLFileEntry uploadFileFromRequest(PortletRequest request,
			String inputFileId, String title, String description, String changeLog, long folderId)
			throws PortalException, SystemException, IOException {
		final ThemeDisplay themeDisplay = (ThemeDisplay) request
				.getAttribute(WebKeys.THEME_DISPLAY);

		final UploadPortletRequest uploadRequest = PortalUtil
				.getUploadPortletRequest(request);

		final File upload = uploadRequest.getFile(inputFileId);

		DLFileEntry fileEntry = null;
		String ext = FileUtil.getExtension(upload.getName());

		title = title + "-" + System.currentTimeMillis()
				+ "." + ext;

		byte[] fileBytes = FileUtil.getBytes(upload);

		InputStream is = new ByteArrayInputStream(fileBytes);
		DLFolder dlFolder = DLFolderLocalServiceUtil.getFolder(folderId);
		
		ServiceContext serviceContext = ServiceContextFactory.getInstance(
				DLFileEntry.class.getName(), request);

		fileEntry = DLFileEntryLocalServiceUtil.addFileEntry(
				themeDisplay.getUserId(), themeDisplay.getScopeGroupId(),
				themeDisplay.getScopeGroupId(), dlFolder.getFolderId(),
				title , MimeTypesUtil.getContentType(upload), title,
				description, changeLog, 0, null, upload, is, upload.length(),
				serviceContext);

		fileEntry = DLFileEntryLocalServiceUtil.updateFileEntry(
				themeDisplay.getUserId(), fileEntry.getFileEntryId(),
				title, MimeTypesUtil.getContentType(upload), title,
				description, changeLog, true, 0, null, upload, is, upload.length(),
				serviceContext);
		return fileEntry;
	}
	
	/**
	 * @param request
	 * @param inputFileId
	 * @param title
	 * @param description
	 * @param changeLog
	 * @param folderId
	 * @return
	 * @throws PortalException
	 * @throws SystemException
	 * @throws IOException
	 */
	public static DLFileEntry uploadFile(PortletRequest request, File file, String title, String description, String changeLog, long folderId)
			throws PortalException, SystemException, IOException {
		final ThemeDisplay themeDisplay = (ThemeDisplay) request
				.getAttribute(WebKeys.THEME_DISPLAY);

		DLFileEntry fileEntry = null;
		String ext = FileUtil.getExtension(file.getName());

		title = title + "-" + System.currentTimeMillis()
				+ "." + ext;

		byte[] fileBytes = FileUtil.getBytes(file);

		InputStream is = new ByteArrayInputStream(fileBytes);
		DLFolder dlFolder = DLFolderLocalServiceUtil.getFolder(folderId);
		
		ServiceContext serviceContext = ServiceContextFactory.getInstance(
				DLFileEntry.class.getName(), request);

		fileEntry = DLFileEntryLocalServiceUtil.addFileEntry(
				themeDisplay.getUserId(), themeDisplay.getScopeGroupId(),
				themeDisplay.getScopeGroupId(), dlFolder.getFolderId(),
				title , MimeTypesUtil.getContentType(file), title,
				description, changeLog, 0, null, file, is, file.length(),
				serviceContext);

		fileEntry = DLFileEntryLocalServiceUtil.updateFileEntry(
				themeDisplay.getUserId(), fileEntry.getFileEntryId(),
				title, MimeTypesUtil.getContentType(file), title,
				description, changeLog, true, 0, null, file, is, file.length(),
				serviceContext);
		return fileEntry;
	}
	
	/**
	 * @param dlFileEntry
	 * @return FileEntry
	 * @throws PortalException
	 * @throws SystemException
	 */
	public static FileEntry getUploadFileEntry(DLFileEntry dlFileEntry) throws PortalException, SystemException {
		return DLAppServiceUtil.getFileEntry(dlFileEntry.getGroupId(), dlFileEntry.getFolderId(), dlFileEntry.getTitle());
	}
	
	/**
	 * @param request
	 * @param fileEntryId
	 * @return
	 * @throws PortalException
	 * @throws SystemException
	 */
	public static JSONObject getFilePreviewInfo(PortletRequest request, long fileEntryId) throws PortalException, SystemException {
		final ThemeDisplay themeDisplay = (ThemeDisplay)request.getAttribute(WebKeys.THEME_DISPLAY);
		final DLFileEntry fileEntry = DLFileEntryLocalServiceUtil.getDLFileEntry(fileEntryId);
		final FileEntry fe = DLAppServiceUtil.getFileEntry(fileEntry.getFileEntryId());
		final FileVersion version = fe.getFileVersion();
		final String docURL = DLUtil.getPreviewURL(fe, version, themeDisplay, "");
		int previewFileCount = PDFProcessorUtil.getPreviewFileCount(version);
		String previewFileURL = docURL + "&previewFileIndex=";
		final JSONObject result = new JSONObject();
		result.put("previewFileCount", previewFileCount);
		result.put("previewFileURL", previewFileURL);
		result.put("initial", "1");
		result.put("docURL", docURL);
		return result;
	}
	
	
	/**
	 * @param s
	 * @return
	 */
	public static String replaceVietnameseLocaleChar(String s) {
		s = s.replace("á", "a");
		s = s.replace("ầ", "àa");
		s = s.replace("ấ", "a");
		s = s.replace("à", "a");
		s = s.replace("ạ", "a");
		s = s.replace("ã", "a");
		s = s.replace("â", "a");
		s = s.replace("ậ", "a");
		s = s.replace("ă", "a");
		s = s.replace("ắ", "a");
		s = s.replace("ằ", "a");
		s = s.replace("ả", "a");
		s = s.replace("ẵ", "a");
		s = s.replace("ặ", "a");
		
		s = s.replace("ó", "o");
		s = s.replace("ọ", "o");
		s = s.replace("ò", "o");
		s = s.replace("õ", "o");
		s = s.replace("ô", "o");
		s = s.replace("ố", "o");
		s = s.replace("ộ", "o");
		s = s.replace("ồ", "o");
		s = s.replace("ỗ", "o");
		
		s = s.replace("ơ", "u");
		s = s.replace("ớ", "u");
		s = s.replace("ợ", "u");
		s = s.replace("ờ", "u");
		s = s.replace("ỡ", "u");
		
		s = s.replace("ị", "i");
		s = s.replace("í", "i");
		s = s.replace("ì", "i");
		s = s.replace("ĩ", "i");
		
		s = s.replace("ũ", "u");
		s = s.replace("ụ", "u");
		s = s.replace("ù", "u");
		s = s.replace("ú", "u");
		s = s.replace("ư", "u");
		s = s.replace("ừ", "u");
		s = s.replace("ứ", "u");
		s = s.replace("ự", "u");
		
		s = s.replace("ê", "e");
		s = s.replace("ế", "e");
		s = s.replace("ệ", "e");
		s = s.replace("ề", "e");
		
		s = s.replace("đ", "d");
		
		return s;
	}
}
