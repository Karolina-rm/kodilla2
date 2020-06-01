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
    public void testFindCompany() {
        // Given
        Company nokia = new Company("Nokia");
        Company krokia = new Company("Krokia");
        Employee goodEmployee = new Employee("Good", "Employee");
        Employee badEmployee = new Employee("Bad", "Employee");

        nokia.getEmployees().add(goodEmployee);
        nokia.getEmployees().add(badEmployee);
        krokia.getEmployees().add(goodEmployee);
        krokia.getEmployees().add(badEmployee);

        goodEmployee.getCompanies().add(nokia);
        badEmployee.getCompanies().add(krokia);

        companyDao.save(nokia);
        companyDao.save(krokia);

        companyList.add(nokia);
        companyList.add(krokia);

        employeeList.add(goodEmployee);
        employeeList.add(badEmployee);


        //When
        List<Company> result = companyEmployeeFacade.retrieveCompanyLike("ok");

        //Then
        Assert.assertEquals(companyList.size(), result.size());

        //CleanUp
        try {
            companyDao.delete(nokia);
            companyDao.delete(krokia);
        } catch (Exception e) {
            //
        }




    }

    @Test
    public void testFindEmployee() {
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

        companyList.add(nokia);
        companyList.add(santander);

        employeeList.add(goodEmployee);
        employeeList.add(badEmployee);

        //When
        List<Employee> result = companyEmployeeFacade.retrieveEmployeeNameLike("oy");
        //Then
        Assert.assertEquals(employeeList.size(), result.size());

        //CleanUp
        try {
            companyDao.delete(nokia);
            companyDao.delete(santander);
        } catch (Exception e) {
            //
        }



    }
}
