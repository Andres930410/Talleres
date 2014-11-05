package talleres

class Post {
	String topic
	Date dateCreated
	Date lastUpdate
	boolean itsAllowed
	Regular owner
	Forum belognsForum	
	static belongsTo=[Regular,Forum]
	static hasMany=[files:File]
	
    static constraints = {
		topic(blank:false,nullable:false,size:3..50)
		dateCreated(blank:false,nullable:false,validator: {
			Date date = new Date()
			if ( dateCreated.compareTo(date) > 0)
				return true
			else
				return false
		})
		lastUpdate(blank:false,nullable:false,validator:
		{
			Date date = new Date()
			if ( lastupdate.compareTo(date) > 0)
				return true
			else
				return false
		})
		itsAllowed(blank:false,nullable:false)
    }
	static mapping = {
		regular column: "owner_id"
		forum column: "fatherForum_id"
	}
	
	def beforeUpdate(){
		lastUpdate = new Date();
	}
	
	def beforeDelete() {
		files.removeAll(files)
	}
	
	def beforeInsert() {
		if (dateCreated == NULL_DATE) {
		   dateCreated = new Date()
		}
	}
}
