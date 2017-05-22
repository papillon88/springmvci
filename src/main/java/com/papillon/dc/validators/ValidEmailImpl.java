package com.papillon.dc.validators;

import org.apache.commons.validator.routines.EmailValidator;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

/**
 * Created by papillon on 5/22/2017.
 */
public class ValidEmailImpl implements ConstraintValidator<ValidEmail,String>{

    private int min;

    @Override
    public void initialize(ValidEmail constraintAnnotation) {
        min = constraintAnnotation.min();
    }

    @Override
    public boolean isValid(String email, ConstraintValidatorContext context) {
        if(email.length() < min )
            return false;

        if(!EmailValidator.getInstance(false).isValid(email))
            return false;

        return true;
    }
}
