package talleres

class Post {
	String topic
	Date dateCreated
	Date lastUpdate
	boolean itsAllowed
	
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
}
