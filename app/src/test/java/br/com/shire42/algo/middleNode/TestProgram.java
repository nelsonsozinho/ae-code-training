package br.com.shire42.algo.middleNode;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class TestProgram {

    private Program program;

    @BeforeEach
    public void setup() {
        program = new Program();
    }

    @Test
    public void testOne() {
        //[0 - 1 - 2 - 3]
        Program.LinkedList linkedList = new Program.LinkedList(0);
        linkedList.next = new Program.LinkedList(1);
        Program.LinkedList expected = new Program.LinkedList(2);
        linkedList.next.next = expected;
        expected.next = new Program.LinkedList(3);
        var actual = program.middleNode(linkedList);

        assertTrue(expected.equals(actual));
    }



}
