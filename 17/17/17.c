#include<stdio.h>
#include<stdlib.h>
//表达式
/*int main(){	//例题1							
	int a, b, c;
	a = 10;
	b = 20;
	printf("a=%d\n", a);
	printf("b=%d\n", b);
	c = a + b;
	printf("c=%d\n", c);
	system("pause");
	return 0;
}
//赋值
int main(){//模拟钟点工
	int hourswork = 8;
	int hourerate;
	int gorsspay;
	hourerate = 13;
	gorsspay = hourswork*hourerate;
	printf("gorsspay=%d\n", gorsspay);
	system("pause");
	return 0;
}
//强制类型转化
int main(){
	char cchar;
	short int ishort;
	int iint;
	float ffloat = 70000;
	cchar = (char)ffloat;//强制转换符号的形式()括号里面填写转型的类型
	ishort = (short)ffloat;
	iint = (int)ffloat;
	printf("cchar=%c\n", cchar);
	printf("ishort=%ld\n", ishort);
	printf("iint=%d\n", iint); 
	system("pause");
	return 0;
}
//优先级与结合性
//在算术运算符中，*，/，%的优先级高于+，-。
int main(){
	int a, b, c, d;
	int num = 0;
	a = 10;
	b = 20;
	c = 30;
	d = 40;
	num = a + b + c + d;
	printf("num=%d\n", num);
	num = a*b + c*d;
	printf("num=%d\n", num);
	num = b / a + c%d;
	printf("num=%d\n", num);
	system("pause");
	return 0;
}
//自增自减运算符
//++自增，--自减
//++或--放在变量的前面，在变量参加表达式运算前进行自加自减放在后面则反之
int main(){
	int num = 20;
	int ber;
	ber = ++num;
	printf("num=%d\n", num);
	printf("ber=%d\n", ber);
	num = 20;
	ber = num++;
	printf("num=%d\n", num);
	printf("ber=%d\n", ber);
	system("pause");
	return 0;
}

