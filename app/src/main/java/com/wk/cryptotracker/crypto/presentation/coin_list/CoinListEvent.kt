package com.wk.cryptotracker.crypto.presentation.coin_list

import com.wk.cryptotracker.core.domain.util.NetworkError

sealed interface CoinListEvent {

    data class Error(val error : NetworkError) : CoinListEvent
}