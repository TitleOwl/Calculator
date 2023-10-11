# ❓ testAddition

## ⛳ Goal: To test the addition functionality in the calculate function.
Identify testable functions: calculate()
Identify parameters, return types, return values, and exception behavior

  -	Parameters: firstNumber, secondNumber, operator
  
  -	Return type: double
  
  -	Return value: result from calculate
  
  -	Exceptional behavior: ??

## 💡 Model the input domain:

-	Characteristics:

    1.Interface-based
     
        C1 = firstNumber can be …
    	
        C2 = secondNumber can be …
      
    2.Functionality-based
     
        C1 = Result
        
-	Partition characteristics:

    -	Interface-based

    
        | Characteristics       | b1              | b2             | b3     |
        | :--                   | :--             | :--            | :--    |
        | C1 = firstNumber can be... | Less than 0   | Equal to 0 | Greater than 0 |
        | C2 = secondNumber can be... | Less than 0   | Equal to 0 | Greater than 0 |
  
    -	Functionality-based

        | Characteristics       | b1              | b2             | b3     |
        | :--                   | :--             | :--            | :--    |
        | C1 = Result. | Less than 0   | Equal to 0 | Greater than 0 |


-	Identify (possible) values: 
    -	Interface-based

    
        | Characteristics       | b1              | b2             | b3     |
        | :--                   | :--             | :--            | :--    |
        | C1 = firstNumber can be... | -5   | 0 | 5000 |
        | C2 = secondNumber can be... | -999.9  | 0 | 666 |


    - Functionality-based
        | Characteristics       | b1              | b2             | b3     |
        | :--                   | :--             | :--            | :--    |
        | C1 = Result.          | -333            | 0              | 4995   |



-	Combine partitions and test values:
    -	ACoC
      
        (C1b1, C2b1) -> (-5, -999.9), expected value = -1004.9
    
        (C1b1, C2b2) -> (-5, 0), expected value = -5
     	
        (C1b1, C2b3) -> (-5, 666), expected value = 661
    
        
        (C1b2, C2b1) -> (0, -999.9), expected value = -999.9
     	
        (C1b2, C2b2) -> (0, 0), expected value = 0
     	
        (C1b2, C2b3) -> (0, 666), expected value = 666
     	
        
        (C1b3, C2b1) -> (5000, -999.9), expected value = 4000.1
     	
        (C1b3, C2b2) -> (5000, 0), expected value = 5000
     	
        (C1b3, C2b3) -> (5000, 666), expected value = 5666

# ❓ testSubtraction

## ⛳ Goal: To test the subtraction functionality in the calculate function.
Identify testable functions: calculate()
Identify parameters, return types, return values, and exception behavior:

-	Parameters: firstNumber, secondNumber, operator
-	Return type: double
-	Return value: result from calculate
-	Exceptional behavior: ??
  
## 💡 Model the input domain:

-	Characteristics:

    1.Interface-based
     
        C1 = firstNumber can be …
    	
        C2 = secondNumber can be …
      
    2.Functionality-based
     
        C1 = Result
        
-	Partition characteristics:

    -	Interface-based

    
        | Characteristics       | b1              | b2             | b3     |
        | :--                   | :--             | :--            | :--    |
        | C1 = firstNumber can be... | Less than 0   | Equal to 0 | Greater than 0 |
        | C2 = secondNumber can be... | Less than 0   | Equal to 0 | Greater than 0 |
  
    -	Functionality-based

        | Characteristics       | b1              | b2             | b3     |
        | :--                   | :--             | :--            | :--    |
        | C1 = Result. | Less than 0   | Equal to 0 | Greater than 0 |


-	Identify (possible) values: 
    -	Interface-based

    
        | Characteristics       | b1              | b2             | b3     |
        | :--                   | :--             | :--            | :--    |
        | C1 = firstNumber can be... | -77.7   | 0 | 5 |
        | C2 = secondNumber can be... | -9  | 0 | -666 |


    - Functionality-based
        | Characteristics       | b1              | b2             | b3     |
        | :--                   | :--             | :--            | :--    |
        | C1 = Result.          | -285           | 0              | 5   |






-	Combine partitions and test values:
    -	ACoC
      
        (C1b1, C2b1) -> (-77.7, -9), expected value = -68.7
    
        (C1b1, C2b2) -> (-77.7, 0), expected value = -77.7
     	
        (C1b1, C2b3) -> (-77.7, 666), expected value = -743.7
    
        
        (C1b2, C2b1) -> (0, -9), expected value = 9
     	
        (C1b2, C2b2) -> (0, 0), expected value = 0
     	
        (C1b2, C2b3) -> (0, 666), expected value = -666
     	
        
        (C1b3, C2b1) -> (5000, -999.9), expected value = 14
     	
        (C1b3, C2b2) -> (5000, 0), expected value = 5
     	
        (C1b3, C2b3) -> (5000, 666), expected value = -661




# ❓ testMultiplication

## ⛳ Goal: To test the multiplication functionality in the calculate function.
Identify testable functions: calculate()
Identify parameters, return types, return values, and exception behavior:

  -	Parameters: firstNumber, secondNumber, operator
  
  -	Return type: double
  
  -	Return value: result from calculate
  
  -	Exceptional behavior: ??

## 💡 Model the input domain:

-	Characteristics:

    1.Interface-based
     
        C1 = firstNumber can be …
    	
        C2 = secondNumber can be …
      
    2.Functionality-based
     
        C1 = Result
        
-	Partition characteristics:

    -	Interface-based

    
        | Characteristics       | b1              | b2             | b3     |
        | :--                   | :--             | :--            | :--    |
        | C1 = firstNumber can be... | Less than 0   | Equal to 0 | Greater than 0 |
        | C2 = secondNumber can be... | Less than 0   | Equal to 0 | Greater than 0 |
  
    -	Functionality-based

        | Characteristics       | b1              | b2             | b3     |
        | :--                   | :--             | :--            | :--    |
        | C1 = Result. | Less than 0   | Equal to 0 | Greater than 0 |


-	Identify (possible) values: 
    -	Interface-based

    
        | Characteristics       | b1              | b2             | b3     |
        | :--                   | :--             | :--            | :--    |
        | C1 = firstNumber can be... | -47   | 0 | 591 |
        | C2 = secondNumber can be... | -100  | 0 | 777 |


    - Functionality-based
        | Characteristics       | b1              | b2             | b3     |
        | :--                   | :--             | :--            | :--    |
        | C1 = Result.          | -36519            | 0              | 200  |



-	Combine partitions and test values:
    -	ECC
      
        (C1b1, C2b2) -> (-100, 0), Expected value = 0
    
        (C1b2, C2b3) -> (0, 591), Expected value = 0
     	
        (C1b3, C2b1) -> (777, -47), Expected value = -36519
    
    
        Add block3 that result greater than 0 from Functionality-based characteristic (check positive number result).
     	
     	
        (C1b1, C2b1) -> (-50, -40), Expected value = 2000
     	
        (C1b3, C2b3) -> (70, 3) Expected value = 210
     	

# ❓ testDivision

## ⛳ Goal: To test the multiplication functionality in the calculate function.
Identify testable functions: calculate()
Identify parameters, return types, return values, and exception behavior:

  -	Parameters: firstNumber, secondNumber, operator
  
  -	Return type: double
  
  -	Return value: result from calculate
  
  -	Exceptional behavior: divide by 0 will get “infinity” and if 0/0 will get “NaN”

## 💡 Model the input domain:

-	Characteristics:

    1.Interface-based
     
        C1 = firstNumber can be …
    	
        C2 = secondNumber can be …
      
    2.Functionality-based
     
        C1 = Result
        
-	Partition characteristics:

    -	Interface-based

    
        | Characteristics       | b1              | b2             | b3     |
        | :--                   | :--             | :--            | :--    |
        | C1 = firstNumber can be... | Less than 0   | Equal to 0 | Greater than 0 |
        | C2 = secondNumber can be... | Less than 0   | Equal to 0 | Greater than 0 |
  
    -	Functionality-based

        | Characteristics       | b1              | b2             | b3     |  b4     | b5     |
        | :--                   | :--             | :--            | :--    | :--    | :--    |
        | C1 = Result. | Less than 0   | Equal to 0 | Greater than 0 | Infinity | NaN |


-	Identify (possible) values: 
    -	Interface-based

    
        | Characteristics       | b1              | b2             | b3     |
        | :--                   | :--             | :--            | :--    |
        | C1 = firstNumber can be... | -15   | 0 | 666 |
        | C2 = secondNumber can be... | -32  | 0 | 333 |


    - Functionality-based
        | Characteristics       | b1              | b2             | b3     | b4     | b5     |
        | :--                   | :--             | :--            | :--    | :--    | :--    |
        | C1 = Result.          | -0.04504504504            | 0     | 0.46875  | Infinity | NaN |



-	Combine partitions and test values:
    -	ECC
      
        (C1b1, C2b1) -> (-15, -32), Expected value = 0.46875
    
        (C1b2, C2b2) -> (0, 0), Expected value = NaN
     	
        (C1b3, C2b3) -> (666, 333), Expected value = 2
    
    
       Add block1, 2 and 4 that result less than 0 and Infinity from Functionality-based characteristic (check negative 
       number result).
     	
    
      (C1b1, C2b3) -> (-15, 333), Expected value = -0.04504504504
     	
      (C1b2, C1b1) -> (0, -15), Expected value = 0
     	
     (C1b3, C2b2) -> (666, 0), Expected value = Infinity


# ❓ testModulo

## ⛳ Goal: To test the multiplication functionality in the calculate function.
Identify testable functions: calculate()
Identify parameters, return types, return values, and exception behavior:

  -	Parameters: firstNumber, secondNumber, operator
  
  -	Return type: double
  
  -	Return value: result from calculate
  
  -	Exceptional behavior: mod by 0 will get “NaN”

## 💡 Model the input domain:

-	Characteristics:

    1.Interface-based
     
        C1 = firstNumber can be …
    	
        C2 = secondNumber can be …
      
    2.Functionality-based
     
        C1 = Result
        
-	Partition characteristics:

    -	Interface-based

    
        | Characteristics       | b1              | b2             | b3     |
        | :--                   | :--             | :--            | :--    |
        | C1 = firstNumber can be... | Less than 0   | Equal to 0 | Greater than 0 |
        | C2 = secondNumber can be... | Less than 0   | Equal to 0 | Greater than 0 |
  
    -	Functionality-based

        | Characteristics       | b1              | b2             | b3     |  b4     | 
        | :--                   | :--             | :--            | :--    | :--    | 
        | C1 = Result. | Less than 0   | Equal to 0 | Greater than 0  | NaN |


-	Identify (possible) values: 
    -	Interface-based

    
        | Characteristics       | b1              | b2             | b3     |
        | :--                   | :--             | :--            | :--    |
        | C1 = firstNumber can be... | -15   | 0 | 666 |
        | C2 = secondNumber can be... | -30  | 0 | 2 |


    - Functionality-based
        | Characteristics       | b1              | b2             | b3     | b4     |
        | :--                   | :--             | :--            | :--    | :--    |
        | C1 = Result.          | -15            | 0     | 1  | NaN |



-	Combine partitions and test values:
    -	MBCC
      
        [A B C]
    
        [1 2 3]
     	
        Base:	(A,1) and (C,2)
    
        (A,1): (A,2), (A,3), (B,1), (C,1)
    
        (C,2): (C,3), (B,2)
     	
        (A,1) -> (-15, -30), Expected value = -15
     	
        (A,2) -> (-15, 0), Expected value = NaN
     	
        (A,3) -> (-15, 2), Expected value = -1
     	
        (B,1) -> (0, -30), Expected value = 0
    
        (C,1) -> (666, -30), Expected value = 6
    
        (C,2) -> (666, 0), Expected value = NaN
    
        (C,3) -> (666, 2), Expected value = 0
    
        (B,2) -> (0, 0), Expected value = NaN
 	

  # ❓ testPower

## ⛳ Goal: To test the multiplication functionality in the calculate function.
Identify testable functions: calculate()
Identify parameters, return types, return values, and exception behavior:

  -	Parameters: firstNumber, secondNumber, operator
  
  -	Return type: double
  
  -	Return value: result from calculate
  
  -	Exceptional behavior: Math.pow(0,Negative Number) = Infinity

## 💡 Model the input domain:

-	Characteristics:

    1.Interface-based
     
        C1 = firstNumber can be …
    	
        C2 = secondNumber can be …
      
    2.Functionality-based
     
        C1 = Result
        
-	Partition characteristics:

    -	Interface-based

    
        | Characteristics       | b1              | b2             | b3     | b4     | b5     |
        | :--                   | :--             | :--            | :--    | :--    | :--    |
        | C1 = firstNumber can be... | Less than 0   | Equal to 0 | Greater than 0 |  Greater than 0  | Greater than 0 |
        | C2 = secondNumber can be... | Less than 0 (even)  | Equal to 0 (odd) | Greater than 0 |  Greater than 0 (odd) |  Greater than 0 (even) |
  
    -	Functionality-based

        | Characteristics       | b1              | b2             | b3     |  b4     | 
        | :--                   | :--             | :--            | :--    | :--    | 
        | C1 = Result. | Less than 0   | Equal to 0 | Greater than 0 | Infinity | 


-	Identify (possible) values: 
    -	Interface-based

    
        | Characteristics       | b1              | b2             | b3     | b4     | b5     |
        | :--                   | :--             | :--            | :--    | :--    | :--    |
        | C1 = firstNumber can be... | -5.5   | 0 | 6 |
        | C2 = secondNumber can be... | -2  | -3 | 0 | 4 | 5 |


    - Functionality-based
        | Characteristics       | b1              | b2             | b3     | b4     | 
        | :--                   | :--             | :--            | :--    | :--    | 
        | C1 = Result.          | -8341.609375     | 0     | 915.0625  | Infinity |



-	Combine partitions and test values:
    -	PWC
      
        [A B C]
    
        [1 2 3 4 5]
     	
        (A,1) (B,1) (C,1)
        
        (A,2) (B,2) (C,2)
        
        (A,3) (B,3) (C,3)
        
        (A,4) (B,4) (C,4)
        
        (A,5) (B,5) (C,5)
        
        (-5.5, -2), expected value = 0.03305785123966942
        
        (-5.5, -3), expected value = -0.006010518407212622
        
        (-5.5, 0), expected value = 1
        
        (-5.5, 4), expected value = 915.0625
        
        (-5.5, 5), expected value = -8341.609375
        
        (0, -2), expected value = Infinity
        
        (0, -3), expected value = Infinity
        
        (0, 0), expected value = 1
        
        (0, 4), expected value = 0
        
        (0, 5), expected value = 0
        
        (6, -2), expected value = 0.027777777777777776
        
        (6, -3), expected value = 0.004629629629629629
        
        (6, 0), expected value = 1
        
        (6, 4), expected value = 1296
        
        (6, 5), expected value = 7776

 # ❓ testSquareRoot

## ⛳ Goal: To test the multiplication functionality in the calculate function.
Identify testable functions: calculate()
Identify parameters, return types, return values, and exception behavior:

  -	Parameters: firstNumber, secondNumber, operator
  
  -	Return type: double
  
  -	Return value: result from calculate
  
  -	Exceptional behavior: If the number in square root is a negative number, will get NaN.

## 💡 Model the input domain:

-	Characteristics:

    1.Interface-based
     
        C1 = firstNumber can be …
    	
        C2 = secondNumber can be …
      
    2.Functionality-based
     
        C1 = Result
        
-	Partition characteristics:

    -	Interface-based

    
        | Characteristics       | b1              | b2             | b3     | 
        | :--                   | :--             | :--            | :--    | 
        | C1 = firstNumber can be... | Less than 0   |  |  | 
        | C2 = secondNumber can be... | Less than 0   | Equal to 0  | Greater than 0 | 
  
    -	Functionality-based

        | Characteristics       | b1              | b2             | b3     |  
        | :--                   | :--             | :--            | :--    | 
        | C1 = Result. | NaN   | Equal to 0 | Greater than 0 | 


-	Identify (possible) values: 
    -	Interface-based

    
        | Characteristics       | b1              | b2             | b3     | 
        | :--                   | :--             | :--            | :--    | 
        | C1 = firstNumber can be... | 0   |  |  |
        | C2 = secondNumber can be... | -11  | 0 | 23 |


    - Functionality-based
        | Characteristics       | b1              | b2             | b3     |
        | :--                   | :--             | :--            | :--    | 
        | C1 = Result.          | NaN     | 0     | 4.795831523312719  | 



-	Combine partitions and test values:
    -	BCC
        Base = (C1b1, C2b1)
     	
        (C1b1, C2b1) -> (0, -11), Expected value = NaN
     	
        (C1b1, C2b2) -> (0, 0), Expected value = 0
     	
        (C1b1, C2b3) -> (0, 23), Expected value = 4.795831523312719


 # ❓ testLog

## ⛳ Goal: To test the multiplication functionality in the calculate function.
Identify testable functions: calculate()
Identify parameters, return types, return values, and exception behavior:

  -	Parameters: firstNumber, secondNumber, operator
  
  -	Return type: double
  
  -	Return value: result from calculate
  
  -	Exceptional behavior: If the number in log is a negative number, will get NaN and log 0 is -Infinity.

## 💡 Model the input domain:

-	Characteristics:

    1.Interface-based
     
        C1 = firstNumber can be …
    	
        C2 = secondNumber can be …
      
    2.Functionality-based
     
        C1 = Result
        
-	Partition characteristics:

    -	Interface-based

    
        | Characteristics       | b1              | b2             | b3     | 
        | :--                   | :--             | :--            | :--    | 
        | C1 = firstNumber can be... | Equal to 0   |  |  | 
        | C2 = secondNumber can be... | Less than 0   | Equal to 0  | Greater than 0 | 
  
    -	Functionality-based

        | Characteristics       | b1              | b2             | b3     |  b4     | b5     |
        | :--                   | :--             | :--            | :--    | :--     |  :--     |
        | C1 = Result.          | Less than 0 | Equal to 0     | Greater than 0 |  NaN    | -Infinity | 


-	Identify (possible) values: 
    -	Interface-based

    
        | Characteristics       | b1              | b2             | b3     | 
        | :--                   | :--             | :--            | :--    | 
        | C1 = firstNumber can be... | 0   |  |  |
        | C2 = secondNumber can be... | -5  | 0 | 10 |


    - Functionality-based
        | Characteristics       | b1              | b2             | b3     | b4     | b5     |
        | :--                   | :--             | :--            | :--    | :--    | :--    |
        | C1 = Result.          | NaN     | 0     | 4.795831523312719  |  NaN | -Infinity |



-	Combine partitions and test values:
    -	BCC

        Base = (C1b1, C2b1)
     	
        (C1b1, C2b1) -> (0, -5), Expected value = NaN
     	
        (C1b1, C2b2) -> (0, 0), Expected value = -Infinity
     	
        (C1b1, C2b3) -> (0, 10), Expected value = 2.302585092994046
     	
        From block 2 in Functionality-based characteristic
     	
        (C1b1, C2b3) -> (0, 1), Expected value = 0

   
 # ❓ testBackButton

## ⛳ Goal: To verify the functionality of the back button (<-). Specifically, the test aims to ensure that when the back button is clicked, it correctly removes the last digit from the input displayed on the calculator screen.
Identify testable functions: initButtons() -> label: ‘<-’ (btnBack) and inputScreen()
Identify parameters, return types, return values, and exception behavior:


  -	Parameters: String(number) from(inputScreen().setText())
  
  -	Return type: String
  
  -	Return value: Number after back button clicked.
  
  -	Exceptional behavior: N/A

## 💡 Model the input domain:

-	Characteristics:

    1.Interface-based
     
        C1 = String is empty
    	
      
    2.Functionality-based
     
        C1 = integer
        C2 = Is 1 digit?  

-	Partition characteristics:

    -	Interface-based

    
        | Characteristics       | b1              | b2             |
        | :--                   | :--             | :--            |
        | C1 = button is visible? | True   | False |
  
    -	Functionality-based

        | Characteristics       | b1              | b2             | 
        | :--                   | :--             | :--        |    
        | C1 = integer | Positive integer  | Negative integer |
     	  | C2 = Is 1 digit? | True  | False |

-	Identify (possible) values: 
    -	Interface-based

    
        | Characteristics       | b1              | b2             |
        | :--                   | :--             | :--            | 
        | C1 = String is empty  | "" | "12345" |
        


    - Functionality-based
        | Characteristics       | b1              | b2             | b3     |
        | :--                   | :--             | :--            | :--    |
        | C1 = integer         | 3     | -123   |
        | C2 = Is 1 digit?        | 3 or -3     | 123 or -123  |


-	Combine partitions and test values:
    -	MBCC
      
          Bases are (C1b1, C2b1) and (C1b2, C2b1)
     	
		  (C1b1, C2b1) -> (positive integer, True) -> “3”, expected value = 0
     	
		  (C1b1, C2b2) -> (positive integer, False) -> “123”, expected value = 12
     	
		  (C1b2, C2b1) -> (negative integer, True) -> “-3”, expected value = -
     	
		  (C1b2, C2b2) -> (negative integer, False) -> “-123”, expected value = -12
     	
