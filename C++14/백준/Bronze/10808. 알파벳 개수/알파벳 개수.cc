#include <iostream>
using namespace std;

int a[26];
string s;
int main() {
	cin >> s;
	for (char c : s) {
		a[c-'a']++;
	}
	for (int n : a) {
		cout << n << ' ';
	}
	cout << '\n';
	return 0;
}