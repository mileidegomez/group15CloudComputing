package com.cloudcomputing.gamelist.app.repository;

import com.cloudcomputing.gamelist.app.entity.GameEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.data.mongodb.repository.Query;
import java.util.List;

public interface GameRepository extends MongoRepository<GameEntity, String>{

    @Query("{Name: '?0'}")
    List <GameEntity> findByName(String name);

    @Query("{Platform: '?0'}")
    List <GameEntity> findByPlatform(String name);



};
