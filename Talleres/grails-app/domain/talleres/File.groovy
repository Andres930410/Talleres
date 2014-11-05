package talleres

class File {
	String fileType
	byte [] content
	static belongsTo=[Post]
    static constraints = {
		fileType(blank:false,nullable:false,validator:{val->
			if(val==~/[A-Za-z-0-9]+\/[A-Za-z-0-9]+/){
				return true
			}else{
				return false
			}
			
		})
		content(blank:false,nullable:false,min:0,max:10*1024)
		
    }
}
