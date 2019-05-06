// Copyright (c) 2018 Kenji Iida  All rights reserved.
/*

    ���ۂƎQ�ƌ^�L���X�g�Ɋւ�����

    �A�X���[�g��\��Athlete���ۃN���X�͊������Ă��܂��B
    (�ύX���Ȃ��ł�������)

    ��̓I�ȃA�X���[�g��\�����j�I��Swimmer�N���X
    ����у}���\���I��MarathonRunner�N���X���쐬���Ă��������B

    [Swimmer�����MarathonRunner�N���X]
    �P�DAthlete���ۃN���X���p�����܂��B

    �Q�D��ږ���\��String�^�̒萔TYPE(public static final��
        �t�B�[���h����ʓI�ɒ萔�ƌ����܂�)���`���܂��B
        �l�͂��ꂼ��u���j�v����сu�}���\���v�ł��B

    �R�D�R���X�g���N�^�͑I�薼�iString�^�j�݂̂������������܂��B
        �I�薼�C���X�^���X�t�B�[���h�ɒl��ݒ肵�Ă��������B

    �S�D���ۃ��\�b�hgetType���������Ă��������B�߂�l�́A��ږ�
        �萔�̒l��Ԃ������ł����ł��B

    �T�D���ꂼ��̎�ڂɉ��������\�b�h���쐬���܂��BSwimmer�N���X��
        �j�����Ƃ�\��swim���\�b�h���AMarathonRunner�N���X�͑��邱��
        ��\��run���\�b�h���쐬���Ă��������B�ǂ���̃��\�b�h�������E�߂�l
        �Ȃ��ł��B�o�͓��e�͉��L���s���ʂ��Q�l�ɂ��Ă��������B

    �܂��AAbstractCastPractice�N���X��main���\�b�h�͈ꕔ�������ł��B

    �A�X���[�g�^�z���for���Ń��[�v���A���̔z��v�f�̎��ۂ̌^��Swimmer
    �N���X�ł���Ήj��swim���\�b�h���A���ۂ̌^��MarathonRunner�N���X��
    ����Α���run���\�b�h�����s���Ă��������B

    �y���s���ʁz
    ���̖��O�͖k������A���j�̑I��ł��B
    ���̖��O�͍������q�A�}���\���̑I��ł��B
    ���̖��O�͊�萳�q�A���j�̑I��ł��B
    ���̖��O�͖���݂����A�}���\���̑I��ł��B

    �k������͉j���܂����B
    �������q�͑���܂����B
    ��萳�q�͉j���܂����B
    ����݂����͑���܂����B

*/
public class AbstractCastPractice{

    public static void main(String[] args){

        // �A�X���[�g�z��I�u�W�F�N�g�̐���
        Athlete[] athlete = {
            new Swimmer("�k������"),
            new MarathonRunner("�������q"),
            new Swimmer("��萳�q"),
            new MarathonRunner("����݂���")
        };

        // ���ȏЉ�
        for(int i = 0 ; i < athlete.length ; i++){
            System.out.println(athlete[i]);
        }

        System.out.println();

        // ���������Ƃ��Ă�������
        // �A�X���[�g�̎�ڂɉ��������\�b�h�̎��s


    }

}

// Athlete���ۃN���X
abstract class Athlete{

    // �I�薼
    protected String name;

    // ��ږ��擾���\�b�h(���ۃ��\�b�h)
    public abstract String getType();

    @Override
    public String toString(){
        return "���̖��O��" + name + "�A" + 
                            getType() + "�̑I��ł��B";
    }

}

// ������Swimmer�N���X���쐬���Ă�������

// ������MarathonRunner�N���X���쐬���Ă�������

