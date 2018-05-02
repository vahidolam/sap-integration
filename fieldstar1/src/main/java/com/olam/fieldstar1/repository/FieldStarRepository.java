package com.olam.fieldstar1.repository;

import javax.transaction.Transactional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.olam.fieldstar1.entity.FieldStar;

public interface FieldStarRepository extends JpaRepository<FieldStar, Long>{
	
	@Query(value="select * from olam_fieldstar.location , olam_fieldstar.field_star" + 
			" where olam_fieldstar.location.field_star_id=olam_fieldstar.field_star.field_star_id" + 
			" and olam_fieldstar.field_star.fs_id=?1",nativeQuery=true)
	public FieldStar findById(String fs_id);
	
	
	/*@Modifying
	@Query(value="insert into location (latitude,longitude,time,FIELD_STAR_ID) values (\"12.34\",\"87.23\",\"2018-04-23 23:23:12\",(SELECT FIELD_STAR_ID FROM FIELD_STAR WHERE FS_ID='FS002'))\r\n" + 
			"",nativeQuery=true)
	@Transactional
	public void saveLocationsByFieldStarId(FieldStar fieldStar);
	*/
	
	@Modifying
	@Query(value="insert into location (latitude,longitude,time,FIELD_STAR_ID) "
			+ "values (:latitude,:longitude,:time,(SELECT FIELD_STAR_ID FROM FIELD_STAR WHERE FS_ID=:FS_ID))" 
			,nativeQuery=true)
	@Transactional
	public void saveLocationsByFieldStarId(@Param("latitude")FieldStar fieldStar);
	
	

}
