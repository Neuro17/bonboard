package foo.nerz.bonboard.dao;

import foo.nerz.bonboard.entity.Post;

import foo.nerz.bonboard.util.GenericDao;



public interface PostDao extends GenericDao<Post,Long> {

	public int getCountByType(int tipo);

}