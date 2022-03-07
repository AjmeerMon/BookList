package com.example.booklist.network

import com.example.booklist.model.RandomBookResponse
import retrofit2.Response


interface BookRepository {
    suspend fun getRandomBook(q: String): Response<RandomBookResponse>
}

class BookRepositoryImpl(private val service: ApiService):BookRepository {
    override suspend fun getRandomBook(q: String) = service.getRandomBook(q)
}