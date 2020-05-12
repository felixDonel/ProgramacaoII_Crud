/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package helper;

/**
 *
 * @author Feeco
 */
public class Validations {
    // Implementar
    // Precisa ser email válido
    
    public static Boolean isValidContrato(String contrato) {
        if (contrato.length() < 3) {
            return false;
        }
        return true;
    }

    // Implementar
    // Precisa ter no mínimo 3 letras
    public static boolean isValidName(String name) {
        if (name.length() < 3) {
            return false;
        }
        return true;
    }
    public static Boolean isCpf(String cpf) {
        /*Esta solução valida estes formatos: 00000000000, 00000000000000, 000.000.000-00, 00.000.000/0000-00 e 
        até 000000000-00 ou 00000000/0000-00, por exemplo. Os pontos e traços são opcionais em cada uma das posições.
        O que não é aceito, por exemplo: 000-000-000-00 (mas pode ser alterado conforme nota abaixo)*/
        
        String regex = "([0-9]{2}[\\.]?[0-9]{3}[\\.]?[0-9]{3}[\\/]?[0-9]{4}[-]?[0-9]{2})|([0-9]{3}[\\.]?[0-9]{3}[\\.]?[0-9]{3}[-]?[0-9]{2})";
        // email => estiver os padrões do regex => true / false
        return cpf.matches(regex);
    }
    public static Boolean isData(String data) {
        
        
        String regex = "^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]))\\1|(?:(?:29|30)(\\/|-|\\.)(?:0?[13-9]|1[0-2])\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)0?2\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9])|(?:1[0-2]))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$";
        // email => estiver os padrões do regex => true / false
        return data.matches(regex);
    }
    
}
