package übung10;

import java.util.ArrayList;
// Task's description: https://chat.openai.com/share/f082ae67-9f57-4ae9-a5fc-8352462064ee

public class MenuStructure {
    public static void main(String[] args) {
        var menu = new Menu("Menu1");
        var item1 = new MenuItem("item1", 10);
        var item2 = new MenuItem("item2", 12);
        var item3 = new MenuItem("item3", 14);

        var submenu = new Menu("Submenu1");
        var subItem = new MenuItem("item4", 16);

        menu.add(item1);
        menu.add(item2);
        menu.add(item3);

        submenu.add(subItem);

        menu.add(submenu);

        menu.print();
    }
}

interface MenuPoint {
    double getPrice();
    void print();
}

class MenuItem implements MenuPoint {
    private String name;
    private double price;

    public MenuItem(String name, double price) {
        this.name = name;
        this.price = price;
    }

    @Override
    public void print() {
        System.out.println("    MenuItem: " + name + " | price: " + price + "$");
    }

    @Override
    public double getPrice() {
        return price;
    }
}

class Menu implements MenuPoint {
    private String name;
    private ArrayList<MenuPoint> items = new ArrayList<>();

    public Menu(String name) {
        this.name = name;
    }

    @Override
    public void print() {
        System.out.println("Menu: " + name + " | price: " + getPrice() + "$");

        for(MenuPoint item: items) {
            item.print();
        }
    }

    @Override
    public double getPrice() {
        double sum = 0;
        for(MenuPoint item: items) { sum += item.getPrice(); }
        return sum;
    }

    public void add(MenuPoint item) {
        items.add(item);
    }

    public void remove(MenuPoint item) {
        items.remove(item);
    }
}