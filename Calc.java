public class Calc{
  private double totCalc = 0;
  private Queue stock = new Queue();
  public void menu(){
    System.out.println("1. Buy");
    System.out.println("2. Sell");
    System.out.println("3. Capital Gain"); 
    System.out.println("4. Quit");
  }
  public double getTotCalc(){
    return totCalc;
  }
  public void sell(int shares, int price){
    while (shares != 0){
      int a= stock.peek().share;
      if (a <= shares){
        shares -= a;
        totCalc += a * (price- stock.peek().price);
        stock.dequeue();
      } 
      else{
        int remaining= a- shares;
        totCalc += shares * (price- stock.peek().price);
        shares= 0;
        stock.peek().share= remaining;
      }
    }
  }
  public void buy(int shares, int price){
    stock.enqueue(shares, price);
  }
}