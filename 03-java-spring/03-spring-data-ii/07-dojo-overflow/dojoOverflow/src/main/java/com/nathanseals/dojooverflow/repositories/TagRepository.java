package com.nathanseals.dojooverflow.repositories;

import java.util.List;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

import com.nathanseals.dojooverflow.models.Tag;

@Repository
public interface TagRepository extends CrudRepository<Tag,Long> {
	List<Tag> findAll();
	boolean existsByName(String name);
	Tag findByName(String name);
}
