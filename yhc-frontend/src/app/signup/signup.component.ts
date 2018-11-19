import { Component, OnInit } from '@angular/core';
import { MatDialogRef } from '@angular/material';
import {FormBuilder, FormControl, FormGroup, ValidatorFn, Validators, ValidationErrors} from '@angular/forms';
import {Router} from '@angular/router';
import {DataService} from '../services/data.service';
import {User} from '../services/interface/User';

@Component({
    selector: 'app-signup',
    exportAs: 'modal',
    templateUrl: './signup.component.html',
    styleUrls: ['./signup.component.css']
})
export class SignupComponent implements OnInit {

    signupForm: FormGroup;
    submitted = false;

    constructor(private dialogRef: MatDialogRef<SignupComponent>,
                private fb: FormBuilder,
                private router: Router,
                private dataService: DataService) { }

    ngOnInit() {
        this.signupForm = this.fb.group({
            'firstName': ['', Validators.required],
            'lastName': ['', Validators.required],
            'email': ['', [Validators.required, Validators.email]],
            'password': ['', [Validators.required,
                Validators.minLength(0),
                Validators.maxLength(16),
                Validators.pattern('^(?=.*[a-z])(?=.*[!@#\$%\^&\*])(?=.*[A-Z])(?=.*[0-9])[a-zA-Z0-9!@#\$%\^&\*]+$')]],
            'retypePassword': ['', [Validators.required]]// , this.matchingPassword.bind(this)]
        });
    }

    matchingPassword(fc: FormControl) {
        const temp = this.signupForm.get('password').value;
        const res: ValidationErrors = fc.value === this.signupForm.get('password').value ? null : {
            NotEqual: 'true'
        };
        return res;
    }

    save() {
        this.submitted = true;
        if (this.signupForm.invalid) {
            return;
        }
        this.dataService.createUser(this.signupForm.value as User);
        this.dialogRef.close(this.signupForm.value);
    }

    close() {
        this.dialogRef.close();
    }
}
