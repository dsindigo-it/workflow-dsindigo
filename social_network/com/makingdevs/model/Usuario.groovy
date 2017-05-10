package com.makingdevs.model

class Usuario {
  String userName
  String fullName
  String email
  Date dateCreated

  Usuario(userName, fullName, email){
    this.userName = userName
    this.fullName = fullName
    this.email = email
  }
}
