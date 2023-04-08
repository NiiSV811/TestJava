package co.edu.uptc.mathutil;
public class MathUtil {
    private int[] numArray;
    private int iterator;
    private int arrSize;
    private int[] intArray;
    public MathUtil(int size){
        this.arrSize = size;
        this.numArray = new int[this.arrSize];
        this.iterator = 0;


    }

    public MathUtil(){
        this.numArray = new int[3];
        this.intArray = new int[]{1,2,3,3,4,5,5,10, 10, 20,1};
    }



    //NEW METHODS
    public int countElementArray(int num){
        int times = 0;
        for(int i = 0; i < this.intArray.length; i++){
            times += this.intArray[i] == num ? 1 : 0;
        }
        return times;
    }

    public int countElementArray(int num, int[] arr){
        int times = 0;
        for(int numArray : arr){
            times += numArray == num ? 1 : 0;
        }
        return times;
    }
    public boolean isIntInArray(int num, int[] arr){
        return this.countElementArray(num,arr) > 0;
    }
    public int[] stringToNumArray(String input){
        int[] arr;
        String[] inputArray;

        input = input.replace(" ", "");
        input = input.replace(".", "");
        inputArray = input.split(",");

        arr = new int[inputArray.length];

        for(int i = 0; i < inputArray.length; i++){
            arr[i] = Integer.parseInt(inputArray[i]);
        }
        return arr;
    }

    public int[] generateSet(){
        int[] set;
        String auxSet = this.intArray[0] + ",";
        set = this.stringToNumArray(auxSet);

        for(int n : this.intArray){
            if(!this.isIntInArray(n, set)){
                auxSet += n + ",";
            }
            set = this.stringToNumArray(auxSet);
        }
        return set;
    }

    public int[] generateSet(int[] arr){
        int[] set;
        String auxSet = arr[0] + ",";
        set = this.stringToNumArray(auxSet);

        for(int n : arr){
            if(!this.isIntInArray(n, set)){
                auxSet += n + ",";
            }
            set = this.stringToNumArray(auxSet);
        }
        return set;
    }

    //PAST METHODS
    public int[] getNumArray(){return  this.numArray;}
    public int getIterator(){return this.iterator;}
    public int addBiggerToNumArray(int num1, int num2){
        int pushValue = this.BiggerThan(num1, num2);
        this.numArray[iterator] = pushValue;
        this.iterator++;
        return pushValue;
    }

    public int biggestNumArray(){
        int theBigger = 0;
        for(int i = 0; i < this.iterator; i++){
            theBigger = this.BiggerThan(this.numArray[i], theBigger);
        }
        return theBigger;
    }

    public int theMinorNumArray(){
        int theMinor = this.numArray[0];
        for(int i = 0; i < this.iterator; i++){
            theMinor = this.LessThan(this.numArray[i], theMinor);
        }
        return theMinor;
    }

    public int biggestNumArray(int[] arr){
        int theBigger = 0;
        for(int i = 0; i < arr.length; i++){
            theBigger = this.BiggerThan(arr[i], theBigger);
        }
        return theBigger;
    }

    public int theMinorNumArray(int[] arr){
        int theMinor = arr[0];
        for(int i = 0; i < arr.length; i++){
            theMinor = this.LessThan(arr[i], theMinor);
        }
        return theMinor;
    }

    public int[] fillArr(int size, int num){
        int[] arr = new int[size];
        for(int i = 0; i < arr.length; i++){
            arr[i] = num;
        }
        return arr;
    }

    private int BiggerThan(int num1, int num2){
        return num1 > num2? num1 : num2;
    }

    private int LessThan(int num1, int num2){
        return num1 < num2? num1: num2;
    }


    //Old Math Util
    private int [] arrayResult;

    public int[] getArrayResult() {
        return arrayResult;
    }

    public  void calcEvenNumbers(int limit){

        if(limit % 2 == 0){
            this.arrayResult = new int[limit/2];
        }else{
            this.arrayResult = new int[(limit-1)/2];
        }


        int iterator = 1;
        int index = 0;
        while (iterator <=limit ){

            if (iterator % 2 == 0){
                this.arrayResult[index] = iterator;
                index ++;
            }
            iterator++;
        }
    }

    public  void calcOddNumbers(int limit){
        if(limit % 2 == 0){
            this.arrayResult = new int[limit/2];
        }else{
            this.arrayResult = new int[(limit + 1)/2];
        }
        int iterator = 1;
        int index = 0;
        while (iterator <= limit){
            if (iterator % 2 != 0){
                arrayResult[index]= iterator;
                index++;
            }
            iterator++;
        }
    }

    public void calcCousinNumbers(int limit){
        String primeNumbers = "";
        int iterator = 2;
        boolean isPrime;
        while (iterator <=limit){
            isPrime = true;
            for (int count = 2; count < iterator; count++){
                if(iterator % count == 0 ){
                    isPrime = false;
                    break;
                }
            }
            if (isPrime){
                primeNumbers += iterator;
            }
            iterator++;
        }
        int numAddtoArray = 0;
        this.arrayResult = new int[primeNumbers.length()];
        for(int prime = 0; prime < arrayResult.length; prime++){
            numAddtoArray = Integer.parseInt(String.valueOf(primeNumbers.charAt(prime)));
            this.arrayResult[prime] = numAddtoArray;
        }


    }
    public Boolean isCapicua(String numberToCheck){
        boolean isCapicua = false;
        String inverseNumber = "";
        int iterator = numberToCheck.length() - 1;
        while(0 <= iterator){
            inverseNumber = inverseNumber + numberToCheck.charAt(iterator);

            iterator--;
        }

        if (inverseNumber.equals(numberToCheck)){
            return true;
        }
        return false;

    }


}
