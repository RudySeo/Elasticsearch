package com.example.elasticsearch.product.elasticsearch

import org.springframework.beans.factory.annotation.Value
import org.springframework.context.annotation.Configuration
import org.springframework.data.elasticsearch.client.ClientConfiguration
import org.springframework.data.elasticsearch.client.elc.ElasticsearchConfiguration
import org.springframework.data.elasticsearch.repository.config.EnableElasticsearchRepositories

@Configuration
@EnableElasticsearchRepositories
class ElasticConfig(
    @Value("\${spring.data.elasticsearch.uris}") private val elasticUri: String,
    @Value("\${spring.data.elasticsearch.username}") private val username: String,
    @Value("\${spring.data.elasticsearch.password}") private val password: String
) : ElasticsearchConfiguration() {

    override fun clientConfiguration(): ClientConfiguration =
        ClientConfiguration.builder()
            .connectedTo(elasticUri)
            .withBasicAuth(username, password)
            .build()
}