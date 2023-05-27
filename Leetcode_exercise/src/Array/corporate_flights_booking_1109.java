package Array;

public class corporate_flights_booking_1109 {
    public int[] corpFlightBookings(int[][] bookings, int n) {
        int[] oriArray = new int[n];
        int start_index = 0;
        int end_index = 0;
        int val = 0;
        int operateTimes = bookings.length;
        for (int i = 0; i < operateTimes; i++) {
            start_index = bookings[i][0] - 1;
            end_index = bookings[i][1] - 1;
            val = bookings[i][2];
            oriArray = diffarrayIncre(oriArray, start_index, end_index, val);
        }
        return covertArray(oriArray);
    }

    public int[] diffarrayIncre(int[] oriarray, int start, int end, int val) {
        oriarray[start] += val;
        if (end < oriarray.length - 1) {
            oriarray[end + 1] -= val;
        }
        return oriarray;
    }

    public int[] covertArray(int[] oriArray) {
        for (int i = 1; i < oriArray.length; i++) {
            oriArray[i] = oriArray[i - 1] + oriArray[i];
        }
        return oriArray;
    }

}

