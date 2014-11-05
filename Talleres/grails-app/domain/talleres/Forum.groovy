package talleres

class Forum {
	String name
	Date dateCreated = new Date()
	String category
	static hasMany=[posts:Post]
	static belongsTo=[Admin]
    static constraints = {
		name(blank:false,nullable:false,unique:true,size:3..20)
		category(blank:false,nullable:false,size:3..15)
		dateCreated(blank:false,nullable:false,validator: { val ->
			def date = new Date()
			if ( val.compareTo(date)<=0 ){
				val = date
				return true
			}
			else{
				return false
			}
		})
		
    }
	def beforeInsert() {
		dateCreated = new Date()
		
	}
	def beforeDelete() {
		posts.removeAll(posts)
	}
	
}
