package com.kpi.tefresolver.exception;

public class ReportNotFoundException extends RuntimeException{
    public ReportNotFoundException(Long id){
        super("Could not find report " + id);
    }
}
