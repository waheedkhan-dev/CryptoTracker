package com.wk.cryptotracker.crypto.data.networking

import com.wk.cryptotracker.core.data.networking.constructUrl
import com.wk.cryptotracker.core.data.networking.safeCall
import com.wk.cryptotracker.core.domain.util.NetworkError
import com.wk.cryptotracker.core.domain.util.Result
import com.wk.cryptotracker.core.domain.util.map
import com.wk.cryptotracker.crypto.data.mappers.toCoin
import com.wk.cryptotracker.crypto.data.mappers.toCoinPrice
import com.wk.cryptotracker.crypto.data.networking.dto.CoinHistoryDto
import com.wk.cryptotracker.crypto.data.networking.dto.CoinPriceDto
import com.wk.cryptotracker.crypto.data.networking.dto.CoinResponseDto
import com.wk.cryptotracker.crypto.domain.Coin
import com.wk.cryptotracker.crypto.domain.CoinDataSource
import com.wk.cryptotracker.crypto.domain.CoinPrice
import io.ktor.client.HttpClient
import io.ktor.client.request.get
import io.ktor.client.request.parameter
import java.time.ZoneId
import java.time.ZonedDateTime

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

    override suspend fun getCoinHistory(
        coinId: String,
        start: ZonedDateTime,
        end: ZonedDateTime
    ): Result<List<CoinPrice>, NetworkError> {
        val startMillis = start.withZoneSameInstant(ZoneId.of("UTC")).toInstant().toEpochMilli()
        val endMillis = end.withZoneSameInstant(ZoneId.of("UTC")).toInstant().toEpochMilli()

       return safeCall<CoinHistoryDto> {
           httpClient.get(
               urlString = constructUrl("/assets/$coinId/history?apiKey=530757118e6c9dc50bd7a404cc333795914cfee1b6ec2085bec4d4886d6d0a3c")
           ) {
               parameter("interval","h6")
               parameter("start",startMillis)
               parameter("end",endMillis)

           }
       }.map { response ->
           response.data.map { it.toCoinPrice() }
       }
    }
}