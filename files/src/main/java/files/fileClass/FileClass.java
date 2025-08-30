package files.fileClass;

import java.io.File;

public class FileClass {

    public void execute() {

        // file = uma representação abstrata de um arquivo e/ou um diretorio de arquivo por nome


        File file = new File("teste_fileClass.txt"); // inclua a extenção do arquivo!!

        if (file.exists()) {
            System.out.println("That file exists");
            System.out.println(file.getPath()); //vai exibir o nome do arquivo
            System.out.println(file.getAbsolutePath()); //vai exibir não só o nome, mas o caminho do arquivo também
            System.out.println(file.isFile()); //vai retornar um boolean dependendo se for um arquivo ou não
            file.delete(); //vai apagar o arquivo do projeto
        }
        else {
            System.out.println("The file doesn't exists :)");
        }

    }

}