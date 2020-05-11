package test;

import main.BalancedBrackets;
import org.junit.Test;

import static org.junit.Assert.*;

public class BalancedBracketsTest {

    //TODO: add tests here

    // Test 1
    @Test
    public void emptyBracketsReturnTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]"));
    }

    // Test 2
    @Test
    public void balancedBracketsWithWords(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[LaunchCode]"));
    }

    // Test 3
    @Test
    public void balancedBracketsWithinString(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("Launch[Code]"));
    }

    // Test 4
    @Test
    public void stringWithOddBracketsReturnFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[Launch]Code]"));
    }

    // Test 5
    @Test
    public void reverseBracketsReturnFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("]["));
    }

    // Test 6
    @Test
    public void squareBracketsWithOtherBracketsReturnTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[]}("));
    }

    // Test 7
    @Test
    public void closedCurlyBracketsOnlyReturnFalse(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("{[}"));
    }

    //Test 8
    @Test
    public void multipleClosedBracketsReturnTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[][]"));
    }

    // Test 9
    @Test
    public void oneClosedBracketOneOpen(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[]]"));
    }

    // Test 10
    @Test
    public void oneClosedOneOpenWithChars(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("[Hey]["));
    }

    // Test 11
    @Test
    public void multipleBracketsWithCharsReturnTrue(){
        assertTrue(BalancedBrackets.hasBalancedBrackets("[Kelsey][Lee]"));
    }

    // Test 12
    @Test
    public void oneClosedSetOneReverseSet(){
        assertFalse(BalancedBrackets.hasBalancedBrackets("][]["));
    }

}
