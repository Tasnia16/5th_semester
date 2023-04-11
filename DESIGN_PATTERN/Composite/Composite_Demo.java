package Composite;

public class Composite_Demo {
    public static void main(String[] args){

    Developer developer=new Developer("Esha", "Developer1",1);
    Developer developer2=new Developer("Tasnia", "Developer2",13);
    Tester tester1=new Tester("Sara","Tester1",33);
    Tester tester2=new Tester("Efad","Tester3",53);
    Tester tester3=new Tester("Sohana","Tester5",90);

    CompanyHeads developerHead=new CompanyHeads();
    developerHead.add_employee(developer);
    developerHead.add_employee(developer2);

    CompanyHeads testerHead =new CompanyHeads();
    testerHead.add_employee(tester1);
        testerHead.add_employee(tester2);
        testerHead.add_employee(tester3);


        CompanyHeads companyHeads=new CompanyHeads();
        companyHeads.add_employee(developerHead);
        companyHeads.add_employee(testerHead);

        companyHeads.show_employee_detail();
    }



}
