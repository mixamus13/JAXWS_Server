package com.mixamus.servers.ws;

import javax.jws.*;

@WebService
public interface Demo {

  @WebMethod
  String helloWorld();

  @WebMethod
  String hi(String fullName);
}
