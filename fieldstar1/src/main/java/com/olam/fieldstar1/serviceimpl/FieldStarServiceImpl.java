package com.olam.fieldstar1.serviceimpl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.olam.fieldstar1.entity.FieldStar;
import com.olam.fieldstar1.repository.FieldStarRepository;
import com.olam.fieldstar1.service.FieldStarService;


@Service
public class FieldStarServiceImpl implements FieldStarService{
	
	@Autowired
	private FieldStarRepository fieldStarRepository;

	@Override
	public FieldStar getFieldStarById(String fs_id ) {
		
		return fieldStarRepository.findById(fs_id);
	}

	@Override
	public void saveFieldStar(FieldStar fieldStar) {
		
		fieldStarRepository.save(fieldStar);
		
	}

	@Override
	public void saveLocationsByFieldStarId(FieldStar fieldStar) {
		fieldStarRepository.saveLocationsByFieldStarId(fieldStar);
		
	}

}
