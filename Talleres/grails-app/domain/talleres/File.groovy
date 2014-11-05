package talleres

class File {
	String fileType
	byte [] content
	int size
	static belongsTo=[Post]
    static constraints = {
		fileType(blank:false,nullable:false,validator:{val->
			if(val==~/[A-Za-z-0-9]+\/[A-Za-z-0-9]+/){
				return true
			}else{
				return false
			}
			
		})
		content(blank:false,nullable:false)
		size(blank:false,nullable:false,max:10*1024)
    }
	static mapping = {
		post column: "post_belongs_id"
	}
}
