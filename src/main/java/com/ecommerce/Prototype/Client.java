package com.ecommerce.Prototype;

public class Client {

    public static void fillRegistry(StudentRegistry studentRegistry){
        Student June23Beginner = new Student();
        June23Beginner.setBatch("June 23 Beginner");
        June23Beginner.setInsName("Shivkumar Shinde");
        June23Beginner.setModuleName("LLD 2");
        June23Beginner.setAvgBatchPsp(70);

        studentRegistry.register("June23Beginner",June23Beginner);

        IntelligentStudent July23Intermediate = new IntelligentStudent();
        July23Intermediate.insName = "Umang Agrawal";
        July23Intermediate.iq = 160;
        July23Intermediate.intelligenceScore = 100;

        studentRegistry.register("July23Intermediate",July23Intermediate);
    }

    public static void main(String[] args) {
        StudentRegistry studentRegistry = new StudentRegistry();
        fillRegistry(studentRegistry);

        Student Shivkumar = studentRegistry.get("June23Beginner").clone();
        Shivkumar.setName("Shivkumar");
        Shivkumar.setAge(27);
        Shivkumar.setPsp(81);

        Student Umang = studentRegistry.get("July23Intermediate").clone();
        Umang.setName("Umang");
        Umang.setAge(22);
        Umang.setPsp(90);

        System.out.println("Debug");
    }
}
