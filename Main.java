import java.util.Scanner;

public class Main{
  public static void main(String[] args){
    Calc ulator = new Calc();
    Scanner n = new Scanner(System.in);
    int a;
    do{
      ulator.menu();
      a = n.nextInt();
      switch (a){
        case 1:
        System.out.println("How many shares would you like to buy?");
        int shares = n.nextInt();
        System.out.println("How much does one share cost?");
        int price = n.nextInt();
        ulator.buy(shares, price);
        break;
        case 2:
        System.out.println("How many share you you like to sell?");
        shares = n.nextInt();
        System.out.println("How much does one share cost?");
        price = n.nextInt();
        ulator.sell(shares, price);
        break;
        case 3:
        System.out.println(ulator.getTotCalc());
        break;
        case 4:
        break;
      }
    } 
    while (a!= 4);
  }
}