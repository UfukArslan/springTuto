package com.example.springTuto.topic;

import java.util.Arrays;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController

public class TopicController {
	
	@RequestMapping("/topics")
	
//	List retourne automatiquement un fichier converti en json
	public List<Topic> getAllTopics() {
		return Arrays.asList(
				new Topic("spring", "Spring Framework", "Spring Framework Description"),
				new Topic("java", "Core Java", "Core Java Description"),
				new Topic("javascript", "JavaScript", "JavaScript Description")
				);
	}

}
