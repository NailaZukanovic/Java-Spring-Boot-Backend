package com.example.demo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name=”Details”)
public class Details {
@Id
private Long idMeal;
@Column
private String strMeal;
@Column
private String strDrinkAlternate;
@Column
private String strCategory;
@Column
private String strArea;
@Column
private String strInstructions; //Ovo je tipa niz sa MealDB-a
@Column
private String strMealThumb;
@Column
private String strTags;
@Column
private String strYoutube;
@Column
private String name;
@Column
private String measure;




public Details(){ }

public Details(Long idCategory, String strCategory, String strCategoryThumb, String strCategoryDescription) {
this.idCategory=idCategory;
this.strCategory=strCategory;
this.strCategoryThumb=strCategoryThumb;
this.strCategoryDescription=strCategoryDescription;
}

public Long getIdCategory() {
return idCategory;
}

public void setIdCategory(Long idCategory) {
this.idCategory = idCategory;
}

public String getStrCategory() {
return strCategory;
}

public void setStrCategory(String strCategory) {
this.strCategory = strCategory;
}

public String getstrCategoryThumb() {
return strCategoryThumb;
}

public void setstrCategoryThumb(String strCategoryThumb) {
this.strCategoryThumb = strCategoryThumb;
}

public String getstrCategoryDescription() {
return strCategoryDescription;
}

public void setstrCategoryDescription(String strCategoryDescription) {
this.strCategoryDescription = strCategoryDescription;
}

}