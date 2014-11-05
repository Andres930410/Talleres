package talleres

class Regular extends User {
	int postViews
	int strikesNumber
	int startNumber
    static constraints = {
		postViews(blank:false,nullable:false,min:0)
		strikesNumber(blank:false,nullable:false,min:0,max:3)
		startNumber(blank:false,nullable:false,min:0,max:5)
    }
}
