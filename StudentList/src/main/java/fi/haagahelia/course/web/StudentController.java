package fi.haagahelia.course.web;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PostMapping;

import fi.haagahelia.course.domain.Student;

public class StudentController {

	@PostMapping("/hello")
	public String studentList(Model model) {
		model.addAttribute("student", new Student());
		
		return "hello";
	}
}
