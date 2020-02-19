package com.vimit.filesystem

import java.util.Scanner

import com.vimit.commands.Command
import com.vimit.files.Directory

object Boot extends App {

  val scanner = new Scanner(System.in)
  val root = Directory.ROOT

  var state = State(root,  root)

  while(true) {
    state.show
    val nextValue = scanner.next()
    state = Command.from(nextValue).apply(state)

  }

}
