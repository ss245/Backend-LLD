package com.ecommerce.Prototype;

public class IntelligentStudent extends Student{
    int iq;
    double intelligenceScore;

    IntelligentStudent(){}

    IntelligentStudent(IntelligentStudent st){
        super(st);
        this.iq = st.iq;
        this.intelligenceScore = st.intelligenceScore;
    }

    public IntelligentStudent clone(){
        return new IntelligentStudent(this);
    }

}
