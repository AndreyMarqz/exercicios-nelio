package ExercicioPolimorfismo3.Entities;

public class PessoaFisica extends Pessoa {

    private Double gastosSaude;

    public PessoaFisica(String nome, Double rendaAnual, Double gastosSaude) {
        super(nome, rendaAnual);
        this.gastosSaude = gastosSaude;
    }

    public Double getGastosSaude() {
        return gastosSaude;
    }

    public void setGastosSaude(Double gastosSaude) {
        this.gastosSaude = gastosSaude;
    }

    @Override
    public Double calcularImposto() {
        if(super.getRendaAnual() < 20000.00) {
            if(gastosSaude > 0) {
                return getRendaAnual() * 0.15 - gastosSaude * 0.5;
            }

            return getRendaAnual() * 0.15;
        } else {
            if(gastosSaude > 0) {
                return getRendaAnual() * 0.25 - gastosSaude * 0.5;
            }

            return super.getRendaAnual() * 0.25;
        }
    }
}
