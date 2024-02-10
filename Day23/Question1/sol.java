class Solution {
    public String pushDominoes(String dominoes) {
        char[] dos = dominoes.toCharArray();
        int left = 'L';
        int i = 0;
        while(i<dos.length){
            if(dos[i] == '.'){
                int j = i;
                while(j<dos.length && dos[j] == '.'){
                    j++;
                }
                int right = j>=dos.length? 'R': dos[j];
                if(right == left){
                    while(i < j){
                        dos[i++] = (char)right;
                    }
                }else if(right == 'R'){
                    i = j-1;
                }else{
                    j--;
                    while(i < j){
                        dos[i++] = (char)left;
                        dos[j--] = (char)right;
                    }
                }
                left = right;
            }else{
                left = dos[i];
            }
            i++;
        }
        return new String(dos);
    }
    public String pushDominoes1(String dominoes) {
        StringBuilder sb = new StringBuilder();
        char[] dos = dominoes.toCharArray();
        Stack<Character> stack = new Stack<>();
        int lastRight = -1;
        int lastLeft = -1;

        for(int i = 0; i<dos.length;){
            if(dos[i] == 'R'){
                while(i<dos.length && dos[i] != 'L'){
                    stack.push('R');
                    if(dos[i] == 'R'){
                        lastRight = i;
                    }
                    i++;
                }
            }else if(dos[i] == 'L'){
                int numOfPop = 0;
                if(lastLeft == -1 && lastRight == -1){
                    numOfPop = i;
                }else{
                    numOfPop = lastLeft > lastRight? (i- lastLeft):(i-lastRight)/2;
                }
                int count = numOfPop;
                while(count > 0){
                    stack.pop();
                    count--;
                }
                if(lastRight != -1 && lastRight > lastLeft && (i-lastRight)%2 == 0 && numOfPop >= 1) {
                    stack.push('.');
                    numOfPop--;
                }
                while(count < numOfPop){
                    stack.push('L');
                    count++;
                }
                stack.push('L');
                lastLeft = i;
                i++;
            }else{
                stack.push(dos[i]);
                i++;
            }
        }
        while(!stack.isEmpty()){
            sb.append(stack.pop());
        }
        return sb.reverse().toString();
    }
}
