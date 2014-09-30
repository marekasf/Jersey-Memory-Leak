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
@Constraint(validatedBy = SomeValidator5.Validator.class)
public @interface SomeValidator5
{
	String message() default "Some msg";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};

	class Validator implements ConstraintValidator<SomeValidator5, String>
	{
		@Override
		public void initialize(final SomeValidator5 tenantValidation)
		{
		}

		@Override
		public boolean isValid(final String number, final ConstraintValidatorContext constraintValidatorContext)
		{
			final int parsedNumber;
			try
			{
				parsedNumber=Integer.parseInt(number);
			}
			catch(final NumberFormatException e)
			{
				return false;
			}
			return parsedNumber >= 0;
		}
	}
}
