package engineeromer.com.organization.converter;

import javax.validation.ConstraintValidator;
import javax.validation.ConstraintValidatorContext;

public class EnglishLowerCaseValidator implements ConstraintValidator<EnglishLowerCase, String> {
    @Override
    public void initialize(EnglishLowerCase constraintAnnotation) {
    }

    @Override
    public boolean isValid(String value, ConstraintValidatorContext context) {
        if (value == null) {
            return true; // Null değerlere izin ver
        }
        // Değeri yalnızca küçük harfli İngilizce harfleri ve rakamları içerip içermediğini kontrol etmek için bir düzenli ifade kullanın
        return value.matches("^[a-z0-9]+$");
    }
}
