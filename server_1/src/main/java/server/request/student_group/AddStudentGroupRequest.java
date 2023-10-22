package server.request.student_group;

public class AddStudentGroupRequest {
    private String name;

    public AddStudentGroupRequest(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
}
