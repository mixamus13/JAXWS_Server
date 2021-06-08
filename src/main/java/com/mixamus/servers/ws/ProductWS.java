package com.mixamus.servers.ws;

import com.mixamus.servers.entities.Product;
import java.util.List;
import javax.jws.WebMethod;
import javax.jws.WebService;

@WebService
public interface ProductWS {

  @WebMethod
  Product find();

  @WebMethod
  List<Product> findAll();
}
