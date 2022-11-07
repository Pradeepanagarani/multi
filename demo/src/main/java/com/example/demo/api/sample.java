package com.example.demo.api;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.model.student;
import org.springframework.jdbc.core.JdbcTemplate;

@RestController // @controller + @ResponseBody
public class sample {
	
	@Autowired
	private JdbcTemplate jdbcTemplate;
	
	@GetMapping("/home") // from ui what pattern we are giving it will match
	public int simple() {
		
		String sql = "INSERT INTO employee (id, name) VALUES (?, ?)";
        
        int result = jdbcTemplate.update(sql, 1, "ravi");
         
        if (result > 0) {
            System.out.println("A new row has been inserted.");
        }
		return result;

	}
	
	
	
	
	@PostMapping("/login")
	public String postex(@RequestBody student stud) {
		
		System.out.println(stud.getName());
		return stud.getId() + "---"+ stud.getName();

	}

}

