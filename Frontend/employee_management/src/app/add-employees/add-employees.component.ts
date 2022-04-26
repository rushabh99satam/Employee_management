import { Component, OnInit } from '@angular/core';
import { Router } from '@angular/router';
import { Employee } from '../employee';
import { EmployeeListComponent } from '../employee-list/employee-list.component';
import { EmployeeService } from '../employee.service';

@Component({
  selector: 'app-add-employees',
  templateUrl: './add-employees.component.html',
  styleUrls: ['./add-employees.component.css']
})
export class AddEmployeesComponent implements OnInit {

  employee : Employee = new Employee();
  constructor(private employeeService : EmployeeService, private router:Router) { }

  ngOnInit(): void {
  }

  saveEmployee(){
    this.employeeService.addEmployee(this.employee).subscribe(data => {console.log(data)});
    this.router.navigate(["/employees"])
  }

  onSubmit(){
    this.saveEmployee();
  }
}
