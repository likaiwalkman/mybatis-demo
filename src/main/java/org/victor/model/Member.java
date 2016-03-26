package org.victor.model;

import java.util.Date;

public class Member {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column member.member_id
     *
     * @mbggenerated
     */
    private Integer memberId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column member.last_name
     *
     * @mbggenerated
     */
    private String lastName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column member.first_name
     *
     * @mbggenerated
     */
    private String firstName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column member.suffix
     *
     * @mbggenerated
     */
    private String suffix;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column member.expiration
     *
     * @mbggenerated
     */
    private Date expiration;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column member.email
     *
     * @mbggenerated
     */
    private String email;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column member.street
     *
     * @mbggenerated
     */
    private String street;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column member.city
     *
     * @mbggenerated
     */
    private String city;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column member.state
     *
     * @mbggenerated
     */
    private String state;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column member.zip
     *
     * @mbggenerated
     */
    private String zip;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column member.phone
     *
     * @mbggenerated
     */
    private String phone;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column member.interests
     *
     * @mbggenerated
     */
    private String interests;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member
     *
     * @mbggenerated
     */
    public Member(Integer memberId, String lastName, String firstName, String suffix, Date expiration, String email, String street, String city, String state, String zip, String phone, String interests) {
        this.memberId = memberId;
        this.lastName = lastName;
        this.firstName = firstName;
        this.suffix = suffix;
        this.expiration = expiration;
        this.email = email;
        this.street = street;
        this.city = city;
        this.state = state;
        this.zip = zip;
        this.phone = phone;
        this.interests = interests;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table member
     *
     * @mbggenerated
     */
    public Member() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column member.member_id
     *
     * @return the value of member.member_id
     *
     * @mbggenerated
     */
    public Integer getMemberId() {
        return memberId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column member.member_id
     *
     * @param memberId the value for member.member_id
     *
     * @mbggenerated
     */
    public void setMemberId(Integer memberId) {
        this.memberId = memberId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column member.last_name
     *
     * @return the value of member.last_name
     *
     * @mbggenerated
     */
    public String getLastName() {
        return lastName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column member.last_name
     *
     * @param lastName the value for member.last_name
     *
     * @mbggenerated
     */
    public void setLastName(String lastName) {
        this.lastName = lastName == null ? null : lastName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column member.first_name
     *
     * @return the value of member.first_name
     *
     * @mbggenerated
     */
    public String getFirstName() {
        return firstName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column member.first_name
     *
     * @param firstName the value for member.first_name
     *
     * @mbggenerated
     */
    public void setFirstName(String firstName) {
        this.firstName = firstName == null ? null : firstName.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column member.suffix
     *
     * @return the value of member.suffix
     *
     * @mbggenerated
     */
    public String getSuffix() {
        return suffix;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column member.suffix
     *
     * @param suffix the value for member.suffix
     *
     * @mbggenerated
     */
    public void setSuffix(String suffix) {
        this.suffix = suffix == null ? null : suffix.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column member.expiration
     *
     * @return the value of member.expiration
     *
     * @mbggenerated
     */
    public Date getExpiration() {
        return expiration;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column member.expiration
     *
     * @param expiration the value for member.expiration
     *
     * @mbggenerated
     */
    public void setExpiration(Date expiration) {
        this.expiration = expiration;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column member.email
     *
     * @return the value of member.email
     *
     * @mbggenerated
     */
    public String getEmail() {
        return email;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column member.email
     *
     * @param email the value for member.email
     *
     * @mbggenerated
     */
    public void setEmail(String email) {
        this.email = email == null ? null : email.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column member.street
     *
     * @return the value of member.street
     *
     * @mbggenerated
     */
    public String getStreet() {
        return street;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column member.street
     *
     * @param street the value for member.street
     *
     * @mbggenerated
     */
    public void setStreet(String street) {
        this.street = street == null ? null : street.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column member.city
     *
     * @return the value of member.city
     *
     * @mbggenerated
     */
    public String getCity() {
        return city;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column member.city
     *
     * @param city the value for member.city
     *
     * @mbggenerated
     */
    public void setCity(String city) {
        this.city = city == null ? null : city.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column member.state
     *
     * @return the value of member.state
     *
     * @mbggenerated
     */
    public String getState() {
        return state;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column member.state
     *
     * @param state the value for member.state
     *
     * @mbggenerated
     */
    public void setState(String state) {
        this.state = state == null ? null : state.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column member.zip
     *
     * @return the value of member.zip
     *
     * @mbggenerated
     */
    public String getZip() {
        return zip;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column member.zip
     *
     * @param zip the value for member.zip
     *
     * @mbggenerated
     */
    public void setZip(String zip) {
        this.zip = zip == null ? null : zip.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column member.phone
     *
     * @return the value of member.phone
     *
     * @mbggenerated
     */
    public String getPhone() {
        return phone;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column member.phone
     *
     * @param phone the value for member.phone
     *
     * @mbggenerated
     */
    public void setPhone(String phone) {
        this.phone = phone == null ? null : phone.trim();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column member.interests
     *
     * @return the value of member.interests
     *
     * @mbggenerated
     */
    public String getInterests() {
        return interests;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column member.interests
     *
     * @param interests the value for member.interests
     *
     * @mbggenerated
     */
    public void setInterests(String interests) {
        this.interests = interests == null ? null : interests.trim();
    }
}