package com.springbootstarter.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {

	private List<Topic> topics =new ArrayList<>(Arrays.asList(new Topic("123", "Java", "Java Starter pack"),
			new Topic("678", "Spring", "Spring Starter pack"), new Topic("125", "SpringBoot", "SpringBoot Starter pack") , new Topic("126", "SpringSecurity", "SpringSecurity Starter pack")

	));
	
	public List<Topic> getAllTopics(){
		return topics;
	}
	
	
	public Topic getTopic(String id) {
		for(Topic topic:topics) { 
			if(topic.getId().equals(id)) {
				return topic;
			}
		}
		return null;
	}
	public void addTopic(Topic topic) {
		topics.add(topic);
	}
	
	public void updateTopic(Topic topic, String id) {
		for(int i=0;i<topics.size();i++) {
			Topic t=topics.get(i);
			if(t.getId().equals(id)) {
				topics.set(i, topic);
				return;
			}
		}
		
	}
	
	public void deleteTopic(String id) {
		for(int i=0;i<topics.size();i++) {
			Topic t=topics.get(i);
			if(t.getId().equals(id)) {
				topics.remove(t);
				return;
			}
		}
	}
}
