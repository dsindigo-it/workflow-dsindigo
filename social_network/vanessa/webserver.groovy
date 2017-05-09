@Grab('org.eclipse.jetty:jetty-server:9.4.5.v20170502')
@Grab('org.eclipse.jetty:jetty-servlet:9.4.5.v20170502')
@Grab('javax.servlet:javax.servlet-api:3.1.0')
import org.eclipse.jetty.server.Server
import org.eclipse.jetty.servlet.*
import groovy.servlet.*

import static org.eclipse.jetty.servlet.ServletContextHandler.*
def server = new Server(1234)
def context = new ServletContextHandler(server, "/", SESSIONS)
context.resourceBase = "."
context.addServlet(GroovyServlet, "*.groovy")
server.start()
