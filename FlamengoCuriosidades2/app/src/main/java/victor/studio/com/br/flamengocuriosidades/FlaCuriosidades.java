package victor.studio.com.br.flamengocuriosidades;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


class FlaCuriosidades {

    private boolean aleatorio = false;
    private List<String> curiosidades;
    private List<Integer> repetir;
    private String curiosidadeVet[] =
            {"A primeira bandeira do Flamengo, criada em 1895, era listrada de azul e amarelo-ouro." +
                    " Como ela desbotava muito e os tecidos – importados – custavam caro, " +
                    "a diretoria resolveu substituí-la por preto e vermelho. " +
                    "A primeira camisa do time de futebol era " +
                    "toda quadriculada, parecia um tabuleiro de damas.","Em 1911, alguns sócios do Fluminense, " +
                    "liderados pelo estudante de Medicina Alberto Borgeth, " +
                    "abandonaram o clube para criar o departamento de futebol no Flamengo, " +
                    "então dedicado apenas ao remo. " +
                    "A princípio, os remadores foram contra. " +
                    "Mas a nova diretoria, que assumiu em 8 de novembro de 1911, aceitou estudar a proposta. " +
                    "Na noite de Natal, o Flamengo criou o seu Departamento de Esportes Terrestres.","Logo, os jogadores ganharam uma camisa listrada, como a dos remadores, " +
                    "mas com um friso branco entre o vermelho e o preto. " +
                    "O friso acabou sendo retirado pois a camisa era muito parecida com a bandeira alemã, " +
                    "na época da Primeira Guerra Mundial. Em 1979, diminuiu-se o número de listras – 5 no total, " +
                    "mais largas.","Em 2010, o Flamengo lançou um terceiro uniforme com listras azuis e amarelas, " +
                    "alusão às primeiras cores do time. " +
                    "A novidade dividiu opiniões.","Já a primeira camisa rubro-negra, a Papagaio de Vintém, " +
                    "virou uma pequena maldição na história recente do clube. Usando a “Papagaio de Vintém”, " +
                    "o Mengão fez nove jogos e não ganhou nenhum em 1995, ano do centenário. " +
                    "Foram quatro empates e cinco derrotas em uma temporada melancólica. " +
                    "Em 2015, tentando superar a maldição, a “Papagaio de Vintém” voltou. Na estreia, " +
                    "derrota por 1 x 0 para o rival Botafogo pelo Campeonato Carioca. " +
                    "Depois, em um jogo contra o Volta Redonda, o clube usou o uniforme no primeiro tempo " +
                    "e ficou no 1 x 1. Na etapa final, com a camisa tradicional, venceu por 2 x 1. " +
                    "A maldição só foi quebrada na vitória por 2 x 0 sobre o Bonsucesso.","O Flamengo tem um hino oficial, composto por um ex-goleiro do clube, " +
                    "o jornalista Paulo Magalhães, quando o clube completou 50 anos, em 1945. " +
                    "O hino de Lamartine Babo, no entanto, se tornou muito mais popular.",
            "O hino composto por Magalhães classifica o Flamengo como “campeão de terra e mar”. " +
                    "Isso porque o time foi campeão carioca de futebol em 1914 e de remo em 1916.","O nome Flamengo é uma alusão aos navegadores holandeses, que estiveram na praia de mesmo nome na zona sul carioca, na primeira metade do Século XVII. Em francês, esses povos eram chamados de flamandes, flamengos. Eles viviam na região de Flandres, que abrangia na época parte da França, da Holanda e da Bélgica. A equipe esportiva recebeu este nome por causa da localização de sua primeira sede. Criado em 1895, o Clube de Regatas do " +
                    "Flamengo foi inaugurado no casarão de Nestor de Barros, número 22, na Praia do Flamengo.","A primeira partida do Flamengo foi no dia 3 de maio de 1912, no campo do America, contra o time do Mangueira, formado por operários da fábrica de chapéus Mangueira. Massacrou por 16 x 2. O primeiro gol foi marcado por Gustavo de Carvalho, mais tarde presidente do clube. " +
                    "Em compensação, no primeiro Fla-Flu, disputado em 7 de julho de 1912, " +
                    "o Fluminense venceu por 3 x 2.","O Flamengo já fez três amistosos contra a Seleção Brasileira e não perdeu nenhum: " +
                    "foram duas vitórias e um empate.","O primeiro mascote do Flamengo foi o Marinheiro Popeye, " +
                    "aquele mesmo das histórias em quadrinhos.","O urubu só surgiu muitos anos depois. As torcidas rivais provocavam os flamenguistas os classificando como “urubus”. " +
                    "A torcida acabou adotando o apelido.",
            "Desde que o título Mundial passou a ser decidido em jogo único, apenas um time sul-americano derrotou um europeu por mais de dois gols de vantagem: " +
                    "foi o Flamengo de 1981, que fez 3 x 0 nó Liverpool, da Inglaterra.","Entre 1980 e 1987 o Flamengo sobrou como o maior time do Brasil: foram três títulos do Campeonato Brasileiro, além de uma Copa União " +
                    "(que até hoje o Fla tenta reconhecer como Campeonato Brasileiro), uma Libertadores e um Mundial.","Em 1995, no ano de seu centenário, o Flamengo montou “o melhor ataque do mundo” com Sávio, Romário e Edmundo. " +
                    "O desempenho frustrante do trio de craques virou piada e se tornou “o pior ataque do mundo”.","Na reta final daquela temporada, o técnico do Flamengo foi o jornalista Washington Rodrigues, o Apolinho. O comentarista conseguiu levar o time para a final da Supercopa da Libertadores, " +
                    "mas acabou derrotado pelo Independiente, da Argentina.","Entre 1999 e 2001 o Flamengo foi tricampeão carioca. Nas três finais o Mengão derrotou o rival Vasco, " +
                    "o que faria também nos Estaduais de 2004, 2011 e 2014, além da Copa do Brasil de 2006.","Uma marca do Flamengo é conquistar títulos com elencos muitas vezes desacreditados até mesmo pela própria torcida. Foi o que aconteceu por exemplo na Copa do Brasil em 2006 e em 2013, " +
                    "além do Brasileirão de 2009.",
                    "O hexa do Flamengo em 2009 marca a maior surpresa da história do Campeonato Brasileiro. O Mengão chegou a estar 11 pontos atrás do líder já no 2º turno, mas acabou levando o título com uma arrancada histórica. " +
                            "Com 67 pontos, aquele Flamengo foi o campeão de pontuação mais baixa na era dos pontos corridos.",
                    "O Flamengo tem também o mais vencedor time do basquete brasileiro: " +
                            "são seis títulos brasileiros, três sul-americanos e um mundial, além de 44 estaduais.","O hino mais famoso do time, que possui o verso “Uma Vez Flamengo, sempre Flamengo”, é apenas o “popular”. A canção oficial foi criada por Paulo Magalhães dez anos antes dessa. " +
                    "O refrão fala sobre: “Tua glória é lutar! Campeão de terra e mar!”.","Eternizado como um clube rubro-negro, as primeiras cores do Mengão foram o azul e o dourado. " +
                    "Por desbotarem com o sol e suor, foi decidido que as cores mudariam para o vermelho e preto.","O time estreou no futebol em 1912, após jogadores do Fluminense – " +
                    "que era um clube dedicado ao futebol – se revoltarem contra a diretoria e resolverem criar um time para o Rubro-Negro.","O primeiro uniforme do clube no futebol foi composto por quatro quadrados, dois vermelhos e dois pretos, como uma pipa. " +
                    "A vestimenta foi apelidada de “Papagaio de Vintém”.","O uniforme listrado em vermelho e preto, característico da equipe, " +
                    "apareceu pela primeira vez em 1916.",
                    "Ao todo, o Flamengo já usou oito escudos diferentes.","No Brasil, muitos clubes tiveram sua criação inspirada no clube carioca, como o Flamengo do Piauí, Associação Atlética Flamengo (Guarulhos-SP), Esporte Clube Flamengo (Santa Catarina), Flamengo Futebol Clube (Conselheiro Lafaiate-MG), Associação Atlética Flamengo de Varginha, " +
                    "Flamengo Esporte Clube de Arcoverde (Pernambuco).","O Mengão não inspirou apenas clubes brasileiros. No mundo todo há referências ao time do Rio de Janeiro. Alguns são: Bromley Flamengo FC e Flamengo FC (Inglaterra), Flamengo de Sucre (Bolívia), Flamengo de Chiclayo (Peru), Sociedad Deportiva Flamengo (Equador), Uniao Flamengo Santos FC (Botswana), " +
                    "Flamengo de Ngagara (Burundi) e Flamengo de Pefine (Guiné-Bissau).","O estádio da Rua Paissandu foi o primeiro a receber um jogo oficial do Mengo.","O Flamengo já teve nove técnicos estrangeiros. São eles: Armando Renganeschi (Argentina), Charles Willians (Inglaterra), Izidor Krüschener (Hungria), Fleitas Solich e Modesto Bria (Paraguai), " +
                    "Ernesto Santos e Cândido de Oliveira (Portugal) e Juan Carlos Bertoni e Ramón Platero (Uruguai).","O clube conseguiu o direito do terreno da Gávea em 1931. O estádio local já recebeu 230 jogos. " +
                    "Foram 175 vitórias do mandante, 23 empates e 32 derrotas.",
                    "O primeiro jogo do Rubro-Negro no " +
                            "Maracanã foi em 23 de julho de 1950, na vitória de 3 a 1 contra o Bangu.","A equipe enfrentou a seleção brasileira por três vezes. No primeiro, em 1957, foi disputado apenas um tempo entre ambos. O confronto ficou no 0 a 0. Na segunda oportunidade, em 1958, o Mengo venceu por 1 a 0, no Maracanã. " +
                    "O último encontro foi em 1976, com vitória do clube carioca por 2 a 0.","O primeiro mascote da equipe foi o Popeye, famoso nos desenhos animados. O Urubu surgiu de uma provocação feita por rivais. " +
                    "Os torcedores “adotaram” o mascote em 1969.","Em 1963, um clássico Fla-Flu se tornou o jogo entre clubes com maior público da história do futebol. Foram 194.603 presentes no Maracanã. O jogo foi 0 a 0. " +
                    "Com o empate, o Rubro-Negro ganhou o título carioca daquele ano."};

    public FlaCuriosidades(){
        repetir = new ArrayList<>();

    }

    public void setAleatorio(boolean aleatorio){
        this.aleatorio = aleatorio;
    }

    public boolean getAleatorio(){
        return this.aleatorio;
    }

    public String sortearCuriosidades(){
        curiosidades = new ArrayList<>();

        curiosidades.addAll(Arrays.asList(curiosidadeVet));

        int sorteio = (int) (Math.random() * 34);

        if(!repetir.isEmpty()){
            for (int i = 0; i < repetir.size(); i++){
                if ((int) repetir.get(i) == sorteio){
                    sorteio = (int) (Math.random() * 34);

                    repetir.add(i,sorteio);
                }
            }
        }else{
            repetir.add(0,sorteio);
        }

        return curiosidades.get(sorteio);


    }

}
