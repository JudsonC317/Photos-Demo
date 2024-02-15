package com.example.photos.demo.repository;

import com.example.photos.demo.model.Photo;
import org.springframework.data.relational.core.sql.In;
import org.springframework.data.repository.CrudRepository;

public interface PhotosRepository extends CrudRepository<Photo, Integer> {

}
