package server.validator.student_group;

import server.Validator;
import server.request.student_group.AddStudentGroupRequest;
import server.request.student_group.EditStudentGroupRequest;
import server.validator.primitive.IdValidator;
import server.validator.primitive.StringValidator;

import java.util.ArrayList;
import java.util.List;

public class EditStudentGroupValidator implements Validator<EditStudentGroupRequest> {
    private StringValidator stringValidator;

    private IdValidator idValidator;

    public EditStudentGroupValidator(StringValidator stringValidator, IdValidator idValidator) {
        this.stringValidator = stringValidator;
        this.idValidator = idValidator;
    }

    @Override

    public List<String> validator(EditStudentGroupRequest request) {
        List<String> errors = new ArrayList<>();

        stringValidator.validatorStringNotEmpty(request.getName(), errors, "name", "empty");
        stringValidator.validatorStringNoNull(request.getName(), errors, "name", "null");
        stringValidator.validatorStringBig(request.getName(), errors, "name", "big", 30);

        idValidator.validateIdNotZero(request.getId(), errors, "id", "must be position");

        return errors;
    }

}
