package server.request.student;

public class EditStudentRequest {
    private long id;
    private String name;
    private String lastName;
    private String patronymic;
    private long idGroup;
    private String status;

    public EditStudentRequest(long id, String name, String lastName, String patronymic, long idGroup, String status) {
        this.id = id;
        this.name = name;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.idGroup = idGroup;
        this.status = status;
    }

    public long getId() {
        return id;
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

    public long getIdGroup() {
        return idGroup;
    }

    public String getStatus() {
        return status;
    }
}
