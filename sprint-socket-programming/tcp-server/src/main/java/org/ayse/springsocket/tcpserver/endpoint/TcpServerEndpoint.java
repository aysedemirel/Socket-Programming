package org.ayse.springsocket.tcpserver.endpoint;

import org.ayse.springsocket.tcpserver.service.MessageService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.integration.annotation.MessageEndpoint;
import org.springframework.integration.annotation.ServiceActivator;

@MessageEndpoint
public class TcpServerEndpoint {

  private final MessageService messageService;

  @Autowired
  public TcpServerEndpoint(MessageService messageService) {
    this.messageService = messageService;
  }

  @ServiceActivator(inputChannel = "inboundChannel")
  public byte[] process(byte[] message) {
    return messageService.processMessage(message);
  }
}
