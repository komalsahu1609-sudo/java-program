public class CountDigits {
public static void main(String[] args) {
int n = 5829;
int count = 0;
for(; n != 0; n /= 10) {
count++;
}
System.out.println("Digits: " + count);

//second time
for(; n != 0; n /= 10) {
count++;
}
System.out.println("Digits: " + count);

//third time
for(; n != 0; n /= 10) {
count++;
}
System.out.println("Digits: " + count);
}
}