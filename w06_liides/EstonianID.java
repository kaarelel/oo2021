/* import java.time.LocalDate;
import java.time.Month;
import java.time.Period;
import java.util.Calendar;

public class EstonianID implements PersonalCodeBehaviour{
    private String code;

    public EstonianID(String code){ //konstruktor
        this.code = code;
    }


    @Override
    public String getGender() {
        int gender = Integer.parseInt(code.substring(0, 1));
        return gender % 2 == 0 ? "Female" : "Male"; */

        //Võimalus1
        /* String gender;
        if((code.charAt(0))%2==0){
            gender = "Female";
        } else {
            gender = "Male";
        }
        // TODO Auto-generated method stub
        return null; */

        //Võimalus 2
        /* int gender = Integer.parseInt(code.substring(0, 1));
        if (gender % 2 == 0){
            return "female";
        } else {
            return "male";
        } */
/*     }

    @Override
    public int getFullYear() { */
       /*  Calendar cal = Calendar.getInstance();
        int idyear = Integer.parseInt(code.substring(1, 3));
        int nowyear = cal.get(Calendar.YEAR);
        int year = nowyear - idyear;  */

        //int year = 1800 + (Integer.parseInt(code.substring(0,1))/2)*100+(Integer.parseInt(code.substring(1,3)));

        //int fullYear = 1800 + Math.round(Integer.parseInt(code.substring(0,1))/2)*100 + Integer.parseInt(code.substring(1,3)) ;



 /*        int year = Integer.parseInt(code.substring(1, 3));

        if(year < 100 && year > 25){
            int fullYear = year + 1900;
            return fullYear;
        } else if (year < 25){
            int fullYear = year + 2000;
            return fullYear;
        }
        return year;
        // TODO Auto-generated method stub
        //return 0;
    }


    @Override
    public String geDOB() {
       
        int dob = Integer.parseInt(code.substring(3, 5) + " . " + Integer.parseInt(code.substring(5, 7) + " . " + getFullYear()));
        return dob;  */
        // TODO Auto-generated method stub
        //return null; */

 /*    }

    @Override
    public int getAge() {
       return null;
    }


    
}
 */

import java.time.LocalDate;
import java.util.Calendar;

public class EstonianID implements PersonalCodeBehaviour {
    private String code;

    public EstonianID(String code) {
        this.code = code;
    }



    @Override
    public String getGender() {
        int codeGender = code.charAt(0);
        /*if(codeGender % 2 == 0 ) {
            return "Female";
        } else {
            return "Male";
        }*/
        return codeGender % 2 == 0 ? "Female" : "Male";
    }

    @Override
    public int getFullYear() {
        int gender = Integer.parseInt(code.substring(0, 1));
        String year = code.substring(1, 3);

        if(gender == 2 || gender == 1){
            year = "18" + year;
        } else if(gender == 4 || gender == 3){
            year = "19" + year;
        } else if(gender == 6 || gender == 5){
            year = "20" + year;
        }
        /*int fullYear = 1800 + Math.round(Integer.parseInt(code.substring(0,1))/2)*100 + Integer.parseInt(code.substring(1,3));*/
        /*int fullYear = 1800 + (Integer.parseInt(code.substring(0,1)) / 2)* 100 + (Integer.parseInt(code.substring(1,3)));*/
        return Integer.parseInt(year);
    }

    @Override
    public String geDOB() {
        String month = code.substring(3, 5);
        String day = code.substring(5, 7);

        return day + "." + month + "." + this.getFullYear();
    }

    @Override
    public int getAge() {

        Calendar cal = Calendar.getInstance();
        int nowyear = cal.get(Calendar.YEAR);
        int year = nowyear - this.getFullYear(); 
        return year;

    }



    @Override
    public String getDay() {
        String day = code.substring(5, 7);
        return day;
    }



    @Override
    public String getMonth() {
        String month = code.substring(3, 5);
        return month;
    }

}