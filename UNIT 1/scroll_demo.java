import java.awt.*;
import java.applet.*;
/*
<applet code="scroll_demo" width="500" height="500">
</applet>
*/
public class scroll_demo extends Applet
 {
  public void init()
   {
      Scrollbar sbl = new Scrollbar(Scrollbar.VERTICAL,0,1,0,50); 
	  Scrollbar sb2= new Scrollbar(Scrollbar.HORIZONTAL,0,1,0,50);
      add(sbl); 
      add(sb2);
	}
}	