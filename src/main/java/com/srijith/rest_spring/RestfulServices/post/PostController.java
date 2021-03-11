package com.srijith.rest_spring.RestfulServices.post;

import java.net.URI;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.srijith.rest_spring.RestfulServices.user.User;






@RestController
public class PostController {
	
	@Autowired
	private PostDaoService postDaoService;
	
	@RequestMapping(method=RequestMethod.GET,value="/user/{id}/posts")
	public List<Post> getAllPosts(@PathVariable Integer id)
	{
		return postDaoService.getAllUserPosts(id);
		
	}
	
	@RequestMapping(method=RequestMethod.POST,value="/users/{id}/post")
	public Post addPost(@RequestBody Post post,@PathVariable Integer id)
	{
		System.out.println("creating the post now");
		post.setUser(new User(id,"",null));
		System.out.println(post);
		postDaoService.addPost(post);
		return post;
	}
	
}
