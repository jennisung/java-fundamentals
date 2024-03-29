/*
 * This Java source file was generated by the Gradle 'init' task.
 */

package basiclibrary;

import java.util.Random;
import java.util.HashSet;
import java.util.*;

public class Library {

    // Dice Rolling
    public int[] roll(int nums) {
        int[] rolls = new int[nums];
        Random random = new Random();

        for (int i = 0; i < nums; i++) {
            rolls[i] = random.nextInt(6) + 1;
        }

        return rolls;
    }

    // Contains Duplicates

    public boolean hasDuplicates(int[] arr) {
        HashSet<Integer> set = new HashSet<>();

        for (int numbers : arr) {
            if (!set.add(numbers)) {
                return true;
            }
        }
        return false;
    }



    // Calculating average
    public double calcAverage(int[] arr) {
        int sum = 0;

        for (int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        return (double) sum / arr.length;
    }


//    public int[] lowestAvg(int[][] arrays) {
//        int minIdx = 0;
//        double minAvg = calcAverage(arrays[0]);
//
//        for (int i = 1; i < arrays.length; i++) {
//            double currentAverage = calcAverage(arrays[i]);
//            if (currentAverage < minAvg) {
//                minIdx = i;
//                minAvg = currentAverage;
//            }
//        }
//
//        return arrays[minIdx];
//    }


    // Analyzing Weather Data
    public String analyzeWeather(int[][] weatherTemps) {
        int minTemp = Integer.MAX_VALUE;
        int maxTemp = Integer.MIN_VALUE;
        HashSet<Integer> uniqueTemperatures = new HashSet<>();

        for (int[] week : weatherTemps) {
            for (int temp : week) {
                minTemp = Math.min(minTemp, temp);
                maxTemp = Math.max(maxTemp, temp);
                uniqueTemperatures.add(temp);
            }
        }

        StringBuilder missingTemps = new StringBuilder();
        for (int temp = minTemp; temp <= maxTemp; temp++) {
            if (!uniqueTemperatures.contains(temp)) {
                missingTemps.append("No temperature seen during month: ").append(temp).append("\n");
            }
        }

        StringBuilder weatherData = new StringBuilder();
        weatherData.append("High: ").append(maxTemp).append("\n");
        weatherData.append("Low: ").append(minTemp).append("\n");
        weatherData.append(missingTemps.toString());

        return weatherData.toString();
    }

    //tally

    public String tally(List<String> votes) {

        Map<String, Integer> voteCountPerCandidate = new HashMap<>();

        for (String candidate : votes) {
            voteCountPerCandidate.put(candidate, voteCountPerCandidate.getOrDefault(candidate, 0) + 1);
        }

        String winningCandidate = "";
        int maxVotes = 0;
        for (Map.Entry<String, Integer> tally : voteCountPerCandidate.entrySet()) {
            String candidate = tally.getKey();
            int votesCount = tally.getValue();
            if (votesCount > maxVotes) {
                maxVotes = votesCount;
                winningCandidate = candidate;
            }
        }

        return winningCandidate;

    }

}


