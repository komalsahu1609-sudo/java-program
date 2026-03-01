public class Power2_5 {
public static void main(String[] args) {
int base = 2, exp = 5;
int result = 1;
for(int i = 1; i <= exp; i++) {
result *= base;
}
System.out.println("Result: " + result);

//second time
for(int i = 1; i <= exp; i++) {
result *= base;
}
System.out.println("Result: " + result);

//third time
for(int i = 1; i <= exp; i++) {
result *= base;
}
System.out.println("Result: " + result);
}
}