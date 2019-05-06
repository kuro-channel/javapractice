// Copyright (c) 2018 Kenji Iida  All rights reserved.
/*

    �p���ƃC���^�t�F�[�X�̖��

    �~���[�W�V������\������Musician���ۃN���X��
    �������Ă��܂��B(�ύX���Ȃ��ł�������)

    �܂��A�̏��\��\������Singable�C���^�t�F�[�X�ƁA
    ���t�\��\������Playable�C���^�t�F�[�X����������
    ���܂��B(�ύX���Ȃ��ł�������)

    ����o���h���\�����邽�߂Ƀ{�[�J���X�gVocalist�N���X�A
    �M�^���X�gGuitarist�N���X�A�R�[���X���h���}�[ChorusDrummer
    �N���X���쐬���Ă��������B

    [Vocalist�N���X]
    �P�DMusician���ۃN���X���p�����ASingable�C���^�t�F�[�X���������܂��B

    �Q�D���O(String�^)���󂯎��R���X�g���N�^���`���܂��B�K�؂ɒl��
        �ێ����Ă��������B

    �R�D�̂�sing���\�b�h���������Ă��������B�u�����͔M�����܂����I�v��
        �o�͂��Ă��������B

    [Guitarist�N���X]
    �P�DMusician���ۃN���X���p�����APlayable�C���^�t�F�[�X���������܂��B

    �Q�D�M�^�[�̎�ނ�\��guitarType�C���X�^���X�t�B�[���h(String�^)�������܂��B

    �R�D�������ɖ��O(String�^)�A�������ɃM�^�[�̎��(String�^)���󂯎��
        �R���X�g���N�^���`���܂��B�K�؂ɒl��ێ����Ă��������B

    �S�D���tplay���\�b�h���������Ă��������B�u�����́��������t���܂����I�v
        �Əo�͂��Ă��������B

    [ChorusDrummer�N���X]
    �P�DMusician���ۃN���X���p�����ASingable�C���^�t�F�[�X��
        Playable�C���^�t�F�[�X���������܂��B

    �Q�D���O(String�^)���󂯎��R���X�g���N�^���`���܂��B�K�؂ɒl��
        �ێ����Ă��������B

    �R�D�̂�sing���\�b�h���������Ă��������B�u�����̓R�[���X�Ńn����܂����I�v
        �Əo�͂��Ă��������B

    �S�D���tplay���\�b�h���������Ă��������B�u�����̓h���������t���܂����I�v
        �Əo�͂��Ă��������B

    �܂��AInheritanceInterfacePractice�N���X��main���\�b�h�͈ꕔ�������ł��B
    �u�~���[�W�b�N�X�^�[�g�I�v�ȉ������̂悤�Ɏ������Ă��������B

    �P�Dfor���[�v�ő������܂��B
    �Q�D�̂����Ƃ��\�ł���Ή̂��܂��B
    �R�D���t���\�ł���Ή��t���܂��B

    �y���s���ʁz
    ����͔M�����܂����I
    �c���̓��[�h�M�^�[�����t���܂����I
    ����̓x�[�X�����t���܂����I
    ��؂̓R�[���X�Ńn����܂����I
    ��؂̓h���������t���܂����I

*/
public class InheritanceInterfacePractice{

    public static void main(String[] args){

        // �~���[�W�V�����z��̍쐬
        Musician[] band = {
                            new Vocalist("����"),
                            new Guitarist("�c��","���[�h�M�^�["),
                            new Guitarist("����","�x�[�X"),
                            new ChorusDrummer("���")
                           };

        // �~���[�W�b�N�X�^�[�g�I


    }

}

// �~���[�W�V�������ۃN���X
abstract class Musician{

    // ���O�t�B�[���h
    private String name;

    // �R���X�g���N�^
    public Musician(String name){
        this.name = name;
    }

    // ���O�擾���\�b�h
    public String getName(){
        return name;
    }

}

// �̏��\�C���^�t�F�[�X
interface Singable{
    void sing();
}

// ���t�\�C���^�t�F�[�X
interface Playable{
    void play();
}

// �����Ƀ{�[�J���X�g�N���X���쐬���Ă�������

// �����ɃM�^���X�g�N���X���쐬���Ă�������

// �����ɃR�[���X���h���}�[�N���X���쐬���Ă�������

