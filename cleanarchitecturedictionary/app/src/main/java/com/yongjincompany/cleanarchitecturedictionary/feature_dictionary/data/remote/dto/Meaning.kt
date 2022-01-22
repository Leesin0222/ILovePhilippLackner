package com.yongjincompany.cleanarchitecturedictionary.feature_dictionary.data.remote.dto

data class Meaning(
    val definitions: List<Definition>,
    val partOfSpeech: String
)