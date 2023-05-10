package com.acpdq.dslist.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.acpdq.dslist.entities.GameList;

public interface GameListRepository extends JpaRepository<GameList, Long> {

}
