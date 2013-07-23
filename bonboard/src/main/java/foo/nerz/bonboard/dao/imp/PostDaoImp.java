package foo.nerz.bonboard.dao.imp;

import java.math.BigInteger;

import org.springframework.transaction.annotation.Transactional;

import foo.nerz.bonboard.dao.PostDao;
import foo.nerz.bonboard.entity.Post;

import foo.nerz.bonboard.util.GenericDaoImp;

public class PostDaoImp extends GenericDaoImp<Post, Long> implements PostDao {

	
	
//	@Transactional
//	public int savePost(Post p){
//		int id = (Integer)getSessionFactory().getCurrentSession().save(p);
//		return id;
//	}
//	
//	@Transactional
//	public Post getById(int id){
//		return (Post) getSessionFactory().getCurrentSession().get(Post.class, id);
//	}
//	
//	@Transactional
//	public void deletById(int id){
//		getSessionFactory().getCurrentSession().delete(this.getById(id));
//	}
	
	/* (non-Javadoc)
	 * @see foo.nerz.bonboard.dao.imp.PostDao#getCountByType(int)
	 */
	
	@Transactional
	public int getCountByType(int tipo){
		BigInteger count = (BigInteger) getSessionFactory().getCurrentSession().createSQLQuery("select count(*) from posts where id_tipo= "+tipo).uniqueResult();
		return count.intValue();
	}
	
//	@Transactional
//	public List<Post> get10PostPaged(int tipo,int page){
//		int count=this.getCountByType(tipo);
//		List<Post> p ;
//		if((page-1)*10<count){
//			if((count-((page-1)*10))<10){
//				Query q=getSessionFactory().getCurrentSession().createQuery("From Post where Id_tipo="+tipo+" order by Time ");
//				q.setMaxResults(count-((page-1)*10));
//				q.setFirstResult((page-1)*10);
//				p=q.list();
//				return p;
//			}else{
//				Query q=getSessionFactory().getCurrentSession().createQuery("From Post where Id_tipo="+tipo+" order by Time desc");
//				q.setMaxResults(10);
//				q.setFirstResult((page-1)*10);
//				p=q.list();
//				return p;
//			}
//		}else return null;
//		
//	}
	
}
