package packets;

public interface Opcode
{
    final byte CMSG_LOGIN                 = 0x01;
    final byte CMSG_LOGOUT                = 0x02;
    final byte SMSG_LOGIN_SUCCESS         = 0x03;
    final byte SMSG_LOGIN_FAILED          = 0x04;
    final byte SMSG_MULTI_LOGIN           = 0x05;
    final byte CMSG_CREATEROOM            = 0x06;
    final byte CMSG_JOINROOM              = 0x07;
    final byte CMSG_LEAVEROOM             = 0x08;
    final byte SMSG_CROOM_SUCCESS         = 0x09;
    final byte SMSG_MULTI_CROOM           = 0x10;
    final byte SMSG_JOINROOM_SUCCESS      = 0x11;
    final byte SMSG_LEAVEROOM_SUCCESS     = 0x12;
    final byte CMSG_SENDGROUPMESSAGE      = 0x13;
    final byte SMSG_SEND_ROOMLIST         = 0x14;
    final byte SMSG_END_SEND_ROOMLIST     = 0x15;
}

