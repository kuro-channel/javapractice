// Copyright (c) 2018 Kenji Iida  All rights reserved.
/*

    �p���Ɋւ����{���

    �s�b�`���[��\��Pitcher�N���X���쐬���Ă��������B

    ��ʓI�Ȗ싅�I���\������BaseballPlayer�N���X��
    ���łɊ������Ă��܂��B�i�ύX���Ȃ��ł��������j

    �܂��APitcher�N���X���g�p����InheritanceBasicPractice�N���X��
    main���\�b�h�͂��łɊ������Ă��܂��B�i�ύX���Ȃ��ł��������j

    [Pitcher�N���X]
    �P�DBaseballPlayer�N���X���p�����܂��B

    �Q�D�X�[�p�[�N���X����󂯌p�����R�̃C���X�^���X�t�B�[���h��
        �ق��ɁA�h�䗦��\��era�C���X�^���X�t�B�[���h�idouble�^�j
        ���`���܂��B

    �R�D�����ɑI�薼�A�w�ԍ��A�ŗ��A�h�䗦�̂S�̒l���󂯎��
        �R���X�g���N�^���`���܂��B���̂����I�薼�A�w�ԍ��A�ŗ���
        �R�̒l�́A�X�[�p�[�N���X�̃C���X�^���X�t�B�[���h�Ɏ󂯓n���܂��B

    �S�D����̏����Љ��introduce�C���X�^���X���\�b�h���`���܂��B
        �o�͓��e�́A���L���s���ʂ��Q�l�ɂ��Ă��������B

    �y���s���ʁz
    �I�薼�F�R�c
    �w�ԍ��F99
    �ŗ��@�F0.09
    �h�䗦�F2.13

*/
public class InheritanceBasicPractice{

    public static void main(String[] args){

        // ����I�u�W�F�N�g�̐���
        Pitcher p = new Pitcher("�R�c", 99, 0.09, 2.13);

        // ����̏Љ�
        p.introduce();

    }

}

// �싅�I��N���X
class BaseballPlayer{

    // �I�薼
    protected String name;

    // �w�ԍ�
    protected int uniformNumber;

    // �ŗ�
    protected double battingAverage;

}

// ������Pitcher�N���X���쐬���Ă�������


