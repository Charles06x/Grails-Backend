package grails.backend

import grails.rest.*

@Resource(uri='/Users', formats=['json', 'xml']) //Gives priority to json format for the response.
class User {
    
    String name
    String pwd
    String code
    Rol rol

    static constraints = {
    }
}
