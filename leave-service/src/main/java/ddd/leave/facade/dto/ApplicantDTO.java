package ddd.leave.facade.dto;

import lombok.Data;

@Data
public class ApplicantDTO {

    String personId;
    String personName;
    String leaderId;
    String applicantType;
    String roleLevel;
}
