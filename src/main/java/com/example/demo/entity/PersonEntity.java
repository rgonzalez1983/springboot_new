package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.util.Objects;

@Entity
@Table(name = "person", schema = "public", catalog = "springboot_new_db")
public class PersonEntity {
    private long idPerson;
    private String name;
    private String lastname;
    private String ci;
    private String gender;
    private String address;
    private Long city;
    private CityEntity cityByCity;

    @Id
    @Column(name = "id_person", nullable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @ApiModelProperty(hidden = true)
    public long getIdPerson() {
        return idPerson;
    }

    public void setIdPerson(long idPerson) {
        this.idPerson = idPerson;
    }

    @Basic
    @Column(name = "name", nullable = true, length = 100)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "lastname", nullable = true, length = 100)
    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    @Basic
    @Column(name = "ci", nullable = true, length = 20)
    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    @Basic
    @Column(name = "gender", nullable = true, length = 1)
    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    @Basic
    @Column(name = "address", nullable = true, length = -1)
    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Basic
    @Column(name = "city", nullable = true, insertable = false, updatable = false)
    public Long getCity() {
        return city;
    }

    public void setCity(Long city) {
        this.city = city;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        PersonEntity that = (PersonEntity) o;
        return idPerson == that.idPerson &&
                Objects.equals(name, that.name) &&
                Objects.equals(lastname, that.lastname) &&
                Objects.equals(ci, that.ci) &&
                Objects.equals(gender, that.gender) &&
                Objects.equals(address, that.address) &&
                Objects.equals(city, that.city);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idPerson, name, lastname, ci, gender, address, city);
    }

    @ManyToOne
    @JoinColumn(name = "city", referencedColumnName = "id_city")
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    public CityEntity getCityByCity() {
        return cityByCity;
    }

    public void setCityByCity(CityEntity cityByCity) {
        this.cityByCity = cityByCity;
    }
}
