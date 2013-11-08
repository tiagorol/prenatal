package com.marciani.sample.entity.user.model;

import java.io.Serializable;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

@MappedSuperclass
public class BaseEntity implements Serializable {
	
	private static final long serialVersionUID = -3336043433768035460L;
	
	@Id
    @GeneratedValue(strategy=GenerationType.AUTO, generator="SEQUENCE")
    private Long id;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public boolean isNew() {
        return (this.id == null);
    }
    
    public static boolean isNotEmpty(BaseEntity... entity) {
    	return !isEmpty(entity);
    }
    
    public static boolean isEmpty(BaseEntity... entity) {
        boolean empty = false;
        for (BaseEntity baseEntity : entity) {
            if(baseEntity == null || baseEntity.getId() == null){
                empty = true;
                break;
            }
        }
        return empty;
    }

    @Override
    public int hashCode() {
        int hash = 0;
        hash += (id != null ? id.hashCode() : 0);
        return hash;
    }

    @Override
    public boolean equals(Object object) {
        if (!(object instanceof BaseEntity)) {
            return false;
        }
        BaseEntity other = (BaseEntity) object;
        if ((this.id == null && other.id != null) || (this.id != null && !this.id.equals(other.id))) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
    	return "[ID=" + getId() + "]";
    }
}
