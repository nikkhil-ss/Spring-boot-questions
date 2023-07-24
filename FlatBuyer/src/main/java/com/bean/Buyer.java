package com.bean;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.*;




@Entity
@Table(name="buyer")
public class Buyer {
	@Id
	private String buyerId;
	private String buyerName;
	private String buyerContactNumber;
	
	@OneToMany(mappedBy="buyer",cascade=CascadeType.All)
	private List<Flat> flatList=new ArrayList<Flat>();

    public Buyer(){
        
    }
    
    public Buyer(String buyerId, String buyerName, String buyerContactNumber){
        this.buyerId=buyerId;
        this.buyerName=buyerName;
        this.buyerContactNumber=buyerContactNumber;
    }
    
	public String getBuyerId() {
		return buyerId;
	}

	public void setBuyerId(String buyerId) {
		this.buyerId = buyerId;
	}

	public String getBuyerName() {
		return buyerName;
	}

	public void setBuyerName(String buyerName) {
		this.buyerName = buyerName;
	}

	public String getBuyerContactNumber() {
		return buyerContactNumber;
	}

	public void setBuyerContactNumber(String buyerContactNumber) {
		this.buyerContactNumber = buyerContactNumber;
	}

	public List<Flat> getFlatList() {
		return flatList;
	}

	public void setFlatList(List<Flat> flatList) {
		this.flatList = flatList;
	}
	
	
	
}
