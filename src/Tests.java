import javax.swing.JOptionPane;

public class Tests {
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
	public static void pazinojums(){
    	JOptionPane.showMessageDialog(null, "Esiet sveicināti elektroniskā testā, kurš pārbaudīs jūsu zināšanas par programmēšanas valodas Java mainīgajiem un to datu tipiem!"
    			+ "\nTestā būs jautājumi kurām ir vairākas atbildes!"
    			+ "\nJa iesniegtu atbildi uz jautājuma, rakstiet visus atbilžu variantus kopā!"
    			+ "\nPiemēram atbilde ir pirmais un otrais variants tad jūs rakstīsiet 12 vai 21"
    			+ "\nSpiediet pogu ar apzīmējumu OK lai sāktu testu!");
    }
    public static void Jautajums1(){
        int atbilde = Integer.parseInt(JOptionPane.showInputDialog("1. Jautājums\n Ar kuriem mainīgiem datu tipiem var veikt matemātiskās darbības!"
        		+ "\n 1. Int "
        		+ "\n 2. Char "
        		+ "\n 3. Double "
        		+ "\n 4. Boolean"));
        if(atbilde == 13 || atbilde == 31) {
        	pareizi = pareizi + 1;
        	pareizi1 = true;
        	System.out.print("Pareizi");
        }
    }
    public static void Jautajums2(){
        int atbilde = Integer.parseInt(JOptionPane.showInputDialog("2. Jautājums\n Kuras no šīm mainīgo datu tipiem varētu izmantot lai saglabātu !"
        		+ "\n 1. Byte "
        		+ "\n 2. Short "
        		+ "\n 3. Int "
        		+ "\n 4. Long"));
        if(atbilde == 234 || atbilde == 243 || atbilde == 324 || atbilde == 342 || atbilde == 423 || atbilde == 432) {
        	pareizi = pareizi + 1;
        	pareizi2 = true;
        	System.out.print("Pareizi");
        }
    }
    public static void Jautajums3(){
        int atbilde = Integer.parseInt(JOptionPane.showInputDialog("3. Jautājums\n Kurus no šīm mainīgiem datu tipiem varētu izmantot lai saglabātu decimāl skaitļus!"
        		+ "\n 1. Long "
        		+ "\n 2. Float "
        		+ "\n 3. Double "
        		+ "\n 4. Int"));
        if(atbilde == 23 || atbilde == 32) {
        	pareizi = pareizi + 1;
        	pareizi3 = true;
        	System.out.print("Pareizi");
        }
    }
    public static void Jautajums4(){
        int atbilde = Integer.parseInt(JOptionPane.showInputDialog("4. Jautājums\n Kuri no šīm mainīgiem ir definēti pareizi!"
        		+ "\n 1. double skaitlis; "
        		+ "\n 2. float 3skaitlis" 
        		+ "\n 3. int skaitlis-15 "
        		+ "\n 4. char burts"));
        if(atbilde == 14 || atbilde == 41) {
        	pareizi = pareizi + 1;
        	pareizi4 = true;
        	System.out.print("Pareizi");
        }
    }
	public static void main(String[] args) {
		pazinojums();
        Jautajums1();
        Jautajums2();
        Jautajums3();
        Jautajums4();
	}

}
