package com.ecommerce.Builder;

public class Client {
    public static void main(String[] args) {
//        Builder builder = Student.getBuilder();
//        builder.setAge(27);
//        builder.setBatch("Academy July 23");
//        builder.setName("Shivkumar");
//        builder.setUniversityName("IIIT Jabalpur");
//        builder.setGradYear(2024);
//        builder.setPsp(100.00);
//        builder.setPhoneNo("8830794089");
//
//        Student st = builder.build();
          Student st = Student.getBuilder()
                  .setAge(27)
                  .setBatch("Academy July 23")
                  .setName("Shivkumar")
                  .setPsp(100.00)
                  .setGradYear(2024)
                  .setPhoneNo("8830794089")
                  .setUniversityName("IIIT Jabalpur").build();
          System.out.println("Hello World!");
    }
}
