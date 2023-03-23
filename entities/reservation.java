package Udemy.EF174.entities;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;

import Udemy.EF174.DomainException.domainException;

public class reservation {
   private Integer numbersRoom;
   private Date checkIn ;
  private Date checkOut;

  private static SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");
public reservation(Integer numbersRoom, Date checkIn, Date checkOut) throws domainException{
     if (!checkOut.after(checkIn)){
        throw new domainException("error in reservation , check-out date must be after check in date");
       
       }
         
  
    this.numbersRoom = numbersRoom;
    this.checkIn = checkIn;
    this.checkOut = checkOut;
}
public int getNumbersRoom() {
    return numbersRoom;
}
public void setNumbersRoom(int numbersRoom) {
    this.numbersRoom = numbersRoom;
}
public Date getCheck_in() {
    return checkIn;
}

public Date getCheck_out() {
    return checkOut;
}
public long Duration(){
long diff = checkOut.getTime() - checkIn.getTime();
return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
}
   
public void  uptadeDates(Date checkIn , Date checkOut) throws domainException{
    Date now = new Date() ;
  if ( checkIn.before(now) || checkOut.before(now)){
   throw new domainException( "erro in reservation : Reservationn dates for update must be future") ; 
  }
   else if (!checkOut.after(checkIn)){
    throw new domainException("error in reservation , check-out date must be after check in date");
   
   }
     
   this.checkIn = checkIn;
     this.checkOut = checkOut;

}
@Override
public String toString(){
return "room:  "
+numbersRoom
   + "   check in:  "
+ sdf.format(checkIn)
+ ",  check out:  "
+ sdf.format( checkOut)
+",  "
+   Duration()
+ " nights :  "  ;
}


}


