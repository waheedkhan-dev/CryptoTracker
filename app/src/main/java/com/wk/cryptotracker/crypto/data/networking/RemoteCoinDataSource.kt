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
                urlString = constructUrl("/assets?apiKey=530757118e6c9dc50bd7a404cc333795914cfee1b6ec2085bec4d4886d6d0a3c")
            )
        }.map { response ->
            response.data.map { it.toCoin() }
        }
    }
}