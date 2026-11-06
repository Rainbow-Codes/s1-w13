public class Craps
{
    DiceRoll r;
    
    public Craps()
    {
        r = new DiceRoll ( );
    }

    // Returns 0 if lose, otherwise the amount won.
    public int play ( ) {
        int pt = r.total();
        if (pt==2 || pt==3 || pt==12)
            return 0;
        if (pt==7 || pt==11)
            return pt;
        while(true){
            int roll = r.total();
            if (roll==pt)
                return pt;
            else if (roll==7)
                return 0;
        }
    }
    
    //simulate play to see your odds of winning
    public void tester(int howMany)
    {
        int totalLoses = 0;
    	for(int x=howMany; x!=0; x--){
            if(play()==0)
                totalLoses+=1;
        }
        System.out.println("Win %: "+1.0*(howMany-totalLoses)/howMany);
        System.out.println("Total of "+howMany+" rolls made with "+(howMany-totalLoses)+" wins");
    }


    public static void main(String[] args) {
        Craps c = new Craps();
        c.tester(100000);
    }
}
