package edu.unbosque.FourPawsCitizens_FastProgress_Backend.resources.pojos;

import java.util.List;

public class CasesT {
    private Integer total;
    private List<Case> caseByType;

    public CasesT() {
    }

    public CasesT(Integer totalCases, List<Case> caseByType) {
        this.total = totalCases;
        this.caseByType = caseByType;
    }


    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public List<Case> getCaseByType() {
        return caseByType;
    }

    public void setCaseByType(List<Case> caseByType) {
        this.caseByType = caseByType;
    }
}
