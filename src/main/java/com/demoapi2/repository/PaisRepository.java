package com.demoapi2.repository;

import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;
import com.demoapi2.model.Pais;


@Repository
public interface PaisRepository extends JpaRepository<Pais, Long>{
	
	List<Pais> findByName(@Param("name") String name);
	
}