//package team1.project.models;
//
//import org.junit.jupiter.api.Assertions;
//import org.junit.jupiter.api.BeforeEach;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.api.extension.ExtendWith;
//import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.test.context.ContextConfiguration;
//import org.springframework.test.context.junit.jupiter.SpringExtension;
//import org.springframework.test.context.junit4.SpringRunner;
//
//import static org.junit.jupiter.api.Assertions.*;
//import static team1.project.models.CardType.*;
//
//@ExtendWith(SpringExtension.class)
//@SpringBootTest
//class GameTest {
//
////    @Test
////    void hello(){
////        Game game = new Game();
////        String response = Game.hello("World");
////        assertEquals("Hello, World", response);
////    }
//
//    AdventureCard build;
//
//    Game game;
//
//
//   /* @BeforeEach
//    public void setup(){
//        game = new Game(new Player());
//        build = new AdventureCard();
//    }*/
//
//
////    @Test
////    public void CheckPlayerNumber(){
////        game.createPlayers();
////    }
//
//
////    @Test
////    public void ShouldCreateAdventureDeck(){
////        Game game = new Game();
////        game.createAdventureDeck();
////        assertEquals(114, game.collectAdventureCard().size());
////    }
//
//    @Test
//    public void ShouldBuildAdventureCard() {
//        build = game.buildAdventureCard(ADVENTURE_FOE,"Dragon",70,50);
//        assertTrue(build.getCardType().equals(ADVENTURE_FOE) &&
//                build.getName().equals("Dragon"));
//    }
//
////    @Test
////    public void handRankCard(){
////
////    }
//
//}