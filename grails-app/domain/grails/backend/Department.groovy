package grails.backend

import grails.rest.*

import grails.plugin.springsecurity.annotation.Secured

@Secured('ROLE_ADMIN')
@Resource(uri='/api/department')
class Department {

    String departmentName

    static constraints = {
    }
}
