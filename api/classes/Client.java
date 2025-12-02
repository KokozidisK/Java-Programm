package api.classes;

/**
 * Η κλάση Client αντιπροσωπεύει τους πελάτες 
 */

 public class Client{
    
    private String afm,name,tel,email;

    /**
     * Κατασκευαστής της κλάσης Client 
     * 
     * @param afm   ΑΦΜ
     * @param name  Ονοματεπώνυμο
     * @param tel   Τηλέφωνο
     * @param email Ηλεκτρονικό ταχυδρομίο
     */
    public Client(String afm,String name,String tel,String email){

        this.afm=afm;
        this.name=name;
        this.tel=tel;
        this.email=email;
    }

    /**
     * Επιστρέφει το ΑΦΜ
     * 
     * @return ΑΦΜ
     */
    public String getAfm(){
        return afm;
    }

    /**
     * Επιστρέφει το ονοματεπώνυμο
     * 
     * @return οματεπώνυμο
     */
    public String getName(){
        return name;
    }

    /**
     * Επιστρέφει το τηλέφωνο
     * 
     * @return τηλέφωνο
     */
    public String getTel(){
        return tel;
    }

    /**
     * Επιστρέφει το email
     * 
     * @return email
     */
    public String getEmail(){
        return email;
    }

    /**
     * Θέτει το ΑΦΜ
     * 
     * @param am
     */
    public void getAfm(String am){
        this.afm=am;
    }

    /**
     * Θέτει το όνομα
     * 
     * @param nm
     */
    public void setName(String nm){
        this.name=nm;
    }

    /**
     * Θέτει το τηλέφωνο
     * 
     * @param tl
     */
    public void setTel(String tl){
        this.tel=tl;
    }

    public void setEmail(String el){
        this.email=el;
    }
    
    /*/
    public static void main(String[] args) {
        Client client=new Client(231012545, "Kostas Kokozidis", "6989874398", "konstadinos.kokozidis@gmail.com");
        System.out.println(client.getName());
    }
    */
 }