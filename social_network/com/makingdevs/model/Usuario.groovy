package com.makingdevs.model

class Usuario {
  String userName
  String fullName
  String email
  Date dateCreated

  Usuario(userName, fullName, email, dateCreated){
    this.userName = userName
    this.fullName = fullName
    this.email = email
    this.dateCreated = dateCreated
  }
}
