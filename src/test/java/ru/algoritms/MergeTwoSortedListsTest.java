package ru.algoritms;

import org.assertj.core.api.*;
import org.junit.jupiter.api.Test;
import java.util.*;
import static org.assertj.core.api.Assertions.*;

public class MergeTwoSortedListsTest {
    @Test
    public void when2SameArrayThenList() {
        MergeTwoSortedLists merge = new MergeTwoSortedLists();
        List<Integer> inputOne = List.of(1, 3, 5, 7, 9);
        List<Integer> inputTwo = List.of(2, 4, 6, 8, 10);
        List<Integer> expected = List.of(
                1, 2, 3, 4, 5, 6, 7, 8, 9, 10
        );
        List<Integer> result = merge.mergeTwoLists(inputOne, inputTwo);
        assertThat(expected).containsExactly(result.toArray(new Integer[0]));
    }

    @Test
    public void when2DifferentArrayThenList() {
        MergeTwoSortedLists merge = new MergeTwoSortedLists();
        List<Integer> inputOne = List.of(1, 3, 5, 7);
        List<Integer> inputTwo = List.of(2, 4, 6, 8, 10, 9);
        List<Integer> expected = List.of(
                1, 2, 3, 4, 5, 6, 7, 8, 9, 10
        );
        List<Integer> result = merge.mergeTwoLists(inputOne, inputTwo);
        assertThat(expected).containsExactly(result.toArray(new Integer[0]));
    }
}