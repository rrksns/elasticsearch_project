package com.example.elastic;

import org.springframework.data.elasticsearch.repository.ElasticsearchRepository;

public interface UserDocumentRepository extends ElasticsearchRepository<UserDocument, String> {
}
