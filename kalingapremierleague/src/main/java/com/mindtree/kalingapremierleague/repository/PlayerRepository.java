package com.mindtree.kalingapremierleague.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.mindtree.kalingapremierleague.entity.Player;
@Repository
public interface PlayerRepository extends JpaRepository<Player, Long> {

}
