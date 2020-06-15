package hibernate.manytomany.facade;

import hibernate.manytomany.Company;
import hibernate.manytomany.Employee;
import hibernate.manytomany.dao.CompanyDao;
import hibernate.manytomany.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class CompanyEmployeeFacade {
    @Autowired
    private CompanyDao companyDao;

    @Autowired
    private EmployeeDao employeeDao;

    public List<Company> retrieveCompanyLike(String fragmentOfTheName) {
        return companyDao.retrieveCompanyNameLike(fragmentOfTheName);
    }

    public List<Employee> retrieveEmployeeNameLike(String fragmentOfTheName){
        return employeeDao.retrieveEmployeeNameLike(fragmentOfTheName);
    }
}