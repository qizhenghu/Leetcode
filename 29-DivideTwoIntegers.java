public int divide(int dividend, int divisor) {
      boolean isNegative = false;
      if((dividend < 0 && divisor >0) || (dividend > 0 && divisor <0)){
        isNegative = true;       
      }
      if(divisor == 0) return Integer.MAX_VALUE;
      if(dividend == 0) return 0;
        
      long dividendl = Math.abs((long)dividend);
      long divisorl = Math.abs((long)divisor);
      
      long answer =  ldivide(dividendl, divisorl);
      
      if(isNegative){
          answer = -answer;
      }
      if(answer >= Integer.MAX_VALUE){
          answer = Integer.MAX_VALUE;  
      }
      return (int)answer;
    }
    private long ldivide(long ldividend, long ldivisor) {
	// Recursion exit condition
	if (ldividend < ldivisor) return 0;
	
	//  Find the largest multiple so that (divisor * multiple <= dividend), 
	//  whereas we are moving with stride 1, 2, 4, 8, 16...2^n for performance reason.
	//  Think this as a binary search.
	long sum = ldivisor;
	long multiple = 1;
	while ((sum+sum) <= ldividend) {
		sum += sum;
		multiple += multiple;
	}
	//Look for additional value for the multiple from the reminder (dividend - sum) recursively.
	return multiple + ldivide(ldividend - sum, ldivisor);
}
