package Udemy.EF174.aplication;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import Udemy.EF174.DomainException.domainException;
import Udemy.EF174.entities.reservation;
public class programan{
public static void main(String [] args) { 
Scanner sc  = new Scanner(System.in);
SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");

try { 
System.out.print("Rooom numbers");
int number = sc.nextInt();
System.out.println("date check in dd/MM/yyyy ");
Date checkIn = sdf.parse(sc.next());
System.out.print("data de check out:");
Date CheckOut = sdf.parse(sc.next()) ;


reservation reservation = new reservation(number, checkIn, CheckOut);
 System.out.println("reservation" +reservation);


 System.out.println("");
 System.out.println("enter data to update the reservation");
 System.out.print("check-in date (dd/MM/yyyy)");
 checkIn = sdf.parse(sc.next());
 System.out.print("check out date dd//MM/yyyy");
 CheckOut = sdf.parse(sc.next());

 
 reservation.uptadeDates(checkIn, CheckOut);
 System.out.println("reservation" +reservation);
   
}
  catch(ParseException e ){
    System.out.print ("invalid date format");
  }
  catch (domainException e){
    System.out.println("error in reservation: " +e.getMessage());
  }
  catch (RuntimeException e){
     System.out.print("uxexpected error");
  }
 sc.close();
  

}}
 

