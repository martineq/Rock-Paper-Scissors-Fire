package ar.fiuba.tecnicas.rockpaperscissors;

import main.java.ar.fiuba.tecnicas.*;

import org.junit.Test;

import static org.junit.Assert.assertEquals;


public class RulesTest {

    private Elemento rock = new Piedra();
	private Elemento paper = new Papel();
    private Elemento scissors = new Tijera();
    private Elemento fire = new Fuego();

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
    public void rockBeatsFire() {
    	assertEquals(rock, rock.vs(fire));
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
    public void paperLostWithFire() {
    	assertEquals(fire, paper.vs(fire));
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

    @Test
    public void scissorsLostWithFire() {
    	assertEquals(fire, scissors.vs(fire));
    }

    @Test
    public void fireLostWithRock() {
    	assertEquals(rock, fire.vs(rock));
    }
    
    @Test
    public void fireBeatsPaper() {
    	assertEquals(fire, fire.vs(paper));
    }
    
    @Test
    public void fireBeatsScissors() {
    	assertEquals(fire, fire.vs(scissors));
    }
    
    @Test
    public void fireTieWithFire() {
    	assertEquals(new Fuego(), fire.vs(fire));
    }
}
