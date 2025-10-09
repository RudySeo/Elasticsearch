package com.example.elasticsearch.product.elasticsearch

import org.springframework.data.elasticsearch.client.ClientConfiguration
import org.springframework.data.elasticsearch.client.elc.ElasticsearchConfiguration

class ElasticConfig : ElasticsearchConfiguration() {
    override fun clientConfiguration(): ClientConfiguration =
        ClientConfiguration.builder()
            .connectedTo("localhost:9200") //
            .build()
}