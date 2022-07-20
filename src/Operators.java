/**
 * Operators class created to show some basic operatos functionality
 */
class Operators {
int number1=280;
int number2=320;
int number3=400;
int cost;
void ternary(){
cost=((number1>number2)?(number1>number3)?number1:number3:(number2>number3)?number2:number3);
System.out.println("The Costliest of the 3 product is:"+cost);
}
  void bitwise()
  {
      System.out.println("Bitwise AND:" + (number1&number2));
      System.out.println("Bitwise OR:" + (number1|number2));
      System.out.println("Bitwise XOR:" + (number1^number2));

      System.out.println("Bitwise NOT:" + (~number1));
  }
void shift()
{
    System.out.println("Shift operators");
    int ans=number1 <<2;
    System.out.println(ans);
    System.out.println(number1>>>2);
    int x=-280;
    System.out.println(x>>>2);
    System.out.println("Unary operator");
    ++number1;
    System.out.println(number1);
    System.out.println(number1++);
    System.out.println(number1);
    System.out.println(--number1);
    System.out.println(number1);
    System.out.println(number1--);
    System.out.println(number1);
    System.out.println("Relational Operator");
    System.out.println("a>b"+"\t" +(number1>number2));
    System.out.println("a!=b"+"\t"+(number1!=number2));
}
  }


