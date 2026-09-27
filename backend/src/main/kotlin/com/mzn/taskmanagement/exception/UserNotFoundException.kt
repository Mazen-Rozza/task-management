package com.mzn.taskmanagement.exception

class UserNotFoundException(id: Int): RuntimeException ("User with id $id was not found")