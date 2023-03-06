package com.kfm.dao;

import java.util.List;

public interface IBaseDao<E,ID> {
	boolean add(E obj);
	boolean delete(ID id);
	boolean update(E obj);
	E get(ID id);
	List<E> get();
}
