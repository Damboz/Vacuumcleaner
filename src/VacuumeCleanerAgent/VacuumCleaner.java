package VacuumeCleanerAgent;

import java.util.Random;
/*
we are simulating actions of a robot  using b  which is medium

(Medium) The agent initial state and random input
 of an environment given to the agent at the beginning of the task
 */


class VacuumAgent {

    // These represent the two possible room states
    static final String DIRTY = "Dirty";
    static final String CLEAN  = "Clean";

    // The two rooms in our environment
    static String roomA;
    static String roomB;

    // Where the agent currently is
    static String agentLocation;

    // Keep track of what the agent does
    static int totalMoves   = 0;
    static int totalCleans  = 0;
    static int actionCount  = 0;

    public static void main(String[] args) {

        // ----- Set up the environment randomly -----
        // The agent does NOT choose this -- it's the environment
        Random rand = new Random();

        roomA = rand.nextBoolean() ? DIRTY : CLEAN;
        roomB = rand.nextBoolean() ? DIRTY : CLEAN;

        // Agent also starts in a random room
        agentLocation = rand.nextBoolean() ? "A" : "B";

        System.out.println("===========================================");
        System.out.println("       VACUUM CLEANER AI AGENT");
        System.out.println("===========================================");
        System.out.println();

        // Show the environment -- in a real agent this would be hidden
        // but we print it so we can verify the agent is behaving correctly
        System.out.println("[ Environment Setup (randomly generated) ]");
        System.out.println("  Room A : " + roomA);
        System.out.println("  Room B : " + roomB);
        System.out.println("  Agent starts in Room " + agentLocation);
        System.out.println();
        System.out.println("-------------------------------------------");
        System.out.println("  Agent Actions:");
        System.out.println("-------------------------------------------");

        // ----- Agent loop -----
        // The agent keeps acting until both rooms are clean
        while (roomA.equals(DIRTY) || roomB.equals(DIRTY)) {
            perceiveAndAct();
        }

        // ----- Done -----
        System.out.println();
        System.out.println("-------------------------------------------");
        System.out.println("  All rooms are clean. Agent shutting down.");
        System.out.println("-------------------------------------------");
        System.out.println();
        System.out.println("[ Final Environment State ]");
        System.out.println("  Room A : " + roomA);
        System.out.println("  Room B : " + roomB);
        System.out.println();
        System.out.println("[ Performance Summary ]");
        System.out.println("  Total cleans  : " + totalCleans);
        System.out.println("  Total moves   : " + totalMoves);
        System.out.println("  Total actions : " + actionCount);
        System.out.println("===========================================");
    }


    static void perceiveAndAct() {

        // Step 1: Sense current room
        String currentState = agentLocation.equals("A") ? roomA : roomB;

        System.out.print("  Agent in Room " + agentLocation
                + " | Senses: " + currentState + " | Action: ");

        if (currentState.equals(DIRTY)) {
            // Action: clean this room
            System.out.println("SUCK");
            if (agentLocation.equals("A")) {
                roomA = CLEAN;
            } else {
                roomB = CLEAN;
            }
            totalCleans++;

        } else {
            // Room is already clean, so move to the other room
            String destination = agentLocation.equals("A") ? "B" : "A";
            System.out.println("MOVE to Room " + destination);
            agentLocation = destination;
            totalMoves++;
        }

        actionCount++;
    }
}