// Copyright (c) 2018 Kenji Iida  All rights reserved.
/*

    ArrayList�Ɋւ���W�����

    �f�W�J����\������DigitalCamera�N���X�ƁA�摜��\������
    Picture�N���X���쐬���Ă��������B

    �܂��A�f�W�J���N���X���g�p����ArrayListNormalPractice�N���X��
    main���\�b�h�͊������Ă��܂��B�i�ύX���Ȃ��ł��������j

    [Picture�N���X]
    �P�D��ʑ̂�\������C���X�^���X�t�B�[���htarget(String�^)���`���܂��B

    �Q�D��ʑ�(String�^)�������Ɏ󂯎��R���X�g���N�^���`���܂��B
        �����Ŏ󂯎�����l���A�C���X�^���X�t�B�[���h�Ɋi�[���Ă��������B

    �R�D�I�u�W�F�N�g�̐������𕶎���Ƃ��Ė߂����߂�toString���\�b�h��
        �I�[�o�[���C�h���Ă��������B�߂�l�Ƃ��ĕԂ��l�́u�����̉摜�v��
        ����������ł��B

    [DigitalCamera�N���X]
    �P�D�B�e�����摜���Ǘ�����ArrayList<Picture>�^�̃������C���X�^���X
        �t�B�[���hmemory���`���܂��B

    �Q�D�����Ȃ��R���X�g���N�^���`���܂��B���̒��ŁA�������C���X�^���X
        �t�B�[���h�̃I�u�W�F�N�g�𐶐����܂��B

    �R�D�摜�B�e���\�b�htakePicture���`���܂��B�����͔�ʑ́iString�^�j�ŁA
        �߂�l�͂���܂���B�u�������B�e���܂����v�Əo�͂�����Ƀ������I�u�W�F�N�g
        �ɉ摜�I�u�W�F�N�g��o�^���܂��B

    �S�D�摜�ꗗ�\�����\�b�hshowPictures���`���܂��B�����E�߂�l�͂Ȃ��ł��B
        �܂��u����  �摜�ꗗ  �����v�Əo�͂��A�g��for����p���ĉ摜�̏���
        ���ɏo�͂��܂��B

    �T�D�ۑ��摜���擾���\�b�hgetPictureCount���`���܂��B�����͂Ȃ��ŁA�߂�l
        �͕ۑ������iint�^�j�ł��B�������I�u�W�F�N�g�Ɋi�[����Ă���摜�I�u�W�F�N�g
        �̌���߂�l�Ƃ��ĕԂ��܂��B

    �U�D�摜�S�������\�b�hclearMemory���`���܂��B�����E�߂�l�͂Ȃ��ł��B
       �u���ׂẲ摜���������܂����v�Əo�͂��A�������I�u�W�F�N�g�Ɋi�[�����
        ���邷�ׂẲ摜�I�u�W�F�N�g���N���A���܂��B

    �y���s���ʁz
    �q�L���B�e���܂����B
    �����`���B�e���܂����B
    �J�v�`�[�m���B�e���܂����B
    �Ԃ������B�e���܂����B
    �c�[�V���b�g���B�e���܂����B

    ���݂̎B�e�����F5

    ����  �摜�ꗗ  ����
    �q�L�̉摜
    �����`�̉摜
    �J�v�`�[�m�̉摜
    �Ԃ����̉摜
    �c�[�V���b�g�̉摜

    ���ׂẲ摜���������܂���

    ���݂̎B�e�����F0

*/

public class ArrayListNormalPractice{

    public static void main(String[] args){

        // �f�W�J���I�u�W�F�N�g�̐錾�Ɛ���
        DigitalCamera myCamera = new DigitalCamera();

        // �f�W�J���ɂĎB�e
        myCamera.takePicture("�q�L");
        myCamera.takePicture("�����`");
        myCamera.takePicture("�J�v�`�[�m");
        myCamera.takePicture("�Ԃ����");
        myCamera.takePicture("�c�[�V���b�g");

        System.out.println();

        // �B�e�摜���̊m�F
        System.out.println("���݂̎B�e�����F" + myCamera.getPictureCount());

        System.out.println();

        // �摜�̉{��
        myCamera.showPictures();

        System.out.println();

        // �摜�t�@�C���̃N���A
        myCamera.clearMemory();

        System.out.println();

        // �B�e�摜���̍Ċm�F
        System.out.println("���݂̎B�e�����F" + myCamera.getPictureCount());

    }

}

// �����Ƀf�W�J���N���X���쐬���Ă�������

// �����ɉ摜�N���X���쐬���Ă�������

