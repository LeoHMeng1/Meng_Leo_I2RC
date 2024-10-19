package frc.robot.commands;

import edu.wpi.first.math.controller.PIDController;
import edu.wpi.first.wpilibj2.command.Command;
import frc.robot.subsystems.Drivetrain;


public class PIDTurnCCW extends Command{
    private double setPointAngle;
    private Drivetrain dt;
    private PIDController pid = new PIDController(0.7/90, 0, 0);
    public PIDTurnCCW(Drivetrain dt, double setPointAngle){
        this.dt = dt;
        this.setPointAngle = setPointAngle;
        addRequirements(dt);
        pid.setTolerance(3);
    }
    @Override
    public void initialize(){
        dt.reset();
        dt.tankDrive(0, 0);
    }

    @Override
    public void execute(){
        double output = pid.calculate(dt.getAngle(), setPointAngle);
            dt.tankDrive(output, -output);
    }
    @Override
    public void end(boolean interrupted){
        dt.tankDrive(0,0);
    }
    @Override
    public boolean isFinished(){
        return pid.atSetpoint();
    }
}
