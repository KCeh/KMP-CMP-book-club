package com.plcoding.bookpedia.book.data.repository

import com.plcoding.bookpedia.book.data.mappers.toBook
import com.plcoding.bookpedia.book.data.network.RemoteBookDataSource
import com.plcoding.bookpedia.book.domain.Book
import com.plcoding.bookpedia.book.domain.BookRepository
import com.plcoding.bookpedia.core.domain.DataError
import com.plcoding.bookpedia.core.domain.EmptyResult
import com.plcoding.bookpedia.core.domain.Result
import com.plcoding.bookpedia.core.domain.map
import kotlinx.coroutines.flow.Flow

class BookRepositoryImpl(
    private val remoteBookDataSource: RemoteBookDataSource
) : BookRepository {

    override suspend fun searchBooks(query: String): Result<List<Book>, DataError.Remote> =
        remoteBookDataSource
            .searchBooks(query)
            .map { resultDto ->
                resultDto.results.map { bookDto -> bookDto.toBook() }
            }

    override suspend fun getBookDescription(bookId: String): Result<String?, DataError> {
        TODO("Not yet implemented")
    }

    override fun getFavoriteBooks(): Flow<List<Book>> {
        TODO("Not yet implemented")
    }

    override fun isBookFavorite(id: String): Flow<Boolean> {
        TODO("Not yet implemented")
    }

    override suspend fun markAsFavorite(book: Book): EmptyResult<DataError.Local> {
        TODO("Not yet implemented")
    }

    override suspend fun deleteFromFavorites(id: String) {
        TODO("Not yet implemented")
    }

}