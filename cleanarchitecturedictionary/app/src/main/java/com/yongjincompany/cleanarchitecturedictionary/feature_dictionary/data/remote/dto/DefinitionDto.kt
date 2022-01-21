package com.yongjincompany.cleanarchitecturedictionary.feature_dictionary.data.remote.dto

import com.yongjincompany.cleanarchitecturedictionary.feature_dictionary.domain.model.Definition

data class DefinitionDto(
    val antonyms: List<String>,
    val definition: String,
    val synonyms: List<String>
) {
    fun toDefinition(): Definition {
        return Definition(
            antonyms = antonyms,
            definition = definition,
            synonyms = synonyms
        )
    }
}