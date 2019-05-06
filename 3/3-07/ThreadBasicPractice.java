// Copyright (c) 2018 Kenji Iida  All rights reserved.
/*

    �X���b�h�Ɋւ����{���

    �X���b�h�ɂ�鑖�s��\������RacingCar�N���X���쐬���Ă��������B

    RacingCar�N���X���g�p����ThreadBasicPractice�N���X��main���\�b�h
    �͊������Ă��܂��B�i�ύX���Ȃ��ł��������j

    [RacingCar�N���X]
    �P�DThread�N���X���p�����܂��B

    �Q�D�S�[���n�_�܂ł̋�����\��int�^�̒萔GOAL���`���܂��B
        �萔GOAL�̒l��100�������ď��������Ă��������B

    �R�DRacingCar�N���X�͎��̂R�̃C���X�^���X�t�B�[���h�������܂��B

        �Ԃ̖��O��\��name(String�^)
        ���̎Ԃ̍ō����s������\��maxDistance(int�^)
        ���̎Ԃ̃G���X�g���銄����\��engineStop(int�^)

    �S�D���̈��������R���X�g���N�^���P�쐬���Ă��������B
        ��P���� �Ԃ̖��O��\��String�^�̈���
        ��Q���� �ō����s������\��int�^�̈���
        ��R���� �G���X�g���銄����\��int�^�̈���

    �T�Drun���\�b�h���I�[�o�[���C�h���܂��B�Q�̃��[�J���ϐ���錾���܂��B

        �����s������\��int�^ totalMileage
        ���̑��s������\��int�^ mileage

    �U�D�����_���̕��͋C���o�����߂ɁAjava.util�p�b�P�[�W��Random�N���X��
        �g�p���܂��B

        [Random�N���X�̎g����]
        Random r = new Random();
        System.out.println(r.nextInt(6) + 1);
        �����1�`6��\�����邳������̏o���オ��ł��B

    �V�Drun���\�b�h�ł́A�S�[������܂ő��s���܂��B
        �܂��A�G���X�g���邩�ǂ�����Random�N���X���g���ĕ\�����܂��B
        engineStop�̒l��10�Ȃ�A10���1��̊����ŃG���X�g���܂��B
        �G���X�g�����ꍇ�́u�������G���X�g���܂����I�v�ƕ\�����A
        3�b�Ԓ�~���܂��B
        �G���X�g���Ȃ������ꍇ�͑��s���܂��B
        ���s�����́A1����ō����s����maxDistance�̊Ԃ̃����_���Ȓl�ł��B
        �����āu����������km���s���܂����I�v�ƕ\�����܂��B
        �����s������GOAL�萔�𒴂��Ă���΃��[�v�𔲂���
        �u�������S�[�����܂����I�I�I�I�I�v�ƕ\�����ďI�����܂��B
        �܂������s������GOAL�萔�ɒB���Ă��Ȃ����1�b��~���đ��s��
        �����܂��B

    �y���s���ʂ̈��z
    Careful����3km���s���܂����I
    Normal�����G���X�g���܂����I
    Normal����3km���s���܂����I
    �c
    Careful����2km���s���܂����I
    Gambler����15km���s���܂����I
    Gambler�����S�[�����܂����I�I�I�I�I
    Careful����4km���s���܂����I
    Normal����8km���s���܂����I
    Careful����1km���s���܂����I
    Careful����4km���s���܂����I
    Careful�����S�[�����܂����I�I�I�I�I
    Normal����8km���s���܂����I
    Normal�����S�[�����܂����I�I�I�I�I
    ���[�X���I�����܂���

*/
public class ThreadBasicPractice{

    public static void main(String[] args){

        // ���ϓI�Ȑ��\��normal��
        RacingCar normal = new RacingCar("Normal��", 10, 10);

        // �X�s�[�h�͂��邪�G���X�g������gambler��
        RacingCar gambler = new RacingCar("Gambler��", 20, 3);

        // ���S�ʂ��d������careful��
        RacingCar careful = new RacingCar("Careful��", 5, 1000);

        // �e�Ԉ�ĂɃX�^�[�g�I�I
        normal.start();
        gambler.start();
        careful.start();

        // �S�Ԃ��S�[������̂�҂�
        try{

            normal.join();
            gambler.join();
            careful.join();

        }
        catch(InterruptedException e){
            e.printStackTrace();
        }

        System.out.println("���[�X���I�����܂���");

    }

}

// ������RacingCar�N���X���쐬���Ă�������

