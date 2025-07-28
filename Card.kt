package com.example.ludojackaroo

enum class CardType {
    MOVE_1, MOVE_2, MOVE_3, MOVE_4, MOVE_5, MOVE_6,
    START, SWITCH, BLOCK, KILL
}

data class Card(val type: CardType)