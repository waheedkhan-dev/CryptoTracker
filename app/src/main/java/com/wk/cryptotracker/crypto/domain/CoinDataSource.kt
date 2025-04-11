package com.wk.cryptotracker.crypto.domain

import com.wk.cryptotracker.core.domain.util.NetworkError
import com.wk.cryptotracker.core.domain.util.Result

interface CoinDataSource {

    suspend fun getCoins() : Result<List<Coin>,NetworkError>
}