package com.example.badgeapp.service;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.badgeapp.domain.Category;
import com.example.badgeapp.repository.CategoriesDao;



@Service
public class CategoriesService {
	/** Logger for this class and subclasses */
    protected final Log logger = LogFactory.getLog(getClass());
    
    @Autowired
    private CategoriesDao categoriesDao;
    
    public List<Category> getCategories() {
        //return products; AQUIIIIIIIIIIIII
    	
    	List<Category> o = categoriesDao.getCategoriesList();
    	return o;
    }
    
    public void updateCategory(Category category){
    	categoriesDao.updateCategory(category);	
    }
    
   
    public Category getCategory(Integer id){
    	return categoriesDao.getCategory(id);
    }

	public void addCategory(Category category) {
    	categoriesDao.addCategory(category);
	}
	


	public void deleteCategory(Integer id) {
    	categoriesDao.deleteCategory(id);
	}
}
