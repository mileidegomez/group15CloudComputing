package com.cloudcomputing.gamelist.app.entity;

import lombok.Data;
import javax.persistence.*;
import java.io.Serializable;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;
import javax.validation.constraints.NotNull;

@Data
@Document( collection="Reporting" )
public class ReportingEntity implements Serializable {

  @Id
  // @GeneratedValue(strategy= GenerationType.IDENTITY)
  private String id;

  //@NotNull(message = "Field must not be null")
  private int PlatformReport;

  //@NotNull(message = "Field must not be null")
  private String CountryReport;



};
