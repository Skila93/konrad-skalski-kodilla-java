package com.kodilla.hibernate.manytomany.facade;

import com.kodilla.hibernate.manytomany.Company;
import com.kodilla.hibernate.manytomany.Employee;
import org.junit.Assert;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;


import java.util.List;

@SpringBootTest
public class EntitiesFacadeTest {

    @Autowired
    EmployeeSearchingFacade employeeSearchingFacade;

    @Test
    public void facadeCompanyTest() {
        //Given
        Employee johnSmith1 = new Employee("John", "Smith");
        Employee stephanieClarckson1 = new Employee("Stephanie", "Clarkson");
        Employee lindaKovalsky1 = new Employee("Linda", "Kovalsky");

        Company softwareMachine1 = new Company("Software Machine");
        Company dataMaesters1 = new Company("Data Maesters");
        Company greyMatter1 = new Company("Grey Matter");

        softwareMachine1.getEmployees().add(johnSmith1);
        dataMaesters1.getEmployees().add(stephanieClarckson1);
        dataMaesters1.getEmployees().add(lindaKovalsky1);
        greyMatter1.getEmployees().add(johnSmith1);
        greyMatter1.getEmployees().add(lindaKovalsky1);

        johnSmith1.getCompanies().add(softwareMachine1);
        johnSmith1.getCompanies().add(greyMatter1);
        stephanieClarckson1.getCompanies().add(dataMaesters1);
        lindaKovalsky1.getCompanies().add(dataMaesters1);
        lindaKovalsky1.getCompanies().add(greyMatter1);

        employeeSearchingFacade.save(softwareMachine1);
        int softwareMachineId = softwareMachine1.getId();
        employeeSearchingFacade.save(dataMaesters1);
        int dataMaestersId = dataMaesters1.getId();
        employeeSearchingFacade.save(greyMatter1);
        int greyMatterId = greyMatter1.getId();

        //When
        List<Company> threeFirstLetters;
        threeFirstLetters = employeeSearchingFacade.searchCompany("Sof");

        List<Company> anyLetters;
        anyLetters = employeeSearchingFacade.searchCompanyAny("ter");

        //Then
        try {
            Assert.assertEquals(1, threeFirstLetters.size());
            Assert.assertEquals(2, anyLetters.size());

            //CleanUp
            employeeSearchingFacade.delete(softwareMachineId);
            employeeSearchingFacade.delete(dataMaestersId);
            employeeSearchingFacade.delete(greyMatterId);
        } catch (Exception e){
        }
    }

    @Test
    public void facadeEmployeeTest() {
        //Given
        Employee johnSmith1 = new Employee("John", "Smith");
        Employee stephanieClarckson1 = new Employee("Stephanie", "Clarkson");
        Employee lindaKovalsky1 = new Employee("Linda", "Kovalsoky");

        Company softwareMachine1 = new Company("Software Machine");
        Company dataMaesters1 = new Company("Data Maesters");
        Company greyMatter1 = new Company("Grey Matter");

        softwareMachine1.getEmployees().add(johnSmith1);
        dataMaesters1.getEmployees().add(stephanieClarckson1);
        dataMaesters1.getEmployees().add(lindaKovalsky1);
        greyMatter1.getEmployees().add(johnSmith1);
        greyMatter1.getEmployees().add(lindaKovalsky1);

        johnSmith1.getCompanies().add(softwareMachine1);
        johnSmith1.getCompanies().add(greyMatter1);
        stephanieClarckson1.getCompanies().add(dataMaesters1);
        lindaKovalsky1.getCompanies().add(dataMaesters1);
        lindaKovalsky1.getCompanies().add(greyMatter1);

        employeeSearchingFacade.save(softwareMachine1);
        int softwareMachineId = softwareMachine1.getId();
        employeeSearchingFacade.save(dataMaesters1);
        int dataMaestersId = dataMaesters1.getId();
        employeeSearchingFacade.save(greyMatter1);
        int greyMatterId = greyMatter1.getId();

        //When
        List<Employee> lastname;
        lastname = employeeSearchingFacade.searchEmployee("Smith");

        List<Employee> anyLettersLastname;
        anyLettersLastname = employeeSearchingFacade.searchEmployeeAny("so");

        // Then
        try {
            Assert.assertEquals(1, lastname.size());
            Assert.assertEquals(2, anyLettersLastname.size());

            //CleanUp
            employeeSearchingFacade.delete(softwareMachineId);
            employeeSearchingFacade.delete(dataMaestersId);
            employeeSearchingFacade.delete(greyMatterId);
        } catch (Exception e){
        }
    }
}