package linguagem.particulas;

import java.awt.Graphics;
import java.awt.Image;
import java.awt.Point;
import java.awt.Rectangle;

import javax.imageio.ImageIO;

public class CSprite {
	/** atributos da classe sprite */
	int posX;
	int posY;
	int velX, velY;
	int alturaImagem, larguraImagem, alturaQuadro, larguraQuadro, 
	quadroInicial, quadroFinal, quadroAtual;
	boolean bEspelhado;
	Image vrImage = null;
	boolean bVisible = true;
	
	/** Construtor da classe que recebe o nome da imagem que será a propria imagem*/ 
 	
	public CSprite(String nomeImagem, int pLarguraImagem, 
			int pAlturaImagem, int pLarguraQuadro,
			int pAlturaQuadro, int pQuadroInicial,
			int pQuadroFinal){
		alturaImagem = pAlturaImagem;
		larguraImagem = pLarguraImagem;
		alturaQuadro = pAlturaQuadro;
		larguraQuadro = pLarguraQuadro;
		quadroInicial = pQuadroInicial;
		quadroFinal = pQuadroFinal;
		quadroAtual = quadroInicial;
		this.bEspelhado = false;
		
		try{
			vrImage = ImageIO.read(getClass().getResource(nomeImagem));
		}catch(Exception e){
			
		}
		
	}  
	
	
	/** Metodo para desenho da classe */
	public void desenha(Graphics g){
		/** Verifica se o Sprite está visible ou nao*/
		if(bVisible) {
		//g.drawImage(vrImage, posX, posY, null);
		//g.drawImage(vrImage, 200, 200, 200+largura, 200+altura, 0, 0, largura , altura, null);
			//g.drawImage(vrImage, 200, 200, 200+largura, 200+altura, 75, 0, largura+largura , altura, null);
			//g.drawImage(vrImage, 200, 200, 200+largura, 200+altura, largura+largura, 0, 75 , altura, null);
			//g.drawImage(vrImage, 200, 200, 200+largura*2, 200+altura*2, largura+largura, 0, 75 , altura, null);
			//g.drawImage(vrImage, 200, 200, 200+larguraImagem, 200+alturaImagem, larguraImagem+larguraImagem, 0, 75 , alturaImagem, null);
			int totalColunas = larguraImagem / larguraQuadro;
			int x1 = larguraQuadro * (quadroAtual % totalColunas);
			int y1 = alturaQuadro * (quadroAtual / totalColunas);
			g.drawImage(vrImage, posX, posY, posX+larguraQuadro, posY+alturaQuadro, x1, y1, x1+larguraQuadro, y1+alturaQuadro, null);
			//g.drawImage(vrImage, 200, 200, (200+75), (200+90), 75, 0, (75+75), 90, null);
			
		
	 }
	}
	Rectangle getArea(){
		return new Rectangle(posX, posY, vrImage.getWidth(null), vrImage.getHeight(null));
	}
	/** Metodos para colisao*/
	public boolean colidePonto(int x, int y){
		return getArea().contains(new Point(x,y));
		
	}
	/** pega a area e  */
	public boolean colideSprite(CSprite pSprite){
		return getArea().intersects(pSprite.getArea());
	}
	
	
	public void atualizaAnimacao(){
		if(quadroInicial == quadroFinal){
			quadroAtual = quadroInicial;
			return;
		}
		if(quadroAtual < quadroFinal){
			quadroAtual++;
		} else{
			quadroAtual = quadroInicial;
		}
		
	}
	
	
	
	
}
