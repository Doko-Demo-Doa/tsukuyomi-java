package com.clipsub.tsukuyomi.service;

import com.clipsub.tsukuyomi.entity.Manga;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.stereotype.Service;

import javax.jms.Destination;
import javax.jms.JMSException;
import javax.jms.Message;

@Service
public class JmsOrderMessagingService implements OrderMessagingService {
    private JmsTemplate template;
    private Destination orderQueue;

    @Autowired
    public JmsOrderMessagingService(JmsTemplate jms) {
        this.template = jms;
    }

    @Override
    public void sendManga(Manga m) {
        // template.convertAndSend("tacocloud.order.queue", this::addMangaSource);
        template.send(session -> session.createObjectMessage(m));
    }

    private Message addMangaSource(Message msg) throws JMSException {
        msg.setStringProperty("X_MANGA_SOURCE", "WEB");
        return msg;
    }
}
