package grails.backend

class Rol {

    String rolName
    
    static belongsTo = [user: User]

    static constraints = {

    }
}
