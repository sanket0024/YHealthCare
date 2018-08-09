import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { ReactiveFormsModule } from '@angular/forms';
import { MatDialogModule } from '@angular/material';
import { MatFormFieldModule } from '@angular/material/form-field';
import { MatInputModule } from '@angular/material';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';

import { AppComponent } from './app.component';
import { HomepageComponent } from './homepage/homepage.component';
import { AboutwecareComponent } from './aboutwecare/aboutwecare.component';
import { SignupComponent } from './signup/signup.component';
import { LandingpageComponent } from './landingpage/landingpage.component';
import { NavbarComponent } from './navbar/navbar.component';
import { SidebarComponent } from './sidebar/sidebar.component';
import { RouterModule, Routes} from '@angular/router';
import { PageNotFoundComponent } from './page-not-found/page-not-found.component';

const yhcRoutes: Routes = [
    {path: 'home', component: LandingpageComponent},
    {path: '', component: HomepageComponent},
    {path: '**', component: PageNotFoundComponent}
    ];

@NgModule({
    declarations: [
        AppComponent,
        HomepageComponent,
        AboutwecareComponent,
        SignupComponent,
        LandingpageComponent,
        NavbarComponent,
        SidebarComponent,
        PageNotFoundComponent
    ],

    imports: [
        BrowserModule,
        ReactiveFormsModule,
        MatDialogModule,
        MatFormFieldModule,
        BrowserAnimationsModule,
        MatInputModule
    ],
    providers: [],
    bootstrap: [AppComponent],
    entryComponents: [SignupComponent]
})
export class AppModule { }
