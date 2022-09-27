package com.greatlearning.assignment;

class HRDepartment extends SuperDepartment {
    String departmentName (){
       return  "Welcome to HR Department" ;
    }
    String getTodaysWork(){
        return "Fill today’s timesheet and mark your attendance" ;
    }
    String getWorkDeadline(){
        return "Completed by EOD" ;
    }
    String doActivity(){
        return  "Team Lunch" ;
    }
}
