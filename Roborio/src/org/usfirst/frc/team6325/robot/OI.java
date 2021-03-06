package org.usfirst.frc.team6325.robot;

import edu.wpi.first.wpilibj.Joystick;
import edu.wpi.first.wpilibj.buttons.Button;
import edu.wpi.first.wpilibj.buttons.JoystickButton;

import org.usfirst.frc.team6325.robot.commands.CloseGear;
import org.usfirst.frc.team6325.robot.commands.OpenGear;
import org.usfirst.frc.team6325.robot.commands.ResetDrivetrain;
import org.usfirst.frc.team6325.robot.commands.ToggleFieldOriented;

/**
 * This class is the glue that binds the controls on the physical operator
 * interface to the commands and command groups that allow control of the robot.
 */
public class OI {
	//// CREATING BUTTONS
	// One type of button is a joystick button which is any button on a
	//// joystick.
	// You create one by telling it which joystick it's on and which button
	// number it is.
	// Joystick stick = new Joystick(port);
	// Button button = new JoystickButton(stick, buttonNumber);

	// There are a few additional built in buttons you can use. Additionally,
	// by subclassing Button you can create custom triggers and bind those to
	// commands the same as any other Button.

	//// TRIGGERING COMMANDS WITH BUTTONS
	// Once you have a button, it's trivial to bind it to a button in one of
	// three ways:

	// Start the command when the button is pressed and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenPressed(new ExampleCommand());

	// Run the command while the button is being held down and interrupt it once
	// the button is released.
	// button.whileHeld(new ExampleCommand());

	// Start the command when the button is released and let it run the command
	// until it is finished as determined by it's isFinished method.
	// button.whenReleased(new ExampleCommand());
	
	public Joystick joyDriver = new Joystick(0);
	public Joystick joySecondary = new Joystick(1);
	
	public Button trigger = new JoystickButton(joyDriver, 1);
	public Button reset = new JoystickButton(joyDriver, 2);
	
	public Button fire = new JoystickButton(joySecondary, 2);
	public Button gearButton = new JoystickButton(joySecondary, 1);
	public Button autoGear = new JoystickButton(joySecondary, 3);
	public Button autoShooter = new JoystickButton(joySecondary, 4);
	public Button activateClimber = new JoystickButton(joySecondary, 5);
	
	public OI(){
		gearButton.whenPressed(new OpenGear());
		gearButton.whenReleased(new CloseGear());
		trigger.whenPressed(new ToggleFieldOriented());
		reset.whenPressed(new ResetDrivetrain());
	}
	
	
}
