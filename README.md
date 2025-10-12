
# Spring Boot + Kotlin + Elasticsearch <br> 자동완성 테스트 프로젝트


## 프로젝트 개요
이 프로젝트는 **Spring Boot 3.5.6**와 **Kotlin**, **Elasticsearch 8.x**를 기반으로  
상품 이름 자동완성 기능을 테스트하기 위해 만든 샘플 프로젝트입니다

사용자가 상품명을 일부 입력하면 Elasticsearch의 **Edge Ngram** 분석기를 활용하여  
부분 문자열로도 자동완성 결과를 반환하도록 구현했습니다


## 기술 스택
- Spring Boot 3.5.6
- Kotlin
- Spring Data Elasticsearch
- Elasticsearch 8.x
- Docker / Docker Compose
- Gradle (Kotlin DSL)

---

## 프로젝트 구조

```text

src/main/kotlin/com/example/elasticsearch/
├── config
│   └── ElasticsearchConfig.kt     # Elasticsearch 연결 설정
├── product
│   ├── elasticsearch
│   │   ├── ProductDocument.kt    # Elasticsearch Document
│   │   └── ProductSearchRepository.kt  # Repository (자동완성 검색)
│   ├── service
│   │   └── ProductService.kt     # 비즈니스 로직
│   └── controller
│       └── ProductController.kt  # API 엔드포인트

````



## Spring Boot 실행

```bash
# Gradle 빌드
./gradlew build

# Docker Compose 실행
docker-compose up -d

# Spring Boot 애플리케이션 실행
./gradlew bootRun
```

---

## 향후 개선 사항

* 자동완성 성능 향상을 위해 **Completion Suggest API** 적용
* 상품 카테고리별 자동완성 구현
* 프론트엔드 입력 시 실시간 자동완성 UI 적용

---

## 참고 자료

* [Spring Data Elasticsearch 공식 문서](https://spring.io/projects/spring-data-elasticsearch)
* [Elasticsearch Edge Ngram 분석기](https://www.elastic.co/guide/en/elasticsearch/reference/current/analysis-edgengram-tokenizer.html)
* [Kibana Dev Tools](https://www.elastic.co/guide/en/kibana/current/dev-tools.html)

---



