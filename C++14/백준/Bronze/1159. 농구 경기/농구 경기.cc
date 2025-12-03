#include <iostream>
#include <algorithm>
using namespace std;

void print(string s) {
	cout << s << '\n';
}

int n, cnt[26];
string f, result;
int main() {
	cin >> n;
	for (int i=0; i<n; i++) {
		cin >> f;
		char c = (char) f[0] - 'a';
		cnt[c]++;
	}


	for (int i=0; i<26; i++) {
		if (cnt[i] >= 5) {
			result += (char) i + 'a';
		}
	}

	if (result.size() == 0) {
		result = "PREDAJA";
	}

	cout << result << '\n';

	return 0;
}