package server.validator.student;


import server.Validator;
import server.request.student.AddStudentRequest;
import server.validator.primitive.IdValidator;
import server.validator.primitive.StringValidator;

import java.util.ArrayList;
import java.util.List;

public class AddStudentValidator implements Validator<AddStudentRequest> {
    private StringValidator stringValidator;
    private IdValidator idValidator;

    public AddStudentValidator(StringValidator stringValidator, IdValidator idValidator) {
        this.stringValidator = stringValidator;
        this.idValidator = idValidator;
    }

    @Override
    public List<String> validator(AddStudentRequest request) {
        List<String> errors = new ArrayList<>();

        stringValidator.validatorStringNotEmpty(request.getName(), errors, "name", "empty");
        stringValidator.validatorStringNoNull(request.getName(), errors, "name", "null");
        stringValidator.validatorStringBig(request.getName(), errors, "name", "big", 30);

        stringValidator.validatorStringNotEmpty(request.getLastName(), errors, "lastName", "empty");
        stringValidator.validatorStringNoNull(request.getLastName(), errors, "lastName", "null");
        stringValidator.validatorStringBig(request.getLastName(), errors, "lastName", "big", 30);

        stringValidator.validatorStringNotEmpty(request.getPatronymic(), errors, "patronymic", "empty");
        stringValidator.validatorStringNoNull(request.getPatronymic(), errors, "patronymic", "null");
        stringValidator.validatorStringBig(request.getPatronymic(), errors, "patronymic", "big", 30);

        stringValidator.validatorStringNotEmpty(request.getStatus(), errors, "status", "empty");
        stringValidator.validatorStringNoNull(request.getStatus(), errors, "status", "null");
        stringValidator.validateStringStatus(request.getStatus(), errors, "status", "no status");

        idValidator.validateIdNotZero(request.getIdGroup(), errors, "idGroup", "must be position");

        return errors;
    }
}

