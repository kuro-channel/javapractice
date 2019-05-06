// Copyright (c) 2018 Kenji Iida  All rights reserved.
/*

    �X���b�h�Z�[�t�Ɋւ�����

    �T�l�̑�x�����P�̕�����ɓ����ɕ�����Ă����l�q���V�~�����[�g
    ���Ă��܂��B

    ��x����\������MultiMillionaire�N���X�ƁA�������\������
    CollectionBox�N���X���쐬���Ă��������B

    �܂��A�����̃N���X���g�p����ThreadSafePractice�N���X��
    main���\�b�h�͊������Ă��܂��B�i�ύX���Ȃ��ł��������j

    [MultiMillionaire�N���X]
    �P�DThread�N���X���p�����܂��B

    �Q�D������C���X�^���X�t�B�[���h���`���܂��B

    �R�D������I�u�W�F�N�g�������Ɏ󂯎��R���X�g���N�^���`���܂��B
        �����Ŏ󂯎�����I�u�W�F�N�g���A�C���X�^���X�t�B�[���h�Ɋi�[���Ă��������B

    �S�Drun���\�b�h���I�[�o�[���C�h���܂��Bfor����p����100���񃋁[�v�����܂��B
        for���̒��ł́A������ɑ΂���1�~�������܂��B
        �i1�~����~100���񃋁[�v�Ȃ̂ŁA100���~��t���邱�ƂɂȂ�܂��j

    [CollectionBox�N���X]
    �P�D������z��\���C���X�^���X�t�B�[���htotalAmount(int�^)���`���܂��B

    �Q�D������I�u�W�F�N�g�́A��΂ɂP�����������݂��Ȃ��悤�ɂ��Ă��������B

        �E�ʃN���X����C���X�^���X���ł��Ȃ��悤�ɃR���X�g���N�^���H�v���Ă��������B
        �E�N���X���\�b�hgetInstance��p���āA������I�u�W�F�N�g���擾���Ă��������B
        �ECollectionBox�^�̃N���X�t�B�[���h���`���āA���܂����p���Ă��������B

    �R�D��������t���邽�߂�contribute���\�b�h���`���Ă��������B
        �����͊�t������z�iint�^�j�ŁA�߂�l�͂Ȃ��ɂ��܂��B

        ���̃��\�b�h���X���b�h�Z�[�t�ɂ���悤�ɒ��ӂ��Ă��������B

    �S�D������z���擾���邽�߂�getTotalAmount���\�b�h���`���Ă��������B
        �����͂Ȃ��ŁA�߂�l�ɕ�����z�t�B�[���h�̒l��Ԃ��Ă��������B

        �������A�Ō�ɕ\�����������z�ɂ͐�΂ɂ��ꂪ�����Ȃ��悤�ɂ��Ă��������B

    �y���������s���ʁz
    ������z��5000000�~�ł��B

    �y�������Ȃ����s���ʁi�s��j�z
    ������z��3294875�~�ł��B

*/
public class ThreadSafePractice{

    public static void main(String[] args){

        // ������I�u�W�F�N�g�̎擾
        CollectionBox cb = CollectionBox.getInstance();

        // �U���̕���������Ȃ��悤�ɂ���i�R���p�C���G���[�j
        // CollectionBox imitation = new CollectionBox();

        // �T�l�̑�x���I�u�W�F�N�g�𐶐�
        MultiMillionaire mm1 = new MultiMillionaire(cb);
        MultiMillionaire mm2 = new MultiMillionaire(cb);
        MultiMillionaire mm3 = new MultiMillionaire(cb);
        MultiMillionaire mm4 = new MultiMillionaire(cb);
        MultiMillionaire mm5 = new MultiMillionaire(cb);

        // ����̊J�n
        mm1.start(); mm2.start(); mm3.start(); mm4.start(); mm5.start();

        // �S���̕�����I���܂ő҂�
        try{
            mm1.join(); mm2.join(); mm3.join(); mm4.join(); mm5.join(); 
        }
        catch(InterruptedException e){
            e.printStackTrace();
        }

        // ������z�̔��\
        System.out.println("������z��" + cb.getTotalAmount() + "�~�ł��B");

    }

}

// �����ɑ�x���N���X���쐬���Ă�������

// �����ɕ�����N���X���쐬���Ă�������

