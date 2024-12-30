package com.plcoding.bookpedia

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import com.plcoding.bookpedia.book.presentation.book.list.BookListScreenRoot
import com.plcoding.bookpedia.book.presentation.book.list.BookListViewModel
import org.jetbrains.compose.ui.tooling.preview.Preview
import org.koin.compose.viewmodel.koinViewModel

@Composable
@Preview
fun App() {
    val viewModel = koinViewModel<BookListViewModel> ()

    MaterialTheme {
        BookListScreenRoot(
            viewModel = viewModel,
            onBookClicked = {}
        )
    }
}