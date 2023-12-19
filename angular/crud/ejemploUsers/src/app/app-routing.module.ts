import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { UsersComponent } from './components/users/users.component';
import { UserFormComponent } from './components/user-form/user-form.component';

const routes: Routes = [
  {path: '', component: UsersComponent },
  {path: 'users', component: UsersComponent },
  {path: 'user',
   children:[
    {path: '', component: UserFormComponent},
    {path: ':id', component: UserFormComponent}
  ]
  }
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
