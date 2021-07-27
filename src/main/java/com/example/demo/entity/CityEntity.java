package com.example.demo.entity;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonManagedReference;
import io.swagger.annotations.ApiModelProperty;

import javax.persistence.*;
import java.util.Collection;
import java.util.Objects;

@Entity
@Table(name = "city", schema = "public", catalog = "springboot_new_db")
public class CityEntity {
    private long idCity;
    private String name;
    private Long country;
    private CountryEntity countryByCountry;
    private Collection<PersonEntity> peopleByIdCity;

    @Id
    @Column(name = "id_city", nullable = false)
    @GeneratedValue(strategy = GenerationType.SEQUENCE)
    @ApiModelProperty(hidden = true)
    public long getIdCity() {
        return idCity;
    }

    public void setIdCity(long idCity) {
        this.idCity = idCity;
    }

    @Basic
    @Column(name = "name", nullable = true, length = -1)
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @Basic
    @Column(name = "country", nullable = true, insertable = false, updatable = false)
    public Long getCountry() {
        return country;
    }

    public void setCountry(Long country) {
        this.country = country;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        CityEntity that = (CityEntity) o;
        return idCity == that.idCity &&
                Objects.equals(name, that.name) &&
                Objects.equals(country, that.country);
    }

    @Override
    public int hashCode() {
        return Objects.hash(idCity, name, country);
    }

    @ManyToOne
    @JsonIgnoreProperties({"hibernateLazyInitializer", "handler"})
    @JoinColumn(name = "country", referencedColumnName = "id_country")
    public CountryEntity getCountryByCountry() {
        return countryByCountry;
    }

    public void setCountryByCountry(CountryEntity countryByCountry) {
        this.countryByCountry = countryByCountry;
    }

    @OneToMany(mappedBy = "cityByCity", cascade = CascadeType.ALL, fetch = FetchType.LAZY)
    @JsonIgnore
    public Collection<PersonEntity> getPeopleByIdCity() {
        return peopleByIdCity;
    }

    public void setPeopleByIdCity(Collection<PersonEntity> peopleByIdCity) {
        this.peopleByIdCity = peopleByIdCity;
    }
}
