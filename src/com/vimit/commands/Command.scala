package com.vimit.commands

import com.vimit.filesystem.State

trait Command {

  def apply(state:State):State

}

object Command {

  def EmptyCommand = new Command {
    override def apply(state: State): State = state
  }

  def InvalidCommand(str: String) = new Command {
    override def apply(state: State): State = state setMessage str+": invalid command"
  }

  def from(value: String) = {
    val tokens = value.split(" ")
    if(value.isEmpty) EmptyCommand
    else if(tokens.length == 1) InvalidCommand(tokens(0))
    else if(tokens.length == 2 && tokens(0).equals("mkdir")) new MkDirCommand(tokens(1))
    else new UnknownCommand


  }
}
