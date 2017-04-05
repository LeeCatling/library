<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Search</title>

    <asset:link rel="icon" href="favicon.ico" type="image/x-ico" />
</head>
<body>
	<div class="row">
		<h1>Library system</h1>
		<formset>
 	<legend>Search for Students</legend>
	<table>
 		<g:form action="results">
	<tr>
 		<td>Name</td>
 		<td><g:textField name="name" /></td>
 	</tr>
	<tr>
 		<td>Username</td>
 		<td><g:textField name="userName" /></td>
 	</tr>
	<tr>
		 <td>Student ID</td>
 		<td><g:textField name="studentID" /></td>
	 </tr>
	<tr>
		 <td>Query Type:</td>
		 <td><g:radioGroup name="queryType" labels="['And','Or','Not']"
		values="['and','or','not']" value="and" >
		${it.radio} ${it.label}
 		</g:radioGroup>
 		</td>
 	</tr>
	<tr>
 		<td/>
 		<td>
 		<g:submitButton name="search" value="Search" style="background-color:#aacaff"/></td>
 	</tr>
 		</g:form>
 	</table>
 		</formset>
	</div>
 </body>
</html>
