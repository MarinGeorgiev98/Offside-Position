Offside Position
Problem
While you were watching a soccer match, you noticed that the commentator was talking about a player's offside position.

For simplicity, let's say that a player is in the offside position if there are fewer than 2 opponents that are closer to the opposing goal line (or equidistant to it). In other words, the player is offside if there are only 1 or 0 opponents ahead of them (or beside them).

We can represent the field on a Cartesian plane with one corner at (0, 0) and the opposite corner at (100, 64); however, since we're only concerned with the horizontal position of each player, we'll only be looking at the x values.

You are given an array teams, which contains two arrays of integers, representing the x positions of all the players of each team. The first team's net is at the left (x value of 0) and the second team's net is at the right (x value of 100).

You need to find out whether there are any players in an offside position on the field or not.

Example

For teams = [[5, 22, 30, 40, 30, 50, 30, 50, 50, 60, 50], [96, 20, 30, 25, 25, 40, 60, 70, 80, 70, 40]], the output should be offsidePosition(teams) = true.



A player from the blue team is in the offside position since there is only one player on the opposing team with an xvalue less than 20.

For teams = [[5, 22, 30, 40, 30, 50, 30, 50, 50, 60, 50], [96, 28, 30, 25, 25, 40, 60, 70, 80, 70, 40]], the output should be offsidePosition(teams) = false.



There are no players with fewer than 2 opponents closer to the opposing goal line, so no one is offside.

For teams = [[5, 20, 30, 40, 30, 50, 30, 50, 50, 60, 50], [96, 20, 30, 25, 25, 40, 60, 70, 80, 70, 40]], the output should be offsidePosition(teams) = false.



No player from the blue team has fewer than 2 opponents strictly closer to the opposing goal line. They are at the same distance as the second-closest opponent to the goal line, so they're not offside.

Input/Output

[input] array.array.integer teams

An array of the 2 teams players' x-coordinates.

Guaranteed constraints:
teams.length = 2,
teams[i].length = 11,
0 ≤ teams[i][j] ≤ 100.

[output] boolean

true if any player is in the offside position on the field and false otherwise.

Deliverables
a single .java file
the file must contain the following method signature, otherwise your submission is considered invalid

bool offsidePosition(int[][] teams) {

}

No user/console input is needed.
Global variables are forbidden.
