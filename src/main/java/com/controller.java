package com;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
@GetMapping(value="/name")
public String getname()
{
	return "hai";
}
}
