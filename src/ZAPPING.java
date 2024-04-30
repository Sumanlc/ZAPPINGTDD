public class ZAPPING {
    public static int optimalChannelChange(int currentChannel, int targetChannel) {
        if (currentChannel == targetChannel) {
            return 0;
        }

        int totalChannels = 99;
        int midPoint = totalChannels / 2;

        int distance = Math.abs(currentChannel - targetChannel);
        distance = Math.min(distance, totalChannels - distance);

        if (distance <= midPoint) {
            return distance;
        } else {
            int toMidpoint = Math.abs(currentChannel - midPoint);
            int remainingDistance = Math.abs(targetChannel - midPoint);
            return toMidpoint + remainingDistance;
        }
    }

}
