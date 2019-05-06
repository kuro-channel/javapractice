// Copyright (c) 2018 Kenji Iida  All rights reserved.
/*

    ���ۂɊւ���W�����

    AbstractNormalPractice�N���X��main���\�b�h��
    �������Ă��܂��B�i�ύX���Ȃ��ł��������j

    �T�b�J�[�I���\������SoccerPlayer���ۃN���X�����
    �Z���^�[�t�H���[�h��\������CenterForward�N���X��
    �S�[���L�[�p�[��\������GoalKeeper�N���X���쐬���Ă��������B

    [SoccerPlayer���ۃN���X]
    �P�D�I�薼��\��name�C���X�^���X�t�B�[���h�iString�^�j��
        �w�ԍ���\��uniformNumber�C���X�^���X�t�B�[���h�iint�^�j
        ���`���܂��B�A�N�Z�X�w���private�ɐݒ肵�܂��B

    �Q�D�����ɑI�薼�Ɣw�ԍ����󂯎��R���X�g���N�^���`���܂��B
        �����̒l�����̂܂܃C���X�^���X�t�B�[���h�Ɏ󂯓n���܂��B

    �R�D���O���O������擾�ł���悤��getName���\�b�h�i�����Ȃ��A�߂�lString�^�j
        ���`���܂��B

    �S�D�{�[�����R��kickBall���\�b�h���`���܂��B�u�����̓{�[�����R��܂����v
        �Əo�͂��܂��B

    �T�D�{�[�����󂯎~�߂�catchBall���\�b�h���`���܂��B�u�����̓{�[����
        ���Ŏ󂯎~�߂܂����v�Əo�͂��܂��B

    �U�D�|�W�V�������擾���ۃ��\�b�hgetPositionName��錾���܂��B
        �����͂Ȃ��ŁA�߂�l��String�^�ł��B

    �V�DtoString���\�b�h���I�[�o�[���C�h���܂��B
       �u�|�W�V������ ���O �w�ԍ������v�̏��ɕ������g�ݗ��Ă܂��B
       �i���L�̎��s���ʂ��Q�l�ɂ��Ă��������j

    [CenterForward�N���X]
    �P�DSoccerPlayer�N���X���p�����܂��B

    �Q�D�|�W�V��������\������String�^�̒萔POSITION_NAME���`���܂��B
        �l�́u�Z���^�[�t�H���[�h�v�Ƃ��܂��B

    �R�D�����ɑI�薼�Ɣw�ԍ����󂯎��R���X�g���N�^���`���܂��B
        SoccerPlayer�N���X�̃R���X�g���N�^�����܂��g���ăC���X�^���X
        �t�B�[���h�ɒl���󂯓n���܂��B

    �S�D�|�W�V�������擾���\�b�hgetPositionName���������܂��B�߂�l��
        �|�W�V�������萔�̒l��Ԃ��܂��B

    [GoalKeeper�N���X]
    �P�DCenterForward�N���X�̎菇�P�`�S�Ɠ����ł��B�|�W�V�������萔��
        �l�ɂ́u�S�[���L�[�p�[�v��ݒ肵�Ă��������B

    �Q�D�{�[�����󂯎~�߂�catchBall���\�b�h���I�[�o�[���C�h���܂��B
       �u�����̓{�[������Ŏ󂯎~�߂܂����v�Əo�͂��܂��B

    �y���s���ʁz
    �Z���^�[�t�H���[�h �c�� �w�ԍ�11
    �c���̓{�[�����R��܂���
    �c���̓{�[���𑫂Ŏ󂯎~�߂܂���

    �S�[���L�[�p�[ �쓇 �w�ԍ�12
    �쓇�̓{�[�����R��܂���
    �쓇�̓{�[������Ŏ󂯎~�߂܂���

*/
public class AbstractNormalPractice{

    public static void main(String[] args){

        // �Z���^�[�t�H���[�h�I�u�W�F�N�g�̐���
        SoccerPlayer fwd = new CenterForward("�c��", 11);

        // ���ȏЉ�
        System.out.println(fwd);

        // �{�[��������
        fwd.kickBall();
        fwd.catchBall();

        System.out.println();

        // �S�[���L�[�p�[�I�u�W�F�N�g�̐���
        SoccerPlayer keeper = new GoalKeeper("�쓇", 12);

        // ���ȏЉ�
        System.out.println(keeper);

        // �{�[��������
        keeper.kickBall();
        keeper.catchBall();

    }

}

// �����ɃT�b�J�[�I�蒊�ۃN���X���쐬���Ă�������

// �����ɃZ���^�[�t�H���[�h�N���X���쐬���Ă�������

// �����ɃS�[���L�[�p�[�N���X���쐬���Ă�������

