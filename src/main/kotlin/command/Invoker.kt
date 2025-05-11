package org.example.command

class SimpleRemoteControl() {
    private var slot: Command? = null

    fun setCommand(command: Command) {
        slot = command
    }

    fun buttonWasPressed() {
        slot?.execute()
    }
}

class RemoteControl() {
    private val onCommands: MutableList<Command>
    private val offCommands: MutableList<Command>
    private var undoCommand: Command

    init {
        val noCommand = NoCommand()
        onCommands = mutableListOf(noCommand)
        offCommands = mutableListOf(noCommand)
        undoCommand = noCommand
    }

    fun setCommand(slot: Int, onCommand: Command, offCommand: Command) {
        onCommands[slot] = onCommand
        offCommands[slot] = offCommand
    }

    fun onButtonWasPushed(slot: Int) {
        onCommands[slot].execute()
        undoCommand = onCommands[slot]
    }

    fun offButtonWasPushed(slot: Int) {
        offCommands[slot].execute()
        undoCommand = offCommands[slot]
    }

    fun undoButtonWasPushed() {
        undoCommand.undo()
    }
}
