package io.springbootapp.controller.topic;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;

@Service
public class TopicService {
	

	private List<Topic> topics =   new ArrayList<> (Arrays.asList(			
				new Topic("Spring", "Spring Framework","Spring FW Descr"),
				new Topic("Java", "Java EE","Java EE Descr"),
				new Topic("VC", "Visual C","Visual C++ Descr")
				));
		
	public List<Topic> getAllTopics(){
		System.out.println("inside Service 1");
		return topics;
	}
	
	public Topic getOneTopic(String id) {
				return topics.stream().filter(t-> t.getId().equals(id)).findFirst().get();
		//return topics.get(0);
	}

	public void addTopic(Topic topic) {
		topics.add(topic);
		
	}

	public void updateTopic(Topic topic, String id) {		
		for(int i=0; i< topics.size(); i++ ) {
			Topic t = topics.get(i);
			//System.out.println(t.getId());
			if(t.getId().equals(id)) {
				topics.set(i, topic);
				return;
			}
		}		
	}

	public void deleteTopic(String id) {
		topics.removeIf(t-> t.getId().equals(id));
		
	}



	
}
