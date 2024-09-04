package com.ecommerce.Prototype;

public class Student implements Prototype<Student> {
    String name;
    int age;
    double psp;
    String batch;
    double avgBatchPsp;
    String insName;
    String moduleName;

    Student(){}

    Student(Student student){
        this.name = student.name;
        this.age = student.age;
        this.psp = student.psp;
        this.batch = student.batch;
        this.avgBatchPsp = student.avgBatchPsp;
        this.insName = student.insName;
        this.moduleName = student.moduleName;

    }

    @Override
    public Student clone() {
        return new Student(this);
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setPsp(double psp) {
        this.psp = psp;
    }

    public void setBatch(String batch) {
        this.batch = batch;
    }

    public void setAvgBatchPsp(double avgBatchPsp) {
        this.avgBatchPsp = avgBatchPsp;
    }

    public void setInsName(String insName) {
        this.insName = insName;
    }

    public void setModuleName(String moduleName) {
        this.moduleName = moduleName;
    }
}
