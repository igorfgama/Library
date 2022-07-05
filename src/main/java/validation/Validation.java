package validation;

import java.util.Objects;

public interface Validation<T> {
    default void nullableValidateEntry(T entry){
        if(Objects.isNull(entry)){
            throw new RuntimeException("Objeto inexistente.");
        }
    }
}
