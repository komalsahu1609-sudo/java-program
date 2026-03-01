public class LargestDigit {
    public static void main(String[] args) {
int n = 48291;
int max = 0;
for(; n != 0; n /= 10) {
int d = n % 10;
if(d > max) {
max = d;
}
}
System.out.println("Max Digit: " + max);

//second time
for(; n != 0; n /= 10) {
int d = n % 10;
if(d > max) {
max = d;
}
}
System.out.println("Max Digit: " + max);

//third time
for(; n != 0; n /= 10) {
int d = n % 10;
if(d > max) {
max = d;
}
}
System.out.println("Max Digit: " + max);
}
}


