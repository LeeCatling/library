package com.lcatling

class BootStrap {

    def init = { servletContext ->
	def library1 = new Library(
		name: 'Adsetts',
		address: '34 sheffield way',
		openingHours: '9:00-23:00',
		location: 'Sheffiled',
		studySpaces: 50
	).save()

	def library2 = new Library(
		name: 'Owen Library',
		address: '78 book road',
		openingHours: '10:00-22:00',
		location: 'Sheffield',
		studySpaces: 34
	).save()

	def librarian1 = new Librarian(
		name: 'Shane Allen',
		email: 'ShaneAllen@mail.com',
		office: 'Adsetts-23',
		userName: 'ShaneAllen',
		password: 'password',
		telephone: '07657382909',
		library: library1
	).save()

	def librarian2 = new Librarian(
		name: 'Ryan Carpenter',
		email: 'RCarpenter@mail.com',
		office: 'Owen Library',
		userName: 'RyanCarpenter',
		password: 'password',
		telephone: '07364512976',
		library: library2
	).save()
	
	def course1 = new Course(
		title: 'Computing',
		code: '435',
		leader: 'Lynne Dawson',
		department: 'Computing',
		description: 'Computing Course',
		studyMode: 'full'
	).save()

	def course2 = new Course(
		title: 'Computer Science',
		code: '67',
		leader: 'Pete Peters',
		department: 'Computer Science',
		description: 'Computer Science Course',
		studyMode: 'full'
	).save()

	def student1 = new Student(
		name: 'Luke Greenwood',
		email: 'LGreenwood@mail.com',
		userName: 'LukeGreenwood',
		password: 'password',
		studentId: 'b5986743',
		course: course1,
		library: library1
	).save()

	def student2 = new Student(
		name: 'Sam Allen',
		email: 'SamAllen@mail.com',
		userName: 'SamAllen',
		password: 'password',
		studentId: 'b5084312',
		course: course2,
		library: library2
	).save()

	def book1 = new Book(
		title: 'computing for dummies',
		subject: 'Computing',
		author: 'S.S.Simpson',
		isbn: '435',
		dateBorrowed: new Date ('01/01/17'),
		returnDate: new Date('02/02/17'),
		student: student1,
		library: library1,
		overdue: false
	).save()

	def book2 = new Book(
		title: 'computer Science for dummies',
		subject: 'Computer Science',
		author: 'W.W.Willson',
		isbn: '5687',
		dateBorrowed: new Date ('02/02/17'),
		returnDate: new Date('03/03/17'),
		student: student2,
		library: library2,
		overdue: false
	).save()

	def bookReview1 = new BookReview(
		datePublished: new Date ('15/02/17'),
		student: student1,
		review: 'This book helped me alot',
		book: book1
	).save()

	def bookReview2 = new BookReview(
		datePublished: new Date ('10/03/17'),
		student: student2,
		review: 'I enjoyed this reading',
		book: book2
	).save()
	     
	     
    }
    def destroy = {
    }
}
