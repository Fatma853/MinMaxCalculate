import java.util.Scanner;
  class Main {
  public static void main(String[] args) {
    int n, a;
    Scanner input = new Scanner(System.in);
    System.out.println("Kaç tane sayı gireceksiniz? ");
    n= input.nextInt();
    int min=0 , max=0 , number;
    for(int i=1 ; i<=n ; i++ ) {
      System.out.println(i + ". Sayı değerini giriniz: ");
      number= input.nextInt();
      if(i==1 ){
        max=number;
        min=number;
      } else if (number<=min){
        min=number;
      }else {
        max=number;
      }
     
    }
    System.out.println("En büyük sayı değeri: " + max);    
    System.out.println("En küçük sayı değeri: " + min);
      
  }
}