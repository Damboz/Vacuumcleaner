
# Vacuum Cleaner AI Agent (Java)
# Project Description
This project implements a simple Vacuum Cleaner AI Agent in Java and it uses task b (Medium) to simulate the actions of a robot.
The program simulates a basic intelligent agent operating in a two-room environment (Room A and Room B).

# The agent:
•	Randomly starts in Room A or Room B
•	Detects whether the current room is Dirty or Clean
•	Cleans the room if it is dirty
•	Moves to the other room if it is clean
•	Continues until both rooms are clean
This is a classic example of a Simple Reflex Agent in Artificial Intelligence.

# AI Concept Demonstrated
This program demonstrates:
•	 Agent-Environment Interaction
•	 Perception → Action cycle
•	 Simple Reflex Agent behavior
•	✔Performance measurement
The agent follows this rule:
IF current room is DIRTY → SUCK
ELSE → MOVE to the other room

# Environment Setup
The environment consists of:
•	Room A (Randomly Clean or Dirty)
•	Room B (Randomly Clean or Dirty)
•	Agent starting location (Randomly A or B)

# Example initial state:
Room A : Dirty
Room B : Clean
Agent starts in Room A

# How the Agent Works
1.	The environment is generated randomly.
2.	The agent senses the current room.
3.	If dirty → cleans it.
4.	If clean → moves to the other room.
5.	Repeats until both rooms are clean.
6.	Displays performance summary.

# Performance Tracking
The program tracks:
•	Total cleans → Number of cleaning actions
•	Total moves → Number of movement actions
•	Total actions → Total steps performed

# Example output:
[ Performance Summary ]
  Total cleans  : 2
  Total moves   : 1
  Total actions : 3
