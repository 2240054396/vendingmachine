package com.company;
import java.util.Scanner;
public class Main {

    public static void main(String[] args) {
    vendingmachine vm = new vendingmachine();
    Scanner in =new Scanner(System.in);
    System.out.println("Money Price Total");
    vm.money=in.nextInt();
    vm.price=in.nextInt();
    vm.total=in.nextInt();
    vm.showmoney();
    vm.shwprice();
    vm.showtotal();
    vm.buy();
    vm.showmoney();
    vm.showtotal();
    }
}
class vendingmachine{
    int price;
    int total;
    int money;
    void welcome(){
        System.out.println("Welcome");
    }
    void showtotal(){
        System.out.println("Total:"+this.total);
    }
    void showmoney(){
        System.out.println("Money:"+this.money);
    }
    void shwprice(){
        System.out.println("Price:"+this.price);
    }
    void buy(){
        this.total+=this.price;
        this.money-=this.price;
        System.out.println("Here you are");
    }
}