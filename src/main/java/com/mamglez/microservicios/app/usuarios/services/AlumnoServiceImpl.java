package com.mamglez.microservicios.app.usuarios.services;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mamglez.microservicios.app.usuarios.models.entity.Alumno;
import com.mamglez.microservicios.app.usuarios.models.repository.AlumnoRepository;

@Service
public class AlumnoServiceImpl implements AlumnoService{
	
	@Autowired
	private AlumnoRepository alumnoRepo;

	@Override
	@Transactional(readOnly = true)
	public Iterable<Alumno> findAll() {
		return alumnoRepo.findAll();
	}

	@Override
	@Transactional(readOnly = true)
	public Optional<Alumno> findById(Long id) {
		return alumnoRepo.findById(id);
	}

	@Override
	@Transactional
	public Alumno save(Alumno alumno) {
		return alumnoRepo.save(alumno);
	}

	@Override
	@Transactional
	public void deleteById(Long id) {
		alumnoRepo.deleteById(id);
	}

}
