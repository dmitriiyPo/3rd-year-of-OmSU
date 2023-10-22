package server.validator.student_group;

import server.Validator;
import server.request.student_group.AddStudentGroupRequest;
import server.validator.primitive.IdValidator;
import server.validator.primitive.StringValidator;

import java.util.ArrayList;
import java.util.List;

public class AddStudentGroupValidator implements Validator <AddStudentGroupRequest> {

    private StringValidator stringValidator;

    public AddStudentGroupValidator(StringValidator stringValidator) {
        this.stringValidator = stringValidator;
    }

    @Override
    public List<String> validator(AddStudentGroupRequest request) {
        List<String> errors = new ArrayList<>();

        stringValidator.validatorStringNotEmpty(request.getName(), errors, "name", "empty");
        stringValidator.validatorStringNoNull(request.getName(), errors, "name", "null");
        stringValidator.validatorStringBig(request.getName(), errors, "name", "big", 30);

        return errors;
    }
}
