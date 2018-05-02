package com.olam.fieldstar1.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;

import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;


@Entity
@Table(name="fieldStar")
public class FieldStar {
	@Id
	@GeneratedValue(generator="native")
	@GenericGenerator(name="native",strategy="native")
	@Column(name="fieldStar_id",nullable=false,unique=true)
	private Long fid;
	
	@Column(name="fs_id")
	private String FS_Id;
	
	
	
	
	@OneToMany(mappedBy="fieldStar",fetch=FetchType.LAZY,cascade=CascadeType.ALL)
	private List<Location> farmerEntity =new ArrayList<>();




	public Long getFid() {
		return fid;
	}




	public void setFid(Long fid) {
		this.fid = fid;
	}




	public String getFS_Id() {
		return FS_Id;
	}




	public void setFS_Id(String fS_Id) {
		FS_Id = fS_Id;
	}




	public List<Location> getFarmerEntity() {
		return farmerEntity;
	}




	public void setFarmerEntity(List<Location> farmerEntity) {
		this.farmerEntity = farmerEntity;
	}




	@Override
	public String toString() {
		return "FieldStar [fid=" + fid + ", FS_Id=" + FS_Id + ", farmerEntity=" + farmerEntity + "]";
	}




	public FieldStar(Long fid, String fS_Id, ArrayList<Location> farmerEntity) {
		super();
		this.fid = fid;
		FS_Id = fS_Id;
		this.farmerEntity = farmerEntity;
	}
	
	
	
	public FieldStar() {}

}
