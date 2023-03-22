package Udemy.EF174.entities;

import java.util.Date;
import java.text.SimpleDateFormat;
import java.util.concurrent.TimeUnit;

public class reservation {
   private Integer numbersRoom;
   private Date check_in ;
  private Date check_out;

  private static SimpleDateFormat sdf= new SimpleDateFormat("dd/MM/yyyy");
public reservation(Integer numbersRoom, Date check_in, Date check_out) {
    this.numbersRoom = numbersRoom;
    this.check_in = check_in;
    this.check_out = check_out;
}
public int getNumbersRoom() {
    return numbersRoom;
}
public void setNumbersRoom(int numbersRoom) {
    this.numbersRoom = numbersRoom;
}
public Date getCheck_in() {
    return check_in;
}

public Date getCheck_out() {
    return check_out;
}
public long Duration(){
long diff = check_out.getTime() - check_in.getTime();
return TimeUnit.DAYS.convert(diff, TimeUnit.MILLISECONDS);
}
   
public void uptadeDates(Date check_in , Date check_out){
     this.check_in = check_in;
     this.check_out = check_out;

}
@Override
public String toString(){
return "room"
+numbersRoom
   + "check in:  "
+ sdf.format(check_in)
+ ",  check out:  "
+ sdf.format(check_out)
+",  "
+   Duration()
+ " nights :  "  ;
}




}
