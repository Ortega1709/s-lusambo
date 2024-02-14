package com.ortega.slusambo.services;

import com.ortega.slusambo.models.Song;
import org.springframework.web.multipart.MultipartFile;

import java.util.List;
import java.util.Optional;
import java.util.UUID;

public interface SongService {

    Song saveSong(Song song, MultipartFile file);
    List<Song> getAllSongs();
    Optional<Song> getSongById(UUID id);
    void updateSong(Song song);
    void deleteSong(UUID id);

}
