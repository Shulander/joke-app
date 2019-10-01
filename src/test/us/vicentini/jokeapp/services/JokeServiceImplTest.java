package us.vicentini.jokeapp.services;


import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import org.junit.After;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

import static org.junit.Assert.assertEquals;
import static org.mockito.Mockito.verify;
import static org.mockito.Mockito.verifyNoMoreInteractions;
import static org.mockito.Mockito.when;

@RunWith(MockitoJUnitRunner.class)
public class JokeServiceImplTest {

    @Mock
    private ChuckNorrisQuotes chuckNorrisQuotes;

    @InjectMocks
    private JokeServiceImpl jokeService;


    @Test
    public void shouldReturnAJoke() {
        var expected = "Random Joke";
        when(chuckNorrisQuotes.getRandomQuote()).thenReturn(expected);

        var actual = jokeService.getRandomQuote();

        assertEquals(expected, actual);
        verify(chuckNorrisQuotes).getRandomQuote();
    }

    @After
    public void tearDown() {
        verifyNoMoreInteractions(chuckNorrisQuotes);
    }
}
