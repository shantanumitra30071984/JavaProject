package org.test.restapi.messenger.resources;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

import org.test.restapi.messenger.model.Message;
import org.test.restapi.messenger.service.MessageService;
@Path("/messages")
public class MessageResource {
MessageService messageService=new MessageService();
 @GET
 @Produces(MediaType.APPLICATION_JSON)
	public List<Message> getMessages() {
	 return messageService.getAllMessages();
 }
  @GET
  @Path("/{messageId}")
 @Produces(MediaType.APPLICATION_XML)
	public Message getMessagesById(@PathParam("messageId")String messageId) {
	  Long msgId=Long.parseLong(messageId);
	 return messageService.getMessage(msgId);
 }
}
