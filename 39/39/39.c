/*#define  _CRT_SECURE_NO_WARNINGS
#include<stdio.h>
#include<time.h>
#include<stdlib.h>
//���ϵͳ���ں�ʱ��
int main(){
	int command[4] = { 0, 1, 2, 3 };
	int num;
	struct tm *systime;
	printf("��Ҫ����������0\n");
	printf("���������ָ��\n");
	while (1){
		scanf("%d", &num);
		if (command[0] == num){
			printf("��������1��ʾϵͳ���ڣ���������2��ʾϵͳʱ�䣬��������3�˳�ϵͳ\n");

		}
		else if (command[1] == num){
			time_t nowtime;
			time(&nowtime);
			systime = localtime(&nowtime);
			printf("ϵͳ����:%d-%d-%d\n", 1900 + systime->tm_year, systime->tm_mon, systime->tm_mday);
		}
		else if (command[2] = num){
			time_t nowtime;
			time(&nowtime);
			systime = localtime(&nowtime);
			printf("%d:%d:%d\n", systime->tm_hour, systime->tm_min, systime->tm_sec);
		}
		else if (command[3] == num){
			return 0;
		}
		printf("�������������\n");
	}
	system("pause");
	return 0;
}*/
