package hw14;


import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.Arguments;
import org.junit.jupiter.params.provider.MethodSource;
import org.junit.jupiter.params.provider.ValueSource;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

class MainClassTest {
    static MainClass mainClass;

    @BeforeAll
    public static void setUp() {
        mainClass = new MainClass();
    }

    private static Stream<Arguments> dataForConvertArrTest() {
        List<Arguments> data = new ArrayList();
        data.add(Arguments.arguments(new int[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 0}, new int[]{5, 6, 7, 8, 9, 0}));
        data.add(Arguments.arguments(new int[]{4, 2, 3, 4, 5, 6, 7, 8, 9, 0}, new int[]{5, 6, 7, 8, 9, 0}));
        data.add(Arguments.arguments(new int[]{4, 2, 3, 4, 5, 6, 7, 8, 4, 0}, new int[]{0}));

        return data.stream();
    }

    @ParameterizedTest
    @MethodSource("dataForConvertArrTest")
    void convertArrTest(int[] arr, int[] result) {
        Assertions.assertArrayEquals(result, mainClass.convertArr(arr));
    }

    @Test
    void convertArrTestException() {
        Assertions.assertThrows(RuntimeException.class,()->mainClass.convertArr(new int[]{1,2,3}));
    }
    private static Stream<Arguments> dataForIsContains4TestTrue() {
        List<Arguments> data=new ArrayList<>();
        data.add(Arguments.arguments(new int[]{1,2,3,4}));
        data.add(Arguments.arguments(new int[]{4}));

        return data.stream();
    }
    @ParameterizedTest
    @MethodSource("dataForIsContains4TestTrue")
    void isContainsTestTrue(int[] arr) {
        Assertions.assertTrue(mainClass.isContains4(arr));

    }

    private static Stream<Arguments> dataForIsContains4TestFalse() {
        List<Arguments> data=new ArrayList<>();
        data.add(Arguments.arguments(new int[1]));
        data.add(Arguments.arguments(new int[]{0,1,2,3}));
        return data.stream();
    }
    @ParameterizedTest
    @MethodSource("dataForIsContains4TestFalse")
    void isContainsTestFalse(int[] arr) {
        Assertions.assertFalse(mainClass.isContains4(arr));

    }
}