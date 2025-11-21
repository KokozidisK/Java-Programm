package  api.classes;

/**
 * Η κλάση Rent υλοποιεί μία ενοικίαση με στοιχεία τον αριθμό ενοικίασης(id)
 * το αυτοκίνητο που ενοικιάζεται,ο πελάτης που το ενοικιάζει, ο υπάλληλος
 * που καταχώρησε την ενοικίαση και οι ημερομινίες έναρξης και λήξης 
 */
public  class Rent{

    private int id;
    Car car;
    Client client;
    Employee employee;
    Date starting,ending;


    private static int idCounter;

/**
 * 
 * @param id       κωδικός αυτοκινήτου
 * @param car      αμάξι προς ενοικίαση
 * @param client   πελάτης που νοικίαζει
 * @param starting ημερομηνία ενοικίασης
 * @param ending   ημερομηνία λήξης ενοικίασης
 * @param employee υπάλληλος που εκτελεί την ενοικίαση
 */
public Rent(int id,Car car,Client client,Date starting,Date ending,Employee employee){
    this.id=id;
    this.car=car;
    this.client=client;
    this.starting=starting;
    this.ending=ending;
    this.employee=employee;
}    

/**
 * 
 * @return κωδικό ενοικίασης
 */
public int getId(){
    return id;
}

/**
 * 
 * @return αυτοκίνητο προς ενοικίαση
 */
public Car getCar(){
    return car;
}

/**
 * 
 * @return πελάτης που νοικιάζει
 */
public Client getClient(){
    return client;
}

/**
 * 
 * @return ημερομηνλια έναρξης ενοικίασης
 */
public Date getStariDate(){
    return starting;
}

/**
 * 
 * @return ημερομηνία λήξης ενοικίασης
 */
public Date getEndDate(){
    return ending;
}

/**
 * 
 * @return υπάλληλος που πραγματοποίησε την ενοικίαση
 */
public Employee getEmployee(){
    return employee;
}
}