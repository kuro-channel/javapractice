// Copyright (c) 2018 Kenji Iida  All rights reserved.
/*

    �Ǝ���O�̖��

    �����Ԃ�\��Car�N���X�ƁA�K�X����\��GasolineException
    ��O�N���X���쐬���Ă��������B

    �܂��ACar�N���X���g�p����OriginalExceptionPractice�N���X��
    main���\�b�h�͂��łɊ������Ă��܂��B�i�ύX���Ȃ��ł��������j

    [ GasolineException��O�N���X ]
    �P�D���̃N���X�͌�����O�Ȃ̂ŁAException�N���X���p�����܂��B

    �Q�DString�^�̈������P���R���X�g���N�^���`���܂��B
        �X�[�p�[�N���X�ł���Exception�N���X�ɂ������V�O�l�`����
        �R���X�g���N�^�����݂���̂ŁA�����Ŏ󂯎�����f�[�^��
        �X�[�p�[�N���X�̃R���X�g���N�^�ɓn���܂��B

    [ Car�N���X ]
    �P�DCar�N���X�ɂ͂R�̃C���X�^���X�t�B�[���h������܂��B

      �E�i���o�[��\��number�C���X�^���X�t�B�[���h�iint�^�j
      �E�Ԏ��\��type�C���X�^���X�t�B�[���h�iString�^�j
      �E�K�\�����ʂ�\��gas�C���X�^���X�t�B�[���h�idouble�^�j

    �Q�D�������R�󂯎��R���X�g���N�^���`���܂��B
        ���̎󂯎�����R�̒l�́A���̂܂܂R�̃C���X�^���X�t�B�[���h
        �ɓn���܂��B(main���\�b�h�̋L�q���Q�l�ɂ��Ă�������)

    �R�D�Ԃ̑��s��\��run�C���X�^���X���\�b�h�i�����E�߂�l�Ȃ��j��
        ��`���܂��Brun���\�b�h�̓K�X����\������GasolineException��O
        ���X���[����\��������̂ŁAthrows�L�[���[�h��p���Ďw�肵�Ă��������B
        ���\�b�h�̍ŏ��̏����Ƃ��āA�K�\�����ʂ��`�F�b�N���܂��B
        �K�\�����ʂ�0.1���b�g�������̏ꍇ�́A�K�X����O�N���X���C���X�^���X�����A
        �X���[���܂��B�C���X�^���X������Ƃ��A�G���[���b�Z�[�W���R���X�g���N�^��
        �����Ƃ��ēn���܂��B�i�G���[���b�Z�[�W�͉��L���s���ʂ��Q�l�j
        �K�\�����ʂ�0.1���b�g���ȏ�̏ꍇ�͑��s���b�Z�[�W��\�����A�K�\�����ʂ�
        0.1���b�g�������炵�܂��B�i���s���b�Z�[�W�͉��L���s���ʂ��Q�l�j

    �y���s���ʁz
    �i���o�[123�̃��~�I�͑��s���Ă��܂��B
    �i���o�[123�̃��~�I�͑��s���Ă��܂��B
    �i���o�[123�̃��~�I�͑��s���Ă��܂��B
    �i���o�[123�̃��~�I�͑��s���Ă��܂��B
    �i���o�[123�̃��~�I�͑��s���Ă��܂��B
    �i���o�[123�̃��~�I�͑��s���Ă��܂��B
    �i���o�[123�̃��~�I�͑��s���Ă��܂��B
    �i���o�[123�̃��~�I�͑��s���Ă��܂��B
    �i���o�[123�̃��~�I�̓K�\�����s���̂��ߑ��s�ł��܂���B

*/
public class OriginalExceptionPractice{

    public static void main(String[] args){

        // �����ԃI�u�W�F�N�g�̐���
        Car mycar = new Car(123, "���~�I", 0.8);

        // �K�\�������Ȃ��Ȃ�܂ő��s����
        try{
            while(true){
                // ���s����
                mycar.run();
            }
        }
        catch(GasolineException e){
            System.out.println(e.getMessage());
        }

    }

}

// �����ɎԃN���X���쐬���Ă�������

// �����ɃK�X����O�N���X���쐬���Ă�������

