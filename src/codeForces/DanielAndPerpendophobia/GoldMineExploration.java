package codeForces.DanielAndPerpendophobia;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class GoldMineExploration {

    private static final int ORIGIN_X = 0;
    private static final int ORIGIN_Y = 0;

    public static void main(String[] args) throws IOException {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int N = Integer.parseInt(reader.readLine().trim());
        ArrayList<GoldMine> mines = new ArrayList<>();
        for (int i = 0; i < N; i++) {
            int[] inputs = Arrays.stream(reader.readLine().trim().split("\\s")).mapToInt(Integer::parseInt).toArray();
            mines.add(new GoldMine(inputs[0], inputs[1]));
        }

        int currentX = ORIGIN_X;
        int currentY = ORIGIN_Y;

        ArrayList<GoldMine> exploredMines = new ArrayList<>();

        while (true) {
            GoldMine currentMine = findMine(mines, currentX, currentY);
            if (currentMine != null) {
                currentMine.visited = true;
                exploredMines.add(currentMine);
                continue;
            }

            GoldMine nextMine = null;
            for (GoldMine mine : mines) {
                if (!mine.visited && !isPerpendicular(currentX, currentY, mine.x, mine.y)) {
                    nextMine = mine;
                    break;
                }
            }

            if (nextMine == null) {
                break;
            }

            currentX = nextMine.x;
            currentY = nextMine.y;

            nextMine.visited = true;
            exploredMines.add(nextMine);
        }

        System.out.println(exploredMines.size());
    }

    private static boolean isPerpendicular(int currentX, int currentY, int mineX, int mineY) {
        return (currentX == mineX && currentY != mineY) || (currentY == mineY && currentX != mineX);
    }

    private static GoldMine findMine(ArrayList<GoldMine> mines, int x, int y) {
        for (GoldMine mine : mines) {
            if (mine.x == x && mine.y == y) {
                return mine;
            }
        }
        return null;
    }

    static class GoldMine {
        public int x;
        public int y;
        public boolean visited;

        public GoldMine(int x, int y) {
            this.x = x;
            this.y = y;
            this.visited = false;
        }

        @Override
        public String toString() {
            return "(" + x + ", " + y + ")";
        }
    }
}