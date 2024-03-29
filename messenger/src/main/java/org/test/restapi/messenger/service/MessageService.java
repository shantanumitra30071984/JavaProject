package org.test.restapi.messenger.service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Map;

import org.test.restapi.messenger.database.DatabaseClass;
import org.test.restapi.messenger.model.Message;

public class MessageService {
	Map<Long,Message>messages=DatabaseClass.getMessages();
/*public List<Message>getAllMessages(){
	Message message1=new Message(1L, "Hello World", new Date(), "Shantanu");
	Message message2=new Message(2L, "Hello Jersey", new Date(), "Shantanu");
	List<Message>list=new ArrayList<Message>();
	list.add(message1);
	list.add(message2);
	return list;
}*/
	public List<Message>getAllMessages(){
		return new ArrayList<Message>(messages.values());
	}
	
	public Message addMessages(Message message) {
		message.setId(messages.size()+1);
		messages.put(message.getId(), message);
		return message;
	}
	
	public Message getMessage(Long id) {
		Message message=messages.get(id);
		return message;
	}

	public MessageService() {
		super();
		messages.put(1L, new Message(1,"Hello World",new Date(),"Shantanu"));
		messages.put(2L, new Message(2,"Hello Jersey",new Date(),"Shantanu"));
	}
}
