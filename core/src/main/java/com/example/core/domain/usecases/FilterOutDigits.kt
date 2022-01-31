package com.example.core.domain.usecases

class FilterOutDigits {
    operator fun invoke(text: String): String {
        return text.filter { it.isDigit() }
    }
}