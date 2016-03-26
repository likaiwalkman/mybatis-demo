package org.victor.model;

import java.util.Date;

public class AbsenceKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column absence.student_id
     *
     * @mbggenerated
     */
    private Integer studentId;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column absence.date
     *
     * @mbggenerated
     */
    private Date date;

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table absence
     *
     * @mbggenerated
     */
    public AbsenceKey(Integer studentId, Date date) {
        this.studentId = studentId;
        this.date = date;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table absence
     *
     * @mbggenerated
     */
    public AbsenceKey() {
        super();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column absence.student_id
     *
     * @return the value of absence.student_id
     *
     * @mbggenerated
     */
    public Integer getStudentId() {
        return studentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column absence.student_id
     *
     * @param studentId the value for absence.student_id
     *
     * @mbggenerated
     */
    public void setStudentId(Integer studentId) {
        this.studentId = studentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column absence.date
     *
     * @return the value of absence.date
     *
     * @mbggenerated
     */
    public Date getDate() {
        return date;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column absence.date
     *
     * @param date the value for absence.date
     *
     * @mbggenerated
     */
    public void setDate(Date date) {
        this.date = date;
    }
}