<%@ page import="talleres.Regular" %>



<div class="fieldcontain ${hasErrors(bean: regularInstance, field: 'name', 'error')} required">
	<label for="name">
		<g:message code="regular.name.label" default="Name" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="name" maxlength="50" required="" value="${regularInstance?.name}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: regularInstance, field: 'lastname', 'error')} required">
	<label for="lastname">
		<g:message code="regular.lastname.label" default="Lastname" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="lastname" maxlength="50" required="" value="${regularInstance?.lastname}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: regularInstance, field: 'age', 'error')} required">
	<label for="age">
		<g:message code="regular.age.label" default="Age" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="age" type="number" min="13" value="${regularInstance.age}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: regularInstance, field: 'username', 'error')} required">
	<label for="username">
		<g:message code="regular.username.label" default="Username" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="username" required="" value="${regularInstance?.username}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: regularInstance, field: 'password', 'error')} required">
	<label for="password">
		<g:message code="regular.password.label" default="Password" />
		<span class="required-indicator">*</span>
	</label>
	<g:textField name="password" required="" value="${regularInstance?.password}"/>

</div>

<div class="fieldcontain ${hasErrors(bean: regularInstance, field: 'postViews', 'error')} required">
	<label for="postViews">
		<g:message code="regular.postViews.label" default="Post Views" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="postViews" type="number" min="0" value="${regularInstance.postViews}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: regularInstance, field: 'strikesNumber', 'error')} required">
	<label for="strikesNumber">
		<g:message code="regular.strikesNumber.label" default="Strikes Number" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="strikesNumber" type="number" min="0" max="3" value="${regularInstance.strikesNumber}" required=""/>

</div>

<div class="fieldcontain ${hasErrors(bean: regularInstance, field: 'startNumber', 'error')} required">
	<label for="startNumber">
		<g:message code="regular.startNumber.label" default="Start Number" />
		<span class="required-indicator">*</span>
	</label>
	<g:field name="startNumber" type="number" min="0" max="5" value="${regularInstance.startNumber}" required=""/>

</div>

