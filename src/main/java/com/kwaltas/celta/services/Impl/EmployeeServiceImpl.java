package com.kwaltas.celta.services.Impl;
import com.kwaltas.celta.entities.Employee;
import com.kwaltas.celta.services.EmployeeService;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;


@Repository
@Transactional
public class EmployeeServiceImpl implements EmployeeService {

    @PersistenceContext
    private EntityManager entityManager;

    @Override
    public List<Employee> getEmployees() {
        String query = "FROM Employee";
        entityManager.createQuery(query).getResultList();
        return entityManager.createQuery(query).getResultList();

    }
}

