package com.wk.cryptotracker.crypto.presentation.coin_list

import androidx.compose.runtime.Immutable
import com.wk.cryptotracker.crypto.domain.Coin
import com.wk.cryptotracker.crypto.presentation.models.CoinUi

@Immutable
data class CoinListState(
    val isLoading: Boolean = false,
    val coins: List<CoinUi> = emptyList(),
    val selectedCoin: Coin? = null
)
