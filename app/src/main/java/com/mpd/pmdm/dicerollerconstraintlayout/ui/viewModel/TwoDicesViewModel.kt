package com.mpd.pmdm.dicerollerconstraintlayout.ui.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.mpd.pmdm.dicerollerconstraintlayout.ui.views.Dice

class TwoDicesViewModel(sides: Int): ViewModel() {

    private val dice1 = Dice(sides)
    private val dice2 = Dice(sides)

    val currentSideDice1 = dice1.currentSide
    val currentSideDice2 = dice2.currentSide

    fun rollDice(){
        dice1.roll()
        dice2.roll()
    }
}
class TwoDicesViewModelFactory(val caras: Int): ViewModelProvider.Factory{
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        @Suppress("UNCHECKED_CAST")
        if(modelClass.isAssignableFrom(TwoDicesViewModel::class.java))
            return TwoDicesViewModel(caras) as T
        throw IllegalArgumentException("ModelClass Is Not an instance of TwoDicesViewModel")
    }
}