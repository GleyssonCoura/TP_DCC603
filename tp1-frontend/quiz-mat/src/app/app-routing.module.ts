import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { ContentPageComponent } from './content-page/content-page.component';
import { HomePageComponent } from './home-page/home-page.component';
import { LoginComponent } from './login/login.component';
import { QuizPageComponent } from './quiz-page/quiz-page.component';

const routes: Routes = [{ path: 'login', component: LoginComponent},
{ path: 'home', component: HomePageComponent},
{ path: 'quiz', component: QuizPageComponent},
{ path: 'content', component: ContentPageComponent},
{ path: '',   redirectTo: '/home', pathMatch: 'full' }];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
