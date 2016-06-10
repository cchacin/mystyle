package com.github.cchacin.mystyle;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;

import org.immutables.value.Value;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@JsonSerialize
@Target(ElementType.TYPE)
@Value.Style(
        defaultAsDefault = true,
        typeBuilder = "BuilderFor_*",
        visibility = Value.Style.ImplementationVisibility.PRIVATE,
        builderVisibility = Value.Style.BuilderVisibility.PACKAGE
)
public @interface Builded {
}
