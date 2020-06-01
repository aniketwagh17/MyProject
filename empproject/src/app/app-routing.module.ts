import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HomeComponent } from './home/home.component';
import { EmployeelistComponent } from './employeelist/employeelist.component';
import { EmployeeComponent } from './employee/employee.component';
import { EmployeefrmComponent } from './employeefrm/employeefrm.component';
import { CreateempComponent } from './createemp/createemp.component';
import { DeleteempComponent } from './deleteemp/deleteemp.component';

const routes: Routes = 

  [
    { path: 'home', component: HomeComponent },
    { path: 'employees', component: EmployeelistComponent },
      { path: 'employeeone/:code', component: EmployeeComponent },
     {path: 'employeefrm/:code', component:EmployeefrmComponent},
     {path: 'createemp', component: CreateempComponent},
     {path:'deletechkemp/:code',component: DeleteempComponent},
    { path: '', redirectTo: '/home', pathMatch: 'full' },

  
   


];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
