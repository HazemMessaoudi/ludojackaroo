package com.example.ludojackaroo

class Player(val name: String) {
    var position: Int = 0

    fun movePawn(steps: Int) {
        position += steps
    }

    fun launchPawn() {
        position = 1
    }

    fun attack() {
        // Logic to attack another player's pawn
    }
}