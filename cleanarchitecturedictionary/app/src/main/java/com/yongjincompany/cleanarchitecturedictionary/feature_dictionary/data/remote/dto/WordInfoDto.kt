package com.yongjincompany.cleanarchitecturedictionary.feature_dictionary.data.remote.dto

data class WordInfoDto(
    val meanings: List<MeaningDto>,
    val phonetics: List<PhoneticDto>,
    val word: String
)