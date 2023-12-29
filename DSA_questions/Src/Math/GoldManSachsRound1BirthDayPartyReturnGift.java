//https://leetcode.com/discuss/interview-question/625140/goldman-sachs-oa-2020-array-burst-problem-birthday-party
package MathProblems;

public class GoldManSachsRound1BirthDayPartyReturnGift {
	public static void main(String[] args) {
		int N = 10;
		int T = 10;
		int D = 1;

		System.out.println(childrenWhoReceivesDamagedGift(N, T, D));
	}

	private static int childrenWhoReceivesDamagedGift(int N, int T, int D) {

		return T % N + D - 1;

	}

}
