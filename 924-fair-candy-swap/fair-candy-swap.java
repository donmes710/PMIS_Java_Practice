
class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int aliceSum = 0;
        int bobSum = 0;

        for (int candy : aliceSizes) {
            aliceSum += candy;
        }

        for (int candy : bobSizes) {
            bobSum += candy;
        }

        int diff = (aliceSum - bobSum) / 2;

        for (int alice : aliceSizes) {
            for (int bob : bobSizes) {
                if (alice - bob == diff) {
                    return new int[]{alice, bob};
                }
            }
        }

        return new int[]{};
    }
}
