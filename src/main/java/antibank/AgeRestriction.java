package antibank;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

@Target(ElementType.FIELD) // Annotation will apply to fields/attributes
@Retention(RetentionPolicy.RUNTIME) // Annotation will be available at runtime
public @interface AgeRestriction {
    int minAge() default 18;
}
