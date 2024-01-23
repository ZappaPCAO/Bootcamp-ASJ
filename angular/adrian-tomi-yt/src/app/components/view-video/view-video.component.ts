import { Component, OnInit } from '@angular/core';
import { Video } from '../../models/video';
import { VideoService } from '../../services/video.service';
import { ActivatedRoute } from '@angular/router';

@Component({
  selector: 'app-view-video',
  templateUrl: './view-video.component.html',
  styleUrl: './view-video.component.css'
})
export class ViewVideoComponent implements OnInit{
  video!: Video;
  valoracion: number = 0;
  constructor(private videoService: VideoService, private route: ActivatedRoute){}

  onValoration() {
    this.video.valoration.push(this.valoracion);

    this.videoService.update(this.video).subscribe((data:Video) => {
      this.video = data;
      this.valoracion = 0;
    });
  }

  onLike() {
    this.video.amountLike++;

    this.videoService.update(this.video).subscribe();
  }

  onDislike() {
    this.video.amountDislike++;

    this.videoService.update(this.video).subscribe();
  }

  ngOnInit(): void {
    let id: number = parseInt(this.route.snapshot.params['id']);

    this.videoService.getById(id).subscribe((data:Video)=>{
      this.video = data;
      this.video.views++;

      this.videoService.update(this.video).subscribe();
    });
  }
}
