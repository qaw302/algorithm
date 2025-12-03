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
		cnt[f[0] - 'a']++;
	}


	for (int i=0; i<26; i++) {
		if (cnt[i] >= 5) {
			result += (char) i + 'a';
		}
	}

	if (!result.size()) {
		result = "PREDAJA";
	}

	cout << result << '\n';

	return 0;
}