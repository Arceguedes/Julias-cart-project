package com.juliaguedes.course.services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.juliaguedes.course.entities.Category;
import com.juliaguedes.course.repositories.CategoryRepository;

@Service
public class CategoryService {

	@Autowired
	private CategoryRepository repository;
	
	
	public List<Category> findAll(){
		return repository.findAll();
	}
	
	public Category findById(long id) {
		Optional<Category> obj = repository.findById(id);
		return obj.get();
	}

}
