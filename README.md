

**I am still working on my game and I will e-mail you when done!**


# README #

**Name:**	Anika Tiku

**Period:**	5th Period

**Game Title:** DecaJump Style 2 (can always change it later)

## Game Proposal ##

The game is played by having acid at the bottom of the screen, and a character that comes out of a door,
after coming out of the door, the character immediately falls towards the acid, and the only way to stop
that is to place a balloon or another object (which moves with your mouse) underneath the character. If 
the balloon reaches the character before the character hits the acid, it survives, otherwise it dies. The goal
of the game is to not hit the acid. The things I want to implement is the acid, some level ups that make u move
faster, as well as different characters. I also want to add different levels, that have more obstacles, 
and when you hit an obstacle you fall back, and u have to place the balloon again.


## Game Controls: ##

-mouse movement controls balloon movement
-mouse clicking controls gaining different boosts

## Game Elements: ##

-normal gravity will be applied on the character
-if you hit an object floating, you get pushed back down instead of continuing the jump
-everytime you hit the balloon you bounce a certain height up
	-different level ups are included
		-balloon gets power ups based on wats in its way
		-balloon can push or allow character to jump higher 
-objects will be floating in the way of the character jumping
-acid is at the bottom of the screen
	-the second the character hits the acid, the character dies
-2 levels to win
-coins are also scattered
	-your balloon has to get the coins, and a score will show how many coins
	-your balloon requires a certain amount of coins, stated at the beginning of the level


## How to Win: ##

The method to win seems simple enough, as all you have to accomplish is getting past a specifc
length or reaching a specific height, with a specific amount of coins. Both coins and the length
restrictions have to be met to successfully pass each level, and once the second level is passed,
the game will be successful.

## Link Examples ##
Provide links to examples of your game idea.  This can be a playable online game, screenshots, YouTube videos of gameplay, etc.

https://www.miniclip.com/games/decajump/en/

## Teacher Response ##

**Approved**

Good game idea and style that's appropriate for this project.  It will come to how good a job you do of the game and what features
you have that add to the gameplay experience.  Having smooth gameplay with animations would definitely increase the gameplay experience.
as well as a powerup or two. In any case, if you make a simplistic version then not so great.  Make a full featured version and it's excellent.

FYI, gravity isn't too hard to implement.  You store dx and dy attributes that keep track of your player's change in position each animation frame and for gravity you just add a constant amount to dy every frame so that dy gets bigger and the player falls faster.  When a bumper balloon is touched, you "shoot" the player upward by changing the dy to something negative and big-ish like -10.  That will mean that the player now moves UP by 10 pixels each frame and then gravity might be something like 1.2 which would keep getting added to dy each frame and eventually pull the player back downward.  Finally, to make the background "scroll" you have many options.  Possibly the simplest is to have two tall images that are some kind of repeating background scene.  Place them adjacent and move their dy according to how fast you want to scroll.  When either of those image's y-position goes past the bottom edge of the screen, move the whole thing back up so that it sits exactly on top of the other image.  It's basically two images leapfrogging each other.

## Class Design and Brainstorm ##

-make sure to implement power-ups
   -include:
        -blue balloon = subtraction to score
        -yellow balloon = addition to score
	-brick = a block/stops the character
-add a score object
-create a fun game over screen
-add acid at the bottom to make sure there is something that will kill the character if it falls
-mess around with the sizes to get a size that fits the best with your world
-make sure to have several of each of the power-ups
     -make sure to increase the intensity or how hard the level is from one to two

## Development Journal ##

Every day you work, keep track of it here.

**5/26/20 (1 hour)**

Goal:  I want to just add the basic code, including the World class, and Actor class, as well as create my characters, including the basic outline of the parts.

Work accomplished:  I ended up creating my project and adding the World and Actor class from my group project. I also created all of the creatures and the objects that i was planning on using for the game, including an image for each of the characters.

**5/28/20 (2 hours)**

Goal:  My goal is to work on the level class today and be able to have the general idea of a level and what should be included in each part of the game. I hope to also add another power-up, or object so that my game becomes more advanced.

Work accomplished:  I was able to create and perfect my level class, with some guidance of my group project, I was able to create a level that held the acid as well as created a ballon and deca jump character (monkey) actor. This is generic and will be used for each level so I decided to create it in the generic level, and then extend the rest of the levels. Although I coded most of the level class, I also created the extended versions of Level 1 and Level 2.

**5/30/20 (4 hours) **

Goal: My goal is to run the code and to fix any errors, and to make sure my characters are appearing correctly and create the levels, and add the seperate power-ups and my characters to move correctly.

Work accomplished: Immediately when I ran the code, I found an error where I was attaching my images. In the past I found the error before when trying to create the images, and I had to work through the error. I realized that I wasn't correctly adding the image to my src folder, which meant that when I called it, I wasn't getting anything, leaving a Null-Pointer error. This error took a lot of effort and time to fix because my debugger wasn't working in the beginning, and required me to fix that before I could work on the actual error. This took a lot of time, and I ended not being able to work on any other part.

**5/31/20 (4 hours)**

Goal: My goal is once again to make sure there are no problems or errors when I run my code, and I hope to try and get my characters to move correctly.

Work accomplished: I was able to make the deca jump character move straight up, but I wasn't able to make the character move sideways, and I wasn't able to complete the power-ups, but I got the brick to prevent movement for the character, as well as being able to make the character move in a "jumping" motion. I had to try a lot of things to get the gravity to appear to work, and although it isn't smooth, it did end up working and I was able to create an almost gravity effect.

**6/1/20 (2 hours) **

Goal: My goal is to make my sideways gravity effect work on the deca jump character.

Work accomplished: I was able to make the sideways effect, although it isn't smooth, I realized that I could use a similar technique as we used in the group project, and I could be able to simply set the first and third part of the balloon to doing a certain action in contrast to the normal up and down jump that would come from connecting with the center part of the balloon. After getting this technique I worked on getting multiple of the power-ups to appear.

**6/4/20 (2 hours) **

Goal: My goal for today is to completely finish the project, and touch-ups and make all the objects appear correctly, and make the second level function correctly.

Work accomplished: Unfortunately I wasn't able to finish the project as it took me some time to work getting the objects to appear correctly, and in the right order, as well as getting the levels to move correctly, and to show a game over scene. It ended up being a simple task but I needed to change my condition statements several times, to make sure that I was taking into account ever chance of dying.

**6/7/20 (3 hours)**

Goal: My goal is to finish the game and all the finishing touches and adding a score object.

Work accomplished: I was able to finish the game, make a non hard coded object lengths, and I made a score object in my world, once again using a similar concept as I used in the group project. Overall the game was a success, and I was able to make all the pieces the correct size, and the game include fun effects including a reflection on the game over screen, just to play around a little.

***
***
