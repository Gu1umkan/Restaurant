package service;

import models.MenuItem;

import java.util.List;

public interface RestaurantMenuService {
    void add(MenuItem menuItem);
    String remove(long id);
    List<MenuItem> getAll();
    List<MenuItem> getAllDessert();
    List<MenuItem> getAllDrink();
    List<MenuItem> getAllSalad();
    List<MenuItem> sortByPrice();
    MenuItem getByName(String name);
}
