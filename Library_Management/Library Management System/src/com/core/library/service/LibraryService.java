package com.core.library.service;

public interface LibraryService {

	 public void Add()throws LibraryServiceException;
	 public void Search()throws LibraryServiceException;
	 public void ShowList()throws LibraryServiceException;
	 public void Borrow()throws  LibraryServiceException;
	 public void Return()throws  LibraryServiceException;
	 
}
