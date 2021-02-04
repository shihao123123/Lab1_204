import static org.junit.jupiter.api.Assertions.*;

class GradeBookTester {

    GradeBook Object1,Object2;
    @org.junit.jupiter.api.BeforeEach
    void setUp() {
         Object1=new GradeBook(5);
         Object2=new GradeBook(5);
        Object1.addScore(66.0);
        Object1.addScore(55.0);
        Object2.addScore(77.0);
        Object2.addScore(88.0);
    }

    @org.junit.jupiter.api.AfterEach
    void tearDown() {
        Object1=null;
        Object2=null;
    }

    @org.junit.jupiter.api.Test
    void getScoresSize() {
        assertEquals(2,Object1.getScoresSize());
        assertEquals(2,Object2.getScoresSize());
    }

    @org.junit.jupiter.api.Test
    void testToString() {
        assertEquals(Object1.toString(), "66.0 55.0 ");
        assertEquals(Object2.toString(), "77.0 88.0 ");
    }

    @org.junit.jupiter.api.Test
    void addScore() {
        assertTrue(Object1.toString().equals("66.0 55.0 "));
        assertTrue(Object2.toString().equals("77.0 88.0 "));
        assertEquals(2,Object1.getScoresSize(),.001);
        assertEquals(2,Object2.getScoresSize(),.001);
    }

    @org.junit.jupiter.api.Test
    void sum() {
        assertEquals(121.0,Object1.sum(),.0001);
        assertEquals(165.0,Object2.sum(),.0001);
    }

    @org.junit.jupiter.api.Test
    void minimum() {
        assertEquals(55.0,Object1.minimum(),.001);
        assertEquals(77.0,Object2.minimum(),.001);
    }

    @org.junit.jupiter.api.Test
    void finalScore() {
        assertEquals(66.0,Object1.finalScore(),.001);
        assertEquals(88.0,Object2.finalScore(),.001);
    }
}