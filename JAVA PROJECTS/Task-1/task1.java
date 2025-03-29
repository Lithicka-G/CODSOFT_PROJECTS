import java.util.Random;
import java.util.Scanner;
class task1 {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
    Random random=new Random();
     int min=0,max=100;
     int Randomnum=(random.nextInt(max-min+1)+min);
     int count=0;
     int success=0;
     System.out.println("Welcome to Number Guessing Game!");
     System.out.println("The number will be between 1-100");
     System.out.println("There are 10 attempts");
     int n=10;
     
     for(int i=1;i<=n;i++){
     System.out.println("\nRound "+i);
     System.out.println("Guess the random number:");
     int s=sc.nextInt();
     
     if(s==Randomnum){
        System.out.println("!!Congratulations, You have guessed it right!!\n");
        success++;
        System.out.println("Game over! Your final score: "+i);
        break;
     }
     else{
        if(s>Randomnum){
            System.out.println("Too high!");
            count++;
        }
        if(s<Randomnum){
            System.out.println("Too low!");
            count++;
        }
     }
    }
     System.out.println("The number was: "+Randomnum);
     sc.close();
   }

}