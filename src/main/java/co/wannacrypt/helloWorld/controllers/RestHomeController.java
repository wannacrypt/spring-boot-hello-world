package co.wannacrypt.helloWorld.controllers;

import co.wannacrypt.helloWorld.message.Response;
import co.wannacrypt.helloWorld.repositories.MessageRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestHomeController {
    private MessageRepository messageRepository;

    public RestHomeController(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    @GetMapping(value = "/getMessageOfTheDay")
    public Response getResource() {
        Response response = new Response("Done", messageRepository.findById(1L).getMessage());
        return response;
    }
}
