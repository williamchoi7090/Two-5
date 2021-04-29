public class Queue{
  static class a{
    int share, price;
    a next;
    public a(int share, int price){
      this.share= share;
      this.price= price;
      this.next= null;
    }
  }
  private a head, tail;
  public Queue(){
    this.head= null;
    this.tail= null;
  }
  public void enqueue(int share, int price){
    a b= new a(share, price);
    if (this.tail == null){
      this.head= this.tail= b;
      return;
    }
    this.tail.next= b;
    this.tail= b;
  }
  public void dequeue(){
    if (this.head == null){
      return;
    }
    this.head= this.head.next;
    if (this.head == null){
      this.tail= null;
    }
  }
  public a peek(){
    return this.head;
  }
}