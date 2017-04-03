package librarysystem

class BootStrap {

    def init = { servletContext ->

def book=new Book(title: 'Defining Issues in English Language Teaching',
	subject:'English',
	author:'H.G.Widowson',
	isbn:'3543507', 
	dateBorrowed: new Date('20/03/2017'),
	returnDate: new Date('22/03/2017'),
	student: student1
	overdue: false,
	library:'library').save()

    
    }
    def destroy = {
    }
}
