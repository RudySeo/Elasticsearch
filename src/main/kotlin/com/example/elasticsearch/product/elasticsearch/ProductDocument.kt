package com.example.elasticsearch.product.elasticsearch

import org.springframework.data.annotation.Id
import org.springframework.data.elasticsearch.annotations.Document
import org.springframework.data.elasticsearch.annotations.Field
import org.springframework.data.elasticsearch.annotations.FieldType

@Document(indexName = "products")
class ProductDocument(
    @Id
    val id: Long,

    @Field(type = FieldType.Text, analyzer = "autocomplete", searchAnalyzer = "standard")
    val name: String
)