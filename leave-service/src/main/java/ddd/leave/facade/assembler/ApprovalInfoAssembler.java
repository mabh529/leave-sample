package ddd.leave.facade.assembler;

import ddd.leave.domain.leave.entity.ApprovalInfo;
import ddd.leave.facade.dto.ApprovalInfoDTO;

public class ApprovalInfoAssembler {

    public static ApprovalInfo toDO(ApprovalInfoDTO dto){
        ApprovalInfo approvalInfo = new ApprovalInfo();
        approvalInfo.setApprovalInfoId(dto.getApprovalInfoId());
        approvalInfo.setMsg(dto.getMsg());
        approvalInfo.setApprover(ApproverAssembler.toDO(dto.getApproverDTO()));
        return approvalInfo;
    }

    public static ApprovalInfoDTO toDTO(ApprovalInfo approvalInfo){
        ApprovalInfoDTO dto = new ApprovalInfoDTO();
        dto.setApprovalInfoId(approvalInfo.getApprovalInfoId());
        dto.setMsg(approvalInfo.getMsg());
        dto.setTime(approvalInfo.getTime());
        return dto;
    }
}
