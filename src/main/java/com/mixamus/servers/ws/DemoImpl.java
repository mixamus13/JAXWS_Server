package com.mixamus.servers.ws;

import javax.jws.WebService;

@WebService(endpointInterface = "com.mixamus.servers.ws.Demo")
public class DemoImpl implements Demo {

  @Override
  public String helloWorld() {
    return "Hello World";
  }

  @Override
  public String hi(String fullName) {
    return "Hello " + fullName;
  }
}