package grails.backend

import grails.backend.*

class BootStrap {

    def init = { servletContext ->
        def adminRole = new Authority(authority:"ROLE_ADMIN").save(flush: true)
        def user1 = new User(username: "Charles", password: "1234").save(flush: true)

        UserAuthority.create(user1, adminRole)
    }
    def destroy = {
    }
}
