package com.idat.ec3_bendezu.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import com.idat.ec3_bendezu.dto.HospitalRequestDTO;
import com.idat.ec3_bendezu.dto.HospitalResponseDTO;
import com.idat.ec3_bendezu.model.Hospital;
import com.idat.ec3_bendezu.repository.HospitalRepository;

public class HospitalServiceImpl implements HospitalService{
	
	@Autowired
	private HospitalRepository repository;

	@Override
	public void guardarHospital(HospitalRequestDTO p) {
		Hospital hospital = new Hospital();
		hospital.setIdHospital(p.getIdHospital());
		hospital.setNombre(p.getNombreHospital());
		hospital.setDescripcion(p.getDescripcion());
		hospital.setDistrito(p.getDistrito());
		repository.save(hospital);
		
		
	}

	@Override
	public void eliminarHospital(Integer id) {
		repository.deleteById(id);
		
	}

	@Override
	public void editarHospital(HospitalRequestDTO p) {
		Hospital hospital = new Hospital();
		hospital.setIdHospital(p.getIdHospital());
		hospital.setNombre(p.getNombreHospital());
		hospital.setDescripcion(p.getDescripcion());
		hospital.setDistrito(p.getDistrito());
		repository.saveAndFlush(hospital);
		
	}

	@Override
	public List<HospitalResponseDTO> listarHospital() {
		
		List<Hospital> hospital = repository.findAll();
		
		List<HospitalResponseDTO> dto = new ArrayList<HospitalResponseDTO>();
		HospitalResponseDTO hospitalDTO = null;
		
		for(Hospital hospitales:hospital) {
			hospitalDTO= new HospitalResponseDTO();
			hospitalDTO.setIdHospital(hospitales.getIdHospital());
			hospitalDTO.setNombreHospital(hospitales.getNombre());
			hospitalDTO.setDescripcion(hospitales.getDescripcion());
			hospitalDTO.setDistrito(hospitales.getDistrito());
			
			dto.add(hospitalDTO);
			
			
		}
		
		return dto;
		
		
	}

	@Override
	public HospitalResponseDTO HospitalById(Integer id) {
		Hospital hospital = repository.findById(id).orElse(null);
		HospitalResponseDTO hospitalDTO = new HospitalResponseDTO();
		
		hospitalDTO= new HospitalResponseDTO();
		hospitalDTO.setIdHospital(hospital.getIdHospital());
		hospitalDTO.setNombreHospital(hospital.getNombre());
		hospitalDTO.setDescripcion(hospital.getDescripcion());
		hospitalDTO.setDistrito(hospital.getDistrito());
		
		return hospitalDTO;
		
	}

}
