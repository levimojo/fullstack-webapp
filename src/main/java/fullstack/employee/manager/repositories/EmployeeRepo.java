package fullstack.employee.manager.repositories;

import fullstack.employee.manager.model.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.Optional;

public interface EmployeeRepo extends JpaRepository<Employee, Long> {

    //Spring understands the naming convention and creates these methods
    //Spring query method

    void deleteEmployeeById(Long id);

    Optional<Employee> findEmployeeById(Long id);
}
