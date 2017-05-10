import com.makingdevs.model.Usuario
def engine   = new groovy.text.SimpleTemplateEngine()
def source   = getClass().classLoader.getResource('welcome_page.html')
def template = engine.createTemplate(source)
Usuario usuario = new Usuario()
  usuario.userName = "usernametest"
  usuario.fullName = "Usuario full name"
  usuario.email = "usuario@servidorusuarios.com"
  usuario.dateCreated = new Date()

def model = [userfullname: "${usuario.fullName}"]
out << template.make(model)
