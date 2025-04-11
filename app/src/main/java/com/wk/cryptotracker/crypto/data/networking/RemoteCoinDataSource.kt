package com.wk.cryptotracker.crypto.data.networking

import com.wk.cryptotracker.core.data.networking.constructUrl
import com.wk.cryptotracker.core.data.networking.safeCall
import com.wk.cryptotracker.core.domain.util.NetworkError
import com.wk.cryptotracker.core.domain.util.Result
import com.wk.cryptotracker.core.domain.util.map
import com.wk.cryptotracker.crypto.data.mappers.toCoin
import com.wk.cryptotracker.crypto.data.networking.dto.CoinResponseDto
import com.wk.cryptotracker.crypto.domain.Coin
import com.wk.cryptotracker.crypto.domain.CoinDataSource
import io.ktor.client.HttpClient
import io.ktor.client.request.get

class RemoteCoinDataSource(private val httpClient: HttpClient) : CoinDataSource {
    override suspend fun getCoins(): Result<List<Coin>, NetworkError> {
        return safeCall<CoinResponseDto> {
            httpClient.get(
                urlString = constructUrl("/assets")
            )
        }.map { response ->
            response.data.map { it.toCoin() }
        }
    }
}