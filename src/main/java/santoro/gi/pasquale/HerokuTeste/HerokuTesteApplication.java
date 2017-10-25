package santoro.gi.pasquale.HerokuTeste;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@Controller
@SpringBootApplication
public class HerokuTesteApplication {

	public static void main(String[] args) {
		SpringApplication.run(HerokuTesteApplication.class, args);
	}
	
	@RequestMapping( "/home")
	public String index() {
		return "index";
	}
	
}
