package com.example.badgeapp.repository;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import com.example.badgeapp.domain.Category;



@Repository
public class CategoriesDaoImp implements CategoriesDao {

	 protected EntityManager em;
	 
	    public EntityManager getEntityManager() {
	        return em;
	    }
	    @PersistenceContext
	    public void setEntityManager(EntityManager entityManager) {
	        this.em = entityManager;
	    }


   
    public List<Category> getCategoriesList() {
    	//Query p = em.createQuery("select distinct c.value from Category p  order by c.id");
    	//p.getResultList();
    	
    	List<Category> s = getEntityManager().createQuery("SELECT c FROM Category c ", Category.class).getResultList();
    	return s;
    	
        //return getEntityManager().createQuery("SELECT value FROM Category ", String.class).getResultList();
    }
    

    @Transactional(readOnly = false)
	public void updateCategory(Category category) {
    	getEntityManager().merge(category);

	}


	 @Transactional(readOnly=false)
	public Category getCategory(Integer id) {
    	return getEntityManager().find(Category.class, id);
	}
    

	@Transactional(readOnly=false)
	public void addCategory(Category cat) {
		Query query= getEntityManager().createQuery("select label from Category  where value=?1");
		query.setParameter(1, cat.getLabel());
		
		@SuppressWarnings("unchecked")
		List <Category> p = query.getResultList();
		if(p.isEmpty()){
			em.persist(cat);
		}
	
	}
	

	@Transactional(propagation = Propagation.REQUIRED) //Enlazar dos llamadas 
	public void deleteCategory(Integer id) {
		//Product p = em.find(Product.class, id);
		Category c = getEntityManager().getReference(Category.class, id);
		em.remove(c);	

	}


}