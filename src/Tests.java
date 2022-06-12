import javax.swing.JOptionPane;

public class Tests {
	static int atbilde;
	static int pareizi = 0;
	static boolean pareizi1 = false;
	static boolean pareizi2 = false;
	static boolean pareizi3 = false;
	static boolean pareizi4 = false;
	static boolean pareizi5 = false;
	static boolean pareizi6 = false;
	static boolean pareizi7 = false;
	static boolean pareizi8 = false;
	static boolean pareizi9 = false;
	static boolean pareizi10 = false;
	static String rezultats;
	public static void pazinojums(){
    	JOptionPane.showMessageDialog(null, "Esiet sveicināti elektroniskā testā, kurš pārbaudīs jūsu zināšanas par programmēšanas valodas Java mainīgajiem un to datu tipiem!"
    			+ "\nTestā būs jautājumi kurām ir vairākas atbildes!"
    			+ "\nJa iesniegtu atbildi uz jautājuma, rakstiet visus atbilžu variantus kopā!"
    			+ "\nPiemēram atbilde ir pirmais un otrais atbilžu variants, tad jūs rakstīsiet 12 vai 21"
    			+ "\nSpiediet pogu ar apzīmējumu OK lai sāktu testu!");
    }
    public static void Jautajums1(){
        atbilde = Integer.parseInt(JOptionPane.showInputDialog("1. Jautājums\n Ar kuriem mainīgiem datu tipiem var veikt matemātiskās darbības?"
        		+ "\n 1. Int "
        		+ "\n 2. Char "
        		+ "\n 3. Double "
        		+ "\n 4. Boolean"));
        if(atbilde == 13 || atbilde == 31) {
        	pareizi = pareizi + 1;
        	pareizi1 = true;
        }
    }
    public static void Jautajums2(){
        atbilde = Integer.parseInt(JOptionPane.showInputDialog("2. Jautājums\n Kuras no šīm mainīgo datu tipiem varētu izmantot lai saglabātu kāda dzimšanas gadu?"
        		+ "\n 1. Byte "
        		+ "\n 2. Short "
        		+ "\n 3. Int "
        		+ "\n 4. Long"));
        if(atbilde == 234 || atbilde == 243 || atbilde == 324 || atbilde == 342 || atbilde == 423 || atbilde == 432) {
        	pareizi = pareizi + 1;
        	pareizi2 = true;
        }
    }
    public static void Jautajums3(){
        atbilde = Integer.parseInt(JOptionPane.showInputDialog("3. Jautājums\n Kurus no šīm mainīgiem datu tipiem varētu izmantot lai saglabātu decimāl skaitļus?"
        		+ "\n 1. Long "
        		+ "\n 2. Float "
        		+ "\n 3. Double "
        		+ "\n 4. Int"));
        if(atbilde == 23 || atbilde == 32) {
        	pareizi = pareizi + 1;
        	pareizi3 = true;
        }
    }
    public static void Jautajums4(){
        atbilde = Integer.parseInt(JOptionPane.showInputDialog("4. Jautājums\n Kuri no šīm mainīgiem ir definēti pareizi?"
        		+ "\n 1. double skaitlis; "
        		+ "\n 2. float 3skaitlis; " 
        		+ "\n 3. int skaitlis-15; "
        		+ "\n 4. char burts; "));
        if(atbilde == 14 || atbilde == 41) {
        	pareizi = pareizi + 1;
        	pareizi4 = true;
        }
    }
    public static void Jautajums5(){
        atbilde = Integer.parseInt(JOptionPane.showInputDialog("5. Jautājums\n Kuriem no šīm mainīgiem ir dotas nepareizas vērtības?"
        		+ "\n 1. char burts = 'a'; "
        		+ "\n 2. double x = 2.3;" 
        		+ "\n 3. boolean atbilde = patiess; "
        		+ "\n 4. int skaitlis = \"1\";"));
        if(atbilde == 34 || atbilde == 43) {
        	pareizi = pareizi + 1;
        	pareizi5 = true;
        }
    }
    public static void Jautajums6(){
        atbilde = Integer.parseInt(JOptionPane.showInputDialog("6. Jautājums\n Kuriem no šīm mainīgo datu tipiem izmantosi lai aprēķinātu trījstūra laukumu?"
        		+ "\n 1. Float "
        		+ "\n 2. Int " 
        		+ "\n 3. Double "
        		+ "\n 4. Long "));
        if(atbilde == 13 || atbilde == 31) {
        	pareizi = pareizi + 1;
        	pareizi6 = true;
        }
    }
    public static void Jautajums7(){
        atbilde = Integer.parseInt(JOptionPane.showInputDialog("7. Jautājums\n Kuriem no šīm mainīgo datu tipiem izmantosi lai saglabātu burtus?"
        		+ "\n 1. Byte "
        		+ "\n 2. Char " 
        		+ "\n 3. Boolean "
        		+ "\n 4. String "));
        if(atbilde == 24 || atbilde == 42) {
        	pareizi = pareizi + 1;
        	pareizi7 = true;
        }
    }
    public static void Jautajums8(){
        atbilde = Integer.parseInt(JOptionPane.showInputDialog("8. Jautājums\n Kuriem no šīm mainīgajiem aizņem 2 baitu atmiņas lai definētu?"
        		+ "\n 1. Short "
        		+ "\n 2. Char " 
        		+ "\n 3. Int "
        		+ "\n 4. Boolean "));
        if(atbilde == 12 || atbilde == 21) {
        	pareizi = pareizi + 1;
        	pareizi8 = true;
        }
    }
    public static void Jautajums9(){
        atbilde = Integer.parseInt(JOptionPane.showInputDialog("9. Jautājums\n Kuras no šīm vērtībām varētu dot būla tipa mainīgajam?"
        		+ "\n 1. TRUE "
        		+ "\n 2. false " 
        		+ "\n 3. nepatiess "
        		+ "\n 4. true "));
        if(atbilde == 24 || atbilde == 42) {
        	pareizi = pareizi + 1;
        	pareizi9 = true;
        }
    }
    public static void Jautajums10(){
        atbilde = Integer.parseInt(JOptionPane.showInputDialog("10. Jautājums\n Kuriem no šīm mainīgo datu tipiem sākuma vērtība ir 0"
        		+ "\n 1. Short "
        		+ "\n 2. Int " 
        		+ "\n 3. Long "
        		+ "\n 4. Float "));
        if(atbilde == 123 || atbilde == 132 || atbilde == 213 || atbilde == 231 || atbilde == 321 || atbilde == 312) {
        	pareizi = pareizi + 1;
        	pareizi10 = true;
        }
    }
    public static void rezultats(){
    	 rezultats = JOptionPane.showInputDialog(null, "Apsveicu jūs abildējāt uz "+pareizi+" no 10 jautājumiem pareizi!\n"
    			+ "\nPlusi ir pareizās atbildes!"
    			+ "Jūs varat apskatīt jūsu rezultātus katrā jautājumā ierakstot tā atiecošā numuru:"
    			+ "\n1. Jautājums"
    			+ "\n2. Jautājums"
    			+ "\n3. Jautājums"
    			+ "\n4. Jautājums"
    			+ "\n5. Jautājums"
    			+ "\n6. Jautājums"
    			+ "\n7. Jautājums"
    			+ "\n8. Jautājums"
    			+ "\n9. Jautājums"
    			+ "\n10 Jautājums"
    			+ "\n Q - lai beigtu testu!");
    	switch(rezultats) {
    	case "1" : atbilde1(); break;
    	case "2" : atbilde2(); break;
    	case "3" : atbilde3(); break;
    	case "4" : atbilde4(); break;
    	case "5" : atbilde5(); break;
    	case "6" : atbilde6(); break;
    	case "7" : atbilde7(); break;
    	case "8" : atbilde8(); break;
    	case "9" : break;
    	case "10" : break;
    	default : JOptionPane.showMessageDialog(null, "Uz redzēšanos!");
    	}
    }
    public static void atbilde1() {
    	if(pareizi1 == true) {
    		JOptionPane.showMessageDialog(null,"1. Jautājums\n Ar kuriem mainīgiem datu tipiem var veikt matemātiskās darbības?"
    	        		+ "\n 1. Int + "
    	        		+ "\n 2. Char "
    	        		+ "\n 3. Double + "
    	        		+ "\n 4. Boolean"
    	        		+ "\nJūs atbildējot uz šo jautājumu pareizi!"
    	        		+ "\nPunkti: 1 / 1");
    		   rezultats();
    	}else {
 		    JOptionPane.showMessageDialog(null,"1. Jautājums\n Ar kuriem mainīgiem datu tipiem var veikt matemātiskās darbības?"
	        		+ "\n 1. Int + "
	        		+ "\n 2. Char "
	        		+ "\n 3. Double + "
	        		+ "\n 4. Boolean"
	        		+ "\nJūs atbildējot uz šo jautājumu nepareizi!"
	        		+ "\nJo tikai Int un Double tipa mainīgos šajā gadijumā var izmantot lai darītu matemātiskās darbības!"
	        		+ "\nPunkti 0 / 1");
 		       rezultats();
    	}
    }
    public static void atbilde2() {
    	if(pareizi2 == true) {
    		JOptionPane.showMessageDialog(null, "2. Jautājums\n Kuras no šīm mainīgo datu tipiem varētu izmantot lai saglabātu kāda dzimšanas gadu?"
            		+ "\n 1. Byte "
            		+ "\n 2. Short + "
            		+ "\n 3. Int + "
            		+ "\n 4. Long + "
            		+ "\nJūs atbildējot uz šo jautājumu pareizi!"
	        		+ "\nPunkti: 1 / 1");
    		   rezultats();
    	}else {
    		JOptionPane.showMessageDialog(null, "2. Jautājums\n Kuras no šīm mainīgo datu tipiem varētu izmantot lai saglabātu kāda dzimšanas gadu?"
            		+ "\n 1. Byte "
            		+ "\n 2. Short + "
            		+ "\n 3. Int + "
            		+ "\n 4. Long +"
	        		+ "\nJūs atbildējot uz šo jautājumu nepareizi!"
	        		+ "\nJo Byte tipa mainīgā maksimālā vērtība ir 127!"
	        		+ "\nPunkti 0 / 1");
 		       rezultats();
    	}
    }
        public static void atbilde3() {
        	if(pareizi3 == true) {
        		JOptionPane.showMessageDialog(null,"3. Jautājums\n Kurus no šīm mainīgiem datu tipiem varētu izmantot lai saglabātu decimāl skaitļus?"
                		+ "\n 1. Long "
                		+ "\n 2. Float + "
                		+ "\n 3. Double + "
                		+ "\n 4. Int"
                		+ "\nJūs atbildējot uz šo jautājumu pareizi!"
                		+ "\nPunkti: 1 / 1");
        		   rezultats();
        	}else {
        		JOptionPane.showMessageDialog(null,"3. Jautājums\n Kurus no šīm mainīgiem datu tipiem varētu izmantot lai saglabātu decimāl skaitļus?"
                		+ "\n 1. Long "
                		+ "\n 2. Float + "
                		+ "\n 3. Double + "
                		+ "\n 4. Int"
    	        		+ "\nJūs atbildējot uz šo jautājumu nepareizi!"
    	        		+ "\nJo Long un Int tipa mainīgos var tikaim rakstīt veselus skaitļus!"
    	        		+ "\nPunkti 0 / 1");
     		       rezultats();
        	}
    }
        public static void atbilde4() {
        	if(pareizi4 == true) {
        		JOptionPane.showMessageDialog(null,"4. Jautājums\n Kuri no šīm mainīgiem ir definēti pareizi?"
                		+ "\n 1. double skaitlis; + "
                		+ "\n 2. float 3skaitlis; " 
                		+ "\n 3. int skaitlis-15; "
                		+ "\n 4. char burts; + "
                		+ "\nJūs atbildējot uz šo jautājumu pareizi!"
                		+ "\nPunkti: 1 / 1");
        		   rezultats();
        	}else {
        		JOptionPane.showMessageDialog(null,"4. Jautājums\n Kuri no šīm mainīgiem ir definēti pareizi?"
                		+ "\n 1. double skaitlis; + "
                		+ "\n 2. float 3skaitlis; " 
                		+ "\n 3. int skaitlis-15; "
                		+ "\n 4. char burts; + "
    	        		+ "\nJūs atbildējot uz šo jautājumu nepareizi!"
    	        		+ "\nJo kad definējot mainīgo nevar rakstīt sākumā ciparu un arī nevar rakstīt - zimi!"
    	        		+ "\nPunkti 0 / 1");
     		       rezultats();
        	}
    }
        public static void atbilde5() {
        	if(pareizi5 == true) {
        		JOptionPane.showMessageDialog(null,"5. Jautājums\n Kuriem no šīm mainīgiem ir dotas nepareizas vērtības?"
                		+ "\n 1. char burts = 'a';  "
                		+ "\n 2. double x = 2.3; " 
                		+ "\n 3. boolean atbilde = patiess; +"
                		+ "\n 4. int skaitlis = \"1\"; +"
                		+ "\nJūs atbildējot uz šo jautājumu pareizi!"
                		+ "\nPunkti: 1 / 1");
        		   rezultats();
        	}else {
        		JOptionPane.showMessageDialog(null,"5. Jautājums\n Kuriem no šīm mainīgiem ir dotas nepareizas vērtības?"
                		+ "\n 1. char burts = 'a';  "
                		+ "\n 2. double x = 2.3; " 
                		+ "\n 3. boolean atbilde = patiess; +"
                		+ "\\n 4. int skaitlis = \"1\"; +"
    	        		+ "\nJūs atbildējot uz šo jautājumu nepareizi!"
    	        		+ "\nJo boolean tipa mainīgā vērtība ir jāraksta angliski kā true un int vērtība nevar būt teksts!"
    	        		+ "\nPunkti 0 / 1");
     		       rezultats();
        	}
    }
        public static void atbilde6() {
        	if(pareizi6 == true) {
        		JOptionPane.showMessageDialog(null,"6. Jautājums\n Kuriem no šīm mainīgo datu tipiem izmantosi lai aprēķinātu trījstūra laukumu?"
                		+ "\n 1. Float + "
                		+ "\n 2. Int " 
                		+ "\n 3. Double + "
                		+ "\n 4. Long "
                		+ "\nJūs atbildējot uz šo jautājumu pareizi!"
                		+ "\nPunkti: 1 / 1");
        		   rezultats();
        	}else {
        		JOptionPane.showMessageDialog(null,"6. Jautājums\n Kuriem no šīm mainīgo datu tipiem izmantosi lai aprēķinātu trījstūra laukumu?"
                		+ "\n 1. Float + "
                		+ "\n 2. Int " 
                		+ "\n 3. Double + "
                		+ "\n 4. Long "
    	        		+ "\nJūs atbildējot uz šo jautājumu nepareizi!"
    	        		+ "\nJo reiķiot trījstūra laukumu rezultāts gandrīz vienmār būs decimāl skaitlis!"
    	        		+ "\nPunkti 0 / 1");
     		       rezultats();
        	}
    }
        public static void atbilde7() {
        	if(pareizi7 == true) {
        		JOptionPane.showMessageDialog(null,"7. Jautājums\n Kuriem no šīm mainīgo datu tipiem izmantosi lai saglabātu burtus?"
                		+ "\n 1. Byte "
                		+ "\n 2. Char +" 
                		+ "\n 3. Boolean "
                		+ "\n 4. String +"
                		+ "\nJūs atbildējot uz šo jautājumu pareizi!"
                		+ "\nPunkti: 1 / 1");
        		   rezultats();
        	}else {
        		JOptionPane.showMessageDialog(null,"7. Jautājums\n Kuriem no šīm mainīgo datu tipiem izmantosi lai saglabātu burtus?"
                		+ "\n 1. Byte "
                		+ "\n 2. Char +" 
                		+ "\n 3. Boolean "
                		+ "\n 4. String +"
    	        		+ "\nJūs atbildējot uz šo jautājumu nepareizi!"
    	        		+ "\nJo tikai Char un String tipa mainīgie var saglabāt burtus!"
    	        		+ "\nPunkti 0 / 1");
     		       rezultats();
        	}
    }
        public static void atbilde8() {
        	if(pareizi8 == true) {
        		JOptionPane.showMessageDialog(null,"8. Jautājums\n Kuriem no šīm mainīgajiem aizņem 2 baitu atmiņas lai definētu?"
                		+ "\n 1. Short + "
                		+ "\n 2. Char + " 
                		+ "\n 3. Int "
                		+ "\n 4. Boolean "
                		+ "\nJūs atbildējot uz šo jautājumu pareizi!"
                		+ "\nPunkti: 1 / 1");
        		   rezultats();
        	}else {
        		JOptionPane.showMessageDialog(null,"8. Jautājums\n Kuriem no šīm mainīgajiem aizņem 2 baitu atmiņas lai definētu?"
                		+ "\n 1. Short + "
                		+ "\n 2. Char + " 
                		+ "\n 3. Int "
                		+ "\n 4. Boolean "
    	        		+ "\nJūs atbildējot uz šo jautājumu nepareizi!"
    	        		+ "\nJo Int aizņem 4 baitus atmiņas un Boolean aizņem 1 baitu atmiņas lai definētu!"
    	        		+ "\nPunkti 0 / 1");
     		       rezultats();
        	}
    }
	public static void main(String[] args) {
		pazinojums();
        Jautajums1();
        Jautajums2();
        Jautajums3();
        Jautajums4();
        Jautajums5();
        Jautajums6();
        Jautajums7();
        Jautajums8();
        Jautajums9();
        Jautajums10();
        rezultats();
	}
}
