package hibernate.manytomany.facade;

import hibernate.manytomany.Company;
import hibernate.manytomany.Employee;
import hibernate.manytomany.dao.CompanyDao;
import hibernate.manytomany.dao.EmployeeDao;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CompanyEmployeeFacadeTestSuite {

    @Autowired
    private CompanyDao companyDao;
    @Autowired
    private EmployeeDao employeeDao;
    @Autowired
    private CompanyEmployeeFacade companyEmployeeFacade;

    private ArrayList<Company> companyList = new ArrayList<>();
    private ArrayList<Employee> employeeList = new ArrayList<>();

    @Test
    public void testFindCompanyAndEmployee() {
        // Given
        Company nokia = new Company("Nokia");
        Company santander = new Company("Santander");
        Employee goodEmployee = new Employee("Good", "Employee");
        Employee badEmployee = new Employee("Bad", "Employee");

        nokia.getEmployees().add(goodEmployee);
        nokia.getEmployees().add(badEmployee);
        santander.getEmployees().add(goodEmployee);
        santander.getEmployees().add(badEmployee);

        goodEmployee.getCompanies().add(nokia);
        badEmployee.getCompanies().add(santander);

        companyDao.save(nokia);
        companyDao.save(santander);




        //When
        List<Company> result = companyEmployeeFacade.retrieveCompanyLike("ok");

        //Then
        Assert.assertEquals(1, result.size());

        //CleanUp
        try {
            companyDao.delete(nokia);
            companyDao.delete(santander);
        } catch (Exception e) {
            //
        }




    }
}
