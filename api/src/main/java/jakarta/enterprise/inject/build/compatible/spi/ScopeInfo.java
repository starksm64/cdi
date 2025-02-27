package jakarta.enterprise.inject.build.compatible.spi;

import jakarta.enterprise.lang.model.declarations.ClassInfo;

/**
 * A scope of a bean. Scope type is an {@linkplain #annotation() annotation}, meta-annotated
 * {@link jakarta.inject.Scope @Scope} or {@link jakarta.enterprise.context.NormalScope @NormalScope}.
 * Lifecycle of beans with given scope is determined by a {@linkplain jakarta.enterprise.context.spi.Context context}.
 *
 * @since 4.0
 */
public interface ScopeInfo {
    /**
     * Returns the declaration of this scope annotation.
     *
     * @return declaration of this scope annotation, never {@code null}
     */
    ClassInfo annotation();

    /**
     * Binary name of this scope annotation, as defined by <cite>The Java&trade; Language Specification</cite>;
     * in other words, the scope annotation name as returned by {@link Class#getName()}.
     * Equivalent to {@code annotation().name()}.
     *
     * @return binary name of this scope annotation, never {@code null}
     */
    default String name() {
        return annotation().name();
    }

    /**
     * Returns whether this scope type is normal. In other words, returns whether
     * this scope annotation is meta-annotated {@code @NormalScope}.
     *
     * @return whether this scope type is normal
     */
    boolean isNormal();
}
