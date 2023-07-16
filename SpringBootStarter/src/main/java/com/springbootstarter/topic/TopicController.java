package com.springbootstarter.topic;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicController {
		
	@Autowired
		private TopicService topicservice;
		
		@GetMapping("/topics")
		public List<Topic> getAllTopics() {
			// TODO Auto-generated method stub
			
			return topicservice.getAllTopics();

		}
		@GetMapping("/topics/{id}")
		public Topic getTopic(@PathVariable("id") String id) {
			
			return topicservice.getTopic(id);
		}
		
		@PostMapping("/topics")
		public void addTopic(@RequestBody Topic topic) {
			topicservice.addTopic(topic);
			
		}
		
		@PutMapping("/topics/{id}")
		public void updateTopic(@RequestBody Topic topic, @PathVariable String id) {
			topicservice.updateTopic(topic,id);
			
		}
		
		@DeleteMapping("/topics/{id}")
		public void deleteTopic(@PathVariable String id) {
			topicservice.deleteTopic(id);
		}
		@GetMapping("/adminpage")
		public String page() {
			return "Pagee for admin";
		}
}
