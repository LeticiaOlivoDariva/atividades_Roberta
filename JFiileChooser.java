import javax.swing.JFileChooser;
import javax.swing.filechooser.FileSystemView;

public class JavaFileChooser {

    public static void main(String[] args) {

        JFileChooser javaSeletorDeArquivo = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());

        javaSeletorDeArquivo.setDialogTitle("Selecione um arquivo ou diretório: ");
        javaSeletorDeArquivo.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);

        int valorRetornado = javaSeletorDeArquivo.showSaveDialog(null);

        if (valorRetornado == JFileChooser.APPROVE_OPTION) {

            if (javaSeletorDeArquivo.getSelectedFile().isDirectory()) {
                System.out.println("O diretório selecionado foi: " + javaSeletorDeArquivo.getSelectedFile());
            } 

            if (javaSeletorDeArquivo.getSelectedFile().isFile()) {
                System.out.println("O arquivo selecionado foi: " + javaSeletorDeArquivo.getSelectedFile());
            }
            
        }
        
    }

}
