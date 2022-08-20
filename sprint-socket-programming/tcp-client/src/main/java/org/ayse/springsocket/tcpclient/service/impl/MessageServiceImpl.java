package org.ayse.springsocket.tcpclient.service.impl;


import java.time.LocalDateTime;
import org.ayse.springsocket.tcpclient.gateway.TcpClientGateway;
import org.ayse.springsocket.tcpclient.service.MessageService;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MessageServiceImpl implements MessageService {

  private static final Logger LOGGER = LoggerFactory.getLogger(MessageServiceImpl.class);
  private final TcpClientGateway tcpClientGateway;

  @Autowired
  public MessageServiceImpl(TcpClientGateway tcpClientGateway) {
    this.tcpClientGateway = tcpClientGateway;
  }

  @Override
  public void sendMessage() {
    String message = LocalDateTime.now().toString();
    LOGGER.info("Send message: {}", message);
    byte[] responseBytes = tcpClientGateway.send(message.getBytes());
    String response = new String(responseBytes);
    LOGGER.info("Receive response: {}", response);
  }
}
