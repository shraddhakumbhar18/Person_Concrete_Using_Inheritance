package com.capgemini.PersonConcrete.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.capgemini.PersonConcrete.entity.Person;
import com.capgemini.PersonConcrete.entity.RegularPerson;
import com.capgemini.PersonConcrete.service.PersonService;

@RestController
public class PersonController 
{
	@Autowired
	private PersonService service;
	
	@RequestMapping("/")
	public Person addPerson()
	{		
		RegularPerson person = new RegularPerson(151, "Shradz", 3000, 2000);
		service.addNew(person);
		
		return person;
	}
}