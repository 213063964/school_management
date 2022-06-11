package za.ac.cput.school_management.domain;

/*
 * Zintle Magwaxaza (218109911)
 * Country.java
 * Date: 9 June 2022
 */

import java.util.Objects;

public class Country {
    private final String countryId;
    private final String countryName;


    private Country(Builder builder) {
        this.countryId = builder.countryId;
        this.countryName = builder.countryName;
    }

    public String getCountryId() {
        return countryId;
    }

    public String getCountryName() {
        return countryName;
    }


    public static class Builder {

        String countryId;
        String countryName;

        public Country.Builder setCountryId(String countryId) {
            this.countryId = countryId;
            return this;
        }

        public Country.Builder setCountryName(String countryName) {
            this.countryName = countryName;
            return this;
        }

        public Builder copy(Country country) {
            this.countryId = country.countryId;
            this.countryName = country.countryName;
            return this;
        }

        public Country build() {
            return new Country(this);
        }
    }

    @Override
    public String toString() {
        return "country{" +
                "countryId='" + countryId + '\'' +
                ", countryName='" + countryName + '\'' + '}';

    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Country that = (Country) o;
        return countryId.equals(that.countryId) &&
                countryName.equals(that.countryName);
    }

    @Override
    public int hashCode()
    {
        return Objects.hash(countryId, countryName);
    }
}
