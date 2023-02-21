package hello.springmvc.controller;

import org.apache.ibatis.javassist.expr.NewArray;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

import hello.springmvc.dao.EmployeeMapper;
import hello.springmvc.entity.Employee;

@Controller
public class EmployeeController {
	
	@Autowired
	EmployeeMapper  mapper;
	
	@RequestMapping("/")
	
public ModelAndView index() {
		
	 ModelAndView mav = new ModelAndView("list-employees");
	 mav.addObject("listEmployees", mapper.getAllEmployees());
	 return mav;
  	
}
	
	@RequestMapping("/showFormAddEmployee")
public ModelAndView showForm() {
	ModelAndView mav = new ModelAndView("add-employee");
	mav.addObject("employee",new  Employee());
	return mav;
	
}
	//route save process same name as action
	@RequestMapping("/saveProcess")
	public String saveProcess(@ModelAttribute("employee") Employee employee) {
		
//		bug number 1
		if(employee.getId() == null) {
			 //save
			 mapper.saveEmployee(employee);
			 System.out.println("save id  done");
		 }else {
			//update
			 mapper.updateEmployee(employee);
			 System.out.println("update is done");
		}
		
		 
		
		return "redirect:/";
	}
	@RequestMapping("/deleteEmployee")
	
	public String deleteEmployee(@RequestParam("Employeeid") int employeeid){
		mapper.deleteEmployee(employeeid);
		
		System.out.println(employeeid);
		return "redirect:/";
	}
	
	@RequestMapping("/updateEmployee")
	public ModelAndView updateEmployee(@RequestParam("Employeeid")int employeeId) {
		ModelAndView mav = new ModelAndView("add-employee");
 		 //create Employee for hold object
		 Employee employee = mapper.findById(employeeId);
		 mav.addObject("employee",employee);
		return mav;

	}
	
	
	
	 
}
