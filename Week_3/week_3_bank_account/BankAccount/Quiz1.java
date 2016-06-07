import comp102x.IO;  
  
public class Quiz1 {
  
         int x;
          int y;
         int z;

        /*public Quiz1(int x) {
  
                x = x;
        }*/

        public static void main(String[] args) {
  
                //Quiz1 q1 = new Quiz1(10);
                IO.output("Enter your x: ");
               int x =IO.inputInteger();
               IO.output("Enter your y: ");
                int y =IO.inputInteger();
                IO.output("Enter your z: ");
                 int z =IO.inputInteger();
                
                if(z < y)
    if(x > y)
        x = 7;
else 
    x = 4; 
    IO.outputln(x);
        }
        
}