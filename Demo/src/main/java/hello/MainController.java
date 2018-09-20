package hello;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
@RequestMapping(path="/demo") // This means URL's start with /demo (after Application path)
public class MainController {
	@Autowired // This means to get the bean called employeeRepository
	           // Which is auto-generated by Spring, we will use it to handle the data
	private EmployeeRepository employeeRepository;


	@PostMapping(path = "/add")
	public @ResponseBody String addNewEmployee(@RequestParam String empID,
										@RequestParam String name,@RequestParam String project,@RequestParam String hobby){
		Employee e = new Employee();
		e.setEMPLOYEE_ID(empID);
		e.setNAME(name);
		e.setPROJECT(project);
		e.setHOBBY(hobby);

		employeeRepository.save(e);
		return "Saved";
	}

	@PutMapping(path = "/edit")
	public @ResponseBody String editProfile(@RequestParam String empID,
											   @RequestParam String name,@RequestParam String project,@RequestParam String hobby){
		employeeRepository.update(hobby,name,project,empID);
		return "Updated";
	}


	@GetMapping(path="/all")
	public @ResponseBody Iterable<Employee> getAllUsers() {
		// This returns a JSON or XML with the users
		return employeeRepository.findAll();
	}


}
