import java.util.Scanner;

public class OffsidePosition {
    boolean offsidePosition(int[][] teams) {
        int[] firstTeam = new int[teams[0].length];

        for (int i = 0; i < teams[0].length; i++) {
            firstTeam[i] = teams[0][i];
        }

        int[] secondTeam = new int[teams[1].length];

        for (int i = 0; i < teams[1].length; i++) {
            secondTeam[i] = teams[1][i];
        }

        int smallestPlayerInSecondTeam = Integer.MAX_VALUE;
        int biggestPlayerInFirstTeam = Integer.MIN_VALUE;


        for (int player : firstTeam) {
            if (player > biggestPlayerInFirstTeam) {
                biggestPlayerInFirstTeam = player;
            }
        }

        for (int player : secondTeam) {
            if (player < smallestPlayerInSecondTeam) {
                smallestPlayerInSecondTeam = player;
            }
        }

        int firstTeamOffsideCounter = 0;
        int secondTeamOffsideCounter = 0;


        for (int player : firstTeam) {
            if (player < smallestPlayerInSecondTeam
            || player == smallestPlayerInSecondTeam) {
                firstTeamOffsideCounter++;
            }
        }

        for (int player : secondTeam) {
            if (player == biggestPlayerInFirstTeam
                    || player > biggestPlayerInFirstTeam) {
                secondTeamOffsideCounter++;
            }
        }

        return firstTeamOffsideCounter == 0 || firstTeamOffsideCounter == 1
                || secondTeamOffsideCounter == 0 || secondTeamOffsideCounter == 1;
    }
}