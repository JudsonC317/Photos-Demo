package com.example.photos.demo.service;

import com.example.photos.demo.model.Photo;
import com.example.photos.demo.DAO.PhotosDAO;
import org.springframework.stereotype.Service;

@Service
public class PhotosService {

    private final PhotosDAO photosDAO;

    public PhotosService(PhotosDAO photosDAO) {
        this.photosDAO = photosDAO;
    }

    public Iterable<Photo> get() {
        return photosDAO.findAll();
    }

    public Photo get(Integer id) {
        return photosDAO.findById(id).orElse(null);
    }

    public void remove(Integer id) {
        photosDAO.deleteById(id);
    }

    public Photo save(String fileName, String contentType, byte[] data) {
        Photo photo = new Photo();
        photo.setContentType(contentType);
        photo.setFileName(fileName);
        photo.setData(data);
        photosDAO.save(photo);
        return photo;
    }
}
