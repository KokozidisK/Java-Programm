package api.classes;

/**
 * Η κλάσση Date αντιπρωσοπεύει μλια ημερομηνία
 */

public class Date {

    private int day,mounth,year;

    public Date(int day,int mounth,int year){
        this.day=day;
        this.mounth=mounth;
        this.year=year;
    }

    public String getDate(){
        return day+"/"+mounth+"/"+year;
    }

    /**
     * Η μέθοδοςς getDifDate επιστρέφει την διαφορά των ημερομηνίων σε μέρες/μηνες/χρόνια δέχοντας 
     * ως είσοδο μία ημερομηνία μεγαλύτερη της τωρινής
     * @return
     */
    public String getDifDate(Date date){
        
        if(year>date.year){
            return "Provided date is smaller than the current";
        
        }
        else if(year==date.year){
            if (mounth>date.mounth) {
                return "Provided date is smaller than the current";
            }
            else if(mounth==date.mounth){
                if (day>date.day) {
                    return "Provided date is smaller than the current";
                }
            }
        }

        int tempDay,tempMounth,tempYear;

        tempYear=date.year-year;
        
        if(mounth>date.mounth){
            tempMounth=date.mounth+(12-mounth);
        }
        else{
            tempMounth=date.mounth-mounth;
        }
        
        if(day>date.day){
            tempMounth--;
            if(mounth==2){
                tempDay=date.day+(28-day);
            }
            else if(mounth%2==0){
                tempDay=date.day+(31-day);
            }
            else{
                tempDay=date.day+(30-day);
            }
        }
        else{
            tempDay=date.day-day;
        }

        
        return tempDay+"/"+tempMounth+"/"+tempYear;

    }
    /**
    public static void main(String[] args) {
        Date first=new Date(5, 11, 2023);
        Date last=new Date(1,4,2024);

        System.out.println(first.getDifDate(last));
    }
    */

}
