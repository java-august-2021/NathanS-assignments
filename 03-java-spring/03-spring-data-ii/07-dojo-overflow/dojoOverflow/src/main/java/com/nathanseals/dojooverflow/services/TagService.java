package com.nathanseals.dojooverflow.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.nathanseals.dojooverflow.models.Tag;
import com.nathanseals.dojooverflow.repositories.TagRepository;

@Service
public class TagService {
	@Autowired
	private TagRepository tRepo;
	
	public List<Tag> allTags(){
		return tRepo.findAll();
	}
	public Tag oneTagById(Long Id) {
		return tRepo.findById(Id).orElse(null);
	}
	public Tag findByName(String name) {
		return tRepo.findByName(name);
	}
	
	public Tag createTag(Tag t) {
		return tRepo.save(t);
	}
	
	public boolean existsByName(String name){
		return tRepo.existsByName(name);
	}
}
