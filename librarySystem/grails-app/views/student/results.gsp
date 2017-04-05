<!doctype html>
<html>
<head>
    <meta name="layout" content="main"/>
    <title>Search</title>

    <asset:link rel="icon" href="favicon.ico" type="image/x-ico" />
</head>
<body>
<div class="row">
	<h1>Results</h1>
<h3>Search Result</h3>
<p>Searched
 for students matching <em>${term}</em>.
 Found <strong>${books.size()}</strong> books.
 </p>
<ul>
 <g:each var="book" in="${books}">
 <li><g:link controller="book" action="show"
id="${book.id}">${book.title}</g:link></li>
 </g:each>
 </ul>
 <g:link action='search'>Search Again</g:link>
</div>
</body>
</html>
