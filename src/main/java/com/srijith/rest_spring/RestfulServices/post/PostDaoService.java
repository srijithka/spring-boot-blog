package com.srijith.rest_spring.RestfulServices.post;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

@Service
public class PostDaoService {
	
	@Autowired
	private PostRepo postRepo;

	public List<Post> getAllUserPosts(Integer id) {
		// TODO Auto-generated method stub
		List<Post> posts=new ArrayList<>();
		postRepo.findByUserId(id).forEach(posts::add);
		return posts;
		
	}

	public void addPost(Post post) {
		// TODO Auto-generated method stub
		postRepo.save(post);
		
	}
	
	

}
