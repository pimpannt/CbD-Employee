package hello;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.jpa.repository.JpaRepository;

import javax.transaction.Transactional;
import java.util.List;


// This will be AUTO IMPLEMENTED by Spring into a Bean called employeeRepository
// CRUD refers Create, Read, Update, Delete

/*public interface EmployeeRepository extends CrudRepository<Employee, Integer> {

}*/

public interface EmployeeRepository extends JpaRepository<Employee, Integer> {
    @Query(value = "UPDATE employee e SET e.hobby = ?1, e.name = ?2,e.project = ?3 WHERE e.employee_id = ?4"
            , nativeQuery = true)
    @Modifying
    @Transactional
    void update(String hobby,String name, String project, String empID);


}
