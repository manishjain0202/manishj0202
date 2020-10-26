package manish.com.Spring5.controller;

import org.springframework.http.converter.json.MappingJacksonValue;
import org.springframework.web.bind.annotation.RestController;

import com.fasterxml.jackson.databind.ser.FilterProvider;
import com.fasterxml.jackson.databind.ser.impl.SimpleBeanPropertyFilter;
import com.fasterxml.jackson.databind.ser.impl.SimpleFilterProvider;

import manish.com.Spring5.Model.Employee;

@RestController
public class FilteringController {

	public Employee getSomeEmp()
	{
		Employee emp = new Employee();
		
		SimpleBeanPropertyFilter filter = SimpleBeanPropertyFilter.filterOutAllExcept("name");
		
		FilterProvider filters = new SimpleFilterProvider().addFilter("beanfilter", filter);
		
		MappingJacksonValue mapping = new MappingJacksonValue(emp);
		mapping.setFilters(filters);
		return emp;
		
	}
}
