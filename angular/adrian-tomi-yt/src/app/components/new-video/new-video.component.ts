import { Component } from '@angular/core';
import { Video } from '../../models/video';
import { FormsModule, NgForm } from '@angular/forms';
import { VideoService } from '../../services/video.service';

@Component({
  selector: 'new-video',
  templateUrl: './new-video.component.html',
  styleUrl: './new-video.component.css'
})
export class NewVideoComponent {
  video!: Video;

  constructor(private videoService: VideoService){}

  addVideo(miForm: NgForm) {
    if(miForm.valid){
      this.videoService.post(this.video).subscribe();
    }                
  }
}
