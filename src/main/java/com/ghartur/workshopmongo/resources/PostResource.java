package com.ghartur.workshopmongo.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.ghartur.workshopmongo.domain.Post;
import com.ghartur.workshopmongo.services.PostService;

@RestController
@RequestMapping(value="/posts")
public class PostResource{
	
	@Autowired
	private PostService post;
	
	@RequestMapping(value="/{id}" , method=RequestMethod.GET)
	public ResponseEntity<Post> findById(@PathVariable String id){
		Post obj = post.findById(id);
		return ResponseEntity.ok().body(obj);
	}
}
