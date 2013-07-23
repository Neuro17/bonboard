package foo.nerz.bonboard.dao.imp;


import org.springframework.transaction.annotation.Transactional;

import foo.nerz.bonboard.dao.AuthoritiesDao;
import foo.nerz.bonboard.entity.Authorities;
import foo.nerz.bonboard.entity.Users;
import foo.nerz.bonboard.util.GenericDaoImp;

public class AuthoritiesDaoImp extends GenericDaoImp<Authorities, String> implements AuthoritiesDao {

	
	

	
	/* (non-Javadoc)
	 * @see foo.nerz.bonboard.dao.imp.AuthoritiesDao#existAuthByUser(foo.nerz.bonboard.entity.Users, java.lang.String)
	 */
	@Override
	@Transactional
	public boolean existAuthByUser(Users u, String auth){
		Authorities a =new Authorities(u, auth);
		Authorities b=null;
		b=(Authorities)getSessionFactory().getCurrentSession().get(Authorities.class, a);
		if(b==null)return false;
		else return true;
	}

	@Override
	@Transactional
	public void saveA(Authorities a) {
		 getSessionFactory().getCurrentSession().save(a);		
	}
	
}
