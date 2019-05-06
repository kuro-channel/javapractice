// Copyright (c) 2018 Kenji Iida  All rights reserved.
/*

    �I�[�o�[���C�h�Ɋւ����{���

    �ڊo�܂����v��\��AlarmClock�N���X���쐬���Ă��������B

    ���ʂ̎��v��\��Clock�N���X�͂��łɊ������Ă��܂��B
    �i�ύX���Ȃ��ł��������j

    �܂��AAlarmClock�N���X���g�p����OverrideBasicPractice�N���X
    ��main���\�b�h�͂��łɊ������Ă��܂��B�i�ύX���Ȃ��ł��������j

    [AlarmClock�N���X]
    �P�DClock�N���X���p�����܂��B

    �Q�D�X�[�p�[�N���X����󂯌p�����R�̃C���X�^���X�t�B�[���h
        (���E���E�b)�̂ق��ɁA�A���[������(���E��)��\��alarmHour��
        alarmMinute�C���X�^���X�t�B�[���h�iint�^�j���`���܂��B

    �R�D�T�̈����̒l���󂯎��R���X�g���N�^���`���܂��B
        ���̂������E���E�b�̂R�̒l�́A�X�[�p�[�N���X�̃R���X�g���N�^
        �𗘗p���ăC���X�^���X�t�B�[���h�Ɏ󂯓n���܂��B

    �S�D�X�[�p�[�N���X�ɂ���showData�C���X�^���X���\�b�h��K�؂ɃI�[�o�[���C�h
        ���܂��B�o�͓��e�́A���L���s���ʂ��Q�l�ɂ��Ă��������B

    �y���s���ʁz
    �������܂̎����F10��15��30�b

    �������܂̎����F15��45��20�b
    �A���[���ݒ莞���F6��30��

*/
public class OverrideBasicPractice{

    public static void main(String[] args){

        // ���ʂ̎��v�I�u�W�F�N�g�̐���
        Clock c1 = new Clock(10, 15, 30);

        // ���ʂ̎��v�̏��̕\��
        c1.showData();

        System.out.println();

        // �ڊo�܂����v�I�u�W�F�N�g�̐���
        AlarmClock c2 = new AlarmClock(15, 45, 20, 6, 30);

        // �ڊo�܂����v�̏��̕\��
        c2.showData();

    }

}

// ���v�N���X
class Clock{

    // �����b
    private int hour;
    private int minute;
    private int second;

    // �R���X�g���N�^
    public Clock(int hour, int minute, int second){

        this.hour = hour;
        this.minute = minute;
        this.second = second;

    }

    // ���\�����\�b�h
    public void showData(){
        System.out.println("�������܂̎����F" + hour + "��" + minute + "��" + second + "�b");
    }

}

// ������AlarmClock�N���X���쐬���Ă�������

