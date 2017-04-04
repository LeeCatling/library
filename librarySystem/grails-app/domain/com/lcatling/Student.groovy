package com.lcatling

class Student {
	
	String name
	String email
	String userName
	String password
	String studentId
	Course course
	Library library

static hasMany=[bookReviews:BookReview, books:Book]

    static constraints = {
	
	name blank:false, nullable:false
	email blank:false, nullable:false, email:true
	userName blank:false, nullable:false, unique:true
	password blank:false, nullable:false, password:true
	studentId blank:false, nullable:false
	course blank:false, nullable:false
    }
}
