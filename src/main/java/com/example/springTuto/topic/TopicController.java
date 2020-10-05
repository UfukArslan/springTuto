package com.example.springTuto.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestBody;



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
	@RequestMapping(method=RequestMethod.POST, value="/topics")
//	Ici l'argument dans addTopic permet d'instancier la class Topic spring est so smart pour ça
	public void addTopic(@RequestBody Topic topic) {
		topicService.addTopic(topic);
	}
	
	@RequestMapping(method=RequestMethod.PUT, value="/topics/{id}") 
	public void update(@RequestBody Topic topic, @PathVariable String id) {
		topicService.updateTopic(id, topic);
	}
	
	@RequestMapping(method=RequestMethod.DELETE, value="/topics/{id}")
	public void deleteTopic(@PathVariable String id) {
		topicService.deleteTopic(id);
	}

}
