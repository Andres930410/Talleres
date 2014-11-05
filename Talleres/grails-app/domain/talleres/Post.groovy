package talleres

class Post {
	String topic
	Date dateCreated
	Date lastUpdate
	boolean itsAllowed
	
    static constraints = {
		topic(blank:false,nullable:false,size:3..50)
		dateCreated(blank:false,nullable:false)
		lastUpdate(blank:false,nullable:false)
		itsAllowed(blank:false,nullable:false)
    }
}
