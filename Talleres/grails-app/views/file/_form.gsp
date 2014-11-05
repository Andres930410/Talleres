<%@ page import="talleres.File" %>



<div class="fieldcontain ${hasErrors(bean: fileInstance, field: 'fileType', 'error')} required">
	<label for="fileType">
		<g:message code="file.fileType.label" default="File Type" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="fileType" required="" value="${fileInstance?.fileType}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: fileInstance, field: 'content', 'error')} required">
	<label for="content">
		<g:message code="file.content.label" default="Content" />
		<span class="required-indicator">*</span>
	</label>
	<input type="file" id="content" name="content" />

</div>

