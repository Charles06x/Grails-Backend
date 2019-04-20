package grails.backend

import grails.rest.*

@Resource(uri='/Rols', formats=['json', 'xml']) //Gives priority to json format for the response.
class Rol {

    String rolName
    
    static belongsTo = [user: User]

    static constraints = {

    }
}
