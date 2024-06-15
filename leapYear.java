import java.util.Scanner;
//leap year is divisible by 4
//when year is divisible by 4 and also by 100 is not leap unless divisible by 400 (leap year rules)
public class leapYear {
    public static void main(String[] args){
Scanner scan = new Scanner(System.in);
boolean isleap = false;
System.out.println("Enter year: ");
int year =scan.nextInt();
if(year % 4 == 0){
    if(year % 100 != 0 || year % 400 == 0){
        isleap =true;
     }
 }
 if(isleap){
    System.out.println(year+" is a leap year");
 }else{
    System.out.println(year+" is not a leap year");
 }
scan.close();
    }
}
