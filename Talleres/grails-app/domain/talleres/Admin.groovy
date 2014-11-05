package talleres

class Admin extends User{
	int level
	int rating
    static constraints = {
		level(blank:false,nullable:false,min:0,max:5)
		rating(blank:false,nullable:false,min:0,max:100) 
    }
}
