def engine   = new groovy.text.SimpleTemplateEngine()
def source   = getClass().classLoader.getResource('web/RegistroUsuario.html')
def template = engine.createTemplate(source)

println params

def model = [message: "Hello world ${new Date()}"]
out << template.make(model)