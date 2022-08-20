package org.ayse.springsocket.tcpserver.service.impl;

import org.ayse.springsocket.tcpserver.service.MessageService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class MessageServiceImpl implements MessageService {

  private static final Logger LOGGER = LoggerFactory.getLogger(MessageServiceImpl.class);

  @Override
  public byte[] processMessage(byte[] message) {
    String messageContent = new String(message);
    LOGGER.info("Receive message: {}", messageContent);
    String responseContent = String.format("Message \"%s\" is processed", messageContent);
    return responseContent.getBytes();
  }
}
