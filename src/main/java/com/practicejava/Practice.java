package com.practicejava;

public class Practice {
    public static void main(String[] args) {

        Animal animal = new Animal();
        animal.eat();

        Cat cat = new Cat();
        cat.eat();

        Dog dog = new Dog();
        dog.eat();

        Animal animal2 = new Cat();
        animal2.eat();
        Animal animal3 = new Dog();
        animal3.eat();

//        Bank b = new Bank();
//        b.deposite(500);
//        System.out.println(b.getBalance());

    }
}

//polymorphism


//inheritance
class Animal {
    public void eat() {
        System.out.println("eat");
    }
}

class Cat extends Animal {
    public void eat() {
        System.out.println("cat eat");
    }
}

class Dog extends Animal {
    public void eat() {
        System.out.println("dog eat");
    }
}

//encapsulation
class Bank {
    private String accNum;
    private double balance;

    public Bank() {

    }

    public Bank(String accNum, double balance) {
        this.accNum = accNum;
        this.balance = balance;
    }

    public String getAccNum() {
        return accNum;
    }

    public void setAccNum(String accNum) {
        this.accNum = accNum;
    }

    public double getBalance() {
        return balance;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    public void deposite(double amount) {
        if (amount > 0) {
            balance += amount;
        } else {
            System.out.println("enter valid amount.");
        }
    }

    public void withdraw(double amount) {
        if (amount > balance) {
            System.out.println("Insufficient funds.");
        } else {
            balance -= amount;
        }
    }

}
