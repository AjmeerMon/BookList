package com.example.booklist.utils

import com.example.booklist.model.RandomBook

interface OnBookClickListener {
    fun onBookClick(q: RandomBook)
}