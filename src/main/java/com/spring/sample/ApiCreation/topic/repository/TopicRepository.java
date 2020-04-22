package com.spring.sample.ApiCreation.topic.repository;


import com.spring.sample.ApiCreation.topic.model.Topic;
import org.springframework.data.repository.CrudRepository;

public interface TopicRepository extends CrudRepository<Topic, String> {
}
