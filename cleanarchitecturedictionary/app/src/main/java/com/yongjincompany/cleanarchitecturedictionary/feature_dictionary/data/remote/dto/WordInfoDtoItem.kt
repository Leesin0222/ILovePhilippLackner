package com.yongjincompany.cleanarchitecturedictionary.feature_dictionary.data.remote.dto

data class WordInfoDtoItem(
    val meanings: List<Meaning>,
    val origin: String,
    val phonetic: String,
    val phonetics: List<Phonetic>,
    val word: String
)