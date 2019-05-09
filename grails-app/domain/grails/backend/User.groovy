package grails.backend

class User {
    
    String name
    String pwd
    String code
    Rol rol

    static constraints = {
        password nullable: false, blank: false, password: true
        username nullable: false, blank: false, unique: true
    }

    static mapping = {
	    password column: '`password`'
    }
}
