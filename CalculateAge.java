import java.time.LocalDate;  
import java.time.Period;  
import java.time.temporal.ChronoUnit;  
import java.util.Scanner;  
public class  CalculateAge 
{  
public static void main(String args[])   
{  
LocalDate startDate = LocalDate.of(2000, 07, 25);  
LocalDate endDate = LocalDate.of(2022, 07, 28);
long years = ChronoUnit.YEARS.between(startDate, endDate);  

System.out.println("You are " + years+" years old.");  
}  
}  