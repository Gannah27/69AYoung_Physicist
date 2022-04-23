package com.company;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.*;

class MainTest {

    @Test
    void main() {

        int [][]arr={{1,2,3},{-1,-2,-3}};
        String y = Main.Equivlence(2,arr);
        assertEquals("YES",y);
    }
    @Test
    void main2() {

        int [][]arr={{11,2,3},{-1,-2,-3},{-1,-2,-3}};
        String y = Main.Equivlence(3,arr);
        assertEquals("NO",y);
    }
    @Test
    void main3() {

        int [][]arr={{11,2,3},{-1,-2,-3},{-1,-2,-3},{5,2,1},{9,3,2}};
        String y = Main.Equivlence(5,arr);
        assertEquals("NO",y);
    }
}