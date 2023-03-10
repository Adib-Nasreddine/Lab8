package com.example.lab8;


import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;


//import org.junit.Before;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

public class CustomListTest {
    private CustomList list;
    /**
     * create a mocklist for my citylist
     * @return
     */
    public CustomList MockCityList(){
        list = new CustomList(null,new ArrayList<>());
        return list;
    }
    @Test
    public void addCityTest(){
        list = MockCityList();
        int listSize = list.getCount();
        list.addCity(new City("Estevan", "SK"));assertEquals(list.getCount(),listSize + 1);
    }
    @Test
    public void hasCityTest(){
        list = MockCityList();
        list.add(new City("Edmonton","AB"));
        list.add(new City("Vancouver","BC"));
        list.add(new City("Toronto","ON"));
        list.add(new City("Hamilton","ON"));
        list.add(new City("Calgary","AB"));
        list.add(new City("Waterloo","ON"));
        assertTrue(list.hasCity(new City("Edmonton","AB")));
        assertFalse(list.hasCity(new City("Saskatoon","SK")));
    }
//    @Test
//    public void deleteCityTest(){
//        list = MockCityList();
//        int listSize = list.getCount();
//        list.deleteCity(new City("Estevan", "SK"));
//        assertEquals(list.getCount(),listSize - 1);
//    }
}
