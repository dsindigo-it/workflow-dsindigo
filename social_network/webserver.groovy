@GrabConfig(systemClassLoader=true)
@Grab('org.eclipse.jetty.aggregate:jetty-server:8.1.9.v20130131')
@Grab('org.eclipse.jetty.aggregate:jetty-servlet:8.1.9.v20130131')
@Grab('javax.servlet:javax.servlet-api:3.0.1')
@Grab(group='com.h2database', module='h2', version='1.3.176')

import org.eclipse.jetty.server.Server
import org.eclipse.jetty.servlet.*
import groovy.servlet.*
import org.h2.server.web.WebServlet
import com.makingdevs.service.*

import static org.eclipse.jetty.servlet.ServletContextHandler.*
def server = new Server(1235)
def context = new ServletContextHandler(server, "/", SESSIONS)
context.resourceBase = "."
context.addServlet(WebServlet, "/dbconsole/*")
context.addServlet(GroovyServlet, "*.groovy")
server.start()

def sql = groovy.sql.Sql.newInstance("jdbc:h2:social_network","sa","sa","org.h2.Driver")

sql.execute("""
create table if not exists data(id integer primary key, campo varchar(255))
""")

sql.execute("""
CREATE TABLE IF NOT EXISTS user(
    id integer primary key,
    name varchar(255) NOT NULL,
    email varchar(50) NOT NULL UNIQUE,
    username varchar(50) NOT NULL UNIQUE
)
""")

def service = UserService.instance
service.getUsers()


