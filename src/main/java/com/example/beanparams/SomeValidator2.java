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
@Constraint(validatedBy = SomeValidator2.Validator.class)
public @interface SomeValidator2
{
	String message() default "mag.";

	Class<?>[] groups() default {};

	Class<? extends Payload>[] payload() default {};

	class Validator implements ConstraintValidator<SomeValidator2, SomeBeanParam3>
	{
		@Override
		public void initialize(final SomeValidator2 sizeValidation)
		{
		}

		@Override
		public boolean isValid(final SomeBeanParam3 repositoryParams, final ConstraintValidatorContext constraintValidatorContext)
		{
			return true;
		}
	}
}
