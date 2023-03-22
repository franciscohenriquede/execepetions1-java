package Udemy.EF174.aplication;
import java.util.Date;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Scanner;

import Udemy.EF174.entities.reservation;
public class programan{
public static void main(String [] args) throws ParseException {
Scanner sc  = new Scanner(System.in);
SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
System.out.print("Rooom numbers");
int number = sc.nextInt();
System.out.println("date check in dd/MM/yyyy ");
Date checkIn = sdf.parse(sc.next());
System.out.print("data de check out:");
Date CheckOut = sdf.parse(sc.next()) ;

 if(!CheckOut.after(checkIn)){
   System.out.print("error in reservation :check out date must be after check in date");
}
else{
    reservation reservation = new reservation(number, checkIn, CheckOut);
    System.out.print("reservation" +reservation);

 
 System.out.print("");
 System.out.print("enter data to update the reservation");
 System.out.print("check-in date (dd/MM/yyyy)");
 checkIn = sdf.parse(sc.next());
 System.out.print("check out date dd//MM/yyyy");
 CheckOut = sdf.parse(sc.next());

 Date now = new Date() ;
  if (checkIn.before(now) || CheckOut.before(now)){
   System.out.println ("erro in reservation : Reservationn dates for update must be future") ; 
  }
   else if (!CheckOut.after(checkIn)){
     System.out.print ("error in reservation , check-out date must be after check in date");
   
   }
    else{ 
      reservation.uptadeDates(checkIn, CheckOut);
      System.out.print("reservation" +reservation);
      

    }
  }
sc.close();
}
}
