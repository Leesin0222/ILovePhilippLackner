package com.yongjincompany.cleanarchitecturedictionary.feature_dictionary.data.remote.dto

data class MeaningDto(
    val definitionDtos: List<DefinitionDto>,
    val partOfSpeech: String
)