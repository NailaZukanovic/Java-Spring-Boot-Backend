package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MealContr {

@Autowired
CatRep catRep;

@GetMapping(“/getAllCategories”)
public List<Meals> getAllMeals()
{
return catRep.findAll();
}

@GetMapping(“/getBookById/{id}”)
public Optional<Category> getCategoryById(@PathVariable(value=”id”) Long id)
{
return catRep.findById(id);
}

@PostMapping(“/addCategory”)
public Category addCategory(@RequestBody Category category)
{
return catRep.save(category);
}

@PutMapping(“/updateCategory/{id}”)
public Category updateCategory(@PathVariable(value=”id”) Long id, @RequestBody Category category)
{
Optional<Category> category = catRep.findById(id);
Category book_new=category.get();
book_new.setStrCategory(category.getStrCategory());
book_new.setstrCategoryThumb(category.getstrCategoryThumb());
book_new.setstrCategoryDescription(category.getstrCategoryDescription());
return catRep.save(book_new);

}

@DeleteMapping(“/deleteCategory/{id}”)
public void deleteCategory(@PathVariable(value=”id”) Long id)
{
Optional<Category> category=catRep.findById(id);
Category book_new=category.get();
catRep.delete(book_new);
}

}