package com.repository;
import org.springframework.data.repository.CrudRepository;
import com.bean.Flat;
import org.springframework.stereotype.Repository;
import java.util.List;


@Repository
public interface FlatRepository extends CrudRepository<Flat,String>  {

    @Query("SELECT f FROM Flat f WHERE f.flatPrice=(SELECT MIN(flatPrice) FROM Flat) AND f.numberOfRooms=(SELECT MAX(numberOfRooms) FROM Flat)")
    List<Flat> findFlatsWithMinPriceAndMaxRooms();
	
	
}
