package com.api.lapwing.dao.business;

import com.api.lapwing.dao.RevisionData;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

public final class BusinessData implements RevisionData {
    private final String name;
    private final String cep;
    private final String complement;
    private final String cnpj;
    private final String cpf;
    private final String phone;
    private final String email;

    @JsonCreator
    public BusinessData(@JsonProperty("Name") final String name,
                        @JsonProperty("Cep") final String cep,
                        @JsonProperty("Complement") final String complement,
                        @JsonProperty("Cnpj") final String cnpj,
                        @JsonProperty("Cpf") final String cpf,
                        @JsonProperty("Email") final String email,
                        @JsonProperty("Phone") final String phone) {
        this.name = name;
        this.cep = cep;
        this.complement = complement;
        this.cnpj = cnpj;
        this.cpf = cpf;
        this.phone = phone;
        this.email = email;
    }

    @JsonProperty("Cep")
    public String getCep() {
        return cep;
    }

    @JsonProperty("Name")
    public String getName() {
        return name;
    }

    @JsonProperty("Complement")
    public String getComplement() {
        return complement;
    }

    @JsonProperty("Cnpj")
    public String getCnpj() {
        return cnpj;
    }

    @JsonProperty("Cpf")
    public String getCpf() {
        return cpf;
    }

    @JsonProperty("Phone")
    public String getPhone() {
        return phone;
    }

    @JsonProperty("Email")
    public String getEmail() {
        return email;
    }

    @Override
    public String toString() {
        return "BusinessData{" +
                "name='" + name + '\'' +
                ", cep='" + cep + '\'' +
                ", complement='" + complement + '\'' +
                ", cnpj='" + cnpj + '\'' +
                ", cpf='" + cpf + '\'' +
                ", phone='" + phone + '\'' +
                ", email='" + email + '\'' +
                '}';
    }
}
