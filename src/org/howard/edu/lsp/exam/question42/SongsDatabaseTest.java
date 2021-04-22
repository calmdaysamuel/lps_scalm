package org.howard.edu.lsp.exam.question42;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.HashSet;
public class SongsDatabaseTest {

	SongsDatabase db = new SongsDatabase();
	

	@BeforeEach
	void init() {
		db = new SongsDatabase();
	}
	
	@Test
	@DisplayName("Test for adding songs")
	public void testAddSong() {
		db.addSong("rock", "Song-A");
		assertEquals(db.getSongs("rock"), new HashSet<String>(Arrays.asList("Song-A")));
		
		db.addSong("pop", "Song-B");
		assertEquals(db.getSongs("pop"), new HashSet<String>(Arrays.asList("Song-B")));
		
		db.addSong("country", "Song-C");
		assertEquals(db.getSongs("country"), new HashSet<String>(Arrays.asList("Song-C")));
		
		db.addSong("rock", "Song-D");
		assertEquals(db.getSongs("rock"), new HashSet<String>(Arrays.asList("Song-A", "Song-D")));
		
		db.addSong("pop", "Song-E");
		assertEquals(db.getSongs("pop"), new HashSet<String>(Arrays.asList("Song-B", "Song-E")));
		
		db.addSong("lo-fi", "Song-F");
		assertEquals(db.getSongs("lo-fi"), new HashSet<String>(Arrays.asList("Song-F")));
		
		db.addSong("lo-fi", "Song-G");
		assertEquals(db.getSongs("lo-fi"), new HashSet<String>(Arrays.asList("Song-F", "Song-G")));
		
	}

	@Test
	@DisplayName("Test for getting songs")
	public void testGetSongs() {
		db.addSong("rock", "Song-A");
		db.addSong("pop", "Song-B");
		db.addSong("country", "Song-C");
		db.addSong("rock", "Song-D");
		db.addSong("pop", "Song-E");
		db.addSong("lo-fi", "Song-F");
		db.addSong("lo-fi", "Song-G");
		
		assertEquals(db.getSongs("rock"), new HashSet<String>(Arrays.asList("Song-A", "Song-D")));
		assertEquals(db.getSongs("pop"), new HashSet<String>(Arrays.asList("Song-B", "Song-E")));
		assertEquals(db.getSongs("country"), new HashSet<String>(Arrays.asList("Song-C")));
		assertEquals(db.getSongs("lo-fi"), new HashSet<String>(Arrays.asList("Song-F", "Song-G")));
	}

	
	@Test
	@DisplayName("Test for getting song genres")
	public void testGetGenreOfSong() {
		
		db.addSong("rock", "Song-A");
		db.addSong("pop", "Song-B");
		db.addSong("country", "Song-C");
		db.addSong("rock", "Song-D");
		db.addSong("pop", "Song-E");
		db.addSong("lo-fi", "Song-F");
		db.addSong("lo-fi", "Song-G");
		
		assertEquals(db.getGenreOfSong("Song-A"), "rock");
		assertEquals(db.getGenreOfSong("Song-B"), "pop");
		assertEquals(db.getGenreOfSong("Song-C"), "country");
		assertEquals(db.getGenreOfSong("Song-D"), "rock");
		assertEquals(db.getGenreOfSong("Song-E"), "pop");
		assertEquals(db.getGenreOfSong("Song-F"), "lo-fi");
		assertEquals(db.getGenreOfSong("Song-G"), "lo-fi");
	}

	
	
	
}