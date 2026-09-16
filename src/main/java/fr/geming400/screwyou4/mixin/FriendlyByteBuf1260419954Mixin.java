package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.FriendlyByteBuf.class)
public class FriendlyByteBuf1260419954Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_351793190(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(351793190L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString(Ljava/nio/charset/Charset;)Ljava/lang/String;", cancellable = true)
    private void toString__1118926695(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1118926695L))
            info.setReturnValue("`nVnx!IOjNwk}y\uC85E)\uD33E+V:#is9HG3,_HR5:2%\u0908$4&sI\u6B1E;i]\u3730+xA\u4543#ngB#\u7B72@nIRS\u4636O\uA8A5'\uAF0BDh>_\uB825cj\u9B47<Ibdhqs>++4!|j");
    }

    @Inject(at = @At("HEAD"), method = "toString(IILjava/nio/charset/Charset;)Ljava/lang/String;", cancellable = true)
    private void toString__796697991(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-796697991L))
            info.setReturnValue("\uB623\u6578e_B%\u2DFC&_%kA'9`O{/\u2543bN)\u2A2CtGuT\u703CkOY7N9?V)i\uD00DNm7TTiU(rluEu\uC600}1\u64DBFcIkhnHh$-eE#G\u1904A]K\u386DS\uFF820\u9CF6\u0C951F\uA11F%1ii61Sl\u553Cm");
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_2030842983(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2030842983L))
            info.setReturnValue("mPc^%{Jb!7<Jf:Oz.}M#>`l!^$u7MtwSY:g0wjB?G;$\u9A94y}5FR-RKY1\u4875");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1817771549(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1817771549L))
            info.setReturnValue(-1280139713);
    }

    @Inject(at = @At("HEAD"), method = "compareTo(Ljava/lang/Object;)I", cancellable = true)
    private void compareTo__631683980(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-631683980L))
            info.setReturnValue(-813735840);
    }

    @Inject(at = @At("HEAD"), method = "compareTo(Lio/netty/buffer/ByteBuf;)I", cancellable = true)
    private void compareTo_1114568989(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1114568989L))
            info.setReturnValue(-155666110);
    }

    @Inject(at = @At("HEAD"), method = "indexOf(IIB)I", cancellable = true)
    private void indexOf_2045792115(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2045792115L))
            info.setReturnValue(2055595304);
    }

    @Inject(at = @At("HEAD"), method = "getBoolean(I)Z", cancellable = true)
    private void getBoolean_695131156(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(695131156L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getByte(I)B", cancellable = true)
    private void getByte_185551496(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(185551496L))
            info.setReturnValue(48);
    }

    @Inject(at = @At("HEAD"), method = "getShort(I)S", cancellable = true)
    private void getShort_304666017(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(304666017L))
            info.setReturnValue((short) 13384);
    }

    @Inject(at = @At("HEAD"), method = "getChar(I)C", cancellable = true)
    private void getChar_549981719(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(549981719L))
            info.setReturnValue((char) 23288);
    }

    @Inject(at = @At("HEAD"), method = "getInt(I)I", cancellable = true)
    private void getInt__32617526(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-32617526L))
            info.setReturnValue(741188311);
    }

    @Inject(at = @At("HEAD"), method = "getLong(I)J", cancellable = true)
    private void getLong__976820476(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-976820476L))
            info.setReturnValue(3523126568145898034L);
    }

    @Inject(at = @At("HEAD"), method = "getFloat(I)F", cancellable = true)
    private void getFloat_1841126068(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1841126068L))
            info.setReturnValue(7.602223E8F);
    }

    @Inject(at = @At("HEAD"), method = "getDouble(I)D", cancellable = true)
    private void getDouble__1634513773(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1634513773L))
            info.setReturnValue(7.612218003376474E8D);
    }

    @Inject(at = @At("HEAD"), method = "clear()Lio/netty/buffer/ByteBuf;", cancellable = true)
    private void clear_1588065527(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1588065527L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "clear()Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void clear__89251650(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-89251650L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBytes(ILio/netty/buffer/ByteBuf;I)Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void getBytes__406786771(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-406786771L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBytes(ILio/netty/buffer/ByteBuf;)Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void getBytes__1238127166(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1238127166L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBytes(ILjava/nio/channels/FileChannel;JI)I", cancellable = true)
    private void getBytes_1833816560(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1833816560L))
            info.setReturnValue(-870706945);
    }

    @Inject(at = @At("HEAD"), method = "getBytes(ILjava/nio/channels/GatheringByteChannel;I)I", cancellable = true)
    private void getBytes__1437966657(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1437966657L))
            info.setReturnValue(-370981559);
    }

    @Inject(at = @At("HEAD"), method = "getBytes(ILjava/nio/ByteBuffer;)Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void getBytes__1507966076(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1507966076L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBytes(I[BII)Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void getBytes_1754804480(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1754804480L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBytes(I[B)Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void getBytes_641213216(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(641213216L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBytes(ILio/netty/buffer/ByteBuf;II)Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void getBytes__405038302(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-405038302L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBytes(ILjava/io/OutputStream;I)Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void getBytes__1504352700(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1504352700L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBytes(ILjava/io/OutputStream;I)Lio/netty/buffer/ByteBuf;", cancellable = true)
    private void getBytes_606649597(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(606649597L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBytes(ILjava/nio/ByteBuffer;)Lio/netty/buffer/ByteBuf;", cancellable = true)
    private void getBytes_1014090301(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1014090301L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBytes(I[BII)Lio/netty/buffer/ByteBuf;", cancellable = true)
    private void getBytes_713736377(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(713736377L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBytes(ILio/netty/buffer/ByteBuf;)Lio/netty/buffer/ByteBuf;", cancellable = true)
    private void getBytes_1855903995(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1855903995L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBytes(I[B)Lio/netty/buffer/ByteBuf;", cancellable = true)
    private void getBytes_340716249(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(340716249L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBytes(ILio/netty/buffer/ByteBuf;II)Lio/netty/buffer/ByteBuf;", cancellable = true)
    private void getBytes_815246939(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(815246939L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBytes(ILio/netty/buffer/ByteBuf;I)Lio/netty/buffer/ByteBuf;", cancellable = true)
    private void getBytes_749641638(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(749641638L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "copy()Lio/netty/buffer/ByteBuf;", cancellable = true)
    private void copy__553224945(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-553224945L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "copy(II)Lio/netty/buffer/ByteBuf;", cancellable = true)
    private void copy_753509743(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(753509743L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isDirect()Z", cancellable = true)
    private void isDirect__1843553450(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1843553450L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "hasArray()Z", cancellable = true)
    private void hasArray_684401834(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(684401834L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "array()[B", cancellable = true)
    private void array_684223889(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(684223889L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "arrayOffset()I", cancellable = true)
    private void arrayOffset_181159052(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(181159052L))
            info.setReturnValue(1982479439);
    }

    @Inject(at = @At("HEAD"), method = "writeInt(I)Lio/netty/buffer/ByteBuf;", cancellable = true)
    private void writeInt_1661779245(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1661779245L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "writeInt(I)Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void writeInt__547532172(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-547532172L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readInt()I", cancellable = true)
    private void readInt_325262975(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(325262975L))
            info.setReturnValue(-1732673940);
    }

    @Inject(at = @At("HEAD"), method = "setBoolean(IZ)Lio/netty/buffer/ByteBuf;", cancellable = true)
    private void setBoolean__1886255697(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1886255697L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setBoolean(IZ)Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void setBoolean__1771008138(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1771008138L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setByte(II)Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void setByte_641295361(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(641295361L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setByte(II)Lio/netty/buffer/ByteBuf;", cancellable = true)
    private void setByte__943007366(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-943007366L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setChar(II)Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void setChar_38770803(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(38770803L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setChar(II)Lio/netty/buffer/ByteBuf;", cancellable = true)
    private void setChar__1292378772(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1292378772L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setShort(II)Lio/netty/buffer/ByteBuf;", cancellable = true)
    private void setShort__881357110(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-881357110L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setShort(II)Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void setShort__2087285423(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2087285423L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setInt(II)Lio/netty/buffer/ByteBuf;", cancellable = true)
    private void setInt__78789257(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-78789257L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setInt(II)Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void setInt_1184698686(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1184698686L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setLong(IJ)Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void setLong_1996667342(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1996667342L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setLong(IJ)Lio/netty/buffer/ByteBuf;", cancellable = true)
    private void setLong__1348031993(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1348031993L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setFloat(IF)Lio/netty/buffer/ByteBuf;", cancellable = true)
    private void setFloat__1470003353(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1470003353L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setFloat(IF)Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void setFloat__1086410962(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1086410962L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setDouble(ID)Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void setDouble__361653613(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-361653613L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setDouble(ID)Lio/netty/buffer/ByteBuf;", cancellable = true)
    private void setDouble_219813772(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(219813772L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "unwrap()Lio/netty/buffer/ByteBuf;", cancellable = true)
    private void unwrap_1366427873(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1366427873L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "capacity(I)Lio/netty/buffer/ByteBuf;", cancellable = true)
    private void capacity__528669481(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-528669481L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "capacity()I", cancellable = true)
    private void capacity__521854754(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-521854754L))
            info.setReturnValue(-1951943010);
    }

    @Inject(at = @At("HEAD"), method = "capacity(I)Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void capacity_205654174(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(205654174L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "release(I)Z", cancellable = true)
    private void release__1152763799(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1152763799L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "release()Z", cancellable = true)
    private void release__757967486(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-757967486L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isReadOnly()Z", cancellable = true)
    private void isReadOnly_1760158461(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1760158461L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "slice(II)Lio/netty/buffer/ByteBuf;", cancellable = true)
    private void slice__1938385998(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1938385998L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "slice()Lio/netty/buffer/ByteBuf;", cancellable = true)
    private void slice_1919948818(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1919948818L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "duplicate()Lio/netty/buffer/ByteBuf;", cancellable = true)
    private void duplicate_60983097(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(60983097L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readLong()J", cancellable = true)
    private void readLong__573347033(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-573347033L))
            info.setReturnValue(8785651198882907503L);
    }

    @Inject(at = @At("HEAD"), method = "readByte()B", cancellable = true)
    private void readByte_1542351379(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1542351379L))
            info.setReturnValue(-10);
    }

    @Inject(at = @At("HEAD"), method = "readShort()S", cancellable = true)
    private void readShort__566554084(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-566554084L))
            info.setReturnValue((short) 18775);
    }

    @Inject(at = @At("HEAD"), method = "writeLong(J)Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void writeLong__2144317408(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2144317408L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "writeLong(J)Lio/netty/buffer/ByteBuf;", cancellable = true)
    private void writeLong_40490969(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(40490969L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "writeByte(I)Lio/netty/buffer/ByteBuf;", cancellable = true)
    private void writeByte_1738117348(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1738117348L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "writeByte(I)Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void writeByte_324393451(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(324393451L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "writeShort(I)Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void writeShort_931289921(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(931289921L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "writeShort(I)Lio/netty/buffer/ByteBuf;", cancellable = true)
    private void writeShort__1402371910(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1402371910L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readBytes(I)Lio/netty/buffer/ByteBuf;", cancellable = true)
    private void readBytes_1863328658(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1863328658L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readBytes(Lio/netty/buffer/ByteBuf;I)Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void readBytes__379300246(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-379300246L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readBytes([B)Lio/netty/buffer/ByteBuf;", cancellable = true)
    private void readBytes_630749654(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(630749654L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readBytes(Lio/netty/buffer/ByteBuf;)Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void readBytes__267409179(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-267409179L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readBytes(Ljava/nio/ByteBuffer;)Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void readBytes__1457305561(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1457305561L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readBytes(Ljava/io/OutputStream;I)Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void readBytes__64238041(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-64238041L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readBytes(Ljava/nio/channels/GatheringByteChannel;I)I", cancellable = true)
    private void readBytes__1810147806(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1810147806L))
            info.setReturnValue(1665112989);
    }

    @Inject(at = @At("HEAD"), method = "readBytes(Ljava/nio/channels/FileChannel;JI)I", cancellable = true)
    private void readBytes__1739465645(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1739465645L))
            info.setReturnValue(2027205369);
    }

    @Inject(at = @At("HEAD"), method = "readBytes([BII)Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void readBytes__1192876547(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1192876547L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readBytes([B)Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void readBytes_1183396701(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1183396701L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readBytes(Lio/netty/buffer/ByteBuf;II)Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void readBytes_447043973(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(447043973L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readBytes(Lio/netty/buffer/ByteBuf;I)Lio/netty/buffer/ByteBuf;", cancellable = true)
    private void readBytes__1586870365(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1586870365L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readBytes(Ljava/io/OutputStream;I)Lio/netty/buffer/ByteBuf;", cancellable = true)
    private void readBytes_170745376(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(170745376L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readBytes([BII)Lio/netty/buffer/ByteBuf;", cancellable = true)
    private void readBytes_262964342(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(262964342L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readBytes(Ljava/nio/ByteBuffer;)Lio/netty/buffer/ByteBuf;", cancellable = true)
    private void readBytes_1549948960(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1549948960L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readBytes(Lio/netty/buffer/ByteBuf;)Lio/netty/buffer/ByteBuf;", cancellable = true)
    private void readBytes__436224674(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-436224674L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readBytes(Lio/netty/buffer/ByteBuf;II)Lio/netty/buffer/ByteBuf;", cancellable = true)
    private void readBytes_1397818878(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1397818878L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "writeBytes(Ljava/nio/channels/FileChannel;JI)I", cancellable = true)
    private void writeBytes__1740887446(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1740887446L))
            info.setReturnValue(1548354453);
    }

    @Inject(at = @At("HEAD"), method = "writeBytes(Ljava/nio/channels/ScatteringByteChannel;I)I", cancellable = true)
    private void writeBytes__721065266(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-721065266L))
            info.setReturnValue(338297851);
    }

    @Inject(at = @At("HEAD"), method = "writeBytes([B)Lio/netty/buffer/ByteBuf;", cancellable = true)
    private void writeBytes__187054177(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-187054177L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "writeBytes(Lio/netty/buffer/ByteBuf;II)Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void writeBytes__63337572(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-63337572L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "writeBytes(Lio/netty/buffer/ByteBuf;I)Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void writeBytes_1543898483(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1543898483L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "writeBytes(Lio/netty/buffer/ByteBuf;)Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void writeBytes__2006485828(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2006485828L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "writeBytes([B)Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void writeBytes_1548103014(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1548103014L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "writeBytes([BII)Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void writeBytes_1397539270(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1397539270L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "writeBytes(Lio/netty/buffer/ByteBuf;)Lio/netty/buffer/ByteBuf;", cancellable = true)
    private void writeBytes__758055563(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-758055563L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "writeBytes(Ljava/nio/ByteBuffer;)Lio/netty/buffer/ByteBuf;", cancellable = true)
    private void writeBytes_655178679(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(655178679L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "writeBytes([BII)Lio/netty/buffer/ByteBuf;", cancellable = true)
    private void writeBytes_332497919(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(332497919L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "writeBytes(Lio/netty/buffer/ByteBuf;II)Lio/netty/buffer/ByteBuf;", cancellable = true)
    private void writeBytes_1355979861(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1355979861L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "writeBytes(Lio/netty/buffer/ByteBuf;I)Lio/netty/buffer/ByteBuf;", cancellable = true)
    private void writeBytes_1321273964(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1321273964L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "writeBytes(Ljava/nio/ByteBuffer;)Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void writeBytes_300980094(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(300980094L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "writeBytes(Ljava/io/InputStream;I)I", cancellable = true)
    private void writeBytes_254248732(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(254248732L))
            info.setReturnValue(397868092);
    }

    @Inject(at = @At("HEAD"), method = "order()Ljava/nio/ByteOrder;", cancellable = true)
    private void order_214702032(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(214702032L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "order(Ljava/nio/ByteOrder;)Lio/netty/buffer/ByteBuf;", cancellable = true)
    private void order_755843047(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(755843047L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isWritable()Z", cancellable = true)
    private void isWritable__849618817(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-849618817L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isWritable(I)Z", cancellable = true)
    private void isWritable_301012236(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(301012236L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "readUnsignedShort()I", cancellable = true)
    private void readUnsignedShort__1026675865(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1026675865L))
            info.setReturnValue(-9958100);
    }

    @Inject(at = @At("HEAD"), method = "writeChar(I)Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void writeChar__1773252807(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1773252807L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "writeChar(I)Lio/netty/buffer/ByteBuf;", cancellable = true)
    private void writeChar_1034110642(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1034110642L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readChar()C", cancellable = true)
    private void readChar_861371462(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(861371462L))
            info.setReturnValue((char) 45134);
    }

    @Inject(at = @At("HEAD"), method = "writeFloat(F)Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void writeFloat_603675870(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(603675870L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "writeFloat(F)Lio/netty/buffer/ByteBuf;", cancellable = true)
    private void writeFloat__524097257(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-524097257L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readFloat()F", cancellable = true)
    private void readFloat_1145565039(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1145565039L))
            info.setReturnValue(7.642227E8F);
    }

    @Inject(at = @At("HEAD"), method = "writeDouble(D)Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void writeDouble__653722193(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-653722193L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "writeDouble(D)Lio/netty/buffer/ByteBuf;", cancellable = true)
    private void writeDouble_249093032(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(249093032L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readDouble()D", cancellable = true)
    private void readDouble__869002772(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-869002772L))
            info.setReturnValue(7.642227000256957E8D);
    }

    @Inject(at = @At("HEAD"), method = "skipBytes(I)Lio/netty/buffer/ByteBuf;", cancellable = true)
    private void skipBytes__1875378487(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1875378487L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "skipBytes(I)Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void skipBytes__1661496560(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1661496560L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readBoolean()Z", cancellable = true)
    private void readBoolean__1164215625(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1164215625L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "readUnsignedByte()S", cancellable = true)
    private void readUnsignedByte_557694063(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(557694063L))
            info.setReturnValue((short) 26087);
    }

    @Inject(at = @At("HEAD"), method = "getUnsignedShort(I)I", cancellable = true)
    private void getUnsignedShort_2051476450(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2051476450L))
            info.setReturnValue(-868091510);
    }

    @Inject(at = @At("HEAD"), method = "writeBoolean(Z)Lio/netty/buffer/ByteBuf;", cancellable = true)
    private void writeBoolean_939097015(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(939097015L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "writeBoolean(Z)Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void writeBoolean__261302402(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-261302402L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readString(ILjava/nio/charset/Charset;)Ljava/lang/String;", cancellable = true)
    private void readString_1494565293(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1494565293L))
            info.setReturnValue("\u8D0BnGF(C\uD270NO<&TOc%zB(\u9747MI4WHMzJ\u0C00'\"Ih'_OG|-)\u1EA7i5jr\"P[\u5E17&");
    }

    @Inject(at = @At("HEAD"), method = "readEnum(Ljava/lang/Class;)Ljava/lang/Enum;", cancellable = true)
    private void readEnum__592415135(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-592415135L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "writeEnum(Ljava/lang/Enum;)Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void writeEnum_1806962501(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1806962501L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "asReadOnly()Lio/netty/buffer/ByteBuf;", cancellable = true)
    private void asReadOnly_286175280(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(286175280L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isReadable()Z", cancellable = true)
    private void isReadable__720721361(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-720721361L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isReadable(I)Z", cancellable = true)
    private void isReadable_1866076(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1866076L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "setIndex(II)Lio/netty/buffer/ByteBuf;", cancellable = true)
    private void setIndex__964501580(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-964501580L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setIndex(II)Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void setIndex__2094728005(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2094728005L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "touch(Ljava/lang/Object;)Lio/netty/buffer/ByteBuf;", cancellable = true)
    private void touch__2136968031(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2136968031L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "touch(Ljava/lang/Object;)Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void touch__804196632(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-804196632L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "touch()Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void touch_1628411020(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1628411020L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "touch(Ljava/lang/Object;)Lio/netty/util/ReferenceCounted;", cancellable = true)
    private void touch_1297910249(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1297910249L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "touch()Lio/netty/buffer/ByteBuf;", cancellable = true)
    private void touch__1922954939(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1922954939L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "touch()Lio/netty/util/ReferenceCounted;", cancellable = true)
    private void touch_1336751301(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1336751301L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "writeUUID(Ljava/util/UUID;)Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void writeUUID_2089282469(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2089282469L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "writeUUID(Lio/netty/buffer/ByteBuf;Ljava/util/UUID;)V", cancellable = true)
    private static void writeUUID__891058416(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-891058416L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "readMap(Ljava/util/function/IntFunction;Lnet/minecraft/network/codec/StreamDecoder;Lnet/minecraft/network/codec/StreamDecoder;)Ljava/util/Map;", cancellable = true)
    private void readMap__590731085(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-590731085L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readMap(Lnet/minecraft/network/codec/StreamDecoder;Lnet/minecraft/network/codec/StreamDecoder;)Ljava/util/Map;", cancellable = true)
    private void readMap_1585075860(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1585075860L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readList(Lnet/minecraft/network/codec/StreamDecoder;)Ljava/util/List;", cancellable = true)
    private void readList_1753441229(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1753441229L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "forEachByteDesc(IILio/netty/util/ByteProcessor;)I", cancellable = true)
    private void forEachByteDesc_1346195583(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1346195583L))
            info.setReturnValue(1104941194);
    }

    @Inject(at = @At("HEAD"), method = "forEachByteDesc(Lio/netty/util/ByteProcessor;)I", cancellable = true)
    private void forEachByteDesc__1512873889(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1512873889L))
            info.setReturnValue(-1981349431);
    }

    @Inject(at = @At("HEAD"), method = "forEachByte(IILio/netty/util/ByteProcessor;)I", cancellable = true)
    private void forEachByte__941245618(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-941245618L))
            info.setReturnValue(-492000254);
    }

    @Inject(at = @At("HEAD"), method = "forEachByte(Lio/netty/util/ByteProcessor;)I", cancellable = true)
    private void forEachByte_384185070(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(384185070L))
            info.setReturnValue(1453378914);
    }

    @Inject(at = @At("HEAD"), method = "writeLongArray(Lio/netty/buffer/ByteBuf;[J)V", cancellable = true)
    private static void writeLongArray_1375842639(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1375842639L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "writeLongArray([J)Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void writeLongArray_520089692(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(520089692L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "writeByteArray(Lio/netty/buffer/ByteBuf;[B)V", cancellable = true)
    private static void writeByteArray_769344059(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(769344059L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "writeByteArray([B)Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void writeByteArray_2742752(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2742752L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readLongArray(Lio/netty/buffer/ByteBuf;)[J", cancellable = true)
    private static void readLongArray_1592220396(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1592220396L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readLongArray()[J", cancellable = true)
    private void readLongArray__1911814393(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1911814393L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readByteArray(I)[B", cancellable = true)
    private void readByteArray__1165487356(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1165487356L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readByteArray(Lio/netty/buffer/ByteBuf;)[B", cancellable = true)
    private static void readByteArray__228228752(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-228228752L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readByteArray()[B", cancellable = true)
    private void readByteArray_1708293875(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1708293875L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readByteArray(Lio/netty/buffer/ByteBuf;I)[B", cancellable = true)
    private static void readByteArray__1068154089(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1068154089L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "writeQuaternion(Lio/netty/buffer/ByteBuf;Lorg/joml/Quaternionfc;)V", cancellable = true)
    private static void writeQuaternion_1517092535(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1517092535L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "writeQuaternion(Lorg/joml/Quaternionf;)V", cancellable = true)
    private void writeQuaternion__1079106097(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1079106097L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "readContainerId()I", cancellable = true)
    private void readContainerId_713840402(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(713840402L))
            info.setReturnValue(608113355);
    }

    @Inject(at = @At("HEAD"), method = "readContainerId(Lio/netty/buffer/ByteBuf;)I", cancellable = true)
    private static void readContainerId__1931819173(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1931819173L))
            info.setReturnValue(1909422014);
    }

    @Inject(at = @At("HEAD"), method = "writeNullable(Ljava/lang/Object;Lnet/minecraft/network/codec/StreamEncoder;)V", cancellable = true)
    private void writeNullable_412974962(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(412974962L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "writeNullable(Lio/netty/buffer/ByteBuf;Ljava/lang/Object;Lnet/minecraft/network/codec/StreamEncoder;)V", cancellable = true)
    private static void writeNullable__196563899(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-196563899L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "writeContainerId(I)V", cancellable = true)
    private void writeContainerId__1983885061(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1983885061L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "writeContainerId(Lio/netty/buffer/ByteBuf;I)V", cancellable = true)
    private static void writeContainerId__1519410444(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1519410444L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "readVector3f()Lorg/joml/Vector3f;", cancellable = true)
    private void readVector3f__991627788(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-991627788L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readVector3f(Lio/netty/buffer/ByteBuf;)Lorg/joml/Vector3f;", cancellable = true)
    private static void readVector3f__432543671(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-432543671L))
            info.setReturnValue(new org.joml.Vector3f());
    }

    @Inject(at = @At("HEAD"), method = "readQuaternion(Lio/netty/buffer/ByteBuf;)Lorg/joml/Quaternionf;", cancellable = true)
    private static void readQuaternion_1144930967(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1144930967L))
            info.setReturnValue(new org.joml.Quaternionf());
    }

    @Inject(at = @At("HEAD"), method = "readQuaternion()Lorg/joml/Quaternionf;", cancellable = true)
    private void readQuaternion__312290260(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-312290260L))
            info.setReturnValue(new org.joml.Quaternionf());
    }

    @Inject(at = @At("HEAD"), method = "readNullable(Lnet/minecraft/network/codec/StreamDecoder;)Ljava/lang/Object;", cancellable = true)
    private void readNullable_2017814805(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2017814805L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "readNullable(Lio/netty/buffer/ByteBuf;Lnet/minecraft/network/codec/StreamDecoder;)Ljava/lang/Object;", cancellable = true)
    private static void readNullable__1085784416(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1085784416L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "writeVector3f(Lio/netty/buffer/ByteBuf;Lorg/joml/Vector3fc;)V", cancellable = true)
    private static void writeVector3f__1972135367(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1972135367L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "writeVector3f(Lorg/joml/Vector3f;)V", cancellable = true)
    private void writeVector3f__101834149(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-101834149L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "readNbt(Lio/netty/buffer/ByteBuf;)Lnet/minecraft/nbt/CompoundTag;", cancellable = true)
    private static void readNbt_1322783921(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1322783921L))
            info.setReturnValue(new net.minecraft.nbt.CompoundTag());
    }

    @Inject(at = @At("HEAD"), method = "readNbt(Lio/netty/buffer/ByteBuf;Lnet/minecraft/nbt/NbtAccounter;)Lnet/minecraft/nbt/Tag;", cancellable = true)
    private static void readNbt__960605928(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-960605928L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readNbt(Lnet/minecraft/nbt/NbtAccounter;)Lnet/minecraft/nbt/Tag;", cancellable = true)
    private void readNbt__416173177(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-416173177L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readNbt()Lnet/minecraft/nbt/CompoundTag;", cancellable = true)
    private void readNbt_345275424(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(345275424L))
            info.setReturnValue(new net.minecraft.nbt.CompoundTag());
    }

    @Inject(at = @At("HEAD"), method = "writeNbt(Lnet/minecraft/nbt/Tag;)Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void writeNbt_96466700(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(96466700L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "writeNbt(Lio/netty/buffer/ByteBuf;Lnet/minecraft/nbt/Tag;)V", cancellable = true)
    private static void writeNbt_1214480119(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1214480119L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "readUUID(Lio/netty/buffer/ByteBuf;)Ljava/util/UUID;", cancellable = true)
    private static void readUUID__60646489(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-60646489L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readUUID()Ljava/util/UUID;", cancellable = true)
    private void readUUID__1750524586(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1750524586L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "alloc()Lio/netty/buffer/ByteBufAllocator;", cancellable = true)
    private void alloc_1034738748(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1034738748L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getShortLE(I)S", cancellable = true)
    private void getShortLE_900310746(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(900310746L))
            info.setReturnValue((short) 26905);
    }

    @Inject(at = @At("HEAD"), method = "getIntLE(I)I", cancellable = true)
    private void getIntLE__1097401277(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1097401277L))
            info.setReturnValue(1947152638);
    }

    @Inject(at = @At("HEAD"), method = "getMedium(I)I", cancellable = true)
    private void getMedium_905848828(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(905848828L))
            info.setReturnValue(1112507300);
    }

    @Inject(at = @At("HEAD"), method = "getLongLE(I)J", cancellable = true)
    private void getLongLE_2055707965(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2055707965L))
            info.setReturnValue(4950758145067325480L);
    }

    @Inject(at = @At("HEAD"), method = "setShortLE(II)Lio/netty/buffer/ByteBuf;", cancellable = true)
    private void setShortLE__1716663119(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1716663119L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setShortLE(II)Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void setShortLE__1734677768(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1734677768L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "refCnt()I", cancellable = true)
    private void refCnt__1068752062(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1068752062L))
            info.setReturnValue(1673488388);
    }

    @Inject(at = @At("HEAD"), method = "retain()Lio/netty/buffer/ByteBuf;", cancellable = true)
    private void retain_402478399(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(402478399L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "retain(I)Lio/netty/buffer/ByteBuf;", cancellable = true)
    private void retain__1356878878(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1356878878L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "retain(I)Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void retain_685367401(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(685367401L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "retain()Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void retain__925801722(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-925801722L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "retain(I)Lio/netty/util/ReferenceCounted;", cancellable = true)
    private void retain_1657657224(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1657657224L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "retain()Lio/netty/util/ReferenceCounted;", cancellable = true)
    private void retain_448617355(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(448617355L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setBytes(ILio/netty/buffer/ByteBuf;I)Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void setBytes_332447905(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(332447905L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setBytes(ILio/netty/buffer/ByteBuf;)Lio/netty/buffer/ByteBuf;", cancellable = true)
    private void setBytes__648475641(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-648475641L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setBytes(ILio/netty/buffer/ByteBuf;)Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void setBytes__1075733554(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1075733554L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setBytes(ILjava/nio/channels/FileChannel;JI)I", cancellable = true)
    private void setBytes__284713732(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-284713732L))
            info.setReturnValue(-1842286559);
    }

    @Inject(at = @At("HEAD"), method = "setBytes(I[B)Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void setBytes_1602359956(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1602359956L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setBytes(I[B)Lio/netty/buffer/ByteBuf;", cancellable = true)
    private void setBytes_699807053(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(699807053L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setBytes(I[BII)Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void setBytes_1998852980(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1998852980L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setBytes(ILjava/io/InputStream;I)I", cancellable = true)
    private void setBytes_2026503114(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2026503114L))
            info.setReturnValue(830120313);
    }

    @Inject(at = @At("HEAD"), method = "setBytes(ILjava/nio/ByteBuffer;)Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void setBytes__89319536(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-89319536L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setBytes(ILjava/nio/ByteBuffer;)Lio/netty/buffer/ByteBuf;", cancellable = true)
    private void setBytes_83321673(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(83321673L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setBytes(ILio/netty/buffer/ByteBuf;II)Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void setBytes_1036400174(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1036400174L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setBytes(ILio/netty/buffer/ByteBuf;I)Lio/netty/buffer/ByteBuf;", cancellable = true)
    private void setBytes_423284250(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(423284250L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setBytes(I[BII)Lio/netty/buffer/ByteBuf;", cancellable = true)
    private void setBytes__2092351955(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2092351955L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setBytes(ILjava/nio/channels/ScatteringByteChannel;I)I", cancellable = true)
    private void setBytes__119751556(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-119751556L))
            info.setReturnValue(-831464383);
    }

    @Inject(at = @At("HEAD"), method = "setBytes(ILio/netty/buffer/ByteBuf;II)Lio/netty/buffer/ByteBuf;", cancellable = true)
    private void setBytes__711897497(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-711897497L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readMedium()I", cancellable = true)
    private void readMedium_1706801037(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1706801037L))
            info.setReturnValue(1564300625);
    }

    @Inject(at = @At("HEAD"), method = "readSlice(I)Lio/netty/buffer/ByteBuf;", cancellable = true)
    private void readSlice__1955110279(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1955110279L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "writeIntLE(I)Lio/netty/buffer/ByteBuf;", cancellable = true)
    private void writeIntLE_2113997030(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2113997030L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "writeIntLE(I)Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void writeIntLE__150854035(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-150854035L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "writeZero(I)Lio/netty/buffer/ByteBuf;", cancellable = true)
    private void writeZero_242259588(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(242259588L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "writeZero(I)Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void writeZero__400390261(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-400390261L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "nioBuffers()[Ljava/nio/ByteBuffer;", cancellable = true)
    private void nioBuffers__476849460(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-476849460L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "nioBuffers(II)[Ljava/nio/ByteBuffer;", cancellable = true)
    private void nioBuffers_591186924(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(591186924L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setLongLE(IJ)Lio/netty/buffer/ByteBuf;", cancellable = true)
    private void setLongLE_1122642158(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1122642158L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setLongLE(IJ)Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void setLongLE__1404135307(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1404135307L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setIntLE(II)Lio/netty/buffer/ByteBuf;", cancellable = true)
    private void setIntLE_751897630(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(751897630L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setIntLE(II)Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void setIntLE__1274009691(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1274009691L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readIntLE()I", cancellable = true)
    private void readIntLE__1443075354(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1443075354L))
            info.setReturnValue(236129672);
    }

    @Inject(at = @At("HEAD"), method = "readLongLE()J", cancellable = true)
    private void readLongLE__1719789106(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1719789106L))
            info.setReturnValue(5566606950127274409L);
    }

    @Inject(at = @At("HEAD"), method = "setMedium(II)Lio/netty/buffer/ByteBuf;", cancellable = true)
    private void setMedium__2018966035(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2018966035L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setMedium(II)Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void setMedium__580170956(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-580170956L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setZero(II)Lio/netty/buffer/ByteBuf;", cancellable = true)
    private void setZero__69957670(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-69957670L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setZero(II)Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void setZero__352163231(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-352163231L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "nioBuffer(II)Ljava/nio/ByteBuffer;", cancellable = true)
    private void nioBuffer__1550622254(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1550622254L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "nioBuffer()Ljava/nio/ByteBuffer;", cancellable = true)
    private void nioBuffer_568964530(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(568964530L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "markReaderIndex()Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void markReaderIndex_1370787625(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1370787625L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "markReaderIndex()Lio/netty/buffer/ByteBuf;", cancellable = true)
    private void markReaderIndex_1331636898(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1331636898L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "resetReaderIndex()Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void resetReaderIndex_1675522091(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1675522091L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "resetReaderIndex()Lio/netty/buffer/ByteBuf;", cancellable = true)
    private void resetReaderIndex__1012263132(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1012263132L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "resetWriterIndex()Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void resetWriterIndex__1176921125(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1176921125L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "resetWriterIndex()Lio/netty/buffer/ByteBuf;", cancellable = true)
    private void resetWriterIndex__245467436(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-245467436L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "discardReadBytes()Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void discardReadBytes_1684329300(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1684329300L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "discardReadBytes()Lio/netty/buffer/ByteBuf;", cancellable = true)
    private void discardReadBytes_564479501(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(564479501L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "discardSomeReadBytes()Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void discardSomeReadBytes_886020968(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(886020968L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "discardSomeReadBytes()Lio/netty/buffer/ByteBuf;", cancellable = true)
    private void discardSomeReadBytes_302973217(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(302973217L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getUnsignedByte(I)S", cancellable = true)
    private void getUnsignedByte__450819794(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-450819794L))
            info.setReturnValue((short) 18078);
    }

    @Inject(at = @At("HEAD"), method = "getMediumLE(I)I", cancellable = true)
    private void getMediumLE__1174367243(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1174367243L))
            info.setReturnValue(-2049702520);
    }

    @Inject(at = @At("HEAD"), method = "getUnsignedMediumLE(I)I", cancellable = true)
    private void getUnsignedMediumLE_517775434(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(517775434L))
            info.setReturnValue(-1026288484);
    }

    @Inject(at = @At("HEAD"), method = "ensureWritable(I)Lio/netty/buffer/ByteBuf;", cancellable = true)
    private void ensureWritable_1577826075(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1577826075L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "ensureWritable(IZ)I", cancellable = true)
    private void ensureWritable__1693802421(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1693802421L))
            info.setReturnValue(-2049660882);
    }

    @Inject(at = @At("HEAD"), method = "ensureWritable(I)Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void ensureWritable__1171172382(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1171172382L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getUnsignedMedium(I)I", cancellable = true)
    private void getUnsignedMedium__777304687(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-777304687L))
            info.setReturnValue(1056634425);
    }

    @Inject(at = @At("HEAD"), method = "getUnsignedShortLE(I)I", cancellable = true)
    private void getUnsignedShortLE_262149723(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(262149723L))
            info.setReturnValue(-966007186);
    }

    @Inject(at = @At("HEAD"), method = "getUnsignedInt(I)J", cancellable = true)
    private void getUnsignedInt_85402134(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(85402134L))
            info.setReturnValue(4397105455177675090L);
    }

    @Inject(at = @At("HEAD"), method = "markWriterIndex()Lio/netty/buffer/ByteBuf;", cancellable = true)
    private void markWriterIndex_2098432594(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2098432594L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "markWriterIndex()Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void markWriterIndex__1481655591(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1481655591L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readerIndex(I)Lio/netty/buffer/ByteBuf;", cancellable = true)
    private void readerIndex_394698540(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(394698540L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readerIndex()I", cancellable = true)
    private void readerIndex__386058007(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-386058007L))
            info.setReturnValue(-1480781750);
    }

    @Inject(at = @At("HEAD"), method = "readerIndex(I)Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void readerIndex_638077491(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(638077491L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "maxCapacity()I", cancellable = true)
    private void maxCapacity_129600986(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(129600986L))
            info.setReturnValue(-99112467);
    }

    @Inject(at = @At("HEAD"), method = "writableBytes()I", cancellable = true)
    private void writableBytes_2044609421(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2044609421L))
            info.setReturnValue(-1876607189);
    }

    @Inject(at = @At("HEAD"), method = "maxWritableBytes()I", cancellable = true)
    private void maxWritableBytes_1894945809(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1894945809L))
            info.setReturnValue(1916531510);
    }

    @Inject(at = @At("HEAD"), method = "readableBytes()I", cancellable = true)
    private void readableBytes__534839331(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-534839331L))
            info.setReturnValue(2040332669);
    }

    @Inject(at = @At("HEAD"), method = "readUnsignedInt()J", cancellable = true)
    private void readUnsignedInt__537783723(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-537783723L))
            info.setReturnValue(4602112813581047678L);
    }

    @Inject(at = @At("HEAD"), method = "writerIndex()I", cancellable = true)
    private void writerIndex__669407079(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-669407079L))
            info.setReturnValue(2092048229);
    }

    @Inject(at = @At("HEAD"), method = "writerIndex(I)Lio/netty/buffer/ByteBuf;", cancellable = true)
    private void writerIndex__1604438660(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1604438660L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "writerIndex(I)Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void writerIndex__1888316285(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1888316285L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "maxFastWritableBytes()I", cancellable = true)
    private void maxFastWritableBytes_1098344333(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1098344333L))
            info.setReturnValue(-993851015);
    }

    @Inject(at = @At("HEAD"), method = "readUnsignedIntLE()J", cancellable = true)
    private void readUnsignedIntLE__1903186564(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1903186564L))
            info.setReturnValue(-8087231949970609334L);
    }

    @Inject(at = @At("HEAD"), method = "writeLongLE(J)Lio/netty/buffer/ByteBuf;", cancellable = true)
    private void writeLongLE__823573294(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-823573294L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "writeLongLE(J)Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void writeLongLE__106097319(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-106097319L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setCharSequence(ILjava/lang/CharSequence;Ljava/nio/charset/Charset;)I", cancellable = true)
    private void setCharSequence_1038822268(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1038822268L))
            info.setReturnValue(-1972250289);
    }

    @Inject(at = @At("HEAD"), method = "writeMedium(I)Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void writeMedium__1862052584(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1862052584L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "writeMedium(I)Lio/netty/buffer/ByteBuf;", cancellable = true)
    private void writeMedium__1041469743(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1041469743L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readUnsignedMedium()I", cancellable = true)
    private void readUnsignedMedium_328225624(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(328225624L))
            info.setReturnValue(-2066288938);
    }

    @Inject(at = @At("HEAD"), method = "bytesBefore(IIB)I", cancellable = true)
    private void bytesBefore__435771404(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-435771404L))
            info.setReturnValue(-551732019);
    }

    @Inject(at = @At("HEAD"), method = "bytesBefore(B)I", cancellable = true)
    private void bytesBefore__2064925292(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2064925292L))
            info.setReturnValue(1149176931);
    }

    @Inject(at = @At("HEAD"), method = "bytesBefore(IB)I", cancellable = true)
    private void bytesBefore_1475646695(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1475646695L))
            info.setReturnValue(-72156004);
    }

    @Inject(at = @At("HEAD"), method = "getUnsignedIntLE(I)J", cancellable = true)
    private void getUnsignedIntLE_649419727(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(649419727L))
            info.setReturnValue(-2809494184451352007L);
    }

    @Inject(at = @At("HEAD"), method = "writeMediumLE(I)Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void writeMediumLE__684584943(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-684584943L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "writeMediumLE(I)Lio/netty/buffer/ByteBuf;", cancellable = true)
    private void writeMediumLE__1548033654(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1548033654L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getCharSequence(IILjava/nio/charset/Charset;)Ljava/lang/CharSequence;", cancellable = true)
    private void getCharSequence__1687445868(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1687445868L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readRetainedSlice(I)Lio/netty/buffer/ByteBuf;", cancellable = true)
    private void readRetainedSlice__2120780427(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2120780427L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readMediumLE()I", cancellable = true)
    private void readMediumLE__929892236(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-929892236L))
            info.setReturnValue(-1942554863);
    }

    @Inject(at = @At("HEAD"), method = "readCharSequence(ILjava/nio/charset/Charset;)Ljava/lang/CharSequence;", cancellable = true)
    private void readCharSequence_1843573025(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1843573025L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "nioBufferCount()I", cancellable = true)
    private void nioBufferCount_271366205(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(271366205L))
            info.setReturnValue(-1433021012);
    }

    @Inject(at = @At("HEAD"), method = "isContiguous()Z", cancellable = true)
    private void isContiguous_1052223767(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1052223767L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "retainedDuplicate()Lio/netty/buffer/ByteBuf;", cancellable = true)
    private void retainedDuplicate__76982083(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-76982083L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "memoryAddress()J", cancellable = true)
    private void memoryAddress_949332294(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(949332294L))
            info.setReturnValue(-8797952934393385873L);
    }

    @Inject(at = @At("HEAD"), method = "writeCharSequence(Ljava/lang/CharSequence;Ljava/nio/charset/Charset;)I", cancellable = true)
    private void writeCharSequence_1678577684(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1678577684L))
            info.setReturnValue(1651270266);
    }

    @Inject(at = @At("HEAD"), method = "readShortLE()S", cancellable = true)
    private void readShortLE_504964547(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(504964547L))
            info.setReturnValue((short) 8676);
    }

    @Inject(at = @At("HEAD"), method = "retainedSlice(II)Lio/netty/buffer/ByteBuf;", cancellable = true)
    private void retainedSlice_336328246(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(336328246L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "retainedSlice()Lio/netty/buffer/ByteBuf;", cancellable = true)
    private void retainedSlice__1639691370(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1639691370L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setMediumLE(II)Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void setMediumLE__801653733(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-801653733L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setMediumLE(II)Lio/netty/buffer/ByteBuf;", cancellable = true)
    private void setMediumLE_257820436(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(257820436L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readUnsignedShortLE()I", cancellable = true)
    private void readUnsignedShortLE_718790094(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(718790094L))
            info.setReturnValue(941830232);
    }

    @Inject(at = @At("HEAD"), method = "writeShortLE(I)Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void writeShortLE__636997638(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-636997638L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "writeShortLE(I)Lio/netty/buffer/ByteBuf;", cancellable = true)
    private void writeShortLE__482665165(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-482665165L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readUnsignedMediumLE()I", cancellable = true)
    private void readUnsignedMediumLE_1404030335(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1404030335L))
            info.setReturnValue(2106750507);
    }

    @Inject(at = @At("HEAD"), method = "internalNioBuffer(II)Ljava/nio/ByteBuffer;", cancellable = true)
    private void internalNioBuffer__1163378129(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1163378129L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasMemoryAddress()Z", cancellable = true)
    private void hasMemoryAddress__329678448(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-329678448L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "limitValue(Ljava/util/function/IntFunction;I)Ljava/util/function/IntFunction;", cancellable = true)
    private static void limitValue__1451227048(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1451227048L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "writeById(Ljava/util/function/ToIntFunction;Ljava/lang/Object;)Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void writeById_213325520(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(213325520L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readEither(Lnet/minecraft/network/codec/StreamDecoder;Lnet/minecraft/network/codec/StreamDecoder;)Lcom/mojang/datafixers/util/Either;", cancellable = true)
    private void readEither_637440974(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(637440974L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readVarInt()I", cancellable = true)
    private void readVarInt__1981874278(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1981874278L))
            info.setReturnValue(1814097060);
    }

    @Inject(at = @At("HEAD"), method = "readById(Ljava/util/function/IntFunction;)Ljava/lang/Object;", cancellable = true)
    private void readById__1229556266(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1229556266L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "writeUtf(Ljava/lang/String;)Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void writeUtf_1438431597(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1438431597L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "writeUtf(Ljava/lang/String;I)Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void writeUtf_962156258(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(962156258L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readUtf(I)Ljava/lang/String;", cancellable = true)
    private void readUtf_509743185(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(509743185L))
            info.setReturnValue("fmHP6Y\uD738R0x+53^UT-p>2y'_3 C56n\uAC0BTV8n:s2/TdX\u9700\u3B8B;$!,{");
    }

    @Inject(at = @At("HEAD"), method = "readUtf()Ljava/lang/String;", cancellable = true)
    private void readUtf__2070178708(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2070178708L))
            info.setReturnValue("d\u5F2F\u11E4I/hM#'!.$R'OEs\u5CAF|\uBFD2<\u430EQW5h^rE|f2u.aId\u4213i{7m.]3(@Q>P_'m[a]^6@U1zAhL\u8959jY \uBF74tvd\u1C25Z{>WD3");
    }

    @Inject(at = @At("HEAD"), method = "writeMap(Ljava/util/Map;Lnet/minecraft/network/codec/StreamEncoder;Lnet/minecraft/network/codec/StreamEncoder;)V", cancellable = true)
    private void writeMap__303961539(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-303961539L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "readBitSet()Ljava/util/BitSet;", cancellable = true)
    private void readBitSet_31138966(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(31138966L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readCollection(Ljava/util/function/IntFunction;Lnet/minecraft/network/codec/StreamDecoder;)Ljava/util/Collection;", cancellable = true)
    private void readCollection__704719380(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-704719380L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "writeEither(Lcom/mojang/datafixers/util/Either;Lnet/minecraft/network/codec/StreamEncoder;Lnet/minecraft/network/codec/StreamEncoder;)V", cancellable = true)
    private void writeEither_887507123(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(887507123L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "writeOptional(Ljava/util/Optional;Lnet/minecraft/network/codec/StreamEncoder;)V", cancellable = true)
    private void writeOptional__754683778(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-754683778L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "writePublicKey(Ljava/security/PublicKey;)Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void writePublicKey_103632805(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(103632805L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "writeBlockHitResult(Lnet/minecraft/world/phys/BlockHitResult;)V", cancellable = true)
    private void writeBlockHitResult_1244127759(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1244127759L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "writeBitSet(Ljava/util/BitSet;)V", cancellable = true)
    private void writeBitSet__555331221(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-555331221L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "readChunkPos(Lio/netty/buffer/ByteBuf;)Lnet/minecraft/world/level/ChunkPos;", cancellable = true)
    private static void readChunkPos_502556083(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(502556083L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readChunkPos()Lnet/minecraft/world/level/ChunkPos;", cancellable = true)
    private void readChunkPos_368620666(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(368620666L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readBlockHitResult()Lnet/minecraft/world/phys/BlockHitResult;", cancellable = true)
    private void readBlockHitResult_740331950(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(740331950L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "writeVarInt(I)Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void writeVarInt__1278982037(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1278982037L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "writeBlockPos(Lio/netty/buffer/ByteBuf;Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private static void writeBlockPos__486369722(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-486369722L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "writeBlockPos(Lnet/minecraft/core/BlockPos;)Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void writeBlockPos_436957573(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(436957573L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readWithCodecTrusted(Lcom/mojang/serialization/DynamicOps;Lcom/mojang/serialization/Codec;)Ljava/lang/Object;", cancellable = true)
    private void readWithCodecTrusted__1737243661(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1737243661L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "writeIdentifier(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void writeIdentifier__744179509(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-744179509L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readIdentifier()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void readIdentifier__2008608104(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2008608104L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readWithCount(Ljava/util/function/Consumer;)V", cancellable = true)
    private void readWithCount_288286210(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(288286210L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "readFixedSizeLongArray([J)[J", cancellable = true)
    private void readFixedSizeLongArray__1875520145(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1875520145L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readFixedSizeLongArray(Lio/netty/buffer/ByteBuf;[J)[J", cancellable = true)
    private static void readFixedSizeLongArray__793976378(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-793976378L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "writeFixedSizeLongArray(Lio/netty/buffer/ByteBuf;[J)V", cancellable = true)
    private static void writeFixedSizeLongArray__1212069224(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1212069224L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "writeFixedSizeLongArray([J)Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void writeFixedSizeLongArray_1029666227(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1029666227L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "writeInstant(Ljava/time/Instant;)V", cancellable = true)
    private void writeInstant_662387218(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(662387218L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "readBlockPos(Lio/netty/buffer/ByteBuf;)Lnet/minecraft/core/BlockPos;", cancellable = true)
    private static void readBlockPos_971210221(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(971210221L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readBlockPos()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void readBlockPos__1025026474(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1025026474L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readOptional(Lnet/minecraft/network/codec/StreamDecoder;)Ljava/util/Optional;", cancellable = true)
    private void readOptional_857565897(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(857565897L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readGlobalPos()Lnet/minecraft/core/GlobalPos;", cancellable = true)
    private void readGlobalPos__299123066(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-299123066L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "writeGlobalPos(Lnet/minecraft/core/GlobalPos;)V", cancellable = true)
    private void writeGlobalPos__2070679699(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2070679699L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "writeVarLong(J)Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void writeVarLong_950540553(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(950540553L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readInstant()Ljava/time/Instant;", cancellable = true)
    private void readInstant__117359937(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-117359937L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readWithCodec(Lcom/mojang/serialization/DynamicOps;Lcom/mojang/serialization/Codec;Lnet/minecraft/nbt/NbtAccounter;)Ljava/lang/Object;", cancellable = true)
    private void readWithCodec_290643268(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(290643268L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "writeWithCodec(Lcom/mojang/serialization/DynamicOps;Lcom/mojang/serialization/Codec;Ljava/lang/Object;)Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void writeWithCodec__815835307(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-815835307L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readVarLong()J", cancellable = true)
    private void readVarLong_919842156(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(919842156L))
            info.setReturnValue(-4209243592247227719L);
    }

    @Inject(at = @At("HEAD"), method = "readIntIdList()Lit/unimi/dsi/fastutil/ints/IntList;", cancellable = true)
    private void readIntIdList__1530594181(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1530594181L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readRegistryKey()Lnet/minecraft/resources/ResourceKey;", cancellable = true)
    private void readRegistryKey__1365714761(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1365714761L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "writeFixedBitSet(Ljava/util/BitSet;I)V", cancellable = true)
    private void writeFixedBitSet_1564263566(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1564263566L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "readVarIntArray(I)[I", cancellable = true)
    private void readVarIntArray_661817867(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(661817867L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readVarIntArray()[I", cancellable = true)
    private void readVarIntArray_935961722(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(935961722L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "writeResourceKey(Lnet/minecraft/resources/ResourceKey;)V", cancellable = true)
    private void writeResourceKey_1055628859(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1055628859L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "writeChunkPos(Lio/netty/buffer/ByteBuf;Lnet/minecraft/world/level/ChunkPos;)V", cancellable = true)
    private static void writeChunkPos_176842804(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(176842804L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "writeChunkPos(Lnet/minecraft/world/level/ChunkPos;)Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void writeChunkPos_1323921329(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1323921329L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readLenientJsonWithCodec(Lcom/mojang/serialization/Codec;)Ljava/lang/Object;", cancellable = true)
    private void readLenientJsonWithCodec__92922163(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-92922163L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "readPublicKey()Ljava/security/PublicKey;", cancellable = true)
    private void readPublicKey_734400066(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(734400066L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readResourceKey(Lnet/minecraft/resources/ResourceKey;)Lnet/minecraft/resources/ResourceKey;", cancellable = true)
    private void readResourceKey__1227415582(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1227415582L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readFixedBitSet(I)Ljava/util/BitSet;", cancellable = true)
    private void readFixedBitSet__1501431905(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1501431905L))
            info.setReturnValue(new java.util.BitSet());
    }

    @Inject(at = @At("HEAD"), method = "writeIntIdList(Lit/unimi/dsi/fastutil/ints/IntList;)V", cancellable = true)
    private void writeIntIdList_16731220(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(16731220L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "writeEnumSet(Ljava/util/EnumSet;Ljava/lang/Class;)V", cancellable = true)
    private void writeEnumSet_787309696(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(787309696L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "writeJsonWithCodec(Lcom/mojang/serialization/Codec;Ljava/lang/Object;)V", cancellable = true)
    private void writeJsonWithCodec__861057569(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-861057569L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "readEnumSet(Ljava/lang/Class;)Ljava/util/EnumSet;", cancellable = true)
    private void readEnumSet__1331674093(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1331674093L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "writeCollection(Ljava/util/Collection;Lnet/minecraft/network/codec/StreamEncoder;)V", cancellable = true)
    private void writeCollection_665840634(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(665840634L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "writeVarIntArray([I)Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void writeVarIntArray__1149931609(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1149931609L))
            info.setReturnValue(null);
    }


}
