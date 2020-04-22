package com.spring.sample.ApiCreation.topic.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Topic {

    @Id
    private String id;
    private String topic;
    private String description;

    public Topic() {
    }

    public Topic(String id, String topic, String description) {
        this.id = id;
        this.topic = topic;
        this.description = description;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getTopic() {
        return topic;
    }

    public void setTopic(String topic) {
        this.topic = topic;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }
}
