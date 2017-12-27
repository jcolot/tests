
/**
 *
 * @author julien
 */
public class ReturnMoney {
        
        int[][] ascTable;

        public static void returnMoney(int N, int[] cent, int[] ascArr) {
                for (int k : cent) {
                        for (int i = 0; i <= N - k; i++) {
                                ascArr[i+k] += ascArr[i];
                        }
                }
        }

        public static void main(String[] args) {
                
                
                if (args.length < 2) {
                    System.out.println("Usage: java ReturnMoney N cent[0] cent[1] cent[2] ...");
                    System.exit(0);
                };
                
                int[] cent = new int[args.length-1];
                int N = Integer.parseInt(args[0]);
                
                for (int i = 1; i < args.length; i++) {
                        cent[i-1] = Integer.parseInt(args[i]);
                }
                
                int[] ascArr = new int[N+1];
                //Arrays.fill(ascArr, 0);
                ascArr[0] = 1;
                returnMoney(N, cent, ascArr);
                System.out.format("Number of ways of returning change is %d\n", ascArr[N]);
        }
}
