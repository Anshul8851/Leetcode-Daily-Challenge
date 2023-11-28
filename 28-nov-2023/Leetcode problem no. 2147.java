class Solution {
    public int numberOfWays(String corridor) {
        int n = corridor.length();
        ArrayList<Integer> seats = new ArrayList<>();
        for(int i = 0;i<n;i++){
            if(corridor.charAt(i) == 'S'){
                seats.add(i);
            }
        }
        if(seats.size() == 0 || seats.size()%2 != 0) return 0;
            int prev = seats.get(1);
            long ans = 1;
            for(int i = 2;i<seats.size();i=i+2){
                ans = (ans*(seats.get(i)-prev))%1000000007;
                prev = seats.get(i+1);
            }
            return (int)ans;
    }
}
