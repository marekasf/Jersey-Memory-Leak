package com.example.beanparams;

import static java.lang.annotation.ElementType.FIELD;
import static java.lang.annotation.ElementType.PARAMETER;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import javax.validation.Payload;

@Target({PARAMETER, FIELD})
@Retention(RUNTIME)
@Constraint(validatedBy = SomeValidator4.Validator.class)
public @interface SomeValidator4
{
	String message() default "SOme msg";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};

	class Validator implements ConstraintValidator<SomeValidator4, String>
	{
		@Override
		public void initialize(final SomeValidator4 nonSpecialCharacters)
		{
		}

		@Override
		public boolean isValid(final String text, final ConstraintValidatorContext constraintValidatorContext)
		{
			return true;
		}
	}
}
