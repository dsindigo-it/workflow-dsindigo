import com.makingdevs.service.*
import com.makingdevs.model.Usuario

def engine   = new groovy.text.SimpleTemplateEngine()
def source   = getClass().classLoader.getResource('web/RegistroUsuario.html')
def template = engine.createTemplate(source)

def userService = UserService.instance;
def model

if(params.userName && params.fullName && params.email){
    def users = userService.getUsers()

    def usuario = new Usuario(params)
    userService.saveUser(usuario)
    model = [message: "El usuario se agregó correctamente"]


}


out << template.make(model)