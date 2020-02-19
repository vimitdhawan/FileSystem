package com.vimit.filesystem

import com.vimit.files.Directory

class State(val root: Directory, val currentDirectory: Directory, val output: String) {

  def show = {
    println(output)
    print(State.SHELL_TOKEN)
  }

  def setMessage(message: String) = State(root, currentDirectory, message)

}

object State {
  val SHELL_TOKEN ="$ "

  def apply(root: Directory, currentDirectory: Directory, output: String = ""): State = new State(root, currentDirectory, output)
  
}