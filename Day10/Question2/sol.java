class Solution {
    public List<Integer> partitionLabels(String s) {
        List<Integer> list = new ArrayList<>();
        int count = 0;
        int[] pos = new int[26];

        char[] arr = s.toCharArray();

        int index = 0;
        int[] firstPos = new int[26];
        Arrays.fill(firstPos, -1);
        int[] chars = new int[26];
        int j = 0;

        for(char c : arr){
            int i = c - 'a';
            if(firstPos[i] == -1){
                firstPos[i] = index;
                chars[j++] = i;
            }
            pos[i] = index;
            index++;
        }
        int limit = 0;
        int last = -1;
        j = 1;
        while(j < 26){
            limit = pos[arr[limit] - 'a'];
            while(j < 26 && firstPos[chars[j]] <= limit ){
                limit = Math.max(limit, pos[chars[j]]);
                j++;
            }
            list.add(limit - last);
            last = limit;
            limit++;
        }
        return list;
    }
}
