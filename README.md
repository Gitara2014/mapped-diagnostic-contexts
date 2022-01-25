# mapped-diagnostic-contexts
Java Logging with Mapped Diagnostic Context (MDC)

RUN: 

Start like normal SpringBoot application. 

TEST: 

Employee 1: 

http://localhost:8080/employee?id=23

`26-01-2022 00:40:39.761 [http-nio-8080-exec-10] INFO  c.b.m.controller.EmployeeController.getEmployee - Employee: 23 requestId=271375f8-878a-4fdf-a653-32382a01b861
`

`26-01-2022 00:40:39.761 [http-nio-8080-exec-10] INFO  com.bane.mdc.service.EmployeeService.getEmployeeInfo - Employee(id=null, name=Mark Smith, age=33) requestId=271375f8-878a-4fdf-a653-32382a01b861
`


Employee 2: 

http://localhost:8080/employee?id=45


`26-01-2022 00:41:22.213 [http-nio-8080-exec-1] INFO  c.b.m.controller.EmployeeController.getEmployee - Employee: 45 requestId=76ced8c5-87d6-49ec-91df-93837ef94297
`

`26-01-2022 00:41:22.214 [http-nio-8080-exec-1] INFO  com.bane.mdc.service.EmployeeService.getEmployeeInfo - Employee(id=null, name=Mark Smith, age=33) requestId=76ced8c5-87d6-49ec-91df-93837ef94297
`

Log: 

The 'requestId' is logged with each log message and grouped per Employee. 
