package com.mixamus.servers;

import com.mixamus.servers.ws.DemoImpl;
import com.mixamus.servers.ws.ProductWSImpl;
import javax.xml.ws.Endpoint;

public class Main {

  public static void main(String[] args) {
    Endpoint.publish("http://localhost:7878/com.mixamus/servers/ws/demo", new DemoImpl());
    Endpoint.publish("http://localhost:7878/com.mixamus/servers/ws/product", new ProductWSImpl());
    System.out.println("Done");
  }
}