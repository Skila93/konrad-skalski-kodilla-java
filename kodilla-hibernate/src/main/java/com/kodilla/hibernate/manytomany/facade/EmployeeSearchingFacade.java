package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import com.kodilla.hibernate.manytomany.dao.CompanyDao;
import com.kodilla.hibernate.manytomany.dao.EmployeeDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public final class EmployeeSearchingFacade {
    @Autowired
    CompanyDao companyDao;

    @Autowired
    EmployeeDao employeeDao;

    public void save(Company company) {
        companyDao.save(company);
    }

    public void delete(int company) {
        companyDao.deleteById(company);
    }


    public List<Employee> searchEmployee(String findEmployee) {
        List<Employee> lastname = employeeDao.retrieveWithLastname(findEmployee);
        return lastname;
    }

    public List<Employee> searchEmployeeAny(String findEmployee) {
        List<Employee> anyLettersLastname = employeeDao.retrieveWithAnyLettersLastname(findEmployee);
        return anyLettersLastname;
    }

    public List<Company> searchCompany(String findCompany) {
        List<Company> threeFirstLetters = companyDao.retrieveWithThreeFirstLetters(findCompany);
        return threeFirstLetters;
    }

    public List<Company> searchCompanyAny(String findCompany) {
        List<Company> anyLetters = companyDao.retrieveWithAnyLetters(findCompany);
        return anyLetters;
    }
}