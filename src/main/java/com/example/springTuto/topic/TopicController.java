package com.example.springTuto.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class TopicController {
	
//	Injection de dépendence Autowired permet de regarder dans le registre de spring pour voir les services
	@Autowired
	private TopicService topicService;
	
	
	@RequestMapping("/topics")
//	List retourne automatiquement un fichier converti en json
	public List<Topic> getAllTopics() {
		return topicService.getAllTopics();
	}
	
	
	@RequestMapping("topics/{id}")
	public Topic getTopic(@PathVariable String id) {
		return topicService.getTopic(id);
		
	}

}
