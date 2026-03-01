public class TribonacciSeries {
public static void main(String[] args) {
int n = 8;
int a = 0, b = 1, c = 1;
System.out.print(a + " " + b + " " + c + " ");
for(int i = 4; i <= n; i++) {
int next = a + b + c;
System.out.print(next + " ");
a = b;
b = c;
c = next;
}

//second time
for(int i = 4; i <= n; i++) {
int next = a + b + c;
System.out.print(next + " ");
a = b;
b = c;
c = next;
}

//third time
for(int i = 4; i <= n; i++) {
int next = a + b + c;
System.out.print(next + " ");
a = b;
b = c;
c = next;
}
}
}

