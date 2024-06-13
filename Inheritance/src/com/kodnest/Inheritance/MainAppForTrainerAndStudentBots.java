package com.kodnest.Inheritance;

public class MainAppForTrainerAndStudentBots {
public static void main(String[] args) {
	TrainerBot tBot=new TrainerBot();
	tBot.read();
	tBot.write();
	tBot.teaching();
	StudentBot sBot=new StudentBot();
	sBot.applyingSkillset();
	sBot.read();
	sBot.write();
	
}
}
