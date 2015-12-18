package annotations;

import java.lang.annotation.ElementType;
import java.lang.annotation.Target;

@Target(ElementType.TYPE)//RESTRIGE ESTA ANOTACAO A CLASSES
public @interface Cabecalho {
//REPRESENTACAO DE CABECALHO PADRAO COM annotations
    String instituicao();
    String projeto();
    String dataCriacao();
    String criador();
    int revisoesFeitas() default 1;
}
