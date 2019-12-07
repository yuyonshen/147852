#define  _CRT_SECURE_NO_WARNINGS
#include <string.h>
#include <stdio.h>
#include <ctype.h>
#include<stdlib.h>
void ReserveStr(char *arr, int start, int end)
{
	char ch;
	if (arr == NULL)
		return;
	while (start<end)
	{
		ch = arr[start];
		arr[start] = arr[end];
		arr[end] = ch;
		start++;
		end--;
	}
}

void ReserveWord(char *arr)
{
	int start = 0;
	int end = 0;
	int len = strlen(arr);
	if (arr == NULL)
		return;

	ReserveStr(arr, 0, len - 1);
	while (start<len)
	{
		end = start;
		if (arr[start] != ' ')
		{
			while (arr[end] != ' '&&arr[end] != '\0')
			{
				end++;
			}
			ReserveStr(arr, start, end - 1);
			start = end;
		}
		else
		{
			start++;
		}

	}
}

int main()
{
	char str[100];
	gets(str);
	ReserveWord(str);
	printf("%s", str);
	system("pause");
	return 0;
}