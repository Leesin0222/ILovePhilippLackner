package com.yongjincompany.cleanarchitecturedictionary.feature_dictionary.data.remote.dto

data class Definition(
    val antonyms: List<String>,
    val definition: String,
    val synonyms: List<String>
)