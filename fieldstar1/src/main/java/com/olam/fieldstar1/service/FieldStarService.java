package com.olam.fieldstar1.service;

import com.olam.fieldstar1.entity.FieldStar;

public interface FieldStarService {
	public FieldStar getFieldStarById(String fs_id );
	public void saveFieldStar(FieldStar fieldStar);
	public void saveLocationsByFieldStarId(FieldStar fieldStar);

}
