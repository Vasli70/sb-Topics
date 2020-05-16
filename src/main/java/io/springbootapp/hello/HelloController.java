package io.springbootapp.hello;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {	
	
	@RequestMapping("/hello")
	public String sayHello() {		
		return "Helo from Hello Controller";			
	}
	
	@RequestMapping("/hello2")
	public String sayHi() {
		System.out.println(" inside Hell2");
		return "Hi from second class";
	}

}
