package com.cloudcomputing.gamelist.app.controller;


import java.util.List;
import com.cloudcomputing.gamelist.app.entity.GameEntity;
import com.cloudcomputing.gamelist.app.entity.ReportingEntity;
import com.cloudcomputing.gamelist.app.exception.ResourceNotFoundException;
import com.cloudcomputing.gamelist.app.repository.GameRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;




@RestController
@RequestMapping("/Vapor/Game")
public class GameController {

	@Autowired
	private GameRepository gameRepository;

	ReportingEntity report = new ReportingEntity();

	int r = 0;




	@GetMapping("/ListOfGamesByName/{gameName}")
	public ResponseEntity<List<GameEntity>> getGameByName(@PathVariable String gameName)
			throws ResourceNotFoundException {
		List<GameEntity> game = gameRepository.findByName(gameName);
				//.orElseThrow(() -> new ResourceNotFoundException("Employee not found for this id :: " + gameName));
		return ResponseEntity.ok().body(game);
	}


	@PostMapping("/InsertGame")
	public GameEntity createEmployee(@RequestBody GameEntity game) {

		gameRepository.save(game);

		return game;
	}

	@DeleteMapping("/{id}")
	public void deleteGame(@PathVariable String id){
		gameRepository.deleteById(id);

	}

	// not working yet
/*	@PutMapping("/UpdateGame/{id}/{newGameName}")
	public ResponseEntity<GameEntity> update_game_By_name(@PathVariable String id) throws ResourceNotFoundException {
		GameEntity game = gameRepository.findById(id)
				.orElseThrow(() -> new ResourceNotFoundException("Employee not found for this id :: " + id));
		//game.setName(newGameName);
		game.setName(game.getName());
		GameEntity updatedGame = gameRepository.save(game);


		return ResponseEntity.ok().body(updatedGame);
	} */

	@GetMapping("/Platform/{gameName}")
	public ResponseEntity<List<GameEntity>> getGameByPlatform(@PathVariable String gameName)
			throws ResourceNotFoundException {
		List<GameEntity> game = gameRepository.findByPlatform(gameName);
		//.orElseThrow(() -> new ResourceNotFoundException("Employee not found for this id :: " + gameName));

		r = report.getPlatformReport() + 1;
		report.setPlatformReport(r);

		return ResponseEntity.ok().body(game);
	}


}
