<%@ taglib uri="http://liferay.com/tld/ui" prefix="liferay-ui"%>

<div class="hrm-modal modal preview-modal" id="preview-modal">
	<div class="modal-header">
		<button type="button" class="close" data-dismiss="modal">x</button>
		<span class="modal-title">Preview</span>
	</div>

	<div class="modal-body" id="previewInfo">
		<div class="lfr-preview-file" id="previewFile">
			<div class="lfr-preview-file-content" id="previewFileContent">
				<div class="lfr-preview-file-image-current-column">
					<div class="lfr-preview-file-image-container">
						<img class="lfr-preview-file-image-current" id="previewFileImage"
							src="${previewFileURL}${initial}" />
					</div>
					<span class="lfr-preview-file-actions hide" id="previewFileActions">
						<span class="lfr-preview-file-toolbar" id="previewToolbar"></span>
						<span class="lfr-preview-file-info"> <span
							class="lfr-preview-file-index" id="previewFileIndex">1</span> of
							<span class="lfr-preview-file-count" id='previewFileCount'>${previewFileCount}</span>
					</span>
					</span>
				</div>

				<div class="lfr-preview-file-images" id="previewImagesContent">
					<div class="lfr-preview-file-images-content"
						id="previewImagesContentSub"></div>
				</div>
			</div>
		</div>
	</div>
	<div class="modal-footer">
		<a type="button" class="btn btn-primary" id="preview_downloadLink">
			Download </a> <a href="#" class="btn" data-dismiss="modal"><liferay-ui:message
				key="global.button.cancel" /></a>
	</div>
</div>
