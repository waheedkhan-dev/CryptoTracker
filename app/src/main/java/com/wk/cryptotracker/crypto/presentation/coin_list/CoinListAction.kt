package com.wk.cryptotracker.crypto.presentation.coin_list

import com.wk.cryptotracker.crypto.presentation.models.CoinUi

sealed interface CoinListAction {
    data class OnCoinClicked(val coinUi: CoinUi) : CoinListAction
    data object OnRefresh : CoinListAction
}