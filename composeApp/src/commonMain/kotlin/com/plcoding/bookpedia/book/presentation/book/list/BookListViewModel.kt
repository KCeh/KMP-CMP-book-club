package com.plcoding.bookpedia.book.presentation.book.list

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update

class BookListViewModel: ViewModel() {

    private val _state = MutableStateFlow(BookListState())
    val state = _state.asStateFlow()

    fun onAction(action: BookListAction) {
        when(action) {
            is BookListAction.OnSearchQueryChanged -> {
                _state.update { it.copy(searchQuery = action.query) }
            }
            is BookListAction.OnBookClicked -> {
                // Handle book click
            }
            is BookListAction.OnTabSelected -> {
                _state.update { it.copy(selectedTab = action.index) }
            }
        }
    }
}