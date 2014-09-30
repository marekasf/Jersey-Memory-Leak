package com.example.beanparams;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import javax.validation.Payload;


@Target({ElementType.PARAMETER, ElementType.FIELD})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = SomeValidator3.Validator.class)
public @interface SomeValidator3
{
	String message() default "Some msg.";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};

	class Validator implements ConstraintValidator<SomeValidator3, String>
	{
		@Override
		public void initialize(final SomeValidator3 namespaceSize)
		{
		}

		@Override
		public boolean isValid(final String text, final ConstraintValidatorContext constraintValidatorContext)
		{
			return true;
		}
	}
}
