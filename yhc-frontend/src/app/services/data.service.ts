import { Injectable } from '@angular/core';
import {HttpClient, HttpHeaders} from '@angular/common/http';
import {User} from './interface/User';
import {catchError} from 'rxjs/internal/operators';

@Injectable({
  providedIn: 'root'
})
export class DataService {

    private headers = new HttpHeaders({'Content-Type': 'application/json'});
    private baseUrl = 'http://localhost:8080';

    constructor(private http: HttpClient) { }

    private handleError(error: any): Promise<any> {
        console.log('***ERROR: ' + error);
        return Promise.reject(error);
    }

    createUser(user: User): Promise<User> {
        console.log(user);
        return this.http.post(this.baseUrl + '/index', user)
            .toPromise()
            .then(response => response as User)
            .catch(this.handleError);
    }
}
