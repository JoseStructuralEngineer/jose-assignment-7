package com.coderscampus.arraylist;

import arraylist.CustomArrayList;
import arraylist.CustomList;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CustomArrayListTest {

    @Test
    void add_test(){
        //Arrange
        CustomList<Integer> customList = new CustomArrayList<>();
        for(int i = 0;i<10000;i++ ){
            customList.add(i+1);
        }
        //Act
        //Assert
        //what would we expect to happen?
        //I expect there to be an Integer with value 10 sorted in the first
        //index in my customelist
        for(int i = 0;i<10000;i++ ){
            System.out.println(customList.get(i));
            assertEquals(customList.get(i),i+1);
        }

        assertEquals(customList.getSize(),10000);
        //fail("Not yet implemented");
    }

    @Test
    void add_at_index_test(){

        //Arrange
        CustomList<Integer> customList = new CustomArrayList<>();
        for(int i = 0;i<10000;i++ ){
            customList.add(i+1);
        }
        //Act
        //Assert
        //what would we expect to happen?
        //I expect there to be an Integer with value 10 sorted in the first
        //index in my customelist



        for(int i = 0;i<10000;i++ ){
            System.out.println(customList.get(i));
            assertEquals(customList.get(i),i+1);
        }

        assertEquals(customList.getSize(),10000);
        //fail("Not yet implemented");
    }

    @Test
    void getSize_test(){

        //Arrange
        CustomList<Integer> customList = new CustomArrayList<>();
        for(int i = 0;i<10000;i++ ){
            customList.add(i+1);
        }

        assertEquals(customList.getSize(),10000);
        //fail("Not yet implemented");
    }

    @Test
    void get_item_test(){

        //Arrange
        CustomList<Integer> customList = new CustomArrayList<>();
        for(int i = 0;i<10000;i++ ){
            customList.add(i+1);
        }

        assertEquals(customList.getSize(),10000);
        //fail("Not yet implemented");
    }

    @Test
    void remove_item_test(){

        //Arrange
        CustomList<Integer> customList = new CustomArrayList<>();
        for(int i = 0;i<10000;i++ ){
            customList.add(i+1);
        }

        assertEquals(customList.getSize(),10000);
        //fail("Not yet implemented");
    }

}