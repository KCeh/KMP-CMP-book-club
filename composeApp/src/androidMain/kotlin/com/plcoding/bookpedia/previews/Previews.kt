package com.plcoding.bookpedia.previews

import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.plcoding.bookpedia.book.presentation.book.list.BookListScreen
import com.plcoding.bookpedia.book.presentation.book.list.BookListState
import com.plcoding.bookpedia.book.presentation.book.list.components.SearchBar

@Preview(showBackground = true)
@Composable
fun SearchBarPreview() {
    MaterialTheme {
        SearchBar(
            searchQuery = "",
            onSearchQueryChange = {},
            onImeSearchAction = {}
        )
    }
}

@Preview
@Composable
fun BookListPreview(){
    MaterialTheme {
        BookListScreen(
            state = BookListState(),
            onAction = {}
        )
    }
}