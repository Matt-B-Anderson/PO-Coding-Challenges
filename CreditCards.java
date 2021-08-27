package com.revature.creditcards;

public class CreditCards {
	 public static void main(String[] args) {
	        System.out.println(checkValid(1234567890123456l));
	    }

	    public static boolean checkValid(long n){
	        StringBuilder validCard = new StringBuilder(Long.toString(n));
	        char check = validCard.charAt(validCard.length()-1);
	        int total = 0;
	        if (validCard.length() > 19 || validCard.length() < 14){
	            return false;
	        }
	        validCard.deleteCharAt(validCard.length()-1);
	        validCard.reverse();
	        for(int i = validCard.length()-1;i>=0;i--){
	            int value = Integer.parseInt(String.valueOf(validCard.toString().charAt(i)));
	            if(value*2 > 9){
	                value = (value*2)-9;
	                validCard.insert(i,value);
	                total+=value;
	                validCard.deleteCharAt(i+1);
	            } else {
	                validCard.insert(i, value * 2);
	                total+=value*2;
	                validCard.deleteCharAt(i + 1);
	            }
	            i--;
	        }
	        for(int i = validCard.length()-2;i>=0;i--){
	            int value = Integer.parseInt(String.valueOf(validCard.toString().charAt(i)));
	            total+=value;
	            i--;
	        }
	        return (Character.getNumericValue(check)==(10-(total%10)));
	    }
}
