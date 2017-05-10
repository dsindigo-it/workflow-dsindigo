import com.makingdevs.service.*
import com.makingdevs.model.Usuario

def engine   = new groovy.text.SimpleTemplateEngine()
def source   = getClass().classLoader.getResource('web/RegistroUsuario.html')
def template = engine.createTemplate(source)

def userService = UserService.instance;

if(params.userName && params.fullName && params.email){
    def usuario = new Usuario(params.userName, params.fullName, params.email)
    userService.saveUser(usuario)
}

def model = [message: "Hello world ${new Date()}"]
out << template.make(model)