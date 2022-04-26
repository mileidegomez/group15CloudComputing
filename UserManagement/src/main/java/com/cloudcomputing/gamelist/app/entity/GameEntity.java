package com.cloudcomputing.gamelist.app.entity;

import lombok.Data;
import javax.persistence.*;
import java.io.Serializable;
import java.util.List;
import org.springframework.data.mongodb.core.mapping.Document;
import javax.validation.constraints.NotNull;
import java.math.BigInteger;
import org.springframework.data.annotation.Id;

@Data
@Document( collection="ListOfGames" )
public class GameEntity implements Serializable {

  @Id
 // @GeneratedValue(strategy= GenerationType.IDENTITY)
  private String id;

//  @NotNull(message = "Field must not be null")
  private String Name;

//  @NotNull(message = "Field must not be null")
  private String Platform;

//  @NotNull(message = "Field must not be null")
  private String Year_Of_Release;

//  @NotNull(message = "Field must not be null")
  private String Genre;

//  @NotNull(message = "Field must not be null")
  private String Publisher;

//  @NotNull(message = "Field must not be null")
  private String NA_Sales;

  //  @NotNull(message = "Field must not be null")
  private String EU_Sales;

  //  @NotNull(message = "Field must not be null")
  private String JP_Sales;

  //@NotNull(message = "Field must not be null")
  private String Other_Sales;

  // @NotNull(message = "Field must not be null")
  private String Global_Sales;

  //  @NotNull(message = "Field must not be null")
  private String Critic_Score;

  //  @NotNull(message = "Field must not be null")
  private String Critic_Count;

  // @NotNull(message = "Field must not be null")
  private String User_Score;

  //  @NotNull(message = "Field must not be null")
  private String User_Count;

  //@NotNull(message = "Field must not be null")
  private String Developer;

  //@NotNull(message = "Field must not be null")
  private String Rating;


};
