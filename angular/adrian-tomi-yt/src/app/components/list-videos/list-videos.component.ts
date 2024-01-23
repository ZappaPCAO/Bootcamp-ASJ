import { Component, OnInit } from '@angular/core';
import { Video } from '../../models/video';
import { VideoService } from '../../services/video.service';

@Component({
  selector: 'list-videos',
  templateUrl: './list-videos.component.html',
  styleUrl: './list-videos.component.css'
})
export class ListVideosComponent implements OnInit {
  videos: Video[] = [];

  constructor(private videoService: VideoService){}

  onDelete(video: Video) {
    if(confirm(`¿Desea eliminar a ${video.title}?`)){
      this.videoService.delete(video.id).subscribe( () => {this.ngOnInit()} );      
    }    
  }

  // Vemos si funciona
  ngOnInit(): void {
    this.videoService.get().subscribe((data: Video[]) => {
      this.videos = data;
    });
  }
}
