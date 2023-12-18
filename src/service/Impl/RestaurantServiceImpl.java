package service.Impl;

import models.MenuItem;
import models.RestaurantMenu;
import service.RestaurantMenuService;

import java.util.Comparator;
import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class RestaurantServiceImpl implements RestaurantMenuService {

    @Override
    public void add(MenuItem menuItem) {
        System.out.println("""
                1.Desserts
                2.Drinks
                3.Salads
                Your coice:
                       """);
        switch (new Scanner(System.in).nextLine()) {
            case "1" -> RestaurantMenu.desserts.add(menuItem);
            case "2" -> RestaurantMenu.drinks.add(menuItem);
            case "3" ->RestaurantMenu.salads.add(menuItem);
            default -> System.out.println("Error choice");
        }
    }

    @Override
    public String remove(long id) {
        for (MenuItem menuItem : getAll()) {
           if( menuItem.getId() == id){
               getAll().remove(menuItem);
               return "Successful deleted";
           }

        }
        return "MenuItem not found ";
    }

    @Override
    public List<MenuItem> getAll() {
      LinkedList<MenuItem> menuItems = new LinkedList<>();
      menuItems.addAll(RestaurantMenu.desserts);
      menuItems.addAll(RestaurantMenu.drinks);
      menuItems.addAll(RestaurantMenu.salads);
        return menuItems;
    }

    @Override
    public List<MenuItem> getAllDessert() {
        return RestaurantMenu.desserts;
    }

    @Override
    public List<MenuItem> getAllDrink() {
        return RestaurantMenu.drinks;
    }

    @Override
    public List<MenuItem> getAllSalad() {
        return RestaurantMenu.salads;
    }

    @Override
    public List<MenuItem> sortByPrice() {
        LinkedList<MenuItem> menu = new LinkedList<>(getAll());
        Comparator<MenuItem> comparatorPrice = Comparator.comparing( MenuItem::getPrice);
        menu.sort(comparatorPrice);
        return menu;
    }

    @Override
    public MenuItem getByName(String name) {
        for (MenuItem menuItem : getAll()) {
            if (menuItem.equals(name)){
                return menuItem;
            }
        }
        return null;
    }
}
