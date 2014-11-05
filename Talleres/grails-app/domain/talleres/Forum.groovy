package talleres

class Forum {
	String name
	Date dateCreated
	String category
	static hasMany=[posts:Post]
	static belongsTo=[Admin]
    static constraints = {
		name(blank:false,nullable:false,unique:true,size:3..20)
		category(blank:false,nullable:false,size:3..15)
		dateCreated(blank:false,nullable:false,validator: {
			Date date = new Date()
			if ( dateCreated.compareTo(date) > 0)
				return true
			else
				return false
		})
		
    }
}
