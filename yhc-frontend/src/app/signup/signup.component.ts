import { Component, OnInit } from '@angular/core';
import { MatDialogRef } from '@angular/material';
import {FormBuilder, FormControl, FormGroup, ValidatorFn, Validators, ValidationErrors} from '@angular/forms';

@Component({
    selector: 'app-signup',
    templateUrl: './signup.component.html',
    styleUrls: ['./signup.component.css']
})
export class SignupComponent implements OnInit {

    signupForm: FormGroup;
    submitted = false;

    constructor(private dialogRef: MatDialogRef<SignupComponent>,
                private fb: FormBuilder) { }

    ngOnInit() {
        this.signupForm = this.fb.group({
            'fName': ['', Validators.required],
            'lName': ['', Validators.required],
            'email': ['', [Validators.required, Validators.email]],
            'password': ['', [Validators.required,
                Validators.minLength(0),
                Validators.maxLength(16),
                Validators.pattern('^(?=.*[a-z])(?=.*[!@#\$%\^&\*])(?=.*[A-Z])(?=.*[0-9])[a-zA-Z0-9!@#\$%\^&\*]+$')]],
            'retypePassword': ['', [Validators.required], this.matchingPassword.bind(this)]
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
        console.log('Sign up successful');
        console.log(this.signupForm.value);
        this.dialogRef.close(this.signupForm.value);
    }

    close() {
        this.dialogRef.close();
    }
}
