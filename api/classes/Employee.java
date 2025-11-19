package api.classes;

/**
 * Η κλάση Employee αντιπροσωπεύει έναν υππάλλο της αντιπορσωπείας με ονοματεπώνυμο
 * username,email,και κωδικο
 */

public class Employee {

    private String fullname,username,email,password;

    /**
     * 
     * @param fullname ονοματεπώνυμο
     * @param username username
     * @param email    email
     * @param password κωδικός
     */
    public Employee(String fullname,String username,String email,String password){
        this.fullname=fullname;
        this.username=username;
        this.email=email;
        this.password=password;
    }

    /**
     * @return ονοματεπώνυμο
     */
    public String getFullname(){
        return fullname;
    }

    /**
     * @return username
     */
    public String getUsername(){
        return username;
    }

    public String getEmail(){
        return email;
    }

    public  String getPassword(){
        return password;
    }

    public void setFullname(String fullname){
        this.fullname=fullname;
    }

    public void setUsername(String username){
        this.username=username;
    }

    public void setEmail(String email){
        this.email=email;
    }

    public void setPassowrd(String password){
        this.password=password;
    }
}
