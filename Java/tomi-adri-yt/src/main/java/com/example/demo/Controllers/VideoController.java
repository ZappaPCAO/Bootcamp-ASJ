package com.example.demo.Controllers;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.Models.Video;
import com.example.demo.Services.VideoService;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;


@RestController
@RequestMapping("/videos")
public class VideoController {

	@Autowired
	VideoService videoService;
	
	@GetMapping
	public ResponseEntity<List<Video>> getVideos(){
		return ResponseEntity.ok(videoService.obtenerVideos());
	}
	
	@GetMapping("/{id}")
	public ResponseEntity<Optional<Video>> getVideoById(@PathVariable Integer id){
		return ResponseEntity.ok(videoService.obtenerVideosById(id));
	}
	
	@PostMapping
	public ResponseEntity<Boolean> postVideo(@RequestBody Video video) {
		return ResponseEntity.ok(videoService.crearVideo(video));
	}
	
	@PutMapping
	public ResponseEntity<Video> putVideo(@RequestBody Video video) {
		return ResponseEntity.ok(videoService.modificarVideo(video));
	}
	
	@DeleteMapping("/{id}")
	public ResponseEntity<Boolean> deleteVideo(@PathVariable Integer id){
		return ResponseEntity.ok(videoService.eliminarVideo(id));
	}
}
