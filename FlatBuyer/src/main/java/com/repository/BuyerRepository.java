package com.repository;

import org.springframework.data.repository.CrudRepository;
import com.bean.Buyer;
import org.springframework.stereotype.Repository;
@Repository
public interface BuyerRepository extends CrudRepository<Buyer,String> {

}
