package api.classes;
import java.util.*;

public class CarList {
  HashMap<Integer,Car>carList;

  public CarList(){
      carList=new HashMap<>();
  }

  /**
   * Μέθοδος που ειπστρέφει το κλειδί του ανικτειμένου
   * @param car
   * @return το ID του αμαξιου
   */
  public int findId(Car car){
    return car.getId();
  }

  /**
   * Μέθοδος που δέχεται έναν δείκτη και επιστρέξει το αμάξι της 
   * λίστας που αντιστοιχεί στον συγκεκριμένο δείκτη
   * @param index Id αυτοκινήτου
   * @return      αντικείμενο αμάξι
   */
  public Car getCar(int index){
    return carList.get(index);
  }

  /**
   * Η μέθοδος προσθέτει ένα αμάξι στην λίστα μόνο αν δεν υπάρχει ήδη καταχωρημένο
   * αμάξι με την ίδια πινακίδα
   * @param car
   */
  public void addCar(Car car){
    int index=car.getId();
    boolean exists=plateExists(car);

    if(exists==false){
      carList.put(index,car);
    }

  }

  /**
   * Μέθοδος που ελέγχει για την ύπαρξη του αμαξιού στην λίστα με την ίδια πινακίδα
   * @param car
   * @return true ή false αν υπάρχει ή όχι το αμάξι αντίστοιχα
   */
  public boolean plateExists(Car car){
    String plate=car.getPlate();
    for(int i:carList.keySet()){
      if(carList.get(i).getPlate().equals(plate)){
        System.out.println("Plate number already exists");
        
        return true;
      }
    }
    
    return false;
  }

  /**
   * Μέθοδος που αλλάζει την πινακίδα του αυτοκινήτου ελέγχωντας 
   * να μην υπάρχει αμάξι στην λίστα με την ίδια πινακίδα με την 
   * μεθοδο {@code } plateExists και η
   * πινακίδα να έχει 3 γράμματα και 4 αριθμούς
   * @param car
   */
  public void changePlate(Car car){
    int index=car.getId();
    Scanner scr=new Scanner(System.in);
    System.out.println("Give a new plate number: ");
    String plate=scr.next().toUpperCase();
    
    int i=0;
    int charSum=0;
    int intSum=0;

    while(i<plate.length()){
      if(plate.charAt(i)>='A' && plate.charAt(i)<='Z'){
        charSum++;
      }
      else if(plate.charAt(i)>='0' && plate.charAt(i)<='9'){
        intSum++;
      }
      
      i++;
      if(i==plate.length()){
        if(charSum!=3 || intSum!=4 || plateExists(car)==true){
          i=0;
          charSum=0;
          intSum=0;
          System.out.println("Give another plate because it doesnt comply to the standards or already exists");
          plate=scr.next().toUpperCase();
        }
        else{
          System.out.println("Given plate complies with the standard template");
          carList.get(index).setPlate(plate);
        }
      }
    }
    
  }

  /**
   * Μέθοδος που αλλάζει την μάρκα του αυτοκινήτου αν δεν υπάρχουν αριθμοί
   * εφαρμόζοντας μια επαναληπτική διαδικασία που ελέγχει ένα προς ένα τα στοιχεία
   * του String εισόδου,και αν περιέχει αριθμό εμφανίζει το κατάλληλο μήνυμα και
   * ξαναζητά είσοδο
   * @param car
   */
  public void editBrand(Car car){
    int index=car.getId();
    Scanner scr=new Scanner(System.in);
    String brand;
    StringOps exists=new StringOps();
    

    do { 
      System.out.println("Please insert the new brand: ");
      brand=scr.next();
              
    } while (exists.chechForDigit(brand));

    carList.get(index).setBrand(brand);

  }

  /**
   * Μέθοδος που αλλάζει τον τύπο του αυτοκινήτου ελέγχοντας αν υπάρχουν
   * στοιχεία στην είσοδο που δίνεται
   * @param car
   */
  public void editType(Car car){
    int index=car.getId();
    String type;
    Scanner scr=new Scanner(System.in);

    type=scr.next();
    StringOps f=new StringOps();

    while(f.chechForDigit(type)){
      System.out.println("Digit was inserted please try again: ");
      type=scr.next();
      
    }

    carList.get(index).setType(type);
  }

  public void editModel(Car car){
    int index=car.getId();
    String model;
    Scanner scr=new Scanner(System.in);

    model=scr.next();
    StringOps flag=new StringOps();

    while(flag.chechForDigit(model)){
      System.out.println("Number was inserted, please give another model: ");
      model=scr.next();
    }
    carList.get(index).setModel(model); 
   
  }
  


  /** 
  public static void main(String[] args) {
      Car car1=new Car("akn1342", "Toyota", "4x4", "SUV", 2020, "Red", true);
      Car car2=new Car("arn1342", "Nissan", "4x4", "SUV", 2020, "Red", true);
      Car car3=new Car("ayn1342", "BWM", "4x4", "SUV", 2020, "Red", true);

      System.out.println(car1.getId());
      System.out.println(car2.getId());
      System.out.println(car3.getId());

      CarList list=new CarList();
      list.addCar(car1);
      list.addCar(car2);
      list.addCar(car3);

      System.out.println(list.getCar(1).getBrand());
      System.out.println(list.getCar(2).getBrand());
      System.out.println(list.getCar(3).getBrand());

      list.editBrand(car1);
      list.editBrand(car2);
      list.editBrand(car3);

      System.out.println(list.getCar(1).getBrand());
      System.out.println(list.getCar(2).getBrand());
      System.out.println(list.getCar(3).getBrand());
  }
  */
    
}
