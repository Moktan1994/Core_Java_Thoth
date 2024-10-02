package com.main.services;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.springframework.beans.BeanUtils;
import org.springframework.stereotype.Service;

import com.main.dao.DogRepository;
import com.main.dto.DogDTO;
import com.main.dto.PatchDTO;
import com.main.entities.DogEntity;
import com.main.exceptions.DogNotFoundException;

@Service
public class DogService {
	
	final private DogRepository dogRepository;
	
	public DogService(final DogRepository dogRepository) {
		this.dogRepository = dogRepository;
		
	}

	public List<DogDTO> findDogs() {
	List<DogDTO> results = new ArrayList<>();
	List<DogEntity> dogEntityList = dogRepository.findAll();
	for(DogEntity entity : dogEntityList) {
		DogDTO dogDTO = new DogDTO();
		BeanUtils.copyProperties( entity, dogDTO);
		results.add(dogDTO);
	}
	return results;
	}

	public DogDTO save(DogDTO dogDTO) {
		DogEntity dogEntity = new DogEntity();
		BeanUtils.copyProperties(dogDTO, dogEntity);
		DogEntity entity = dogRepository.save(dogEntity);
		dogDTO.setDid(entity.getId());
		return dogDTO;
	}

	public boolean deleteDog(int id) {
		boolean status = false;
		if(dogRepository.existsById(id)) {
			dogRepository.deleteById(id);
			status = true;
		}
		return status;
		
		
	}

	/**
	 * This is logic for partial update
	 * @param patchDTO
	 */
	public void update(PatchDTO patchDTO) {
		Optional<DogEntity> optional = dogRepository.findById(Integer.parseInt(patchDTO.getId()));
		if(optional.isPresent()) {
			DogEntity dbDogEntity = optional.get();
			if("name".equalsIgnoreCase(patchDTO.getAtrributeName())) {
				dbDogEntity.setName(patchDTO.getAttributeValue());
			}
			else if("color".equalsIgnoreCase(patchDTO.getAtrributeName())) {
				dbDogEntity.setColor(patchDTO.getAttributeValue());
			}
			dogRepository.save(dbDogEntity);
		}
		else {
			throw new DogNotFoundException("Hello, there!It seems like this dog does not exist!");
		}
		
	}
	//** logic for updating existing entity
	public void update(DogDTO dogDTO) {
		Optional<DogEntity> optional = dogRepository.findById(dogDTO.getDid());
		if(optional.isPresent()) {
			DogEntity dbDogEntity = optional.get();
			if(dogDTO.getColor()!= null) {
				dbDogEntity.setColor(dogDTO.getColor());
			}
			if(dogDTO.getName()!= null) {
				dbDogEntity.setName(dogDTO.getName());
			
			}
			dogRepository.save(dbDogEntity);
		}
		else {
			throw new DogNotFoundException("Hello, there!It seems like this dog does not exist!");
		}
		
		
	}

}
