package server.request.student;

import java.util.Objects;

public class AddStudentRequest {
    private String name;
    private String lastName;
    private String patronymic;
    private String status;
    private long idGroup;

    public AddStudentRequest(String name, String lastName, String patronymic, String status, long idGroup) {
        this.name = name;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.status = status;
        this.idGroup = idGroup;
    }

    public String getName() {
        return name;
    }

    public String getLastName() {
        return lastName;
    }

    public String getPatronymic() {
        return patronymic;
    }

    public String getStatus() {
        return status;
    }

    public long getIdGroup() {
        return idGroup;
    }
}
