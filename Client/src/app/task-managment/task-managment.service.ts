import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class TaskManagmentService {

  private getVal = "http://localhost:8081";

  constructor(private http:HttpClient) { }

  getDetail():Observable<any>{
    return this.http.get<any>("http://localhost:8081/getAll");
  }
  
}
