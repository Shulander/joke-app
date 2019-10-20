package us.vicentini.jokeapp.config;

import guru.springframework.norris.chuck.ChuckNorrisQuotes;

//@Configuration
public class SpringBeansConfiguration {

//    @Bean
    public ChuckNorrisQuotes chuckNorrisQuotes(){
        return new ChuckNorrisQuotes();
    }
}
