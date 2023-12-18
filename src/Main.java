import models.MenuItem;
import service.Impl.RestaurantServiceImpl;
import service.RestaurantMenuService;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        RestaurantMenuService service = new RestaurantServiceImpl();
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.println("""
                    1.Add
                    2.Remove
                    3.Get all
                    4.Get all desserts
                    5.Get all drinks
                    6.Get all salads
                    7.Sort by price
                    8.Get by name
                    0.Exit
                    Enter your choice:
                    """);
            switch (scanner.nextLine()) {
                case "1" -> {
                    MenuItem menuItem = new MenuItem();
                    menuItem.setId(MyGenerateId.forId());
                    System.out.print("Enter name : ");
                    menuItem.setName(scanner.nextLine());
                    System.out.print("Enter price ");
                    menuItem.setPrice(new Scanner(System.in).nextDouble());
                    System.out.print("Enter preperation time(type int): ");
                    menuItem.setPreperationTime(new Scanner(System.in).nextInt());
                    service.add(menuItem);
                }
                case "2" -> {
                    System.out.print("Enter menuItem id: ");
                    service.remove(new Scanner(System.in).nextLong());
                }
                case "3" -> System.out.println(service.getAll());
                case "4" -> System.out.println(service.getAllDessert());
                case "5" -> System.out.println(service.getAllDrink());
                case "6" -> System.out.println(service.getAllSalad());
                case "7" -> System.out.println(service.sortByPrice());
                case "8" -> {
                    System.out.print("Enter name : ");
                    System.out.println(service.getByName(scanner.nextLine()));
                }
                case "0" -> System.exit(0);
            }
        }
    }
}