package jakarta.enterprise.inject.build.compatible.spi;

import java.lang.annotation.ElementType;
import java.lang.annotation.Retention;
import java.lang.annotation.RetentionPolicy;
import java.lang.annotation.Target;

/**
 * 5th phase of {@linkplain BuildCompatibleExtension build compatible extension} execution.
 * Allows custom validation.
 * <p>
 * Methods annotated {@code @Validation} may declare parameters of these types:
 * <ul>
 * <li>{@link Messages}</li>
 * <li>{@link Types}</li>
 * </ul>
 *
 * @since 4.0
 */
@Target(ElementType.METHOD)
@Retention(RetentionPolicy.RUNTIME)
public @interface Validation {
}
