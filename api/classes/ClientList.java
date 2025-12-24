package api.classes;
import java.util.*;
/**
 * Η κλάση αυτή αναπαριστά μια λίστα πελατών με βασικές λειτουργίες προσθήκης,επεξεργασίας και αναζήτησης
 */
public class ClientList {

    HashMap<String, Client> clientList;
    public ClientList(){
        clientList=new HashMap<>();
    }

    /**
     * Προσθέτει έναν πελάτη στην λίστα αν αυτός δεν υπάρχει ήδη
     * @param client
     */
    public void addClient(Client client){
        String afm=client.getAfm();
        if(clientList.containsKey(afm)==false){
            clientList.put(afm,client);
        }
        else{
            System.out.println("Client with this afm already exists");
        }
    }

    /**
     * Μέθοδος που αλλάζει το όνομα ενός πελάτη
     * @param client
     */
    public void editName(Client client){
        String afm=client.getAfm();
        Scanner scr=new Scanner(System.in);

        System.out.println("Please give the new clinet's name");
        String name=scr.next();
        StringOps flag=new StringOps(false);
        while(flag.chechForDigit(name)){
            System.out.println("Name had a digit, please try again");
            name=scr.next();
        }

        clientList.get(afm).setName(name);
    }

    public void editTel(Client client){
        String afm=client.getAfm();
        Scanner scr=new Scanner(System.in);

        System.out.println("Please give a new telephone number \n");
        String tel=scr.next();

        boolean flag=false;
        for(int i=0;i<tel.length();i++){
            if(tel.charAt(i)>'9' || tel.charAt(i)<'0'){
                flag=true;
            }
        }

        while(flag){
            flag=false;
            System.out.println("Telephone contained characters, please try again");
            tel=scr.next();

            for(int i=0;i<tel.length();i++){
                if(tel.charAt(i)>'9' || tel.charAt(i)<'0'){
                    flag=true;
                }
            }
        }

        clientList.get(afm).setTel(tel);
        
    }
    
}
