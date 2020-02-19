package com.vimit.commands

import com.vimit.filesystem.State

class UnknownCommand extends Command{
  override def apply(state: State): State = state setMessage "unknown command"
}
