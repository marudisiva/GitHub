import { Component } from '@angular/core';
import { EmployeeService } from './service/employee.service';
import { Employee } from './model/employee';


@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'app';
  employees = new Array<Employee>();

  constructor( empService:EmployeeService ) {

    empService.getEmployees().subscribe(response => 
    {
      this.employees = response.map(item => 
      {
        return new Employee( 
            item.id,
            item.name,
            item.status
        );
      });
    });

  }
  
}
