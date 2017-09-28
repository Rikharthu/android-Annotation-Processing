package com.example.uberv.piri_annotation;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

// More info: https://medium.com/@iammert/annotation-processing-dont-repeat-yourself-generate-your-code-8425e60c6657

// How custom annotation is stored. SOURCE - analysed by the Compiler and never stored
@Retention(RetentionPolicy.SOURCE)
// our annotation target will be TYPE: class, interface, enum, etc...
@Target(ElementType.TYPE)
public @interface NewIntent {
}
