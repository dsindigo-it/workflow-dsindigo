package com.makingdevs.service

import com.makingdevs.model.Usuario
import java.util.List

interface UserService {
    def getUsers()
    def saveUser(Usuario user)
}
