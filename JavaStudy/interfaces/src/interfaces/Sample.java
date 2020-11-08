package interfaces;

public class Sample implements SampleInterfaces{
	private String name;
	private String date;
	public Sample(String n, String yyyyMM) {
	name = n;
	date = yyyyMM;
	}
	 /*
	 * 司令（インターフェース）が増えた際にOverrideした各メソッドそれぞれを修正することになると、
	 * 修正箇所を探すことは大変だし、賢くない書き方になるので一箇所にまとめましょう！
	 * 以下はOverrideしたメソッドの処理を実行する際に、フラグを立てて該当す処理をさせるメソッドの例
	 */
	  // 司令をこなす！
	private void submitOrder(final int shoriFlg) {
		String nameAnd = name + "、";
		if (shoriFlg ==0) {
			System.out.println(nameAnd +date+"勤務表出しました");
		}else if (shoriFlg ==1) {
			System.out.println(nameAnd +date+ "の交通費もだしました");
		}
		else {
			System.out.println(nameAnd +"本当はまだ何も出していません");
		}
	}
	public void doNothing() {
		submitOrder(-1);
	}
	@Override
	public void daseyaKinmuhyo() {
		// TODO 自動生成されたメソッド・スタブ
		submitOrder(0);
	}

	@Override
	public void daseyaKotsuhi() {
		// TODO 自動生成されたメソッド・スタブ
		submitOrder(1);
	}

	@Override
	public void goToSevenEleven() {
		// TODO 自動生成されたメソッド・スタブ
	System.out.println("先にセブンイレブン行ってきます");
	}

}
