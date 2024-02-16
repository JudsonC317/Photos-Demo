package com.example.photos.demo.DAO;

import com.example.photos.demo.model.Photo;
import org.springframework.data.repository.CrudRepository;

public interface PhotosDAO extends CrudRepository<Photo, Integer> {

}
