package com.vimit.commands

import com.vimit.filesystem.State

trait Command {

  def apply(state:State):State

}

object Command {
  def from(value: String) = new UnknownCommand
}
