package com.engsoft.tp1backend.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.engsoft.tp1backend.entity.UsuarioADM;
import com.engsoft.tp1backend.repository.UsuarioADMRepository;

@Service
public class UsuarioADMService {

	@Autowired
	private UsuarioADMRepository usuarioADMRepository;

	public UsuarioADM inserirUsuarioADM(UsuarioADM usuarioADM) {
		if (usuarioADM == null) {

		}

		if (usuarioADM.getNome() == null || usuarioADM.getNome().isEmpty()) {

		}

		if (usuarioADM.getLogin() == null || usuarioADM.getLogin().isEmpty()) {

		}

		if (usuarioADM.getSenha() == null || usuarioADM.getSenha().isEmpty()) {

		}

		return this.usuarioADMRepository.save(usuarioADM);
	}
}
