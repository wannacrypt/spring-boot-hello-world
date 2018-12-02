package co.wannacrypt.helloWorld.bootstrap;

import co.wannacrypt.helloWorld.model.Message;
import co.wannacrypt.helloWorld.repositories.MessageRepository;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.ContextRefreshedEvent;
import org.springframework.stereotype.Component;

@Component
public class DevBootstrap implements ApplicationListener<ContextRefreshedEvent> {

    private MessageRepository messageRepository;

    public DevBootstrap(MessageRepository messageRepository) {
        this.messageRepository = messageRepository;
    }

    @Override
    public void onApplicationEvent(ContextRefreshedEvent event) {
        init();
    }

    private void init() {
        Message message = new Message(1L, "Hello World!");
        messageRepository.insert(message);
    }
}
