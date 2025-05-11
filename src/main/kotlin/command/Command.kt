package org.example.command

interface Command {
    fun execute()

    fun undo()
}

class NoCommand : Command {
    override fun execute() {}

    override fun undo() {}
}

class LightOnCommand(
    private val light: Light,
) : Command {
    override fun execute() {
        light.on()
    }

    override fun undo() {
        light.off()
    }
}

class LightOffCommand(
    private val light: Light,
) : Command {
    override fun execute() {
        light.off()
    }

    override fun undo() {
        light.on()
    }
}

//class GarageDoorUpCommand(
//    private val door: GarageDoor,
//) : Command {
//    override fun execute() {
//        door.up()
//    }
//}
