#include <iostream>
#include <map>
using namespace std;

int n, m;
string name, quest;
map<int, string> mp1;
map<string, int> mp2;
int main() {
	ios_base::sync_with_stdio(false);
	cin.tie(NULL); cout.tie(NULL);
	cin >> n >> m;
	for (int i=1; i<=n; i++) {
		cin >> name;
		mp1[i] = name;
		mp2[name] = i;
	}

	for (int i=0; i<m; i++) {
		cin >> quest;
		if (atoi(quest.c_str())) {
			cout << mp1[atoi(quest.c_str())] << '\n';
		} else {
			cout << mp2[quest] << '\n';
		}
	}
	return 0;
}