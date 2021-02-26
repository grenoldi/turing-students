package entities;

import enums.Status;

public class Student {
    private Long id;
    private String name;
    private String cpf;
    private String telephone;
    private String street;
    private String uf;
    private String cep;
    private int number;
    private double firstTestGrade;
    private double secondTestGrade;
    private double homeworkGrade;
    private double presentationGrade;
    private double finalGrade;
    private Status status;

    public Student(Long id, String n, String cpf, String tel){
        this.id = id;
        this.name = n;
        this.cpf = cpf;
        this.telephone = tel;
        this.status= Status.PENDING;
    }

    public Student(Longid, String n, String cpf, String tel, String st, String uf, String cep, int num){
        this.id = id;
        this.name = n;
        this.cpf = cpf;
        this.telephone = tel;
        this.street = st;
        this.uf = uf;
        this.cep = cep;
        this.number = num;
        this.status= Status.PENDING;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelephone() {
        return telephone;
    }

    public void setTelephone(String telephone) {
        this.telephone = telephone;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street) {
        this.street = street;
    }

    public String getUf() {
        return uf;
    }

    public void setUf(String uf) {
        this.uf = uf;
    }

    public String getCep() {
        return cep;
    }

    public void setCep(String cep) {
        this.cep = cep;
    }

    public int getNumber() {
        return number;
    }

    public void setNumber(int number) {
        this.number = number;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getFirstTestGrade() {
        return firstTestGrade;
    }

    public void setFirstTestGrade(double firstTestGrade) {
        this.firstTestGrade = firstTestGrade;
    }

    public double getSecondTestGrade() {
        return secondTestGrade;
    }

    public void setSecondTestGrade(double secondTestGrade) {
        this.secondTestGrade = secondTestGrade;
    }

    public double getHomeworkGrade() {
        return homeworkGrade;
    }

    public void setHomeworkGrade(double homeworkGrade) {
        this.homeworkGrade = homeworkGrade;
    }

    public double getPresentationGrade() {
        return presentationGrade;
    }

    public void setPresentationGrade(double presentationGrade) {
        this.presentationGrade = presentationGrade;
    }

    public double getFinalGrade() {
        return finalGrade;
    }

    public void setFinalGrade(double finalGrade) {
        this.finalGrade = finalGrade;
    }

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }
}
