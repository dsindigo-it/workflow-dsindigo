def engine   = new groovy.text.SimpleTemplateEngine()
def source   = getClass().classLoader.getResource('post.html')
def template = engine.createTemplate(source)
def model = [message: "Hello world ${new Date()}"]
out << template.make(model)
