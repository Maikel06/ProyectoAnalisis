package com.example.AnalisisProject;

import com.example.AnalisisProject.entity.OfertaLaboral;
import com.example.AnalisisProject.entity.Organizacion;
import com.example.AnalisisProject.entity.RequisitoPuesto;
import com.example.AnalisisProject.repository.OfertaLaboralRepository;
import com.example.AnalisisProject.repository.OrganizacionRepository;
import com.example.AnalisisProject.repository.RequisitoPuestoRepository;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

@ExtendWith(SpringExtension.class)
@SpringBootTest
class AnalisisProjectApplicationTests {

	@Autowired
	OfertaLaboralRepository Oferta_Repo;

	@Autowired
	OrganizacionRepository Organizacion_Repo;

	@Autowired
	RequisitoPuestoRepository Requisito_Repo;

	@Test
	public void testReadOfertas(){
		List<OfertaLaboral> ofertasList = Oferta_Repo.findAll();
		assertTrue(ofertasList.size()>=1);
	}

	@Test
	public void testReadOfertaId(){
		OfertaLaboral oferta = Oferta_Repo.findById(1).get();
		assertEquals(5, oferta.getNumVacante());
	}

	@Test
	public void testUpdateoferta(){
		OfertaLaboral oferta = Oferta_Repo.findById(1).get();
		oferta.setExtensionContrato(3);
		Oferta_Repo.save(oferta);
		assertNotEquals(5,Oferta_Repo.findById(1).get().getExtensionContrato());
	}

	//*************************************************************************************************************
	//*************************************************************************************************************
	@Test
	public void testReadOrganizacion(){
		List<Organizacion> organizaciones = Organizacion_Repo.findAll();
		assertTrue(organizaciones.size()>=1);
	}

	@Test
	public void testReadOrganizacionId(){
		Organizacion organizacion = Organizacion_Repo.findById(1).get();
		assertEquals("99873773", organizacion.getTelefono());
	}

	@Test
	public void testUpdateOrganizacion(){
		Organizacion organizacion = Organizacion_Repo.findById(1).get();
		organizacion.setTelefono("88677484");
		Organizacion_Repo.save(organizacion);
		assertNotEquals("9988399",Organizacion_Repo.findById(1).get().getTelefono());
	}


	//*************************************************************************************************************
	//*************************************************************************************************************

	@Test
	public void testReadRequisito(){
		List<RequisitoPuesto> requisitoPuesto = Requisito_Repo.findAll();
		assertTrue(requisitoPuesto.size()>=1);
	}

	@Test
	public void testReadRequisitoId(){
		RequisitoPuesto requisitoPuesto = Requisito_Repo.findById(1).get();
		assertEquals("Ingles", requisitoPuesto.getDetalle());
	}

	@Test
	public void testUpdateRequisito(){
		RequisitoPuesto requisitoPuesto = Requisito_Repo.findById(1).get();
		requisitoPuesto.setDetalle("Frances");
		Requisito_Repo.save(requisitoPuesto);
		assertNotEquals("Ingles",Requisito_Repo.findById(1).get().getDetalle());
	}

}
