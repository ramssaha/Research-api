package com.sahatech.springBootStarterPkg.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class TopicService {
	
	@Autowired
	private TopicRepository topicRepository;
	
	List<Topic> topicList;

	public List<Topic> getAllTopics()
	{
		topicList=new ArrayList<Topic>();
		topicRepository.findAll().forEach(topicList::add);
		return topicList;
	}
	
	
	public Topic getTopic(int id) {
		return topicRepository.findById(id).get();
	}


	public void addTopic(Topic topic) {
		topicRepository.save(topic);
		
	}


	public void deleteTopic(int id) {
		topicRepository.delete(topicList.stream().filter(t->t.getId()==id).findFirst().get());		
	}


	public void updateTopic(Topic topic, int id) {
		topicRepository.save(topic);
		
	}
}
