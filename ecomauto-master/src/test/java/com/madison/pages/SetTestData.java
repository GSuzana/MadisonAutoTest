package com.madison.pages;

/**
 * Created by razvansidra on 7/27/2017.
 */
public class SetTestData {

    public TestData initTestData(){
        TestData testData = new TestData();

        testData.setFirstName("test");
        testData.setLastName("test");
        testData.setEmailAddress("test@gmail.com");
        testData.setAddress("test");
        testData.setCity("test");
        testData.setPostalCode("123456");
        testData.setCountry("test");
        testData.setTelephone("1234567899");

        return testData;
    }
}