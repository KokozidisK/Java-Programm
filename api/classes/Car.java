package api.classes;


/**
 * Η κλάση Car αντιπροσωπεύει ένα αμάξι με κωδικό,πινακίδα,μάρκα,τύπο,μοντέλο,
 * έτος κατασκευής,χρώμα,κατάσταση διαθεσιμότητας
 */

public class Car{
    private int id,year;
    private String plate,brand,type,model,color;
    private boolean avaliable;
    private static int idcounter=1;

    /**
     * Κατασκευαστής της κλάσης Car που αρχικοποιεί τα πεδία με εξαίρεση
     * το id όπου το αυξάνει κατά ένα
     * 
     * @param id        ο κωδικός του αυτοκινήτου
     * @param plate     η πινακίδα του αυτοκινήτου
     * @param brand     η μάρκα του αυτοκινήτου
     * @param type      τύπος του αυτοκινήτου
     * @param model     το μοντέλο του αυτοκινήτου
     * @param year      το έτος κατασκευής
     * @param color     το χρώμα του αυτοκινήτου
     * @param avaliable η κατάσταση
     * @param idcounter μετρητής κωδικών αυτοκινήτων
    */
    public Car(String plate,String brand,String type,String model,int year,String color,boolean avaliable){
        this.plate=plate;
        this.brand=brand;
        this.type=type;
        this.model=model;
        this.year=year;
        this.color=color;
        this.avaliable=avaliable;
        this.id=idcounter;

        this.idcounter++;
    }
    
    /**
     * Επιστρέφει τον κωδικό του αυτοκινήτου
     * 
     * @return κωδικό
     */
    public int getId(){
        return id;
    }

    /**
     * Επιστρέφει την πινακίδα
     * 
     * @return πινακίδα
     */
    public String getPlate(){
        return plate;
    }

    /**
     * Επιστρέφει την μάρκα
     * 
     * @return μάρκα
     */
    public String getBrand(){
        return brand;
    }


    /**
     * Επιστρέφει τον τύπο
     * 
     * @return τύπο
     */
    public String getType(){
        return type;
    }

    /**
     * Επιστρέφει το μοντέλο
     * 
     * @return μοντέλο
     */
    public String getModel(){
        return model;
    }

    /**
     * Επιστρέφει το έτος κατασκευής
     * 
     * @return έτος κατασκευής
     */
    public int getYear(){
        return year;
    }

    /**
     * Επιστρέφει το χρώμα
     * 
     * @return χρώμα
     */
    public String getColor(){
        return color;
    }

    /**
     * Επιστρέφει την διαθεσιμότητα
     * 
     * @return διαθεσιμότητα
     */
    public boolean getAvaliability(){
        return avaliable;
    }

    /**
     * Θέτει την πινακίδα
     * 
     * @param pl
     */
    public void setPlate(String pl){
        this.plate=pl;
    }

    /**
     * Θέτει την μάρκα
     * 
     * @param br
     */
    public void setBrand(String br){
        this.brand=br;
    }
    
    /**
     * Θέτει τον τύπο
     * 
     * @param tp
     */
    public void setType(String tp){
        this.type=tp;
    }
    
    /**
     * θέτει το μοντέλο
     * 
     * @param md
     */
    public void setModel(String md){
        
        this.model=md;
    }

    /**
     * Θέτει το έτος κατασκευής
     * 
     * @param yr
     */
    public void setYear(int yr){
        this.year=yr;
    }

    /**
     * Θέτει το χρώμα
     * 
     * @param cl
     */
    public void setColor(String cl){
        this.color=cl;
    }


    public void setAvaliability(boolean av){
        this.avaliable=av;
    }

    /*
    public static void main(String[] args) {
        Car first=new Car("IKI2345","Toyota", "SUV", "Tractor", 2015, "Red", false);
        System.out.println(first.getBrand());
        first.setBrand("BMW");
        System.out.println(first.getBrand());
    }
    */   
}