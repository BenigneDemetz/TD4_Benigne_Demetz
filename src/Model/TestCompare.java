package Model;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

import static org.junit.jupiter.api.Assertions.*;


class TestCompare {

    @Test
    public void test() {
        String str = "td4 de java";
        String str2 = "td4 de java";
        assertEquals(CalculDistance.comapreTo(str, str2));
        assertEquals(CalculDistance.compareToIgnoreCase(str, str2));
    }

}