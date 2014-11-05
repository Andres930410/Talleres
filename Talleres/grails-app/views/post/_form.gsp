<%@ page import="talleres.Post" %>



<div class="fieldcontain ${hasErrors(bean: postInstance, field: 'topic', 'error')} required">
	<label for="topic">
		<g:message code="post.topic.label" default="Topic" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="topic" maxlength="50" required="" value="${postInstance?.topic}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: postInstance, field: 'lastUpdate', 'error')} required">
	<label for="lastUpdate">
		<g:message code="post.lastUpdate.label" default="Last Update" />
		<span class="required-indicator">*</span>
	</label>
	<g:datePicker name="lastUpdate" precision="day"  value="${postInstance?.lastUpdate}"  />

</div>

<div class="fieldcontain ${hasErrors(bean: postInstance, field: 'itsAllowed', 'error')} ">
	<label for="itsAllowed">
		<g:message code="post.itsAllowed.label" default="Its Allowed" />
		
	</label>
	<g:checkBox name="itsAllowed" value="${postInstance?.itsAllowed}" />

</div>

<div class="fieldcontain ${hasErrors(bean: postInstance, field: 'belognsForum', 'error')} required">
	<label for="belognsForum">
		<g:message code="post.belognsForum.label" default="Belogns Forum" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="belognsForum" name="belognsForum.id" from="${talleres.Forum.list()}" optionKey="id" required="" value="${postInstance?.belognsForum?.id}" class="many-to-one"/>

</div>

<div class="fieldcontain ${hasErrors(bean: postInstance, field: 'files', 'error')} ">
	<label for="files">
		<g:message code="post.files.label" default="Files" />
		
	</label>
	<g:select name="files" from="${talleres.File.list()}" multiple="multiple" optionKey="id" size="5" value="${postInstance?.files*.id}" class="many-to-many"/>

</div>

<div class="fieldcontain ${hasErrors(bean: postInstance, field: 'owner', 'error')} required">
	<label for="owner">
		<g:message code="post.owner.label" default="Owner" />
		<span class="required-indicator">*</span>
	</label>
	<g:select id="owner" name="owner.id" from="${talleres.Regular.list()}" optionKey="id" required="" value="${postInstance?.owner?.id}" class="many-to-one"/>

</div>

