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
        while(isRunning){
        System.out.println("Here is your balance: $"+balance);
        for (int x=0;x<stocks.length;x++){
            System.out.println(stocks[x]+"-$" +prices[x] +" || Shares Owned:" + shares[x]);
        }

        System.out.println("What do you want to do\n1) Buy Stock\n2) Sell Stock \n3) Next Day \n4) Exit");
        int action = kb.nextInt();
        if (action ==1) {
            System.out.println("Which stock do you want to buy. Type 1 2 or 3 for each one respectively "); //ask by numb
             int stockchoice = kb.nextInt() - 1; 
            System.out.println("How many shares?");
            int amount=kb.nextInt();
            double cost= prices[stockchoice] *amount;
            if (cost <= balance){
                balance-=cost;
                shares[stockchoice]+=amount;
                System.out.println("Investment successfull!");
            }
            else{
                System.out.println("Not enough money to do this investment");
            }
        }else if(action==2){
                System.out.println("Which stocks do you want to sell? (1-" + stocks.length + ")");
                int stockchoice=kb.nextInt() -1;
                System.out.println("How many");  //change this prd
                int amount=kb.nextInt();
                if(amount <=shares[stockchoice]){
                    double money=prices[stockchoice]*amount;
                    //do to add money to account after selling shares
                    balance+=money;
                    shares[stockchoice]-=amount;
                    System.out.println("Stocks sold");
                }else{
                    System.out.println("You don't own that many shares to sell");
                }
            }else if (action ==3){
                //next day so stock prices randomly change
                //Random rand=new Random();
                for(int x=0; x<prices.length;x++){
                    //prices changng
                    double change=rand.nextDouble()*10-5;
                    prices[x]+=change;
                    if(prices[x]<1){
                        //price dont go under one dollar
                        prices[x]=1;
                    }

                }
                 System.out.println("Price has changed!");
            } else if(action== 4){
                isRunning=false;
                  System.out.println("  Portfolio balance: $" + balance);
                  System.out.println("Thanks for playing! Hope you enjoyed :D!");
            }
            }

       
    }
    }
