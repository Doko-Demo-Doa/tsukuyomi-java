package com.clipsub.tsukuyomi;

import org.junit.Test;
import reactor.core.publisher.Flux;
import reactor.test.StepVerifier;

public class ReactorTests {

    @Test
    public void createFluxFromArray() {
        String[] fruits = new String[] {"Apple", "Orange", "Grape"};
        Flux<String> fruitFlux = Flux.fromArray(fruits);

        StepVerifier.create(fruitFlux)
                .expectNext("Apple")
                .expectNext("Orange")
                .expectNext("Grape")
                .verifyComplete();
    }
}
