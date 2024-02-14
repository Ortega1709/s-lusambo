package com.ortega.slusambo.repository;


import com.ortega.slusambo.models.Song;
import org.springframework.data.mongodb.repository.MongoRepository;

import java.util.UUID;

public interface SongRepository extends MongoRepository<Song, UUID> {

}
