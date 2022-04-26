import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { AddEmployeesComponent } from './add-employees/add-employees.component';
import { EmployeeListComponent } from './employee-list/employee-list.component';
import { UpdateEmployeeComponent } from './update-employee/update-employee.component';

const routes: Routes = [
  {path:'employees', component: EmployeeListComponent},
  {path:'', redirectTo: 'employees', pathMatch:'full'},
  {path:'addEmployee', component: AddEmployeesComponent},
  {path:'updateEmployee/:id', component: UpdateEmployeeComponent},
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
