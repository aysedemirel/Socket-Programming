package org.ayse.springsocket.tcpclient.scheduler;

import org.ayse.springsocket.tcpclient.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class MessageJobScheduler {

  private final MessageService messageService;

  @Autowired
  public MessageJobScheduler(MessageService messageService) {
    this.messageService = messageService;
  }

  @Scheduled(fixedDelay = 1000L)
  public void sendMessageJob() {
    messageService.sendMessage();
  }
}
