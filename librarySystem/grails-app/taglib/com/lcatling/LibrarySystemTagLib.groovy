package com.lcatling

class LibrarySystemTagLib {
    //static defaultEncodeAs = [taglib:'html']
   static encodeAsForTags = [tagName: [taglib:'html'], otherTagName: [taglib:'none']]

def loginToggle = {
out<<"<div style='margin: 15px 0 40px;'>"
if(request.getSession(false) && session.user){
out<<"<span style='float:left;margin-left:15px'>"
out<<"Welcome${session.user}."

if(session.role=='librarian') {
	out<<"</span><span style='float:right;megin-right:15px'>"
	out<<"<a href='${createLink(controller:'librarian',action:'logout')}'>"
	out<<" Librarian Logout</a></span>"
}
if(session.role=='student'){
	out << "</span><span style='float:right;megin-right:15px'>"
	out<<"<a href='${createLink(controller:'student',action:'logout')}'>"
	out<<"Logout</a></span>"
}

} else{
out<<"<span style='float:right;margin-right:10px'>"
out<<"<a href='${createLink(controller:'librarian',action:'login')}'>"
out<<" Librarian Login</a></span>"
out<<"<span style='float:right;margin-right:10px'>"
out<<"<a href='${createLink(controller:'student',action:'login')}'>"
out<<"Student Login</a></span>"
}
out<<"</div><br/>"
}
}
