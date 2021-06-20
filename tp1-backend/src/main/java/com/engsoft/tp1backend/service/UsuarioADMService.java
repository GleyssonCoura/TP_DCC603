package com.engsoft.tp1backend.service;

import org.springframework.stereotype.Service;

import org.springframework.beans.factory.annotation.Autowired;

import com.engsoft.tp1backend.repository.UsuarioADMRepository;

@Service
public class UsuarioADMService {

	@Autowired
	private UsuarioADMRepository usuarioADMRepository;
}
