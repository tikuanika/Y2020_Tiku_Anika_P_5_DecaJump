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

Put all your brainstorm ideas, strategy approaches, and class outlines here

## Development Journal ##

Every day you work, keep track of it here.

**Date (time spent)**

Goal:  What are you trying to accomplish today?

Work accomplished:  Describe what you did today and how it went.

**Date (time spent)**

Goal:  What are you trying to accomplish today?

Work accomplished:  Describe what you did today and how it went.

***
***
