import comp102x.IO;

public class Q13
{
        private int a;

        public Q13() {
            a = 2;
        }
        
        public Q13(int p) {
            a = p;
        }
        
        public void fun( ) {
            IO.outputln(a);
        }
        
        public void fun(int p, int q) {
            q = p / a;
            IO.outputln(a + p + q);
        }
        
        public void fun(int p, double q) {
            q = a / p;
            IO.outputln(a + p - q);
        }
         public int countDivisible(int first , int second)
         {
             int divisor = 0;
             for(int i = first;i <= second;i++){
                
                if (i%3 ==0 && i%9 !=0){
                    divisor++;
                }
                 
                }
             return divisor;
         }
          public void printNumberLine(int seqCenter, int length) {
//                int[] anArray;
//               int tempLenght = length;
//                
//                if (length/2 - seqCenter != 0 && seqCenter !=0){
//                  length = length/2 + seqCenter;
//                 }
//                 if (seqCenter ==0){
//                     length =1;
//                 }
//               anArray = new int[(length)];
//               anArray[(length/2)] = seqCenter;
//               boolean flag = false;
//              
//               for (int i = 0;i <(length/2);i++){
//                   if ((seqCenter -1- i) !=0){
//                   anArray[((length/2)-1-i)] = seqCenter -1- i;
//                   anArray[((length/2)+1+i)] = seqCenter -1- i;
//                   flag = true;
//                 }
//                 else
//                 {   
//                     
//                     
//                     flag = false;
//                     break;
//                 }
//             }
//                 
//                 
//                 if (flag == true){ 
//                 for (int i = 0; i < anArray.length; i++) {
//                      
//                         System.out.print(anArray[i]);
//                     }
//                 }
//                 else{
//                      for (int i = 0; i <(tempLenght/2)-seqCenter;i++ )
//                      {
//                          System.out.print(" ");
//                        }
//                        for (int i = 0; i < anArray.length; i++) {
//                      
//                         System.out.print(anArray[i]);
//                     }
//                     for (int i = 0; i <(tempLenght/2)-seqCenter;i++ )
//                      {
//                          System.out.print(" ");
//                        }
//                 }
//                System.out.println();
        	String value= "";
        int i=0,j=0;
        for ( i=0;i<=seqCenter;i++){
            value+=i;
            j++;
        }
         
        for ( i=seqCenter-1;i>=0;i--)    {
            value+=i;
            j++;
        }
         
        if (j==length)
            System.out.println(value);
        else{
            int y=length-j;
            String extra="";
            for (i=0;i<y/2;i++)
                extra+=" ";
                value=extra+value+extra;
                 System.out.println(value);
                }
            }
             public void printNumberDiamond(int diaCenter){
                int length = 2*diaCenter + 1;
                for (int i = 0;i <=diaCenter;i++){
                    printNumberLine(i,length);
                }
                for (int i = (diaCenter-1);i >=0;i--){
                    printNumberLine(i,length);
                }
                }
            
        public static void main(String[ ] args) {
            // implementation given below
            //Q13 c4 = new Q13( 2 );
            //c4.fun( 4, 2.0 );
           //Q13 c2 = new Q13( );
           //c2.fun( 3, 2 );
           Q13 c1 = new Q13( 2 );
           c1.fun( );
        }
}