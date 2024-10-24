# Preseason Digital Notebook Example
Name: **Leo Meng**

Section: **I2RC**

Week: **7**


## Code
The main topic this week was: **Sequential Command Group**

Commands: **PID Controller and Encoder Drive**

Subsystems: **Drivetrain**

### How does the code work?
We tested out our PID code to ensure that our robots were able to turn smoothly (my robot turned 81 degrees for a right angle turn). Afterwards, we created a new sequential command group branch and merged in our previous weeks' work into here so that we can run everything together instead of just driving or just turning. The robot container now contains most the pid and encoder drive objects. Moreover, instead of just returning encorder drive or just returning pid, it now returns SequentialCommandGroup, allowing for multiple actions to be done at the same time.z


### Important notes for future reference

N/A