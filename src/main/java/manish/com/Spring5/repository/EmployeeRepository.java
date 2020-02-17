package manish.com.Spring5.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import manish.com.Spring5.Model.Employee;

@Repository
public interface EmployeeRepository extends JpaRepository<Employee, Long> {
}