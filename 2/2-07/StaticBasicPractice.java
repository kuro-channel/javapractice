// Copyright (c) 2018 Kenji Iida  All rights reserved.
/*

    static�Ɋւ����{���

    ���{�b�g��\��Robot�N���X���쐬���Ă��������B
    Robot�N���X���g�p����StaticBasicPractice�N���X��
    main���\�b�h�͂��łɊ������Ă��܂��B�i�ύX���Ȃ��ł��������j

    [Robot�N���X]
    �P�D���̂悤�ȂQ�̃C���X�^���X�t�B�[���h�ƁA�P�̃N���X�t�B�[���h
        �������܂��B

      �E���{�b�gID��\���C���X�^���X�t�B�[���h id (int�^)

      �E���{�b�g����\���C���X�^���X�t�B�[���h name (String�^)

      �E���{�b�g�����Y����\���N���X�t�B�[���h total (int�^)

    �Q�DString�^�̈������ЂƂ������R���X�g���N�^���`���܂��B
        �����œn���Ă�������������{�b�g���ɐݒ肵�A���{�b�g�����Y����
        �C���N�������g���܂��B���{�b�gID��1����̘A�Ԃ�����U��܂����A
        ���{�b�g�����Y���̒l�����܂����p���Ă��������B

    �R�D���{�b�g�����Y���̒l���擾���邽�߂�getTotal�N���X���\�b�h
       �i�����Ȃ��E�߂�lint�^�j���`���܂��B

    �S�D���{�b�g�̏����Љ�邽�߂�introduce���\�b�h(�����Ȃ��E�߂�l�Ȃ�)
        ���`���܂��B�����͉��L���s���ʂ��Q�l�ɂ��Ă��������B

    �y���s���ʁz
    ���{�b�g�����Y���F0
    ���{�b�g�����Y���F5
    ���{�b�g�����Y���F6

    ID�F1 NAME�FRX
    ID�F2 NAME�FPZ
    ID�F3 NAME�FSS
    ID�F4 NAME�FFG
    ID�F5 NAME�FVC
    ID�F6 NAME�FSUPER-Z

*/
public class StaticBasicPractice{

    public static void main(String[] args){

        // ���{�b�g�����Y���̕\��
        System.out.println("���{�b�g�����Y���F" + Robot.getTotal());

        // �T�̂̃��{�b�g�I�u�W�F�N�g���쐬
        // �i�U�̖ڂ͕ۗ��j
        Robot[] robots = { 
                            new Robot("RX"),
                            new Robot("PZ"),
                            new Robot("SS"),
                            new Robot("FG"),
                            new Robot("VC"),
                            null
                          };

        // ���{�b�g�����Y���̕\��
        System.out.println("���{�b�g�����Y���F" + Robot.getTotal());

        // �U�̖ڂ̃��{�b�g�I�u�W�F�N�g���쐬
        robots[5] = new Robot("SUPER-Z");

        // ���{�b�g�����Y���̎擾
        System.out.println("���{�b�g�����Y���F" + Robot.getTotal());

        System.out.println();

        // �U�̂̃��{�b�g�̏���\��
        for(int i = 0 ; i < robots.length ; i++){
            robots[i].introduce();
        }

    }

}

// ������Robot�N���X���쐬���Ă�������

