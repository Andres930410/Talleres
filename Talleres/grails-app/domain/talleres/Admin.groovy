package talleres

class Admin extends User{
	int level
	int rating
	static hasMany=[forums:Forum]
    static constraints = {
		level(blank:false,nullable:false,min:0,max:5)
		rating(blank:false,nullable:false,min:0,max:100) 
    }
	static mapping = {
		sort level: "desc"
	}
}
