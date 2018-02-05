package com.thatperson.domain;
import org.springframework.roo.addon.javabean.RooJavaBean;
import org.springframework.roo.addon.jpa.activerecord.RooJpaActiveRecord;
import org.springframework.roo.addon.tostring.RooToString;
import javax.validation.constraints.NotNull;

@RooJavaBean
@RooToString
@RooJpaActiveRecord
public class Fishfeed {

    /**
     */
    @NotNull
    private String prodName;

    /**
     */
    @NotNull
    private String ingredient;

    /**
     */
    @NotNull
    private String availableFish;

    /**
     */
    @NotNull
    private String availableArea;

    /**
     */
    private String supplier;

    /**
     */
    private String origin;

    /**
     */
    private String certification;

    /**
     */
    private String useMethod;

    /**
     */
    private String price;

    /**
     */
    private String users;

    /**
     */
    private String recommendIndex;
}
