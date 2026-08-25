import static org.junit.jupiter.api.Assertions.assertEquals;

import java.util.ArrayList;

import org.junit.jupiter.api.Test;

public class GradeAnalyzerTest {

    @Test
    void calculateAverage_emptyList_returnsZero() {
        ArrayList<Integer> scores = new ArrayList<>();
        assertEquals(0.0, GradeAnalyzer.calculateAverage(scores), 0.0001);
    }

    @Test
    void calculateAverage_singleScore_returnsThatScore() {
        ArrayList<Integer> scores = new ArrayList<>();
        scores.add(95);
        assertEquals(95.0, GradeAnalyzer.calculateAverage(scores), 0.0001);
    }

    @Test
    void calculateAverage_multipleScores_returnsCorrectAverage() {
        ArrayList<Integer> scores = new ArrayList<>();
        scores.add(80);
        scores.add(90);
        scores.add(100);
        assertEquals(90.0, GradeAnalyzer.calculateAverage(scores), 0.0001);
    }

    @Test
    void calculateAverage_decimalAverage_returnsCorrectValue() {
        ArrayList<Integer> scores = new ArrayList<>();
        scores.add(80);
        scores.add(85);
        scores.add(90);
        scores.add(95);
        assertEquals(87.5, GradeAnalyzer.calculateAverage(scores), 0.0001);
    }

    @Test
    void calculateAverage_tenScores_returnsExactAverage() {
        ArrayList<Integer> scores = new ArrayList<>();
        scores.add(50);
        scores.add(55);
        scores.add(60);
        scores.add(65);
        scores.add(70);
        scores.add(75);
        scores.add(80);
        scores.add(85);
        scores.add(90);
        scores.add(95);
        assertEquals(72.5, GradeAnalyzer.calculateAverage(scores), 0.0001);
    }

    @Test
    void calculateAverage_largeListWithRoundAverage_stillReturnsCorrectValue() {
        ArrayList<Integer> scores = new ArrayList<>();
        scores.add(90);
        scores.add(80);
        scores.add(70);
        scores.add(60);
        scores.add(50);
        scores.add(40);
        scores.add(30);
        scores.add(20);
        scores.add(10);
        scores.add(0);
        assertEquals(45.0, GradeAnalyzer.calculateAverage(scores), 0.0001);
    }
}
