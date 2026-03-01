public class DecimalToBinary {
public static void main(String[] args) {
int n = 10;
for(int i = 31; i >= 0; i--) {
int k = n >> i;
if((k & 1) == 1)
System.out.print("1");
else
System.out.print("0");
}

//second time
for(int i = 31; i >= 0; i--) {
int k = n >> i;
if((k & 1) == 1)
System.out.print("1");
else
System.out.print("0");
}

//third time
for(int i = 31; i >= 0; i--) {
int k = n >> i;
if((k & 1) == 1)
System.out.print("1");
else
System.out.print("0");
}
}
}
