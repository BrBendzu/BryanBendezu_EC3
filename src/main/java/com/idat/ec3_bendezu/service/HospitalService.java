package com.idat.ec3_bendezu.service;

import java.util.List;

import com.idat.ec3_bendezu.dto.HospitalRequestDTO;
import com.idat.ec3_bendezu.dto.HospitalResponseDTO;

public interface HospitalService {

	public void guardarHospital(HospitalRequestDTO p);
	public void eliminarHospital(Integer id);
	public void editarHospital(HospitalRequestDTO p);
	public List<HospitalResponseDTO> listarHospital();
	public HospitalResponseDTO HospitalById(Integer id);
	
}
