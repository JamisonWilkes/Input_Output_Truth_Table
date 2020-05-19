//Jamison Wilkes
//Program 6-Input/Output Table
import javax.swing.*;
public class InOutTable
{
   public static void main(String[] args)
   {
      boolean a,b,c,d,e; 
        
      System.out.println("    " + "a" + "        " + "b" + "        " + "c" + "        " + "d" + "        " + "e" + "        " + "(( c + ~d ) * b ) * ~( d + a * e )");
      
      System.out.println();
      a = true; b = true; c = true; d = true; e = true; 
      System.out.printf(  "%8s %8s %8s %8s %8s %11s\n", a, b, c, d, e, ((c || !d) && b) && !(d || a && e ));
      
      a = true; b = true; c = true; d = true; e = false;
      System.out.printf(  "%8s %8s %8s %8s %8s %11s\n", a, b, c, d, e, ((c || !d) && b) && !(d || a && e ));

      a = true; b = true; c = true; d = false; e = true;
      System.out.printf(  "%8s %8s %8s %8s %8s %11s\n", a, b, c, d, e, ((c || !d) && b) && !(d || a && e ));

      a = true; b = true; c =true; d = false; e = false;
      System.out.printf(  "%8s %8s %8s %8s %8s %11s\n", a, b, c, d, e, ((c || !d) && b) && !(d || a && e ));

      a = true; b = true; c = false; d = true; e = true;
      System.out.printf(  "%8s %8s %8s %8s %8s %11s\n", a, b, c, d, e, ((c || !d) && b) && !(d || a && e ));

      a = true; b = true; c = false; d = true; e = false;
      System.out.printf(  "%8s %8s %8s %8s %8s %11s\n", a, b, c, d, e, ((c || !d) && b) && !(d || a && e ));

      a = true; b = true; c = false; d = false; e = true; 
      System.out.printf(  "%8s %8s %8s %8s %8s %11s\n", a, b, c, d, e, ((c || !d) && b) && !(d || a && e ));

      a = true; b = true; c = false; d = false; e = false;
      System.out.printf(  "%8s %8s %8s %8s %8s %11s\n", a, b, c, d, e, ((c || !d) && b) && !(d || a && e ));

      a = true; b = false; c = true; d = true; e = true;
      System.out.printf(  "%8s %8s %8s %8s %8s %11s\n", a, b, c, d, e, ((c || !d) && b) && !(d || a && e ));

      a = true; b = false; c = true; d = true; e = false;
      System.out.printf(  "%8s %8s %8s %8s %8s %11s\n", a, b, c, d, e, ((c || !d) && b) && !(d || a && e ));

      a = true; b = false; c = true; d = false; e = true;
      System.out.printf(  "%8s %8s %8s %8s %8s %11s\n", a, b, c, d, e, ((c || !d) && b) && !(d || a && e ));

      a = true; b = false; c = true; d = false; e = false;
      System.out.printf(  "%8s %8s %8s %8s %8s %11s\n", a, b, c, d, e, ((c || !d) && b) && !(d || a && e ));

      a = true; b = false; c = false; d = true; e = true;
      System.out.printf(  "%8s %8s %8s %8s %8s %11s\n", a, b, c, d, e, ((c || !d) && b) && !(d || a && e ));

      a = true; b = false; c = false; d = true; e = false;
      System.out.printf(  "%8s %8s %8s %8s %8s %11s\n", a, b, c, d, e, ((c || !d) && b) && !(d || a && e ));

      a = true; b = false; c = false; d = false; e = true; 
      System.out.printf(  "%8s %8s %8s %8s %8s %11s\n", a, b, c, d, e, ((c || !d) && b) && !(d || a && e ));

      a = true; b = false; c = false; d = false; e = false;
      System.out.printf(  "%8s %8s %8s %8s %8s %11s\n", a, b, c, d, e, ((c || !d) && b) && !(d || a && e ));

      a = false; b = true; c = true; d = true; e = true;
      System.out.printf(  "%8s %8s %8s %8s %8s %11s\n", a, b, c, d, e, ((c || !d) && b) && !(d || a && e ));

      a = false; b = true; c = true; d = true; e = false; 
      System.out.printf(  "%8s %8s %8s %8s %8s %11s\n", a, b, c, d, e, ((c || !d) && b) && !(d || a && e ));

      a = false; b = true; c = true; d = false; e = true;
      System.out.printf(  "%8s %8s %8s %8s %8s %11s\n", a, b, c, d, e, ((c || !d) && b) && !(d || a && e ));

      a = false; b = true; c = true; d = false; e = false;
      System.out.printf(  "%8s %8s %8s %8s %8s %11s\n", a, b, c, d, e, ((c || !d) && b) && !(d || a && e ));

      a = false; b = true; c = false; d = true; e = true;
      System.out.printf(  "%8s %8s %8s %8s %8s %11s\n", a, b, c, d, e, ((c || !d) && b) && !(d || a && e ));

      a = false; b = true; c = false; d = true; e = false; 
      System.out.printf(  "%8s %8s %8s %8s %8s %11s\n", a, b, c, d, e, ((c || !d) && b) && !(d || a && e ));

      a = false; b = true; c = false; d = false; e = true;
      System.out.printf(  "%8s %8s %8s %8s %8s %11s\n", a, b, c, d, e, ((c || !d) && b) && !(d || a && e ));

      a = false; b = true; c = false; d = false; e = false; 
      System.out.printf(  "%8s %8s %8s %8s %8s %11s\n", a, b, c, d, e, ((c || !d) && b) && !(d || a && e ));

      a = false; b = false; c = true; d = true; e = true;
      System.out.printf(  "%8s %8s %8s %8s %8s %11s\n", a, b, c, d, e, ((c || !d) && b) && !(d || a && e ));

      a = false; b = false; c = true; d = true; e = false;
      System.out.printf(  "%8s %8s %8s %8s %8s %11s\n", a, b, c, d, e, ((c || !d) && b) && !(d || a && e ));

      a = false; b = false; c = true; d = false; e = true;
      System.out.printf(  "%8s %8s %8s %8s %8s %11s\n", a, b, c, d, e, ((c || !d) && b) && !(d || a && e ));

      a = false; b = false; c = true; d = false; e = false; 
      System.out.printf(  "%8s %8s %8s %8s %8s %11s\n", a, b, c, d, e, ((c || !d) && b) && !(d || a && e ));

      a = false; b = false; c = false; d = true; e = true;
      System.out.printf(  "%8s %8s %8s %8s %8s %11s\n", a, b, c, d, e, ((c || !d) && b) && !(d || a && e ));

      a = false; b = false; c = false; d = true; e = false; 
      System.out.printf(  "%8s %8s %8s %8s %8s %11s\n", a, b, c, d, e, ((c || !d) && b) && !(d || a && e ));

      a = false; b = false; c = false; d = false; e = true; 
      System.out.printf(  "%8s %8s %8s %8s %8s %11s\n", a, b, c, d, e, ((c || !d) && b) && !(d || a && e ));

      a = false; b = false; c = false; d = false; e = false;
      System.out.printf(  "%8s %8s %8s %8s %8s %11s\n", a, b, c, d, e, ((c || !d) && b) && !(d || a && e ));
         
              
}
}