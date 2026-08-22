class Solution {
    public int carFleet(int target, int[] position, int[] speed) {
        int n = position.length;
        if(n <= 1) return n;
        
        int[][] cars = new int[n][2];

        for(int i = 0; i < n; i++){
            cars[i][0] = position[i];
            cars[i][1] = speed[i];
        }

        Arrays.sort(cars, (a, b) -> Integer.compare(a[0], b[0]));

        Stack<Double> stack = new Stack<>();
        for(int i = n - 1; i >= 0; i--){
            int p = cars[i][0];
            int s = cars[i][1];

            stack.push((double) (target - p) / s);

            if(stack.size() >= 2){
                double currentCarTime = stack.peek(); 
                double fleetAheadTime = stack.get(stack.size() - 2);

                if(currentCarTime <= fleetAheadTime){
                    stack.pop();
                }
            }
        }
        return stack.size();
    }
}
