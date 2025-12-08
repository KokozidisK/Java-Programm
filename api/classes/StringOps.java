package api.classes;

/**
 * Κλάση που ελέγχει για την εμφάνιση συγκεκριμένων ειδών χαρακτήρων σε ένα {@code}String αντικείμενο
 * και επιστρέφει αν ο έλεγχος είναι αληθής ή ψευδής
 */
public class StringOps {

    boolean value;

    public StringOps(){}
    
    public StringOps(boolean val){
        value=val;
    }
    /**
     * Ελέγχει για την ύπαρξη αριθμού μέσα σε ένα String επιστρέφοντας true αν υπάρχει ή
     * false στην αντίθετη περίπτωση
     * @param string
     * @return
     */
    public boolean chechForDigit(String string){

        for(int i=0;i<string.length();i++) {
            if(Character.isDigit(string.charAt(i))){
                System.out.println("Digit was insetred please give another type: ");
                return true;
                
            }
        }

        return false;
    }


}
