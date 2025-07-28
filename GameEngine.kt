package com.example.ludojackaroo

class GameEngine {
    val deck = CardDeck()
    val players = listOf(
        Player("Red"),
        Player("Blue"),
        Player("Green"),
        Player("Yellow")
    )
    var currentPlayerIndex = 0

    fun playTurn() {
        val card = deck.drawCard()
        val player = players[currentPlayerIndex]
        when (card.type) {
            CardType.START -> player.launchPawn()
            CardType.KILL -> player.attack()
            else -> player.movePawn(card.type.name.last().toString().toInt())
        }
        currentPlayerIndex = (currentPlayerIndex + 1) % players.size
    }
}