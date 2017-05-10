package com.makingdevs.service

import com.makingdevs.model.Usuario

@Singleton
class UserService {
    def sql = groovy.sql.Sql.newInstance("jdbc:h2:social_network","sa","sa","org.h2.Driver")

    def getUsers() {
        def users = []
        sql.eachRow("SELECT * FROM user") {
            Usuario user = new Usuario()
            user.userName = it.username
            user.fullName = it.name
            user.email = it.email
            user.dateCreated = it.created
            users.add user
        }
        users
    }

    def saveUser(Usuario user) {
        user.dateCreated = new Date()

        sql.execute """
            INSERT INTO user(username, name, email, created) 
                VALUES ($user.userName, $user.fullName, $user.email, $user.dateCreated)
        """
    }
}
