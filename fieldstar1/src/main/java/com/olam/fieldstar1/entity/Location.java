package com.olam.fieldstar1.entity;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.fasterxml.jackson.annotation.JsonIgnore;


@Entity
@Table(name="location")
public class Location {
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO,generator="native")  
	@GenericGenerator(name="native",strategy="native")                
	@Column(name="f_id")
	private Long id;
	
	@Column(name="latitude")
	private String latitude;
	
	@Column(name="longitude")
	private String longitude;
	
	@Column(name="time")
	private String time;
	
	
	@ManyToOne(targetEntity=FieldStar.class,cascade=CascadeType.ALL,fetch=FetchType.EAGER)
	@JoinColumn(name="fieldStar_id" )
	@JsonIgnore
	private FieldStar fieldStar;


	public Long getId() {
		return id;
	}


	public void setId(Long id) {
		this.id = id;
	}


	public String getLatitude() {
		return latitude;
	}


	public void setLatitude(String latitude) {
		this.latitude = latitude;
	}


	public String getLongitude() {
		return longitude;
	}


	public void setLongitude(String longitude) {
		this.longitude = longitude;
	}


	public String getTime() {
		return time;
	}


	public void setTime(String time) {
		this.time = time;
	}


	public FieldStar getFieldStar() {
		return fieldStar;
	}


	public void setFieldStar(FieldStar fieldStar) {
		this.fieldStar = fieldStar;
	}
	


	public Location() {
		
	}
	
	

	public Location(Long id, String latitude, String longitude, String time, FieldStar fieldStar) {
		super();
		this.id = id;
		this.latitude = latitude;
		this.longitude = longitude;
		this.time = time;
		this.fieldStar = fieldStar;
	}


	@Override
	public String toString() {
		return "Location [id=" + id + ", latitude=" + latitude + ", longitude=" + longitude + ", time=" + time
				+ ", fieldStar=" + fieldStar + "]";
	}
	
	
	

}
