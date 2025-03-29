import java.util.*;
class task2{
   public static void main(String args[]){
Scanner sc=new Scanner(System.in);
System.out.println("STUDENT GRADE CALCULATOR");
System.out.println("Take marks obtained (out of 100) in each subject.\n");
System.out.println("Enter the number of subjects: ");
 int sub=sc.nextInt();
System.out.println("Enter the marks of each subject: ");
int[] array = new int[sub];
for(int i=0;i<sub;i++){
array[i] = sc.nextInt();
}
float sum=0;
for(int i=0;i<sub;i++){
sum+=array[i];
}
System.out.println("\nSum of all the marks: "+sum);

float avg=(sum/sub);
 System.out.println("Average Percentage: "+avg+"%");
 
 System.out.println("Grade obtained: ");
 int grade=(int) avg;
 if(grade>=90 && grade<=100){
     System.out.println("A");
 }
 else if(grade>=80 && grade<=89){
     System.out.println("B");
 }
 else if(grade>=70 && grade<=79){
     System.out.println("C");
 }
 else if(grade>=60 && grade<=69){
     System.out.println("D");
 }
 else if(grade<60){
     System.out.println("F");
 }
 else{
     System.out.println("Invalid calculation");
     
 }
 sc.close();
}
}