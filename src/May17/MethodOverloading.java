package May17;

public class MethodOverloading {

    public String name(String firstName){
        return "Hello "+firstName;
    }
    public String name(String firstName,String middleName){
        return "Hello "+firstName+" "+middleName;
    }
    public String name(String firstName,String middleName,String lastName){
        return "Hello "+firstName+" "+middleName+" "+lastName;
    }

    public String Salary(int Salary){
        return "Your Salary "+Salary;
    }
    public String Salary(int salary,int bonus){
        return "Your Salary and bonus "+salary+" "+bonus;
    }
    public String Salary(int salary,int bonus,int incentive){
        return "Your Salary,onus and incentive "+salary+" "+bonus+" "+incentive;
    }




}
