package edu.unbosque.FourPawsCitizens_FastProgress_Backend.resources.pojos;

import java.util.List;

public class VisitsT {

    private Integer total;
    private List<Visit> visitByType, visitByVets;

    public VisitsT() {
    }

    public VisitsT(Integer total, List<Visit> visitByType, List<Visit> visitByVets) {
        this.total = total;
        this.visitByType = visitByType;
        this.visitByVets = visitByVets;
    }

    public Integer getTotal() {
        return total;
    }

    public void setTotal(Integer total) {
        this.total = total;
    }

    public List<Visit> getVisitByType() {
        return visitByType;
    }

    public void setVisitByType(List<Visit> visitByType) {
        this.visitByType = visitByType;
    }

    public List<Visit> getVisitByVets() {
        return visitByVets;
    }

    public void setVisitByVets(List<Visit> visitByVets) {
        this.visitByVets = visitByVets;
    }
}


