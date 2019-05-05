package com.clipsub.tsukuyomi.service;

import com.clipsub.tsukuyomi.entity.Manga;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.jms.core.JmsTemplate;
import org.springframework.jms.support.converter.MappingJackson2MessageConverter;
import org.springframework.stereotype.Service;

import javax.jms.Destination;

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

    }

    @Bean
    public MappingJackson2MessageConverter messageConverter() {
        MappingJackson2MessageConverter converter = new MappingJackson2MessageConverter();
        converter.setTypeIdPropertyName("_typeId");
        return converter;
    }
}
