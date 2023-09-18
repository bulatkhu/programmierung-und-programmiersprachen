package übung10;

import lombok.*;
import java.util.*;

// Task's source: https://chat.openai.com/share/f082ae67-9f57-4ae9-a5fc-8352462064ee

public class TemplateMuster1 {
    public static void main(String[] args) {
        Customer customer1 = new Customer("Customer1", 2000);
        Artikel artikel1 = new Artikel("artikel1", 20);

        var orders = new ArrayList<Artikel>();
        orders.add(artikel1);

        StandardOrder standardOrder = new StandardOrder(orders, customer1, 10, "delivery address1");

        try {
            standardOrder.processOrder();
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }


        Customer customer2 = new Customer("Customer2", 1000);
        Artikel artikel2 = new Artikel("artikel2", 900);
        var orders2 = new ArrayList<Artikel>();
        orders2.add(artikel2);
        ExpressOrder expressOrder = new ExpressOrder(orders2, customer2, 10, "delivery address1");

        try {
            expressOrder.processOrder();
        } catch (Exception e) {
            System.out.println("Exception: " + e.getMessage());
        }

    }
}

abstract class AbstractOrder {
    protected ArrayList<Artikel> card;
    protected int deliveryPrice;
    protected String deliveryAddress;
    protected Customer customer;

    public AbstractOrder(ArrayList<Artikel> orders, Customer customer, int deliveryPrice, String deliveryAddress) {
        this.card = orders;
        this.customer = customer;
        this.deliveryPrice = deliveryPrice;
        this.deliveryAddress = deliveryAddress;
    }

    public void getItems() throws Exception {
        System.out.println("Amount of orders: " + card.size());
        this.card = new ArrayList<>();
    }

    public void verifyPayment() throws Exception {
        var cardAmount = getAmount();

        if (cardAmount == 0) {
            throw new Exception("Card cannot be empty");
        }

        customer.pay(cardAmount);
    };

    public void verifyDeliveryAddress() throws Exception {
        if (deliveryAddress ==  null) {
            throw new Exception("Invalid delivery address");
        }
    };

    public void shipOrder() {
        System.out.println("Shipping orders to: " + customer.getName() + " | final amount: " + getAmount());
    }

    public void notifyCustomer() {
        System.out.println("Your order(s) will arrive soon to following address: " + deliveryAddress);
    }

    public void processOrder() throws Exception {
        verifyPayment();
        verifyDeliveryAddress();
        shipOrder();
        notifyCustomer();
        getItems();
        System.out.println("Your order has been processed and your package is on its way. Thank you for choosing us!");
        System.out.println();
    }

    public double getAmount() {
        double sum = 0;
        for(var item: card) {
            sum += item.getPrice();
        }
        return sum + deliveryPrice;
    }
}

@Data
class Artikel {
    private String name;
    private double price;

    public Artikel(String name, double price) {
        this.name = name;
        this.price = price;
    }

    public Artikel(String name) {
        this.name = name;
        this.price = 10;
    }
}

@Data
class Customer {
    private String name;
    private double balance;

    public Customer(String name, int balance) {
        this.name = name;
        this.balance = balance;
    }

    public void pay(double amount) throws Exception {
        if (getBalance() >= amount) {
            this.balance -= amount;
            return;
        }
        throw new Exception("insufficient balance");
    }
}

class StandardOrder extends AbstractOrder {
    public StandardOrder(ArrayList<Artikel> orders, Customer customer, int deliveryPrice, String deliveryAddress) {
        super(orders, customer, deliveryPrice, deliveryAddress);
    }
}

class ExpressOrder extends AbstractOrder {
    public ExpressOrder(ArrayList<Artikel> orders, Customer customer, int deliveryPrice, String deliveryAddress) {
        super(orders, customer, deliveryPrice + 100, deliveryAddress);
    }

    public void shipOrder() {
        System.out.println("Shipping orders with express delivery to: " + customer.getName() + " | final amount: " + getAmount());
    }
}

class InternationalOrder extends AbstractOrder {
    public InternationalOrder(ArrayList<Artikel> orders, Customer customer, int deliveryPrice, String deliveryAddress) {
        super(orders, customer, deliveryPrice + 20, deliveryAddress);
    }

    @Override
    public void verifyDeliveryAddress() throws Exception {
        super.verifyDeliveryAddress();
        if (this.deliveryAddress.length() <= 10) {
            throw new Exception("It's not an international delivery address");
        }
    }
}