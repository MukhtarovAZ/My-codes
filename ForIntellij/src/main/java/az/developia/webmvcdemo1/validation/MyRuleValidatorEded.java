package az.developia.webmvcdemo1.validation;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class MyRuleValidatorEded implements ConstraintValidator<EdedOlmalidir,Integer>{
    @Override
    public boolean isValid(Integer value, ConstraintValidatorContext context) {

        return value>100;
    }

}

