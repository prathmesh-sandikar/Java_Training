//Abstraction using abstract class

package com.harman.batch4;

abstract class College {
    abstract void setAcademicFee();

}

class CSE_Dept extends College{

    void setAcademicFee(){
        System.out.println("100000");
    }
}

class ME_Dept extends College{
    void setAcademicFee(){
        System.out.println("75000");
    }
}

class CollegeOffice{
    public static void main(String[] args) {
        College ob_cse=new CSE_Dept();
        College ob_me=new ME_Dept();
        System.out.println("CSE Dept Fee Strucure");
        ob_me.setAcademicFee();
    }
}