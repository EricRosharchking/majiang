import java.util.List;
import java.util.ArrayList;
import java.util.Collections;

public class Game {
	private Player player1;
	private Player player2;
	private Player player3;
	private Player player4;

	private ArrayList<Pai> paiChi;
	private int index;
	private int turn;

	public Game() {
		System.out.println("This is a new Game");
		turn = 0;
		paiChi = new ArrayList<Pai>();
		for (int i = 0; i < 4; i++) {
			for (int j = 0; j < 4; j++) {
				if (j < 3) {
					for (int k = 0; k < 9; k++) {
						paiChi.add(new Pai((char) (j + 97), k, i));
					}
				} else {
					for (int k = 0; k < 7; k++) {
						paiChi.add(new Pai((char) (j + 97), k, i));
					}
				}
			}
		}
		for (int i = 0; i < 4; i++)
			Collections.shuffle(paiChi);
	}

	public void setPosition() {
		player1.setPosition(1);
		player2.setPosition(2);
		player3.setPosition(3);
		player4.setPosition(4);
	}

	public void faPai() {
		int i = 0;
		for (; i < 13; i++) {
			player1.moPai(this.getPaiChi().get(4 * i + 0));
			player2.moPai(this.getPaiChi().get(4 * i + 1));
			player3.moPai(this.getPaiChi().get(4 * i + 2));
			player4.moPai(this.getPaiChi().get(4 * i + 3));
		}
		index = 4 * i;
	}

	public void setPlayers(Player player1, Player player2, Player player3, Player player4) {
		this.player1 = player1;
		this.player2 = player2;
		this.player3 = player3;
		this.player4 = player4;
	}

	public Player getPlayer(int i) {
		switch (i) {
		case 0:
			return player1;
		case 1:
			return player2;
		case 2:
			return player3;
		case 3:
			return player4;
		default:
			return null;
		}
	}

	public void playerMoPai() {
		this.getPlayer(turn % 4).moPai(this.moPai());
	}

	public Pai moPai() {
		return this.getPaiChi().get(index++);
	}

	public Pai daPai(int i) {
		return this.getPlayer(turn++ % 4).daPai(i);
	}

	public ArrayList<Pai> getPaiChi() {
		return this.paiChi;
	}

	public boolean checkWin(Player player) throws Exception {
		List<Pai> jiang = this.checkJiang(player.getPaiList());
		if (jiang == null || jiang.size() == 0) {
			return false;
		} else {
			System.out.print("Jiang:");
			MajiangUtil.print(jiang);
		}
		return false;
	}

	public boolean checkWin(Player player, Pai pai) {
		return false;
	}

	public List<Pai> checkJiang(ArrayList<Pai> paiList) throws Exception {
		List<Pai> resultList = null;
		List<Pai> wanList = new ArrayList<>();
		List<Pai> bingList = new ArrayList<>();
		List<Pai> tiaoList = new ArrayList<>();
		List<Pai> fengList = new ArrayList<>();
		for (Pai pai : paiList) {
			switch (pai.getHuaSe()) {
			case 'a':
				wanList.add(pai);
				break;
			case 'b':
				bingList.add(pai);
				break;
			case 'c':
				tiaoList.add(pai);
				break;
			case 'd':
				fengList.add(pai);
				break;
			default:
				throw new Exception("Error in Pai.huaSe");
			}
		}
		// System.out.println(wanList);
		// System.out.println(bingList);
		// System.out.println(tiaoList);
		// System.out.println(fengList);
		// System.out.println("*********************");
		// MajiangUtil.print(wanList);
		// MajiangUtil.print(bingList);
		// MajiangUtil.print(tiaoList);
		// MajiangUtil.print(fengList);
		
		List<Integer> sizeList = new ArrayList<>();
		sizeList.add(wanList.size() % 3);
		sizeList.add(bingList.size() % 3);
		sizeList.add(tiaoList.size() % 3);
		sizeList.add(fengList.size() % 3);
		if (sizeList.contains(1)) {
			return resultList;
		} else if (!sizeList.contains(0)) {
			return resultList;
		}
		switch (sizeList.indexOf(2)) {
		case 0:
			resultList = wanList;
			break;
		case 1:
			resultList = bingList;
			break;
		case 2:
			resultList = tiaoList;
			break;
		case 3:
			resultList = fengList;
			break;
		default:
			break;
		}
		return resultList;
	}

	public int getTurn() {
		return turn;
	}

	public void setTurn(int turn) {
		this.turn = turn;
	}

	public int getIndex() {
		return index;
	}
}