package com.main.controllers;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

import org.springframework.http.HttpStatus;
import org.springframework.http.HttpStatusCode;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.service.annotation.PatchExchange;

import com.main.dto.DogDTO;
import com.main.dto.PatchDTO;
import com.main.services.DogService;

@RestController
@RequestMapping("/v1")
public class DogController {

	final private DogService dogService;

	/**
	 * this is called constructor injection
	 * 
	 * @param dogService
	 */
	public DogController(final DogService dogService) {
		this.dogService = dogService;

	}

	// /dogs?id=12
	// http://localhost:8080/v1/dogs/1
//	@GetMapping("/dogs/{id}")
//	public DogDTO showDog(@PathVariable int id) {
//		return new DogDTO(1, "Micky", "white");
//	}

	// ENDPOINT = http://localhost:8080/v1/dogs
	// This code is hardCoding for example of restApi
//	@GetMapping("/dogs")
//	public List<DogDTO> showDogs() {
//	List<DogDTO> dtos = new ArrayList<>();
//	dtos.add(new DogDTO(1,"Tonny","Black"));
//	dtos.add(new DogDTO(2,"Molar","White"));
//	dtos.add(new DogDTO(3,"Puppy","Red"));
//	return dtos;
//	}
	@GetMapping("/dogs")
	public List<DogDTO> showDogs() {
		return dogService.findDogs();
	}

	/**
	 * { "name": "Jacky", "color": "red" }
	 * 
	 * @param dogDTO
	 * @return
	 */
	//this is a example of postmapping in restful Api create a new 
//	@PostMapping("/dogs")
//	public DogDTO createDog(@RequestBody DogDTO dogDTO) {
//		System.out.println("request payload: " + dogDTO);
//		dogDTO.setDid(new Random().nextInt());
//		return dogDTO;
//
//	}
	
	//201-Created
	@PostMapping("/dogs")
	public ResponseEntity<DogDTO> createDog(@RequestBody DogDTO dogDTO) {
		dogDTO = dogService.save(dogDTO);
		return new ResponseEntity<DogDTO>(dogDTO,HttpStatus.CREATED);
	}
	
	//this is for delete from database
	@DeleteMapping("/dog/{id}")
	public ResponseEntity<Void> deleteDog(@PathVariable int id) {
		boolean status = dogService.deleteDog(id);
		return new ResponseEntity<Void>(status ? HttpStatus.NO_CONTENT : HttpStatus.NOT_FOUND);
	}
	
	@PutMapping("/dogs")
	public ResponseEntity<DogDTO> updateDogs(@RequestBody DogDTO dogDTO) {
		dogService.update(dogDTO);
		return new ResponseEntity<DogDTO>(dogDTO,HttpStatus.OK);
	}
	
	@PatchMapping("/dogs")
	public ResponseEntity<Map<String, Object>> updateDog(@RequestBody PatchDTO dogDTO) {
		///it must be not be null
		dogService.update(dogDTO);
		Map map = new HashMap<String, Object>();
		map.put("message", dogDTO.getAtrributeName()+" is updated successfully.");
		return new ResponseEntity<Map<String,Object>>(map,HttpStatus.OK);
		
	}
}
