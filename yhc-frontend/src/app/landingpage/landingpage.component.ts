import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-landingpage',
  templateUrl: './landingpage.component.html',
  styleUrls: ['./landingpage.component.css']
})
export class LandingpageComponent implements OnInit {
    file: File;

    constructor() { }

    ngOnInit() {}

    onFileChanged(event) {
        this.file = event.target.files[0];
    }

    onUpload() {
        console.log('Uploaded');
    }

}
