// Copyright (c) 2018 Kenji Iida  All rights reserved.
/*

    �����㋉���

    �z�e����\������Hotel�N���X���쐬���Ă��������B
    ���̃z�e���ɋΖ�����Staff�N���X�ƁA���̃z�e����
    ���p����Customer�N���X���쐬���Ă��������B

    �܂��A�l��\������Person���ۃN���X�ƁA�J���\��
    �\������Workable�C���^�t�F�[�X�A�������s����\������
    ShortFallException��O�N���X�͊������Ă��܂��B
    �i�ύX���Ȃ��ł��������j

    �����̃N���X���g�p����TotalHiLevelPractice�N���X��
    main���\�b�h���������Ă��܂��B�i�ύX���Ȃ��ł��������j

    [Hotel�N���X]
    �P�D���̂S�̃C���X�^���X�t�B�[���h�������܂��B

        �z�e����    name(String�^)
        ���v        profits(long�^)
        �]�ƈ�����  staffs(ArrayList<Staff>�^)
        ���q�l����  customers(ArrayList<Customer>�^)

    �Q�D�����̃����N��\������l�X�gRoomRank�񋓌^���`���܂��B
        �i�ڍׂ͌�ɐ������܂��j

    �R�D�R���X�g���N�^�������܂��B�����̓z�e�����Ȃ̂ŁA�t�B�[���h�ɓn���܂��B
        �u�������I�[�v�����܂����v�Əo�͂��܂��B���̂��ƁA�]�ƈ�������
        ���q�l������\������ArrayList�I�u�W�F�N�g���C���X�^���X�����܂��B

    �S�D�z�e���ɓ���enter���\�b�h���I�[�o�[���[�h���ĂQ��`���܂��B

        �������]�ƈ��̏ꍇ�́A�o�΂ł��B�u�����������ɏo�΂��܂����v��
        �o�͂��A�]�ƈ�����ArrayList�I�u�W�F�N�g�ɒǉ����܂��B

        ���������q�l�ƕ��������N�̏ꍇ�́A�h����]�ł��B
        ���������N�񋓌^�͉��i���擾����getPrice���\�b�h�i�߂�lint�^�j
        �������Ă���̂ŁA���̒l�����q�l�������Ă���pay���\�b�h�̈�����
        �n���A�������x�����Ă��炢�܂��Bpay���\�b�h�̖߂�l���z�e����
        ���v�t�B�[���h�ɉ��Z���܂��B�u�����l�������́����ɂ�����ɂȂ�܂��v
        �ƕ\�����A�Ō�ɂ��q�l����ArrayList�I�u�W�F�N�g�ɒǉ����܂��B
        ���Apay���\�b�h�͏�����������Ȃ��ꍇ��ShortFallException��O���X���[
        ���܂��B��O�I�u�W�F�N�g�̎����b�Z�[�W���o�͂��Ă��������B

    �T�D�z�e���^�cmanage���\�b�h���`���܂��B���݃z�e���ɂ��邷�ׂĂ̏]�ƈ���
        ����work���\�b�h�����s���܂��B���������[�v�ɂ͊g��for�����g�p���Ă��������B

    �U�D���q�l�̏����o�͂���showCustomerInfo���\�b�h���`���܂��B
        �u���q�l���v�Əo�͂�����ɁA���݃z�e���ɂ��邷�ׂĂ̂��q�l��
        ���itoString���\�b�h�̖߂�l�j���o�͂��܂��B���������[�v�ɂ�
        �g��for�����g�p���Ă��������B

    �V�D�z�e�������o�͂���showHotelInfo���\�b�h���`���܂��B
        �z�e�����⌻�݂̏]�ƈ����A���݂̂��q�l���A���݂̗��v�Ȃǂ��o��
        ���܂��B���L�A���s���ʂ��Q�l�ɂ��Ă��������B

    [�l�X�gRoomRank�񋓌^]
    �P�D�z�e���N���X�̃����o�Ƃ��Ē�`���܂��B

    �Q�D�R�̗񋓎q�������܂��B�܂��A�Q�̃C���X�^���X�t�B�[���h�Ƃ���
        �����̃����N��roomRankName(String�^)�Ɖ��iprice(int�^)�������܂��B
        �R���X�g���N�^�����܂��g���ăt�B�[���h�ɒl��ݒ肵�܂��B

        �񋓎q�uSUITE�v �����̃����N���u"�X�C�[�g���[��"�v ���i�u100000�v
        �񋓎q�uNORMAL�v �����̃����N���u"�ʏ탋�[��"�v ���i�u20000�v
        �񋓎q�uECONOMY�v �����̃����N���u"�i�����[��"�v ���i�u5000�v

    �R�D���i���擾����getPrice���\�b�h���`���܂��B�i�����Ȃ��E�߂�lint�^�j

    �S�DtoString���\�b�h���I�[�o�[���C�h���܂��BroomRankName�t�B�[���h��
        �l��Ԃ��܂��B

    [Staff�N���X]
    �P�DPerson�N���X���p�����AWorkable�C���^�t�F�[�X���������܂��B

    �Q�D�E���\��jobType�t�B�[���h�iString�^�j���`���܂��B

    �R�D�R���X�g���N�^�͑������Ɏ����A�������ɐE����󂯎��܂��B
        �t�B�[���h�ɒl���Z�b�g���Ă��������B

    �S�D����work���\�b�h���������܂��B�u�������������s���܂����v��
        �o�͂��܂��B

    [Customer�N���X]
    �P�DPerson�N���X���p�����܂��B

    �Q�D��������\��money�C���X�^���X�t�B�[���h�iint�^�j���`���܂��B

    �R�D�R���X�g���N�^�͑������Ɏ����A�������ɏ��������󂯎��܂��B
        �t�B�[���h�ɒl���Z�b�g���Ă��������B

    �S�D�x��pay���\�b�h���`���܂��B�����͎g�p���z�iint�^�j�Ȃ̂ŁA
        ���̕�������������z�����������A�߂�l�Ƃ��ĕԂ��܂��B
        ������������Ȃ��ꍇ�́A�u�����͏������s���ł��v
        �Ƃ������b�Z�[�W��ShortFallException��O�N���X�̃R���X�g���N�^��
        �n���āA���̂܂܃X���[���܂��B

    �T�D���q�l����Ԃ�toString���\�b�h���I�[�o�[���C�h���܂��B
        �u�����l�@�������F�����~�v�Ƃ����������Ԃ��܂��B

    �y���s���ʁz
    �z�e���h���t�B�����I�[�v�����܂���
    ��{���z�e���h���t�B���ɏo�΂��܂���
    ���삪�z�e���h���t�B���ɏo�΂��܂���
    ��m�����z�e���h���t�B���ɏo�΂��܂���

    ���c�l���z�e���h���t�B���̃X�C�[�g���[���ɂ�����ɂȂ�܂�
    �O��l���z�e���h���t�B���̒ʏ탋�[���ɂ�����ɂȂ�܂�
    �X�c�͏������s���ł�

    ��{�����|���s���܂���
    ���삪�������s���܂���
    ��m�����ڋq���s���܂���

    ���q�l���
    ���c�l�@�������F400000�~
    �O��l�@�������F20000�~

    �z�e���h���t�B���̌��݂̏�
    ���ݓ����Ă���]�ƈ����F3��
    ���݂����܂�̂��q�l���F2��
    ���݂̗��v�F120000�~

*/

public class TotalHiLevelPractice{

    public static void main(String[] args){

        // �z�e�����I�[�v��
        Hotel hotel = new Hotel("�z�e���h���t�B��");

        // �z�e���ɂR�l�̏]�ƈ����o��
        hotel.enter(new Staff("��{", "���|"));
        hotel.enter(new Staff("����", "����"));
        hotel.enter(new Staff("��m��", "�ڋq"));

        System.out.println();

        // �R�l�̂��q�l���`�F�b�N�C���i�P�l���������s���Ŕ��܂ꂸ�j
        hotel.enter(new Customer("���c", 500000), Hotel.RoomRank.SUITE);
        hotel.enter(new Customer("�O��", 40000), Hotel.RoomRank.NORMAL);
        hotel.enter(new Customer("�X�c", 4000), Hotel.RoomRank.ECONOMY);

        System.out.println();

        // �z�e�����^�c
        hotel.manage();

        System.out.println();

        // ���q�l���̊m�F
        hotel.showCustomerInfo();

        System.out.println();

        // �z�e�����̊m�F
        hotel.showHotelInfo();

    }

}

// �����Ƀz�e���N���X���쐬���Ă�������


// �J���\�C���^�t�F�[�X
interface Workable{

    // �������ۃ��\�b�h
    void work();

}

// �����ɏ]�ƈ��N���X���쐬���Ă�������

// �����Ɍڋq�N���X���쐬���Ă�������

// �������s����O�N���X
class ShortFallException extends Exception{

    public ShortFallException(String message){
        super(message);
    }

}
