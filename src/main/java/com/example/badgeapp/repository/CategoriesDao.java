package com.example.badgeapp.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.example.badgeapp.domain.Category;


@Repository
public interface CategoriesDao {


    public List<Category> getCategoriesList();
    
	public void updateCategory(Category category);


	public Category getCategory(Integer id);
	public void addCategory(Category category);
	

	public void deleteCategory(Integer id);


}