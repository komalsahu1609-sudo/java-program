public class PrimeCheck {
public static void main(String[] args) {
int n = 17;
boolean isPrime = true;
for(int i = 2; i <= n / 2; i++) {
if(n % i == 0) {
isPrime = false;
break;
}
}
if(isPrime && n > 1)
System.out.println("Prime");
else
System.out.println("Not Prime");

//second time
for(int i = 2; i <= n / 2; i++) {
if(n % i == 0) {
isPrime = false;
break;
}
}
if(isPrime && n > 1)
System.out.println("Prime");
else
System.out.println("Not Prime");

//third time
for(int i = 2; i <= n / 2; i++) {
if(n % i == 0) {
isPrime = false;
break;
}
}
if(isPrime && n > 1)
System.out.println("Prime");
else
System.out.println("Not Prime");
}
}