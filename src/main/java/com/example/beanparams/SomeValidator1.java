package com.example.beanparams;


import static java.lang.annotation.ElementType.TYPE;
import static java.lang.annotation.RetentionPolicy.RUNTIME;

import java.lang.annotation.Retention;
import java.lang.annotation.Target;

import javax.validation.Constraint;
import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;
import javax.validation.Payload;

@Target({TYPE})
@Retention(RUNTIME)
@Constraint(validatedBy = SomeValidator1.Validator.class)
public @interface SomeValidator1
{
	String message() default "msg.";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};

	class Validator implements ConstraintValidator<SomeValidator1, SomeBeanParam3>
	{
		@Override
		public void initialize(final SomeValidator1 sizeValidation)
		{
		}

		@Override
		public boolean isValid(final SomeBeanParam3 repositoryParams,
				final ConstraintValidatorContext constraintValidatorContext)
		{
			return true;
		}
	}
}
