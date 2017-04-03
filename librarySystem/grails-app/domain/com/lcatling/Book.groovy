package com.lcatling

class Book {
	
	String tittle
	String subject
	String author
	String isbn
	Date dateBorrowed
	Date returnDate
	Student student
	Library library
	Boolean overdue
static hasMany=[bookReviews:BookReview]


    static constraints = {
	
	title blank:false, nullable:false
	subject blank:false, nullable:false
	author blank:false, nullable:false
	isbn blank:false, nullable:false
	dateBorrowed blank:false, nullable:false
	returnDate blank:false, nullable:false
	student blank:false, nullable:false
	overdue blank:false, nullable:false
    }
}
