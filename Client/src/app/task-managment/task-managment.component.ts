import { Component } from '@angular/core';
import { TaskManagmentService } from './task-managment.service';


@Component({
  selector: 'app-task-managment',
  templateUrl: './task-managment.component.html',
  styleUrls: ['./task-managment.component.css']
})
export class TaskManagmentComponent implements OnInit{

  items=[];

  constructor(private service:TaskManagmentService){}

  ngOnInit()
  {
    this.service.getDetail().subscribe(c=>
      {
        this.items=c;
      }
    )
  }

}
