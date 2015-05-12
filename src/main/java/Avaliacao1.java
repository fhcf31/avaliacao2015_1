/**
 * UTFPR - Universidade Tecnológica Federal do Paraná
 * DAINF - Departamento Acadêmico de Informática
 * IF62C - Fundamentos de Programação 2
 * 
 * Primeira avaliação parcial 2014/2.
 * @author 
 */
import utfpr.ct.dainf.if62c.avaliacao.Complexo;

public class Avaliacao1 {

    public static void main(String[] args) {
        // implementar main
        //raizes da equação primeira equação
        
        System.out.println();
        
        
    }
    
    // implementar raizesEquacao(Complexo, Complexo, Complexo)
    public static Complexo[] raizesEquacao(Complexo a,Complexo b,Complexo c){
        
        Complexo[] raizes = new Complexo[2];
        
        raizes[0] = b.prod(-1).soma(b.prod(b).sub(a.prod(4).prod(c)).sqrt()[0].div(a.prod(2)));
        raizes[1] = b.prod(-1).soma(b.prod(b).sub(a.prod(4).prod(c)).sqrt()[1].div(a.prod(2)));
        
        return raizes;
    }
    
}
