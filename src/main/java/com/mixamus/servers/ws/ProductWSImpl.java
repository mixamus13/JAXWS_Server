package com.mixamus.servers.ws;

import com.mixamus.servers.dao.ProductDAO;
import com.mixamus.servers.entities.Product;
import java.util.List;
import javax.jws.WebService;

@WebService(endpointInterface = "com.mixamus.servers.ws.ProductWS")
public class ProductWSImpl implements ProductWS {

  private ProductDAO productDAO = new ProductDAO();

  @Override
  public Product find() {
    return productDAO.find();
  }

  @Override
  public List<Product> findAll() {
    return productDAO.findAll();
  }
}
