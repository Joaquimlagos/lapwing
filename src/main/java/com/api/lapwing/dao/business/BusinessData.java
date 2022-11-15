package com.api.lapwing.dao.business;

/*
 * Copyright 2019 Amazon.com, Inc. or its affiliates. All Rights Reserved.
 * SPDX-License-Identifier: MIT-0
 *
 * Permission is hereby granted, free of charge, to any person obtaining a copy of this
 * software and associated documentation files (the "Software"), to deal in the Software
 * without restriction, including without limitation the rights to use, copy, modify,
 * merge, publish, distribute, sublicense, and/or sell copies of the Software, and to
 * permit persons to whom the Software is furnished to do so.
 *
 * THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR IMPLIED,
 * INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, FITNESS FOR A
 * PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE AUTHORS OR COPYRIGHT
 * HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER LIABILITY, WHETHER IN AN ACTION
 * OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, OUT OF OR IN CONNECTION WITH THE
 * SOFTWARE OR THE USE OR OTHER DEALINGS IN THE SOFTWARE.
 */

import com.api.lapwing.dao.RevisionData;
import com.fasterxml.jackson.annotation.JsonCreator;
import com.fasterxml.jackson.annotation.JsonProperty;

/**
 * Represents a driver's license, serializable to (and from) Ion.
 */
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
