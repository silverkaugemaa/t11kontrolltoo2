package akordid;

public class Kolmkola {
   private int y;
   public Kolmkola(int põhitoon){
	   y=põhitoon;
   }
   public Kolmkola(String nimetus){
	   this(MuusikaAbi.leiaKorgus(nimetus));
   }
   public int toonika(){
	   return y;
   }
   public int terts(){
	   return y + 4;
   }
   public int kvint(){
	   return y + 7;
   }
   public String toString(){
	   return y+" "+terts()+" "+kvint();
   }
   public String tekstina(){
	   return MuusikaAbi.leiaTaht(y)+" "+MuusikaAbi.leiaTaht(terts())+
			   " "+MuusikaAbi.leiaTaht(kvint());
   }
}