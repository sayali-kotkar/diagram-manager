import { Component, OnInit } from '@angular/core';
import { HttpClient, HttpParams } from '@angular/common/http';

@Component({
  selector: 'app-image',
  templateUrl: './image.component.html',
  styleUrls: ['./image.component.css']
})
export class ImageComponent implements OnInit {

  images: any

  constructor(private http: HttpClient) {
    http.get<Image>('http://localhost:8080/diagrams/').subscribe((data: {}) => {
      this.images = data;
    });

  }

  ngOnInit() {
  }

  delete(event, image: Image) {
    const params = new HttpParams()
      .set('diagramId', image.diagramId)

    this.http.delete('http://localhost:8080/diagrams', { params })
    .subscribe((res) => console.log(res))
  }
}

interface Image {
  title: string;
  imageUrlForApi: string;
  diagramId: string;
}
