package edu.fcv.teste.app;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import org.springframework.web.bind.annotation.RequestMethod;
@RequestMapping("/version")
@RestController
public class VersionController {
	
	@RequestMapping(method = RequestMethod.GET)
	public String getVersion(){
		return "development";
	}
}
