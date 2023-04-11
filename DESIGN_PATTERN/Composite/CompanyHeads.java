package Composite;

import java.util.ArrayList;

public class CompanyHeads implements Employee{
    ArrayList<Employee>employees;

    CompanyHeads()
    {
        this.employees=new ArrayList<>();
    }

    public void add_employee(Employee employee)
    {
        this.employees.add(employee);
    }

    @Override
    public void show_employee_detail() {
        for( Employee e:employees)
        {
            e.show_employee_detail();
        }

    }
}
