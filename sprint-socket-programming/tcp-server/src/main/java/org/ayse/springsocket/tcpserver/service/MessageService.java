package org.ayse.springsocket.tcpserver.service;

public interface MessageService {

  byte[] processMessage(byte[] message);
}
