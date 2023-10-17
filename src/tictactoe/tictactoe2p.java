package tictactoe;

import java.util.Scanner;

public class tictactoe2p {

	public static void main(String[] args) {
		Scanner teclado = new Scanner(System.in);
		int p1 = 0, p2 = 0, vitoria = 0;
		String vitoria1 = "Jogador 1 venceu!", vitoria2 = "Jogador 2 venceu!", vitoria3 = "Empate";
		String A1 = "_", A2 = "_", A3 = "_", B1 = "_", B2 = "_", B3 = "_", C1 = "_", C2 = "_", C3 = "_";
		String A1P = A1, A2P = A2, A3P = A3, B1P = B1, B2P = B2, B3P = B3, C1P = C1, C2P = C2, C3P = C3;
		String tabuleiro = null;

		while (vitoria == 0) {
			while (A1P == A1 && A2P == A2 && A3P == A3 && B1P == B1 && B2P == B2 && B3P == B3 && C1P == C1 && C2P == C2
					&& C3P == C3) {
				tabuleiro = (A1 + "|" + A2 + "|" + A3 + "\n" + B1 + "|" + B2 + "|" + B3 + "\n" + C1 + "|" + C2 + "|"
						+ C3);
				System.out.println(tabuleiro);
				System.out.print("Faça a sua jogada, jogador 1:");
				p1 = teclado.nextInt();
				if (p1 == 1 && A1 == "_") {
					A1 = "X";
				} else {
					if (p1 == 2 && A2 == "_") {
						A2 = "X";
					} else {
						if (p1 == 3 && A3 == "_") {
							A3 = "X";
						} else {
							if (p1 == 4 && B1 == "_") {
								B1 = "X";
							} else {
								if (p1 == 5 && B2 == "_") {
									B2 = "X";
								} else {
									if (p1 == 6 && B3 == "_") {
										B3 = "X";
									} else {
										if (p1 == 7 && C1 == "_") {
											C1 = "X";
										} else {
											if (p1 == 8 && C2 == "_") {
												C2 = "X";
											} else {
												if (p1 == 9 && C3 == "_") {
													C3 = "X";
												} else {
													System.out.println(
															"O movimento inserido não é válido. Jogue novamente.");
												}
											}
										}
									}
								}
							}
						}
					}
				}
			}
			if ((A1 == "X" || A1 == "O") && (A2 == "X" || A2 == "O") && (A3 == "X" || A3 == "O")
					&& (B1 == "X" || B1 == "O") && (B2 == "X" || B2 == "O") && (B3 == "X" || B3 == "O")
					&& (C1 == "X" || C1 == "O") && (C2 == "X" || C2 == "O") && (C3 == "X" || C3 == "O")) {
				C3 = C3 + "\nFim de jogo";
				vitoria = 3;
			} else {
				A1P = A1;
				A2P = A2;
				A3P = A3;
				B1P = B1;
				B2P = B2;
				B3P = B3;
				C1P = C1;
				C2P = C2;
				C3P = C3;
				if ((A1 == "X" && A2 == "X" && A3 == "X") || (B1 == "X" && B2 == "X" && B3 == "X")
						|| (C1 == "X" && C2 == "X" && C3 == "X") || (A1 == "X" && B1 == "X" && C1 == "X")
						|| (A2 == "X" && B2 == "X" && C2 == "X") || (A3 == "X" && B3 == "X" && C3 == "X")
						|| (A1 == "X" && B2 == "X" && C3 == "X") || (A3 == "X" && B2 == "X" && C1 == "X")) {
					vitoria = 1;
				} else {
					while (A1P == A1 && A2P == A2 && A3P == A3 && B1P == B1 && B2P == B2 && B3P == B3 && C1P == C1
							&& C2P == C2 && C3P == C3) {
						tabuleiro = (A1 + "|" + A2 + "|" + A3 + "\n" + B1 + "|" + B2 + "|" + B3 + "\n" + C1 + "|" + C2
								+ "|" + C3);
						System.out.println(tabuleiro);
						System.out.print("Faça a sua jogada, jogador 2:");
						p2 = teclado.nextInt();
						if (p2 == 1 && A1 == "_") {
							A1 = "O";
						} else {
							if (p2 == 2 && A2 == "_") {
								A2 = "O";
							} else {
								if (p2 == 3 && A3 == "_") {
									A3 = "O";
								} else {
									if (p2 == 4 && B1 == "_") {
										B1 = "O";
									} else {
										if (p2 == 5 && B2 == "_") {
											B2 = "O";
										} else {
											if (p2 == 6 && B3 == "_") {
												B3 = "O";
											} else {
												if (p2 == 7 && C1 == "_") {
													C1 = "O";
												} else {
													if (p2 == 8 && C2 == "_") {
														C2 = "O";
													} else {
														if (p2 == 9 && C3 == "_") {
															C3 = "O";
														} else {
															if ((A1 == "X" || A1 == "O") && (A2 == "X" || A2 == "O")
																	&& (A3 == "X" || A3 == "O")
																	&& (B1 == "X" || B1 == "O")
																	&& (B2 == "X" || B2 == "O")
																	&& (B3 == "X" || B3 == "O")
																	&& (C1 == "X" || C1 == "O")
																	&& (C2 == "X" || C2 == "O")
																	&& (C3 == "X" || C3 == "O")) {
																C3 = C3 + "\nFim de jogo";
																vitoria = 3;
															}
															System.out.println(
																	"O movimento inserido não é válido. Jogue novamente.");
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
					A1P = A1;
					A2P = A2;
					A3P = A3;
					B1P = B1;
					B2P = B2;
					B3P = B3;
					C1P = C1;
					C2P = C2;
					C3P = C3;
					if ((A1 == "O" && A2 == "O" && A3 == "O") || (B1 == "O" && B2 == "O" && B3 == "O")
							|| (C1 == "O" && C2 == "O" && C3 == "O") || (A1 == "O" && B1 == "O" && C1 == "O")
							|| (A2 == "O" && B2 == "O" && C2 == "O") || (A3 == "O" && B3 == "O" && C3 == "O")
							|| (A1 == "O" && B2 == "O" && C3 == "O") || (A3 == "O" && B2 == "O" && C1 == "O")) {
						vitoria = 2;
					} else {
						if ((A1 == "X" || A1 == "O") && (A2 == "X" || A2 == "O") && (A3 == "X" || A3 == "O")
								&& (B1 == "X" || B1 == "O") && (B2 == "X" || B2 == "O") && (B3 == "X" || B3 == "O")
								&& (C1 == "X" || C1 == "O") && (C2 == "X" || C2 == "O") && (C3 == "X" || C3 == "O")) {
							vitoria = 3;
						}
					}
				}
			}
		}
		tabuleiro = (A1 + "|" + A2 + "|" + A3 + "\n" + B1 + "|" + B2 + "|" + B3 + "\n" + C1 + "|" + C2 + "|" + C3);
		System.out.println(tabuleiro);
		if (vitoria == 1) {
			System.out.println(vitoria1);
		}
		if (vitoria == 2) {
			System.out.println(vitoria2);
		}
		if (vitoria == 3) {
			System.out.println(vitoria3);
		}
	}
}
