import java.util.*;

public class stocksimulator{
    public static void main(String [] args){
        Scanner kb= new Scanner(System.in);
        Random rand= new Random();
        //TITLE BOX WITH EMojis

        System.out.println("<----- $$ STOCK MARKET SIMULATOR $$ ----->");
    
        // this is what user starts with the amount of money
        double balance=10000;
        String [] stocks= {"NVDA","TSLA","AMZN"};
        double []prices= {100.0,200.0,180.0};
        int[] shares = {0,0,0};
       // System.out.println(stocks[0]);
       // System.out.println(prices[2]);

        boolean isRunning= true;
      //  while(isRunning){
        System.out.println("Here is your balance: $"+balance);
        for (int x=0;x<stocks.length;x++){
            System.out.println(stocks[x]+"-$" +prices[x] +" | Shares Owned:" + shares[x]);
        }

        System.out.println("What do you want to do\n1) Buy Stock\n2) Sell Stock \n3) Next Day \n4) Exit");
        int action = kb.nextInt();
        if (action==1) {
            System.out.println("Which stock do you want to buy");
            
        }

            
       
   // }
    }
}     