import grails.backend.UserPasswordEncoderListener
import grails.backend.cors.CorsFilter

beans = {
    userPasswordEncoderListener(UserPasswordEncoderListener)
    corsFilter(CorsFilter)
}
