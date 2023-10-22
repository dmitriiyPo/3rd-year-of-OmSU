package server.entity;

import java.util.Objects;

public class Student
{
    private String name;
    private String lastName;
    private String patronymic;
    private Long id;
    private Long idGroup;
    private String status;

    public Student(){}

    public Student(String name, String lastName, String patronymic, Long id, Long idGroup, String status)
    {
        this.name = name;
        this.lastName = lastName;
        this.patronymic = patronymic;
        this.id = id;
        this.idGroup = idGroup;
        this.status = status;
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

    public Long getId() {
        return id;
    }

    public Long getIdGroup() {
        return idGroup;
    }

    public String getStatus() {
        return status;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return Objects.equals(name, student.name) && Objects.equals(lastName, student.lastName) && Objects.equals(patronymic, student.patronymic) && Objects.equals(id, student.id) && Objects.equals(idGroup, student.idGroup) && Objects.equals(status, student.status);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, lastName, patronymic, id, idGroup, status);
    }
}
