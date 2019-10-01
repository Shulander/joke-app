package us.vicentini.jokeapp.services;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.stereotype.Service;

@Slf4j
@Service
@RequiredArgsConstructor
class JokeServiceImpl implements JokeService {

    private final ChuckNorrisQuotes chuckNorrisQuotes;

    @Override
    public String getRandomQuote() {
        String randomQuote = chuckNorrisQuotes.getRandomQuote();
        log.info("New Joke from ChuckNorrisQuotes: '{}'", randomQuote);
        return randomQuote;
    }
}
