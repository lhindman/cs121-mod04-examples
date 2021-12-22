# CS121 - Module 4 - Loops and Conditionals Guided Experimentation
The purpose of this guided experimentation is to provide students with an opportunity to experiment with the code examples presented in the lecture. It is important to keep detailed observation notes as you work through the experiments below. These observations will be useful to you as you complete the labs and you will be allowed to reference them on open book / open note quizzes. You will not be required to turn in your observations.
## Getting Started
To get started on this activity, please clone this repository into your development environment  

Steps to Clone Examples
1. Copy the URL for this repo by clicking the green "Code" button above, select HTTPS then click the copy icon.
2. Open VSCode, click the Source Control icon then click Clone Repository.
3. Pasted the repo URL into the "Provide repository URL" field and press Enter
4. Browse to the location in your development environment where you want to store the repostory and click Select Repository Location.
5. When prompted, Open the repository then Open the workspace

## Boolean Expression Experimentation
1. Open *SmartHome.java*, read the code and run it to ensure it functions properly.  Then work through each of the experiments below and record your observations.
    - Modify the values as shown below. Has the alert been triggered and if not, why?  
    ```
    alertMode = false
    lightsOn = true
    away = true
    timeOn = 0
    ```
 
    - Modify the values as shown below. Has the alert been triggered and if not, why?  
    ```
    alertMode = false
    lightsOn = true
    away = true
    timeOn = 120
    ```
    
    - Modify the values as shown below. Has the alert been triggered and if not, why?  
    ```
    alertMode = true
    lightsOn = false
    away = false
    timeOn = 120
    ```

    - Modify the values as shown below. Has the alert been triggered and if not, why?  
    ```
    alertMode = true
    lightsOn = true
    away = false
    timeOn = 0
    ```

      
## Data Comparison Experimentation
1. Open *FloatingPointComparison.java*, read the code and run it to ensure it functions properly.  Then work through each of the experiments below and record your observations.
    - Experiment by decreasing TOLERANCE values, identifying which provide a match that is "close enough"
    ```
    final double TOLERANCE = 0.00000000000001;
    final double TOLERANCE = 0.000000000000001;
    final double TOLERANCE = 0.0000000000000001;
    final double TOLERANCE = 0.00000000000000001;
    final double TOLERANCE = 0.000000000000000001;
    ```

1. Open *ObjectComparison.java*, read the code and run it to ensure it functions properly.  Then work through each of the experiments below and record your observations.
    - Modify the comparison between p1 and p3 (line 31) to be a comparison between p1 and p2 as shown below. What is the result and why?  
    ```
    if (p1 == p2)
    ```

    - Modify the comparison between p1 and p2 (line 15) to be a comparison between p1 and p3 as shown below. What is the result and why? 
    ```
    if (p1.equals(p3))  
    ```

## Conditional Experimentation
1. Open *MinOfThree.java*, read the code and run it to ensure it functions properly.  Then work through each of the experiments below and record your observations.
    - Run the program with each of the following sets of input values and record the results of each. 
        - 1 2 3
        - 3 2 1
        - 1 1 3
        - 3 1 1
        - 3 3 3
            
    - Modify the code for technique 2, replacing each instance of '<=' with '<' as shown below.  Then run again with each of the sets of values. What is the result and why?  
    ```
    if ((num1 < num2) && (num1 < num3)) {
        min = num1;
    }
    if ((num2 < num3) && (num2 < num1)) {
        min = num2;
    }
    if ((num3 < num2) && (num3 < num1)) {
        min = num3;
    }
    ```
            
1. Open *Guessing.java*, read the code and run it to ensure it functions properly.  Then work through each of the experiments below and record your observations.
    - Play three games and record what the correct answer was for each game
    - Modify the Random object so that it is instantiated using a seed number as shown below. Then Play the game three more times, recording the answer each time. What is the result and why?  
    ```
    Random generator = new Random(123);
    ```
      
## Switch Statement Experimentation
1. Open *GradeReport.java*, read the code and run it to ensure it functions properly.  Then work through each of the experiments below and record your observations.
    - Run the program with each of the following grades as input values and record the results of each. 
        - 95
        - 83
        - 71
        - 64
        - 59
    - Modify the switch statement by removing all of the *break* statements. The run the program again with the above values. What is the result and why?

## While Loop Experimentation
1. Open *BasicWhileLoops.java*, read the code and run it to ensure it functions properly.  Then work through each of the experiments below and record your observations.
    - Off by one errors are incredibly common, especially when working with loops.  Modify the numCookies example, replacing the '>' with '>=' in the loop expression. What is the result and why?
    - Matching entire strings can be very constraining when dealing with user input. Depending upon the requirements of the application, it may be convient to only check the first character of the string instead of the entire contents of the string.  Modify the loop expression as shown below to exit on and string that begins with a 'q'. Try a variety of words that start with the letter 'q' or 'Q' to see how this code behaves. What is the result?  Why did I need to check for the length() before accessing the character at index 0?  
    ```
    while ( !(input.length() > 0 && input.charAt(0) == 'q') ) 
    ```
    
## For Loop Experimentation
1. Open *Echo.java*, read the code and run it to ensure it functions properly.  Then work through each of the experiments below and record your observations.
    - Modify the line that reads input using the **nextLine()** Scanner method to use the **next()** Scanner method as shown below. What is the result and why?
    ```
    message = scan.next();
    ```

1. Open *Milage.java*, read the code and run it to ensure it functions properly.  Then work through each of the experiments below and record your observations.
    - When prompted for number of miles enter: **12.0**  What is the result and why?  

    - When prompted for number of miles enter: **12**, when prompted for the gallons of fuel used enter: **two**  What is the result and why?

    - When prompted for number of miles enter: **12**, when prompted for the gallons of fuel used enter: **2**  What is the result and why?
