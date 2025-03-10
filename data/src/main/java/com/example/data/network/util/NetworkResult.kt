package com.example.data.network.util

sealed interface NetworkResult<T, E : NetworkErrorType> {
    data object Loading : NetworkResult<Nothing, Nothing>
    data class Success<T, E : NetworkErrorType>(val data: T) : NetworkResult<T, E>
    data class Error<T, E : NetworkErrorType>(val error: E) : NetworkResult<T, E>
}