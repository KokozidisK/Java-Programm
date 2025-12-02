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
  public int findIndex(Car car){
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
    int index=findIndex(car);
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
          System.out.println("Given plate comply with the standard template");
        }
      }
    }
    
  }

  /**
   * Μέθοδος που αλλάζει την μάρκα του αυτοκινήτου αν δεν υπάρχουν αριθμοί
   * @param car
   */
  public void editBrand(Car car){
    int index=findIndex(car);
    Scanner scr=new Scanner(System.in);
    String brand;
    boolean exists;
    

    do { 
      exists=false;
      System.out.println("Please insert the new brand: ");
      brand=scr.next();
      for(int i=0;i<brand.length();i++){
        if(brand.charAt(i)>='0' && brand.charAt(i)<='9'){
          exists=true;
          System.out.println("Input contains number!");
        }
      }
        
    } while (exists);

    carList.get(index).setBrand(brand);

  }


  /*/  
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
