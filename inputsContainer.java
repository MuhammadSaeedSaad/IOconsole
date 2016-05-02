
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

//this class for taking inputs from console 
public class inputsContainer {
    private int numOfTestCases;
    private String arr[][];
    private int numOfStringsPerCase;

    inputsContainer(int i) throws IOException{
        takingNumOfTestCases();
        takingNumOfStringsPerTestCase();
        if(i==0) takingInputStrings("ENTER THE INPUT STRING NUMBER");
        else takingInputStrings("ENTER THE INPUT INTEGER STRING NUMBER");

    }
    public String bufferInput() throws IOException{
        BufferedReader br =new BufferedReader(new InputStreamReader(System.in));
        return br.readLine();
    }
    public void takingNumOfTestCases() throws IOException {
        System.out.print("NUMBER OF TEST CASES:");
        String a=bufferInput();
        numOfTestCases = Integer.parseInt(Character.toString(a.charAt(0)));
    }
    void takingNumOfStringsPerTestCase() throws IOException{
        System.out.print("ENTER NUMBER OF STRINGS PER CASE :");
        String s=bufferInput();
        numOfStringsPerCase=Integer.parseInt(Character.toString(s.charAt(0)));

    }

    public int getNumOfTestCases(){
        return numOfTestCases;
    }
    public int getNumOfStringsPerCase(){
        return numOfStringsPerCase;
    }

    public void takingInputStrings(String inputAskingString)throws IOException {
        String arr[][]=new String[numOfTestCases][numOfStringsPerCase];
        for (int i=0;i<numOfTestCases;i++){
            for (int j=0;j<numOfStringsPerCase;j++){
            System.out.print(inputAskingString+" "+(j+1)+" for test case number "+(i+1)+" :");
            arr[i][j]=bufferInput();
            }
        }
        this.arr=arr;

    }

    public String[][] getInputs(){
        return arr;
    }

}
