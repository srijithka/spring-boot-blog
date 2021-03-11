package com.srijith.rest_spring.RestfulServices.post;

import java.util.List;

import org.springframework.data.repository.CrudRepository;

public interface PostRepo extends CrudRepository<Post,Integer>{
	
	public List<Post> findByUserId(Integer id);

}
