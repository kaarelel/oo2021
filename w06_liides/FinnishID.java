import java.util.Calendar;

public class FinnishID implements PersonalCodeBehaviour{
    
    private String code;

    public FinnishID(String code){
        this.code = code;
    }

    @Override
    public String getGender() {
       int codeGender = Integer.parseInt(code.substring(9, 10));
       return codeGender % 2 == 0 ? "Female" : "Male";
    }

    @Override
    public int getFullYear() {
        int codeCentury = code.charAt(6);
        String year = code.substring(4, 6);
        if (codeCentury == '+'){
            year = "18" + year;
        } else if (codeCentury == '-'){
            year = "19" + year;
        } else if (codeCentury == 'A'){
            year = "20" + year;
        }
        return Integer.parseInt(year);

       
    }

    @Override
    public String geDOB() {
        String month = code.substring(2, 4);
        String day = code.substring(0, 2);

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
        String day = code.substring(0, 2);
        return day;
    }

    @Override
    public String getMonth() {
        String month = code.substring(2, 4);
        return month;
    }
    
}
