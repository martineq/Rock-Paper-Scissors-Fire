package ar.fiuba.tecnicas.rockpaperscissors;

import main.java.ar.fiuba.tecnicas.Elemento;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class RulesTest {

    private Elemento rock = new Elemento(1);
	private Elemento paper = new Elemento(2);
    private Elemento scissors = new Elemento(3);

    @Test
    public void rockBeatsScissors() {
    	assertEquals(rock, rock.vs(scissors));
    }

    @Test
    public void rockLostWithPaper() {
    	assertEquals(paper, rock.vs(paper));
    }

    @Test
    public void rockTieWithRock() {
    	assertEquals(rock, rock.vs(rock));
    }

    @Test
    public void paperBeatsRock() {
    	assertEquals(paper, paper.vs(rock));
    }

    @Test
    public void paperLostWithScissors() {
    	assertEquals(scissors, paper.vs(scissors));
    }

    @Test
    public void paperTieWithPaper() {
    	assertEquals(paper, paper.vs(paper));
    }

    @Test
    public void scissorsBeatsPaper() {
    	assertEquals(scissors, scissors.vs(paper));
    }

    @Test
    public void scissorsLostWithRock() {
    	assertEquals(rock, scissors.vs(rock));
    }

    @Test
    public void scissorsTieWithScissors() {
    	assertEquals(scissors, scissors.vs(scissors));
    }
}
