package com.yongjincompany.cleanarchitecturedictionary.feature_dictionary.data.remote.dto

data class WordInfoDto(
    val meanings: List<MeaningDto>,
    val origin: String,
    val phonetic: String,
    val phonetics: List<PhoneticDto>,
    val word: String
)