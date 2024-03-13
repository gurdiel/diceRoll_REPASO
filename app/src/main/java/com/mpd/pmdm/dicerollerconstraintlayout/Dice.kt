package com.mpd.pmdm.dicerollerconstraintlayout

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData

/**
 * Clase que modela un dado con un número de caras configurable
 */
class Dice(private val numSides: Int) {
    private val _currentSide = MutableLiveData<Int>(0)
    val currentSide: LiveData<Int> =_currentSide

    init {
        roll()
    }

    fun roll() {
         _currentSide.value = (1..numSides).random()
    }
}