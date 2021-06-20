package com.mindtree.kalingapremierleague.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.kalingapremierleague.entity.Ground;
@Repository
public interface GroundRepository  extends JpaRepository<Ground,Long>{

}
