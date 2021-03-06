/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package edu.ucsc.ce.models;

/**
 *
 * @author Jinadi
 */
public class Student_SubDTO {

    private String ssid;
    private StudentDTO studentDTO;; 
    private SubjectDTO subjectDTO;

    public Student_SubDTO(String ssid, StudentDTO studentDTO, SubjectDTO subjectDTO) {
        this.ssid = ssid;
        this.studentDTO = studentDTO;
        this.subjectDTO = subjectDTO;
    }
    

    /**
     * @return the sid
     */
   
    /**
     * @return the studentDTO
     */
    public StudentDTO getStudentDTO() {
        return studentDTO;
    }

    /**
     * @param studentDTO the studentDTO to set
     */
    public void setStudentDTO(StudentDTO studentDTO) {
        this.studentDTO = studentDTO;
    }

    /**
     * @return the subjectDTO
     */
    public SubjectDTO getSubjectDTO() {
        return subjectDTO;
    }

    /**
     * @param subjectDTO the subjectDTO to set
     */
    public void setSubjectDTO(SubjectDTO subjectDTO) {
        this.subjectDTO = subjectDTO;
    }

    /**
     * @return the ssid
     */
    public String getSsid() {
        return ssid;
    }

    /**
     * @param ssid the ssid to set
     */
    public void setSsid(String ssid) {
        this.ssid = ssid;
    }

  

}
