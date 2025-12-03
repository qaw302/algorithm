#include <iostream>
#include <algorithm>

using namespace std;

string s, t;
int result;

int main() {
	cin >> s;
	t = s;
	reverse(t.begin(), t.end());

	if (s==t) {
		result = 1;
	}

	cout << result << '\n';

	return 0;
}