package com.example.demo.repo;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

import com.example.demo.entity.Fee;

public interface FeeRepository extends JpaRepository<Fee, Integer> {
	
//	public List<Fee> findByBranch(String srchString);

//	@Query(value = "select * from tieto_fee where branch=:srchString",nativeQuery = true)
//	public List<Fee> findByBranch(@Param("srchString")String srchString);
	
//	@Query(value = "From fee where branch=:srchString",nativeQuery = false)
//	public List<Fee> findByBranch(@Param("srchString")String srchString);
//	
//	@Query(value = "update tieto_fee set amount=:revisedAmount where id=:id")
//	@Modifying
//	@Transactional
//	public int updateAmount(@Param("revisedAmount") double amount, @Param("id") int id);
}
