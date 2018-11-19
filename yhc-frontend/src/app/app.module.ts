import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { ReactiveFormsModule } from '@angular/forms';
import { MatDialogModule } from '@angular/material';
import { MatFormFieldModule } from '@angular/material/form-field';
import { MatInputModule } from '@angular/material';
import { BrowserAnimationsModule } from '@angular/platform-browser/animations';
import {HttpClient, HttpClientModule, HttpHeaders} from '@angular/common/http';

import { AppComponent } from './app.component';
import { HomepageComponent } from './homepage/homepage.component';
import { AboutwecareComponent } from './aboutwecare/aboutwecare.component';
import { SignupComponent } from './signup/signup.component';
import { LandingpageComponent } from './landingpage/landingpage.component';
import { NavbarComponent } from './navbar/navbar.component';
import { SidebarComponent } from './sidebar/sidebar.component';
import { RouterModule, Routes} from '@angular/router';
import { PageNotFoundComponent } from './page-not-found/page-not-found.component';
import {DataService} from './services/data.service';

const yhcRoutes: Routes = [
    {path: 'afterLogin', component: LandingpageComponent},
    {path: 'index', component: HomepageComponent},
    {path: '', redirectTo: '/index', pathMatch: 'full'},
    {path: 'index/(modal:signup)', component: SignupComponent, outlet: 'modal'},
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
        MatInputModule,
        RouterModule.forRoot(
            yhcRoutes,
            { enableTracing: true }
        ),
        HttpClientModule
    ],
    providers: [
        DataService],
    bootstrap: [AppComponent],
    entryComponents: [SignupComponent]
})
export class AppModule { }
