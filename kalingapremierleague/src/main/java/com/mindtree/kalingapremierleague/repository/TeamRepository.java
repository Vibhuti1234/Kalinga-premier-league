package com.mindtree.kalingapremierleague.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.kalingapremierleague.entity.Team;
@Repository
public interface TeamRepository  extends JpaRepository<Team, Long>{

}
