import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
/*

    ������Ɋւ���d�v�Ȗ��

    String�^�̕ϐ�inputPassword���錾���Ă���܂��B
    System.console().readLine()�̋L�q�́A�L�[�{�[�h���當����̓��͂�
    �󂯕t������̂ŁA���̒l�ŕϐ�inputPassword�����������Ă��܂��B

    StringImportantPractice�N���X�ɂ́A�������p�X���[�h��\������String�^��
    �萔PASSWORD����`���Ă���܂��B

    �L�[�{�[�h������͂����p�X���[�h�̒l���p�X���[�h�萔�̒l�Ɠ������ꍇ��
    �u�p�X���[�h����v���܂����v�ƕ\�����A�p�X���[�h�萔�̒l�Ɠ������Ȃ��ꍇ��
    �u�p�X���[�h����v���܂���v�ƕ\�����Ă��������B

    �y���s���ʁz
    �p�X���[�h����͂��Ă�������
    ABC
    �p�X���[�h����v���܂���

    �y���s���ʁz
    �p�X���[�h����͂��Ă�������
    XYZ
    �p�X���[�h����v���܂���

*/
public class StringImportantPractice{

    // �������p�X���[�h�萔
    private static final String PASSWORD = "XYZ";

    public static void main(String[] args) throws IOException{

        System.out.println("�p�X���[�h����͂��Ă�������");

        // ���̓p�X���[�h�ϐ��̐錾�Ə�����
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String inputPassword = br.readLine();

        // ��������p�X���[�h�̈�v�𒲂ׂĂ�������
        if(PASSWORD.equals(inputPassword)) {
        	System.out.println("�p�X���[�h����v���܂���");
        } else {
        	System.out.println("�p�X���[�h����v���܂���");
        }

    }

}
