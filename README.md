```

        ||||||||||  |||||||||||   ||||||||||  |||||||||  |||||||||||  |||     ||  |||||||||  ||||||||||   ||  ||||||||||
        ||      ||  ||        ||      ||      ||         ||       ||  ||||    ||  ||         ||       ||      ||
        ||      ||  ||        ||      ||      ||         ||       ||  |||||   ||  ||         ||       ||      ||
        ||      ||  ||        ||      ||      ||         ||       ||  || ||   ||  ||         ||       ||      ||
        ||      ||  ||   |||||        ||      ||         ||       ||  ||  ||  ||  ||         ||   ||||        ||
        ||||||||||  ||||||            ||      |||||||||  ||       ||  ||  ||  ||  ||||||||   ||||||	          ||||||||||
        ||          ||||||            ||             ||  ||       ||  ||   || ||  ||         ||||||                   ||
        ||          ||  |||           ||             ||  ||       ||  ||   || ||  ||         ||  |||                  ||
        ||          ||    |||         ||             ||  ||       ||  ||    ||||  ||         ||   |||                 ||
        ||          ||      |||       ||             ||  ||       ||  ||    ||||  ||         ||     |||               ||
        ||          ||       |||  ||||||||||  |||||||||  |||||||||||  ||     |||  |||||||||  ||      |||      ||||||||||


        |||||||||   ||||||||||  ||         |||||||||||  |||          |||  |||          |||   |||||||||  
        ||      ||      ||      ||         ||           ||||        ||||  ||||        ||||  ||       ||      
        ||      ||      ||      ||         ||           ||||        ||||  ||||        ||||  ||       ||     
        ||      ||      ||      ||         ||           || ||      || ||  || ||      || ||  ||       ||     
        ||      ||      ||      ||         ||           ||  ||    ||  ||  ||  ||    ||  ||  ||       ||     
        ||      ||      ||      ||         ||||||||||   ||  ||    ||  ||  ||  ||    ||  ||   |||||||||		
        ||      ||      ||      ||         ||           ||   ||  ||   ||  ||   ||  ||   ||  ||       ||           
        ||      ||      ||      ||         ||           ||   ||  ||   ||  ||   ||  ||   ||  ||       ||         
        ||      ||      ||      ||         ||           ||    ||||    ||  ||    ||||    ||  ||       ||        
        ||      ||      ||      ||         ||           ||    ||||    ||  ||    ||||    ||  ||       ||       	
        |||||||||   ||||||||||  |||||||||  |||||||||||  ||     ||     ||  ||     ||     ||  ||       ||      
```

# Git / GitHub / Open Source Development Workshop


Welcome to the Prisoner's Dilemma README. This page will tell you everything you need to know about the basics of **git**, **github**, and collaborating on **open-source** projects. 

Within this repository (PrisonersDilemmaCSWorkshop), you will find this README along with various other files. These files are for the tournament you will be participating in: Prisoner's Dilemma.

Now, before we get started, let's talk a little bit about what a README file is for. In short, the first thing you want to do whenever looking at a new repository for the first time is to look at the README. (i.e. exactly what you are doing right now!) Common items in a README include instructions on how to get involved in the project, how to get the source code onto your local environment (computer), or what the repository/code base does. This particular README will include info on all three in addition to more general information about Git, GitHub, open source development, and further resources to get you going.

(Note, if you are completely new to Git and GitHub you might want to begin first with a different, slightly more basic GitHub repository/tutorial on my page: AnIntroToGitAndGitHub)

So let's dive right in.

### Before you begin - Create an account

i) If you already have a GitHub account and git installed, great! (Go ahead and skip to Step One) If not, follow along below.  

ii) In the upper right of this page you should see a login button. Select that.  

iii) Select 'Create a new account' on this next page..  

iv)  

v) Now open up your terminal. We are going to install git if you do not already have it. (On a mac you can check what version of git you have installed by running **git --version**)

vi) You are going to run two commands to get git. The first is installing some software called [Homebrew](https://brew.sh/). Homebrew's awesome, you'll use it for installing lots of cool stuff in the future. The second command uses Homebrew to install git.

```
$ /usr/bin/ruby -e "$(curl -fsSL https://raw.githubusercontent.com/Homebrew/install/master/install)"
$ brew install git
```

After this is done, run:
```
$ git --version
```
To make sure git installed.

vii) Configure your username and email by typing
```$ git config --global user.name "Tiago Ford"
$ git config --global user.email "tford@email.com"
```

### Step One - Get the source code onto your computer

i) Fork this repository. Do this by clicking the Fork button in the upper right of this page. What this does is copy the current version of this repository onto your own GitHub page!
1. You will then see a pop up that asks...
...
2. Now navigate to your profile page and you should see this forked repository sitting there.

ii) At this stage, all of the code it still in the cloud, but we want to get a copy down onto your personal computer. We will do this by **cloning** your forked version locally.

iii) open the code Eclipse or another IDE/editor of your choice
1. At the top of Eclipse select File -> Import -> General -> Existing Projects into Workspace
2. Now navigate to where you cloned the repository locally. (i.e. select the folder presumably with the name: PrisonersDilemmaCSWorkshop).
3. Click enter and now you should have the project listed in your Package Explorer sidebar.

Congratulations for making it this far! You have completed the hardest part. Often times with open source projects, getting the code locally without any bugs in the appropriate software is half the battle.

### Step Two - What this code does

i) Now that you have the code locally, let's learn a little bit about what it does. The purpose is to simulate a Prisoner's Dilemma tournament. If you do not know anything about Prisoner's Dilemma [click here](https://en.wikipedia.org/wiki/Prisoner%27s_dilemma). 

The object of the code is to write you own strategy for the game, and then to run it against other strategies to try and come out on top.

The rules are pretty simple. You are given a history of all rounds played between you and another player. And then you are to make a decision whether to cooperate or not. If both players cooperate you get 3 points; if you cooperate and your opponent does not you get 0 points; if neither player cooperates you get 1 points; and finally if you defect and your opponent cooperates you get 5 points.

ii) So, what code should you change?

Well, there's sort of two answers here. The first is that you could change anything you want! You could turn this code into a website, change the tournament rules, make/delete players, really anything! That's the exciting part about open source code typically.

But for contributing to this specific repository you have to follow a set of guidelines. You can find those in the next section.


### Step Three - How to contribute

This might be the most important section of major GitHub repositories. This is because you can make all sorts of changes and improvements to someone else's code, but if you don't follow the posted guidelines, when you 'submit' your changes, they might get rejected. Often times authors will specify things like spaces v. tabs, what parts of the code they want you to touch, what other developers can you reach out to, etc...

i) Editing the code
1. Create a new class within the package src/tournament and call it whatever you want
2. Implement the interface Strategy at the top of your class
3. Fill in the method takeOneTurn(history) making sure that you return a "c" or a "d" every time.
4. Open the PrisonerDilemmaTechniques class and follow the pattern already there for adding your strategy to the game.
5. Finally you can go to the Tournament class and run that code to see how your strategy did! Best of Luck!

ii) **add**, **commit**, **push** 
1. So you've made your changes, and now you're ready for the whole world to see it.
2. After you have tested your code to make sure there are no bugs, save it all and open up the terminal.
3. Use the command cd to navigate to the directory you are working in. (i.e. it might look something like cd Documents/ComputerScience/CS52/workspace/PrisonersDilemmaCSWorkshop)


iii) Make a **pull request** to this repository

Congratulations! Your first open source development contribution!



### Resources

i) Check out this[link to another simpler tutorial](githublink) if you'd like more practice with the fundamentals.

ii) Git resources:  
Git tutorial: https://try.github.io/levels/1/challenges/1  
Git cheat sheet: https://www.git-tower.com/blog/git-cheat-sheet  

iii) GitHub resources:  
Popular projects on GitHub: https://github.com/explore  
GitHub's help page: https://help.github.com/articles/git-and-github-learning-resources/  

iv) Open source resources:  
Good resource for first-timers: http://www.firsttimersonly.com/  
Udacity tutorial: https://www.udacity.com/course/how-to-use-git-and-github--ud775  

But seriously, open source development is a steep learning curve. It may be tough at first, but jumping head first into a project will get you to where you want to be faster than any series of tutorials will.  

v) Other neat projects/sites:  
You get a ton of cool, free stuff as a student on GitHub. Check it all out here: https://education.github.com/pack  

