package com.github.cchacin.mystyle;

import org.assertj.core.api.Assertions;
import org.junit.Test;

import java.util.UUID;

public class SampleTest {

    @Test
    public void test() throws Exception {
        // Given
        final UUID uuid = UUID.fromString("c8b5db4e-b9cf-442d-a4aa-e0c77764513f");

        // When
        final Sample sample = new Sample.Builder().someId(uuid)
                                                  .addSomeIds(uuid)
                                                  .build();

        // Then
        Assertions.assertThat(sample).isNotNull();
    }
}
