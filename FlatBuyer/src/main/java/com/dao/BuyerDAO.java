package com.dao;

import java.util.List;
import java.util.ArrayList;

import org.springframework.stereotype.Repository;
import org.springframework.beans.factory.Repository;
import com.bean.Buyer;
import com.bean.Flat;
import com.repository.BuyerRepository;
import com.repository.FlatRepository;

@Repository
public class BuyerDAO {

	  @Autowired
	  private BuyerRepository buyerrepository;
	  
	  
	  @Autowired
	  private FlatRepository flatrepository;
	  
	
	public void addBuyer(Buyer buyer) {
		buyerrepository.save(buyer);
	}
	
	
	public void addFlat(String buyer_id, Flat flat) {
		Buyer buyer =buyerrepository.findById(buyer_id).get();
		flat.setBuyer(buyer);
		buyer.getFlatList().add(flat);
		buyerrepository.save(buyer);
		flatrepository.save(flat);
	}
	
	
	public List<Flat> flatWithMinPriceMaxRooms(){
		List<Flat> flatList=new ArrayList<>();
		List<Flat> minmax=new ArrayList<>();
		
		double minPrice=Integer.MAX_VALUE;
		int max=Integer.MIN_VALUE;
		
		flatrepository.findAll().forEach((obj)->flatList.add(obj));
		for(Flat f:flatList){
		    if(f.getFlatPrice()<minPrice){
		        minPrice=f.getFlatPrice();
		    }
		    if(f.getNumberOfRooms()>maxCount){
		        maxCount=f.getNumberOfRooms();
		    }
		}
		    for(Flat f:flatList){
		        if(f.getFlatPrice()==minPrice && obj.getNumberOfRooms()==maxCount){
		            minmax.add(f);
		        }
		    }
		
		return minmax;
	}
	
}
