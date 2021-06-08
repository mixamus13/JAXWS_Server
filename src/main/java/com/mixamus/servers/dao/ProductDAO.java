package com.mixamus.servers.dao;

import com.mixamus.servers.entities.Product;
import java.util.ArrayList;
import java.util.List;

public class ProductDAO {

  public Product find() {
    return new Product("po1", "name 1", 100);
  }

  public List<Product> findAll() {
    List<Product> result = new ArrayList<>();
    result.add(new Product("po1", "name 1", 100));
    result.add(new Product("po2", "name 2", 200));
    result.add(new Product("po3", "name 3", 300));

    return result;
  }
}
