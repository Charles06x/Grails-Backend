package grails.backend

<<<<<<< HEAD
import groovy.transform.EqualsAndHashCode
import groovy.transform.ToString
import grails.compiler.GrailsCompileStatic

@GrailsCompileStatic
@EqualsAndHashCode(includes='username')
@ToString(includes='username', includeNames=true, includePackage=false)
class User implements Serializable {

    private static final long serialVersionUID = 1

    String username
    String password
    boolean enabled = true
    boolean accountExpired
    boolean accountLocked
    boolean passwordExpired

    Set<Authority> getAuthorities() {
        (UserAuthority.findAllByUser(this) as List<UserAuthority>)*.authority as Set<Authority>
    }
=======
class User {
    
    String name
    String pwd
    String code
    Rol rol
>>>>>>> parent of 90b4a7f... Convert domains into rest resources, and allow publicKeyRetrieval.

    static constraints = {
        password nullable: false, blank: false, password: true
        username nullable: false, blank: false, unique: true
    }

    static mapping = {
	    password column: '`password`'
    }
}
