package lab_5;

public class Doctor implements Staff {
 int salary =10000;
 int year = 2021;
    @Override
    public void GetSalary(int units) {
        System.out.println(units*salary);
    }


    @Override
    public void getYearsOfWork(int start_years) {
        System.out.println( year-start_years );
    }
   
}
