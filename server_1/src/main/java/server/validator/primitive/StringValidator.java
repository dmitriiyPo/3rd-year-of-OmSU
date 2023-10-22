package server.validator.primitive;

import java.util.List;

public class StringValidator {

    public boolean validatorStringNotEmpty(String str, List<String> errors, String fieldName, String messageError) {
        if (str.equals("")) {
            errors.add(fieldName + ": " + messageError);
            return false;
        }
        return true;
    }

    public boolean validatorStringNoNull(String str, List<String> errors, String fieldName, String messageError) {
        if (str == null) {
            errors.add(fieldName + ": " + messageError);
            return false;
        }
        return true;
    }

    public boolean validatorStringBig(String str, List<String> errors, String fieldName, String messageError, int x) {
        if (str.length() > x) {
            errors.add(fieldName + ": " + messageError);
            return false;
        }
        return true;
    }

    public boolean validateStringInt(String id, List<String> errors, String fieldName, String errorMessage) {
        for (int i = 0; i < id.length(); i++) {
            if (!Character.isDigit(id.charAt(i))) {
                errors.add(fieldName + ": " + errorMessage);
                return false;
            }
        }
        return true;
    }

    public boolean validateStringStatus(String status, List<String> errors, String fieldName, String errorMessage) {
        if (!status.equals("учится") && !status.equals("в а/о") && !status.equals("отчислен")) {
            errors.add(fieldName + ": " + errorMessage);
            return false;
        }
        return true;
    }

}
