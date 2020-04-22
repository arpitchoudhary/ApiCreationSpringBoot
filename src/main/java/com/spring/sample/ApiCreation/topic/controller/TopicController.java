package com.spring.sample.ApiCreation.topic.controller;


import com.spring.sample.ApiCreation.topic.model.Topic;
import com.spring.sample.ApiCreation.topic.service.TopicService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class TopicController {

    @Autowired
    private TopicService service;

    @RequestMapping(value = "/topics", method = RequestMethod.GET)
    public List<Topic> getTopics() {
        return service.getAllTopics();
    }

    @RequestMapping(value = "/topics", method = RequestMethod.POST)
    public void addTopic(@RequestBody Topic topic){
        service.addTopic(topic);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "/topics/{id}")
    public void updateTopic(@RequestBody Topic topic, @PathVariable String id){
        service.updateTopic(id, topic);
    }

    @RequestMapping(method = RequestMethod.DELETE, value = "/topics/{id}")
    public void deleteTopic(@PathVariable String id) {
        service.deleteTopic(id);
    }
}
