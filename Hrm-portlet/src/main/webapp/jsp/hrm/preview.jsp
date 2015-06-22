<%@page import="com.liferay.portlet.documentlibrary.service.DLAppLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.util.ParamUtil"%>
<%@page import="com.liferay.portlet.documentlibrary.util.DLUtil"%>
<%@page import="com.liferay.portal.kernel.util.WebKeys"%>
<%@page import="com.liferay.portal.theme.ThemeDisplay"%>
<%@page
	import="com.liferay.portlet.documentlibrary.util.PDFProcessorUtil"%>
<%@page import="com.liferay.portal.kernel.repository.model.FileVersion"%>
<%@page
	import="com.liferay.portlet.documentlibrary.service.DLAppServiceUtil"%>
<%@page
	import="com.liferay.portlet.documentlibrary.service.DLFileEntryLocalServiceUtil"%>
<%@page import="com.liferay.portal.kernel.repository.model.FileEntry"%>
<%@page import="com.liferay.portlet.documentlibrary.model.DLFileEntry"%>
<%@taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui"%>
<%@include file="init.jsp"%>

<% 
	final ThemeDisplay themeDisplay = (ThemeDisplay)renderRequest.getAttribute(WebKeys.THEME_DISPLAY);
	final long dlFileEntryId = ParamUtil.getLong(renderRequest, "fileEntryId");
	System.out.println("Entry ID : " + dlFileEntryId);
	final DLFileEntry fileEntry = DLFileEntryLocalServiceUtil.getDLFileEntry(dlFileEntryId);
	final FileEntry fe = DLAppServiceUtil.getFileEntry(fileEntry.getFileEntryId());
	final FileVersion version = fe.getFileVersion();
	final String docURL = DLUtil.getPreviewURL(fe, version, themeDisplay, "");
	System.out.println(docURL);
	int previewFileCount = PDFProcessorUtil.getPreviewFileCount(version);
	System.out.println(previewFileCount);
	String previewFileURL = docURL + "&previewFileIndex=";
	System.out.println(previewFileURL);
	renderRequest.setAttribute("previewFileCount", previewFileCount);
	renderRequest.setAttribute("previewFileURL", previewFileURL);
	renderRequest.setAttribute("initial", "1");
	renderRequest.setAttribute("docURL", docURL);
%>

<div class="lfr-preview-file" id="previewFile">
	<div class="lfr-preview-file-content" id="previewFileContent">
		<div class="lfr-preview-file-image-current-column">
			<div class="lfr-preview-file-image-container">
				<img class="lfr-preview-file-image-current" id="previewFileImage"
					src="${previewFileURL}${initial}" />
			</div>
			<span class="lfr-preview-file-actions hide" id="previewFileActions">
				<span class="lfr-preview-file-toolbar" id="previewToolbar"></span> <span
				class="lfr-preview-file-info"> <span
					class="lfr-preview-file-index" id="previewFileIndex">1</span> of <span
					class="lfr-preview-file-count">${previewFileCount}</span>
			</span>
			</span>
		</div>

		<div class="lfr-preview-file-images" id="previewImagesContent">
			<div class="lfr-preview-file-images-content"></div>
		</div>
	</div>
</div>
<div class="btn-group">
	<a href="${docURL}" type="button">Download</a>
	<button type="button" onclick="close()">Close</button>
</div>
<script>

AUI().use('liferay-preview', function(A) {
    new Liferay.Preview(
                                {
                                                actionContent: '#previewFileActions',
                                                baseImageURL: '${previewFileURL}',
                                                boundingBox: '#previewFile',
                                                contentBox: '#previewFileContent',
                                                currentPreviewImage: '#previewFileImage',
                                                imageListContent: '#previewImagesContent',
                                                maxIndex: ${previewFileCount},
                                                previewFileIndexNode: '#previewFileIndex',
                                                toolbar: '#previewToolbar'
                                }
                ).render();
});
</script>
