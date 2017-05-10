package com.makingdevs.service

import com.makingdevs.model.Usuario

@Singleton
class UserService {
    def sql = groovy.sql.Sql.newInstance("jdbc:h2:social_network","sa","sa","org.h2.Driver")

    def getUsers() {
     //   sql.eachRow("SELECT * FROM user") {
     //       println new Usuario(it)
     //   }
    }
}
