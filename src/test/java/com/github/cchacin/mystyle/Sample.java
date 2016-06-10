package com.github.cchacin.mystyle;

import java.util.List;
import java.util.UUID;

@Builded
public interface Sample {
    default UUID id() {
        return UUID.fromString("c8b5db4e-b9cf-442d-a4aa-e0c77764513f");
    }

    UUID someId();

    List<UUID> someIds();

    class Builder extends BuilderFor_Sample {
    }
}
