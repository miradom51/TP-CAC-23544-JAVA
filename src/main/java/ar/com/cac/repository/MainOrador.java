package ar.com.cac.repository;

import java.time.LocalDate;
import java.util.List;

import ar.com.cac.entity.Orador;

public class MainOrador {

	 public static void main(String[] args) {
		
		 //Interface i = new ClaseQueImplementa();
		 IOradorRepository repository = new MySqlOradorRepository();
		 
		 //repository.save(new Orador("juan", "perez", "jua@mail.com", "php", LocalDate.now()));
		 
		 //elimino a juan!!!
		 Orador carlos =repository.getById(3L);
		 
		 carlos.setApellido("perez");
		 carlos.setNombre("martin");
		 carlos.setTema("c#");
		 
		 repository.update(carlos);
		 
		 System.out.println(repository.findAll());
		 
	}
}
