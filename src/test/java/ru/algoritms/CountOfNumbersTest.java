package ru.algoritms;

import org.junit.jupiter.api.Test;
import java.util.*;
import static org.assertj.core.api.Assertions.*;
import static ru.algoritms.CountOfNumbers.*;

public class CountOfNumbersTest {

    @Test
    public void when11223336() {
        Map<String, Integer> map = toMap(11223336);
        Map<String, Integer> expected = Map.of("1", 2, "2", 2, "3", 3, "6", 1);
        assertThat(expected).isEqualTo(map);
    }
}