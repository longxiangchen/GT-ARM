package com.cs2340.armadillo;

import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.*;

import com.cs2340.armadillo.Models.Bear;
import com.cs2340.armadillo.Models.Coyote;
import com.cs2340.armadillo.Models.Enemy;
import com.cs2340.armadillo.Models.EnemyFactory;
import com.cs2340.armadillo.Models.Human;
import com.cs2340.armadillo.Models.Wolf;

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * @see <a href="http://d.android.com/tools/testing">Testing documentation</a>
 */
public class ExampleUnitTest {
    @Ignore
    public void addition_isCorrect() {
        assertEquals(4, 2 + 2);
    }

    @Test
    public void getEnemyReturnsCoyoteCorrectly() {
        EnemyFactory factory = new EnemyFactory();
        Enemy enemy = factory.getEnemy("COYOTE");
        Coyote coyote = new Coyote();
        String expected = coyote.getClass().getName();
        String actual = enemy.getClass().getName();
        assertTrue(expected.equals(actual));
    }

    @Test
    public void getEnemyReturnsWolfCorrectly() {
        EnemyFactory factory = new EnemyFactory();
        Enemy enemy = factory.getEnemy("WOLF");
        Wolf wolf = new Wolf();
        String expected = wolf.getClass().getName();
        String actual = enemy.getClass().getName(); //fixed
        assertTrue(expected.equals(actual));
    }

    @Test
    public void wolfMovesVertically() {
        Wolf wolf = new Wolf();
        wolf.move();
        int expected = wolf.getY();
        int actual = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void wolfMovesHorizontally() {
        Wolf wolf = new Wolf();
        wolf.move();
        int expected = wolf.getX();
        int actual = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void coyoteMovesVertically() {
        Coyote coyote = new Coyote();
        coyote.move();
        int expected = coyote.getY();
        int actual = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void coyoteMovesHorizontally() {
        Coyote coyote = new Coyote();
        coyote.move();
        int expected = coyote.getX();
        int actual = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void bearMovesVertically() {
        Bear bear = new Bear();
        bear.move();
        int expected = bear.getY();
        int actual = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void bearMovesHorizontally() {
        Bear bear = new Bear();
        bear.move();
        int expected = bear.getX();
        int actual = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void humanMovesVertically() {
        Human human = new Human();
        human.move();
        int expected = human.getY();
        int actual = 1;
        assertEquals(expected, actual);
    }

    @Test
    public void humanMovesHorizontally() {
        Human human = new Human();
        human.move();
        int expected = human.getX();
        int actual = 1;
        assertEquals(expected, actual);
    }


}
