package it.unical.test;

import static org.junit.Assert.assertEquals;

import java.time.Instant;

import org.junit.BeforeClass;
import org.junit.Test;

import it.unical.asde.AthleticGame;

public class AthleticGameBasicTest {

	private static AthleticGame game;

	@Test
	public void addArrivalWorks() {
		game.addArrival("Oliverio", Instant.now());
		assertEquals(1, game.getArrivals().size());
	}

	@Test(expected = IllegalArgumentException.class)
	public void getParticipantWorks() {
		game.getParecipiantTime("Pappa");
	}

	@BeforeClass
	public static void init() {
		game = new AthleticGame("cacca");
	}

}
