package com.example.ludojackaroo

class CardDeck {
    private val cards = mutableListOf<Card>()

    init {
        repeat(4) { cards.add(Card(CardType.START)) }
        repeat(4) { cards.add(Card(CardType.SWITCH)) }
        repeat(4) { cards.add(Card(CardType.KILL)) }
        repeat(10) { i -> cards.add(Card(CardType.values()[i % 6])) }
        cards.shuffle()
    }

    fun drawCard(): Card = cards.removeAt(0)
}