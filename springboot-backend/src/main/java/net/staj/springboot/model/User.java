package net.staj.springboot.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name = "kullanıcılar")
public class User {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long id;

	@Column(name = "ad")
	private String ad;

	@Column(name = "soy_isim")
	private String soy_isim;

	private String email;
	private String telNo;

	public User() {

	}

	public User(String ad, String soy_isim, String email,String telNo ) {
		super();
		this.ad = ad;
		this.soy_isim = soy_isim;
		this.email = email;
		this.telNo = telNo;
	}

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getAd() {
		return ad;
	}

	public void setAd(String ad) {
		this.ad = ad;
	}

	public String getSoy_isim() {
		return soy_isim;
	}

	public void setSoy_isim(String soy_isim) {
		this.soy_isim = soy_isim;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
	
	public String getTelNo() {
		return telNo;
	}

	public void setTelNo(String telNo) {
		this.telNo = telNo;
	}
}