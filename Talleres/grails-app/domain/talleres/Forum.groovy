package talleres

class Forum {
	String name
	Date dateCreated
	String category
    static constraints = {
		name(blank:false,nullable:false,unique:true,size:3..20)
		category(blank:false,nullable:false,size:3..15)
		
    }
}
