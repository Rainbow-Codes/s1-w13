import java.util.Random;

public class Generator {

   private Random randGen;
   private BarChart12 bars;

   public Generator ( ) {
      randGen = new Random ( );
      bars = new BarChart12();
   }

   
   public int generator1( ) {
      return randGen.nextInt(6)+1;
   }
    
   
   public int generator2( ) {
      return randGen.nextInt(6) + randGen.nextInt(6) + 2;
   }
   
   
   public int generator3( ) {
      return randGen.nextInt(12) + 1;
   }
   
   
   public int generator4(int a) {
      int temp = a;
      while(temp == a){
         temp = randGen.nextInt(6)+1;
      }
      return temp;
   }
   
   
   public void tester (int whichTest, int howMany) {
      int k;
      k = 0;
      bars.clear();        // clear the graph
      while (k < howMany) {
         if (whichTest == 1) {
            bars.add(generator1 ( ));
         } else if (whichTest == 2) {
            bars.add(generator2( ));
         } else if (whichTest == 3) {
            bars.add(generator3( ));
         } else if (whichTest == 4) {
            bars.add(generator4(2));
         } else {
            System.out.println("I don't have such a test!");
            break;
         };
         k = k + 1;
      }
      bars.updateUI();     // tells the bar chart to update its picture
   }

   public static void main(String[] args) {
      Generator g = new Generator();
      //g.tester(1,1000);
      //g.tester(2,1000);
      //g.tester(3,1000);
      g.tester(4,1000);
   }
}
