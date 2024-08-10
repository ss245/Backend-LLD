package com.ecommerce.Builder;

public class Student {
    int age;
    String name;
    String universityName;
    String phoneNo;
    int gradYear;
    String batch;
    double psp;

    public static Builder getBuilder(){
        return new Builder();
    }

    private Student(Builder builder){


        this.age=builder.age;
        this.name=builder.name;
        this.universityName=builder.universityName;
        this.phoneNo=builder.phoneNo;
        this.gradYear=builder.gradYear;
        this.batch=builder.batch;
        this.psp=builder.psp;


    }

    public static class Builder {
        int age;
        String name;
        String universityName;
        String phoneNo;
        int gradYear;
        String batch;
        double psp;

        public int getAge() {
            return age;
        }

        public Builder setAge(int age) {
            this.age = age;
            return this;
        }

        public String getName() {
            return name;
        }

        public Builder setName(String name) {
            this.name = name;
            return this;
        }

        public String getUniversityName() {
            return universityName;
        }

        public Builder setUniversityName(String universityName) {
            this.universityName = universityName;
            return this;
        }

        public String getPhoneNo() {
            return phoneNo;
        }

        public Builder setPhoneNo(String phoneNo) {
            this.phoneNo = phoneNo;
            return this;
        }

        public int getGradYear() {
            return gradYear;
        }

        public Builder setGradYear(int gradYear) {
            this.gradYear = gradYear;
            return this;
        }

        public String getBatch() {
            return batch;
        }

        public  Builder setBatch(String batch) {
            this.batch = batch;
            return this;
        }

        public double getPsp() {
            return psp;
        }

        public Builder setPsp(double psp) {
            this.psp = psp;
            return this;
        }

        public Student build(){

                /*
        Validation check are doing so that if validation fails then we should not create student object.
         */
            if(this.gradYear<=2020){
                throw new RuntimeException("GradYear is not geater than 2020.");
            }
            if(this.psp<85){
                throw new RuntimeException("PSP is less than 85.");
            }
            return new Student(this);
        }

    }


}
