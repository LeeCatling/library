package com.lcatling

class BookReview {

	Book book
	Date datePublished
	Student student
	String review



    static constraints = {
	book blank:false, nullable:false
	datePublished blank:false, nullable:false
	student blank:false, nullable:false
	review blank:false, nullable:false, maxSize: 1000, widget:'textarea'
    }
}
