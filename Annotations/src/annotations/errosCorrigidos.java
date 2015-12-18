package annotations;

import java.lang.annotation.Documented;
import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Documented
//PARA QUE ELA APARECA NO javadoc
@Target({ElementType.METHOD, ElementType.TYPE})
public @interface errosCorrigidos {
    String[] erros();
}
