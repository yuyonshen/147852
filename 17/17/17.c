#include<stdio.h>
#include<stdlib.h>
//���ʽ
/*int main(){	//����1							
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
//��ֵ
int main(){//ģ���ӵ㹤
	int hourswork = 8;
	int hourerate;
	int gorsspay;
	hourerate = 13;
	gorsspay = hourswork*hourerate;
	printf("gorsspay=%d\n", gorsspay);
	system("pause");
	return 0;
}
//ǿ������ת��
int main(){
	char cchar;
	short int ishort;
	int iint;
	float ffloat = 70000;
	cchar = (char)ffloat;//ǿ��ת�����ŵ���ʽ()����������дת�͵�����
	ishort = (short)ffloat;
	iint = (int)ffloat;
	printf("cchar=%c\n", cchar);
	printf("ishort=%ld\n", ishort);
	printf("iint=%d\n", iint); 
	system("pause");
	return 0;
}
//���ȼ�������
//������������У�*��/��%�����ȼ�����+��-��
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
//�����Լ������
//++������--�Լ�
//++��--���ڱ�����ǰ�棬�ڱ����μӱ��ʽ����ǰ�����Լ��Լ����ں�����֮
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

