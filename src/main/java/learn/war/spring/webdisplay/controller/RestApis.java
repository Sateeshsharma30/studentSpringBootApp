package learn.war.spring.webdisplay.controller;

import java.util.HashMap;
import java.util.Map;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import learn.war.spring.webdisplay.model.Student;

@RestController
@RequestMapping("/rest")
public class RestApis {

	@GetMapping("/getName")
	public String getName() {
		return "name";
	}

	@GetMapping(path = "/getMap", produces = { "application/json" })
	public Map<String, String> getMap() {
		Map<String, String> mp = new HashMap<>();
		mp.put("a", "a");
		mp.put("b", "b");
		return mp;
	}

	@GetMapping(path = "/getXml", produces = {"application/json", "application/xml" })
	public Student getXml() {
		return new Student("userName");
	}
	
	@GetMapping(path = "/getEntity", produces = {"application/json", "application/xml" })
	public ResponseEntity<Student> getEntity() {
		return new  ResponseEntity<Student>(new Student("userName"), HttpStatus.OK);
	}
}
