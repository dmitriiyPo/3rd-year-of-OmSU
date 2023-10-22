package server.validator.primitive;

import java.util.List;

public class IdValidator {
    public boolean validateIdNotZero(long id, List<String> errors, String fieldName, String errorMessage) {
        if (id <= 0) {
            errors.add(fieldName + ": " + errorMessage);
            return false;
        }
        return true;
    }
}
