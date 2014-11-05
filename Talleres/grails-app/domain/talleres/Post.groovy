package talleres

class Post {
	String topic
	Date dateCreated = new Date()
	Date lastUpdate
	boolean itsAllowed
	Regular owner
	Forum belognsForum	
	static belongsTo=[Regular,Forum]
	static hasMany=[files:File]
	
    static constraints = {
		topic(blank:false,nullable:false,size:3..50)
		dateCreated(blank:false,nullable:false,validator: {val->
			def date = new Date()
			if ( val.compareTo(date)<=0){
				return true
			}
			else
				return false
		})
		lastUpdate(blank:false,nullable:true,validator:{ val,obj ->
			val?.after(obj.dateCreated)
		})
		itsAllowed(blank:false,nullable:false)
    }
	def beforeInsert() {
		dateCreated = new Date()
	}
	def beforeUpdate(){
		lastUpdate =new Date()
	}
}
