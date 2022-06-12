import javax.swing.JOptionPane;

public class Tests {
    public static void pazinojums(){
    	JOptionPane.showMessageDialog(null, "Esiet sveicināti elektroniskā testā, kurš pārbaudīs jūsu zināšanas par programmēšanas valodas Java mainīgajiem un to datu tipiem!"
    			+ "\nTestā būs jautājumi kurām ir vairākas atbildes!"
    			+ "\nJa iesniegtu atbildi uz jautājuma ierakstiet teksta logā jūsu izvēlētās atbildes ciparu tad atstarpi un velvienu ciparu!"
    			+ "\nSpiediet pogu ar apzīmējumu OK lai sāktu testu!");
    }
    public static int Jautajums1(int x, boolean pareizi){
        String atbilde = JOptionPane.showInputDialog("1. Jautājums\n Ar kuriem mainīgajiem var veikt matemātiskās darbības!"
        		+ "\n 1. Int "
        		+ "\n 2. Char "
        		+ "\n 3. Double "
        		+ "\n 4. Boolean");
        if(atbilde == "1 3" || atbilde == "3 1") {
        	x = x + 1;
        	pareizi = true;
        }
		return x;
    }
	public static void main(String[] args) {
		int punkti = 0;
		boolean pareizi1 = false;
		boolean pareizi2 = false;
		boolean pareizi3 = false;
		boolean pareizi4 = false;
		boolean pareizi5 = false;
		boolean pareizi6 = false;
		boolean pareizi7 = false;
		boolean pareizi8 = false;
		boolean pareizi9 = false;
		boolean pareizi10 = false;
		pazinojums();
        Jautajums1(punkti, pareizi1);
	}

}
