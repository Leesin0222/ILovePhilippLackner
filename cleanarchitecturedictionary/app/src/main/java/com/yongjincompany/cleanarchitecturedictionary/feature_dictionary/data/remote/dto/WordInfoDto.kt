package com.yongjincompany.cleanarchitecturedictionary.feature_dictionary.data.remote.dto

data class WordInfoDtoItem(
    val meanings: List<Meaning>,
    val phonetics: List<Phonetic>,
    val word: String
)