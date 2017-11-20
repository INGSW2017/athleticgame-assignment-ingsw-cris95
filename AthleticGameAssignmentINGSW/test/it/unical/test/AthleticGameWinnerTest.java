package it.unical.test;

import static org.junit.Assert.assertNotNull;

import java.time.Instant;

import org.junit.After;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import it.unical.asde.AthleticGame;

public class AthleticGameWinnerTest {

	private static AthleticGame game;

	@BeforeClass
	public static void init() {
		game = new AthleticGame("cacca");
		game.addArrival("Oliverio", Instant.now());
	}

	@After
	public void reset() {
		game.reset();
	}

	@Before
	public void start() {
		game.start();
	}

	@Test(timeout = 100)
	public void getWinnerWorks() {
		assertNotNull("No winners", game.getWinner());
	}

}
