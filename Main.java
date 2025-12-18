import java.util.Scanner;

class Product{
    int pid;
    double price;
    int quantity;

    // Parameterized constructor
    Product(int pid, double price, int quantity) {
        this.pid = pid;
        this.price = price;
        this.quantity = quantity;
    }
}

class ProductMain {


    public static double calculateTotal(Product[] products) {
        double total = 0;
        for (Product p : products) {
            total += p.price * p.quantity;
        }
        return total;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);


        Product[] products = new Product[5];
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter details for Product " + (i + 1));
            System.out.print("Enter Product ID: ");
            int pid = sc.nextInt();
            System.out.print("Enter Price: ");
            double price = sc.nextDouble();
            System.out.print("Enter Quantity: ");
            int quantity = sc.nextInt();

            products[i] = new Product(pid, price, quantity);
        }


        double maxPrice = products[0].price;
        int maxPid = products[0].pid;
        for (int i = 1; i < products.length; i++) {
            if (products[i].price > maxPrice) {
                maxPrice = products[i].price;
                maxPid = products[i].pid;
            }
        }
        System.out.println("Product ID with highest price: " + maxPid);

        // c. Calculate total amount spent
        double totalAmount = calculateTotal(products);
        System.out.println("Total amount spent on all products: " + totalAmount);

        sc.close();
    }
}

//Program to find the account balance

class Account {
    private double balance;

    public Account() {
        balance = 0.0;
    }


    public Account(double initialBalance) {
        balance = initialBalance;
    }


    public void deposit(double amount) {
        if (amount > 0) {
            balance += amount;
            System.out.println("Deposited: " + amount);
        } else {
            System.out.println("Deposit amount must be positive!");
        }
    }


    public void withdraw(double amount) {
        if (amount > 0 && amount <= balance) {
            balance -= amount;
            System.out.println("Withdrawn: " + amount);
        } else {
            System.out.println("Invalid withdraw amount or insufficient balance!");
        }
    }


    public void displayBalance() {
        System.out.println("Current Balance: " + balance);
    }

    public static void main(String[] args) {
        // Using no-argument constructor
        Account acc1 = new Account();
        acc1.displayBalance();
        acc1.deposit(500);
        acc1.withdraw(200);
        acc1.displayBalance();

        System.out.println("-------------------");


        Account acc2 = new Account(1000);
        acc2.displayBalance();
        acc2.deposit(300);
        acc2.withdraw(500);
        acc2.displayBalance();
    }
}
//---------------------------------------------------------------------------------
// Base class Person
class Person {
    protected String name;
    protected int age;

    // Constructor for Person
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void displayPerson() {
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
    }
}


class Employee extends Person {
    private String employeeID;
    private double salary;

    public Employee(String name, int age, String employeeID, double salary) {
        super(name, age); // Initialize Person attributes
        this.employeeID = employeeID;
        this.salary = salary;
    }


    public void displayEmployee() {
        // Call base class method
        super.displayPerson();
        System.out.println("Employee ID: " + employeeID);
        System.out.println("Salary: " + salary);
    }


    public static void main(String[] args) {
        Employee emp = new Employee("Akash", 24, "EMP253344", 50000.0);
        emp.displayEmployee();
    }
}