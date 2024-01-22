package com.filmrate.filmrate;

public class StartWithValidator implements ConstraintValidator<StartWith, String>{
  private String startWithPrefix;
    public void initialize(StartWith constraintAnnot){
      ConstraintValidator.super.initialize(constraintAnnot);
      startWithPrefix = constraintAnnot.value();
  }

    public boolean isValid(String value, ConstraintValidatorContext context){
      return value.startsWith(startWithPrefix);
  }
}
