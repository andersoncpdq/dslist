package com.acpdq.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.acpdq.dslist.entities.Game;

public interface GameRepository extends JpaRepository<Game, Long> {

}
