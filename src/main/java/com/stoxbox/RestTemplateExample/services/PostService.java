package com.stoxbox.RestTemplateExample.services;

import com.stoxbox.RestTemplateExample.entity.Post;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class PostService {
    private final RestTemplate restTemplate;

    public PostService(RestTemplate restTemplate) {
        this.restTemplate = restTemplate;
    }

    public Post[] getPosts() {
        String apiUrl = "https://jsonplaceholder.typicode.com/posts";
        return restTemplate.getForObject(apiUrl, Post[].class);
    }
}
