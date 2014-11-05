package talleres

class User {
	String name
	String lastname
	int age
	String username
	String password
	
    static constraints = {
		name(size: 3..50,blank:false,nullable:false)
		lastname(size: 3..50,blank:false,nullable:false)
		age(min:13,blank:false,nullable:false)
		username(blank:false,nullable:false,unique:true)
		password(blank:false,nullable:false,validator:{val->
			if (val.length()<8){
				return false
			}
			def m1 = val ==~ /.*[A-Z].*/
			def m2 = val ==~ /.*[a-z].*/
			def m3 = val ==~ /.*[0-9].*/
			if (m1 && m2 && m3){
				return true
			}else{
				return false
			}
		})
		
		
    }
}
