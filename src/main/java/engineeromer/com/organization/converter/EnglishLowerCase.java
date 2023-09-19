package engineeromer.com.organization.converter;


import javax.validation.Constraint;
import javax.validation.Payload;
import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target({ElementType.FIELD, ElementType.PARAMETER})
@Retention(RetentionPolicy.RUNTIME)
@Constraint(validatedBy = EnglishLowerCaseValidator.class)
public @interface EnglishLowerCase {
    String message() default "Alan yalnızca küçük harfli İngilizce harfleri ve rakamları içermelidir.";

    //Class<?>[] groups() default {};

    //Class<? extends Payload>[] payload() default {};
}




