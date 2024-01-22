package com.filmrate.filmrate;

import java.lang.annotation.*;
import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

@Documented
@Constraint(validatedBy={StartWithValidator.class})
@Target({ElementType.METHOD, ElementType.FIELD, ElementType.ANNOTATION_TYPE, ElementType.CONSTRUCTOR,ElementType.PARAMETER,ElementType.TYPE_USE})
@Retention(RetentionPolicy.RUNTIME)
public @interface StartWith {
    String message() default "nn";
    Class<?>[] groups() default {};
    Class<? extends  Payload>[] payload() default {};
}
