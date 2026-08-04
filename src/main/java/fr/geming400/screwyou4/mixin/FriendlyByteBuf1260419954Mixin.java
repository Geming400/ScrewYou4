package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.FriendlyByteBuf.class)
public class FriendlyByteBuf1260419954Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1649035579(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1649035579L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString(IILjava/nio/charset/Charset;)Ljava/lang/String;", cancellable = true)
    private void toString_498400013(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(498400013L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_124959483(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(124959483L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString(Ljava/nio/charset/Charset;)Ljava/lang/String;", cancellable = true)
    private void toString_165101101(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(165101101L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1298682200(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1298682200L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "compareTo(Lio/netty/buffer/ByteBuf;)I", cancellable = true)
    private void compareTo__2097625379(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2097625379L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "compareTo(Ljava/lang/Object;)I", cancellable = true)
    private void compareTo__1648922956(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1648922956L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "indexOf(IIB)I", cancellable = true)
    private void indexOf_473850410(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(473850410L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBoolean(I)Z", cancellable = true)
    private void getBoolean__1820626526(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1820626526L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getByte(I)B", cancellable = true)
    private void getByte__1820649590(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1820649590L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getShort(I)S", cancellable = true)
    private void getShort__1820633253(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1820633253L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getChar(I)C", cancellable = true)
    private void getChar__1820648629(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1820648629L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getInt(I)I", cancellable = true)
    private void getInt__1820642863(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1820642863L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getLong(I)J", cancellable = true)
    private void getLong__1820641902(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1820641902L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getFloat(I)F", cancellable = true)
    private void getFloat__1820645746(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1820645746L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDouble(I)D", cancellable = true)
    private void getDouble__1820647668(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1820647668L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "clear()Lio/netty/buffer/ByteBuf;", cancellable = true)
    private void clear__1338356700(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1338356700L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "clear()Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void clear__2123504341(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2123504341L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBytes(ILjava/nio/channels/GatheringByteChannel;I)I", cancellable = true)
    private void getBytes__1222503916(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1222503916L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBytes(ILjava/io/OutputStream;I)Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void getBytes_69147929(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(69147929L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBytes(ILjava/nio/channels/FileChannel;JI)I", cancellable = true)
    private void getBytes_1472506437(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1472506437L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBytes(ILio/netty/buffer/ByteBuf;I)Lio/netty/buffer/ByteBuf;", cancellable = true)
    private void getBytes_405986289(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(405986289L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBytes(ILio/netty/buffer/ByteBuf;)Lio/netty/buffer/ByteBuf;", cancellable = true)
    private void getBytes__926128304(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-926128304L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBytes(ILio/netty/buffer/ByteBuf;II)Lio/netty/buffer/ByteBuf;", cancellable = true)
    private void getBytes__1248134288(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1248134288L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBytes(I[B)Lio/netty/buffer/ByteBuf;", cancellable = true)
    private void getBytes_1571002404(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1571002404L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBytes(ILio/netty/buffer/ByteBuf;II)Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void getBytes_1234427767(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1234427767L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBytes(ILjava/nio/ByteBuffer;)Lio/netty/buffer/ByteBuf;", cancellable = true)
    private void getBytes__454702318(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-454702318L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBytes(I[BII)Lio/netty/buffer/ByteBuf;", cancellable = true)
    private void getBytes_1902724932(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1902724932L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBytes(ILio/netty/buffer/ByteBuf;)Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void getBytes__932510889(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-932510889L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBytes(ILio/netty/buffer/ByteBuf;I)Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void getBytes_477383224(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(477383224L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBytes(ILjava/nio/ByteBuffer;)Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void getBytes_924953497(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(924953497L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBytes(I[BII)Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void getBytes__155785141(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-155785141L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBytes(I[B)Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void getBytes_648163627(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(648163627L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBytes(ILjava/io/OutputStream;I)Lio/netty/buffer/ByteBuf;", cancellable = true)
    private void getBytes_2141183122(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2141183122L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "copy(II)Lio/netty/buffer/ByteBuf;", cancellable = true)
    private void copy_2032206724(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2032206724L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "copy()Lio/netty/buffer/ByteBuf;", cancellable = true)
    private void copy__1338485660(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1338485660L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isDirect()Z", cancellable = true)
    private void isDirect_1298698537(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1298698537L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasArray()Z", cancellable = true)
    private void hasArray_1298698537(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1298698537L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "array()[B", cancellable = true)
    private void array__1848712712(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1848712712L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "arrayOffset()I", cancellable = true)
    private void arrayOffset_1298682200(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1298682200L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "writeInt(I)Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void writeInt__2083675420(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2083675420L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "writeInt(I)Lio/netty/buffer/ByteBuf;", cancellable = true)
    private void writeInt_511807901(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(511807901L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readInt()I", cancellable = true)
    private void readInt_1298682200(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1298682200L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setBoolean(IZ)Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void setBoolean_113112860(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(113112860L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setBoolean(IZ)Lio/netty/buffer/ByteBuf;", cancellable = true)
    private void setBoolean_930162645(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(930162645L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setByte(II)Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void setByte__848978869(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-848978869L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setByte(II)Lio/netty/buffer/ByteBuf;", cancellable = true)
    private void setByte_2032335684(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2032335684L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setChar(II)Lio/netty/buffer/ByteBuf;", cancellable = true)
    private void setChar_2032335684(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2032335684L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setChar(II)Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void setChar__848978869(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-848978869L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setShort(II)Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void setShort__848978869(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-848978869L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setShort(II)Lio/netty/buffer/ByteBuf;", cancellable = true)
    private void setShort_2032335684(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2032335684L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setInt(II)Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void setInt__848978869(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-848978869L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setInt(II)Lio/netty/buffer/ByteBuf;", cancellable = true)
    private void setInt_2032335684(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2032335684L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setLong(IJ)Lio/netty/buffer/ByteBuf;", cancellable = true)
    private void setLong__1569529915(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1569529915L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setLong(IJ)Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void setLong__1297675508(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1297675508L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setFloat(IF)Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void setFloat_497111048(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(497111048L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setFloat(IF)Lio/netty/buffer/ByteBuf;", cancellable = true)
    private void setFloat__46969407(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-46969407L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setDouble(ID)Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void setDouble_1394504326(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1394504326L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setDouble(ID)Lio/netty/buffer/ByteBuf;", cancellable = true)
    private void setDouble__1433172801(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1433172801L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "unwrap()Lio/netty/buffer/ByteBuf;", cancellable = true)
    private void unwrap__1338485660(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1338485660L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "capacity(I)Lio/netty/buffer/ByteBuf;", cancellable = true)
    private void capacity_511807901(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(511807901L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "capacity(I)Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void capacity__2083675420(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2083675420L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "capacity()I", cancellable = true)
    private void capacity_1298682200(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1298682200L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "release()Z", cancellable = true)
    private void release_1298698537(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1298698537L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "release(I)Z", cancellable = true)
    private void release__1820626526(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1820626526L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isReadOnly()Z", cancellable = true)
    private void isReadOnly_1298698537(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1298698537L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "slice()Lio/netty/buffer/ByteBuf;", cancellable = true)
    private void slice__1338485660(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1338485660L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "slice(II)Lio/netty/buffer/ByteBuf;", cancellable = true)
    private void slice_2032206724(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2032206724L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "duplicate()Lio/netty/buffer/ByteBuf;", cancellable = true)
    private void duplicate__1338485660(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1338485660L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readLong()J", cancellable = true)
    private void readLong_1298683161(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1298683161L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readByte()B", cancellable = true)
    private void readByte_1298675473(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1298675473L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readShort()S", cancellable = true)
    private void readShort_1298691810(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1298691810L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "writeLong(J)Lio/netty/buffer/ByteBuf;", cancellable = true)
    private void writeLong_1204909598(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1204909598L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "writeLong(J)Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void writeLong_1762595237(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1762595237L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "writeByte(I)Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void writeByte__2083675420(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2083675420L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "writeByte(I)Lio/netty/buffer/ByteBuf;", cancellable = true)
    private void writeByte_511807901(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(511807901L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "writeShort(I)Lio/netty/buffer/ByteBuf;", cancellable = true)
    private void writeShort_511807901(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(511807901L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "writeShort(I)Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void writeShort__2083675420(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2083675420L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readBytes(Lio/netty/buffer/ByteBuf;I)Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void readBytes_501330367(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(501330367L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readBytes(Ljava/nio/ByteBuffer;)Lio/netty/buffer/ByteBuf;", cancellable = true)
    private void readBytes_810203883(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(810203883L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readBytes([B)Lio/netty/buffer/ByteBuf;", cancellable = true)
    private void readBytes_1679281387(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1679281387L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readBytes(Lio/netty/buffer/ByteBuf;)Lio/netty/buffer/ByteBuf;", cancellable = true)
    private void readBytes__166477143(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-166477143L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readBytes([BII)Lio/netty/buffer/ByteBuf;", cancellable = true)
    private void readBytes__1415354805(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1415354805L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readBytes(Ljava/io/OutputStream;I)Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void readBytes__37537038(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-37537038L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readBytes(Lio/netty/buffer/ByteBuf;I)Lio/netty/buffer/ByteBuf;", cancellable = true)
    private void readBytes__1814631496(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1814631496L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readBytes(Ljava/io/OutputStream;I)Lio/netty/buffer/ByteBuf;", cancellable = true)
    private void readBytes__2054669781(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2054669781L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readBytes(Lio/netty/buffer/ByteBuf;II)Lio/netty/buffer/ByteBuf;", cancellable = true)
    private void readBytes__1367808887(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1367808887L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readBytes(Ljava/nio/channels/GatheringByteChannel;I)I", cancellable = true)
    private void readBytes_1940051565(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1940051565L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readBytes(Lio/netty/buffer/ByteBuf;)Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void readBytes__377549072(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-377549072L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readBytes(Ljava/nio/ByteBuffer;)Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void readBytes__961188942(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-961188942L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readBytes([BII)Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void readBytes__900813038(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-900813038L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readBytes(Lio/netty/buffer/ByteBuf;II)Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void readBytes_1976789200(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1976789200L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readBytes([B)Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void readBytes_1027276210(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1027276210L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readBytes(Ljava/nio/channels/FileChannel;JI)I", cancellable = true)
    private void readBytes_1677186974(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1677186974L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readBytes(I)Lio/netty/buffer/ByteBuf;", cancellable = true)
    private void readBytes_511678941(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(511678941L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "writeBytes(Lio/netty/buffer/ByteBuf;)Lio/netty/buffer/ByteBuf;", cancellable = true)
    private void writeBytes__166477143(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-166477143L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "writeBytes(Lio/netty/buffer/ByteBuf;I)Lio/netty/buffer/ByteBuf;", cancellable = true)
    private void writeBytes__1814631496(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1814631496L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "writeBytes([BII)Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void writeBytes__900813038(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-900813038L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "writeBytes(Lio/netty/buffer/ByteBuf;II)Lio/netty/buffer/ByteBuf;", cancellable = true)
    private void writeBytes__1367808887(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1367808887L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "writeBytes([B)Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void writeBytes_1027276210(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1027276210L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "writeBytes(Ljava/nio/ByteBuffer;)Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void writeBytes__961188942(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-961188942L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "writeBytes(Ljava/io/InputStream;I)I", cancellable = true)
    private void writeBytes__646704536(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-646704536L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "writeBytes(Ljava/nio/channels/ScatteringByteChannel;I)I", cancellable = true)
    private void writeBytes_1275549722(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1275549722L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "writeBytes(Ljava/nio/channels/FileChannel;JI)I", cancellable = true)
    private void writeBytes_1677186974(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1677186974L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "writeBytes(Lio/netty/buffer/ByteBuf;)Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void writeBytes__377549072(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-377549072L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "writeBytes([B)Lio/netty/buffer/ByteBuf;", cancellable = true)
    private void writeBytes_1679281387(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1679281387L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "writeBytes([BII)Lio/netty/buffer/ByteBuf;", cancellable = true)
    private void writeBytes__1415354805(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1415354805L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "writeBytes(Ljava/nio/ByteBuffer;)Lio/netty/buffer/ByteBuf;", cancellable = true)
    private void writeBytes_810203883(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(810203883L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "writeBytes(Lio/netty/buffer/ByteBuf;I)Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void writeBytes_501330367(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(501330367L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "writeBytes(Lio/netty/buffer/ByteBuf;II)Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void writeBytes_1976789200(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1976789200L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "order(Ljava/nio/ByteOrder;)Lio/netty/buffer/ByteBuf;", cancellable = true)
    private void order__890025611(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-890025611L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "order()Ljava/nio/ByteOrder;", cancellable = true)
    private void order__366470526(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-366470526L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isWritable(I)Z", cancellable = true)
    private void isWritable__1820626526(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1820626526L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isWritable()Z", cancellable = true)
    private void isWritable_1298698537(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1298698537L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readUnsignedShort()I", cancellable = true)
    private void readUnsignedShort_1298682200(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1298682200L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "writeChar(I)Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void writeChar__2083675420(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2083675420L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "writeChar(I)Lio/netty/buffer/ByteBuf;", cancellable = true)
    private void writeChar_511807901(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(511807901L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readChar()C", cancellable = true)
    private void readChar_1298676434(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1298676434L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "writeFloat(F)Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void writeFloat__737585503(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-737585503L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "writeFloat(F)Lio/netty/buffer/ByteBuf;", cancellable = true)
    private void writeFloat__1567497190(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1567497190L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readFloat()F", cancellable = true)
    private void readFloat_1298679317(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1298679317L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "writeDouble(D)Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void writeDouble_159807775(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(159807775L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "writeDouble(D)Lio/netty/buffer/ByteBuf;", cancellable = true)
    private void writeDouble_1341266712(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1341266712L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readDouble()D", cancellable = true)
    private void readDouble_1298677395(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1298677395L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "skipBytes(I)Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void skipBytes__2083675420(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2083675420L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "skipBytes(I)Lio/netty/buffer/ByteBuf;", cancellable = true)
    private void skipBytes_511807901(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(511807901L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readBoolean()Z", cancellable = true)
    private void readBoolean_1298698537(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1298698537L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readUnsignedByte()S", cancellable = true)
    private void readUnsignedByte_1298691810(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1298691810L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getUnsignedShort(I)I", cancellable = true)
    private void getUnsignedShort__1820642863(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1820642863L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "writeBoolean(Z)Lio/netty/buffer/ByteBuf;", cancellable = true)
    private void writeBoolean__590365138(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-590365138L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "writeBoolean(Z)Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void writeBoolean__1121583691(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1121583691L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readString(ILjava/nio/charset/Charset;)Ljava/lang/String;", cancellable = true)
    private void readString_1786129428(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1786129428L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readEnum(Ljava/lang/Class;)Ljava/lang/Enum;", cancellable = true)
    private void readEnum__1260795976(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1260795976L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "writeEnum(Ljava/lang/Enum;)Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void writeEnum_335567045(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(335567045L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "asReadOnly()Lio/netty/buffer/ByteBuf;", cancellable = true)
    private void asReadOnly__1338485660(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1338485660L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isReadable()Z", cancellable = true)
    private void isReadable_1298698537(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1298698537L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isReadable(I)Z", cancellable = true)
    private void isReadable__1820626526(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1820626526L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setIndex(II)Lio/netty/buffer/ByteBuf;", cancellable = true)
    private void setIndex_2032335684(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2032335684L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setIndex(II)Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void setIndex__848978869(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-848978869L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "writeMap(Ljava/util/Map;Lnet/minecraft/network/codec/StreamEncoder;Lnet/minecraft/network/codec/StreamEncoder;)V", cancellable = true)
    private void writeMap_1450445184(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1450445184L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "readMap(Ljava/util/function/IntFunction;Lnet/minecraft/network/codec/StreamDecoder;Lnet/minecraft/network/codec/StreamDecoder;)Ljava/util/Map;", cancellable = true)
    private void readMap_572271065(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(572271065L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readMap(Lnet/minecraft/network/codec/StreamDecoder;Lnet/minecraft/network/codec/StreamDecoder;)Ljava/util/Map;", cancellable = true)
    private void readMap__1536528454(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1536528454L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "writeUtf(Ljava/lang/String;I)Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void writeUtf__1854279782(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1854279782L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "writeUtf(Ljava/lang/String;)Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void writeUtf_793389493(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(793389493L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readUtf()Ljava/lang/String;", cancellable = true)
    private void readUtf_124959483(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(124959483L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readUtf(I)Ljava/lang/String;", cancellable = true)
    private void readUtf__160449630(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-160449630L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "touch(Ljava/lang/Object;)Lio/netty/buffer/ByteBuf;", cancellable = true)
    private void touch__1307091520(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1307091520L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "touch(Ljava/lang/Object;)Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void touch__800197177(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-800197177L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "touch(Ljava/lang/Object;)Lio/netty/util/ReferenceCounted;", cancellable = true)
    private void touch_826404842(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(826404842L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "touch()Lio/netty/util/ReferenceCounted;", cancellable = true)
    private void touch_1418512646(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1418512646L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "touch()Lio/netty/buffer/ByteBuf;", cancellable = true)
    private void touch__1338356700(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1338356700L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "touch()Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void touch__2123504341(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2123504341L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readOptional(Lnet/minecraft/network/codec/StreamDecoder;)Ljava/util/Optional;", cancellable = true)
    private void readOptional__2126991969(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2126991969L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "writeOptional(Ljava/util/Optional;Lnet/minecraft/network/codec/StreamEncoder;)V", cancellable = true)
    private void writeOptional__144738401(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-144738401L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "writeIdentifier(Lnet/minecraft/resources/Identifier;)Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void writeIdentifier__364848205(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-364848205L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readIdentifier()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void readIdentifier__1182646599(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1182646599L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "writeCollection(Ljava/util/Collection;Lnet/minecraft/network/codec/StreamEncoder;)V", cancellable = true)
    private void writeCollection_1344968157(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1344968157L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "writeNullable(Ljava/lang/Object;Lnet/minecraft/network/codec/StreamEncoder;)V", cancellable = true)
    private void writeNullable__2108527854(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2108527854L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "writeNullable(Lio/netty/buffer/ByteBuf;Ljava/lang/Object;Lnet/minecraft/network/codec/StreamEncoder;)V", cancellable = true)
    private static void writeNullable__1003088731(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1003088731L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "readInstant()Ljava/time/Instant;", cancellable = true)
    private void readInstant__1937313142(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1937313142L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readNullable(Lio/netty/buffer/ByteBuf;Lnet/minecraft/network/codec/StreamDecoder;)Ljava/lang/Object;", cancellable = true)
    private static void readNullable__875319735(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-875319735L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readNullable(Lnet/minecraft/network/codec/StreamDecoder;)Ljava/lang/Object;", cancellable = true)
    private void readNullable_751588684(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(751588684L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "writeInstant(Ljava/time/Instant;)V", cancellable = true)
    private void writeInstant_664208144(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(664208144L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "readUnsignedInt()J", cancellable = true)
    private void readUnsignedInt_1298683161(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1298683161L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "writerIndex()I", cancellable = true)
    private void writerIndex_1298682200(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1298682200L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "writerIndex(I)Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void writerIndex__2083675420(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2083675420L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "writerIndex(I)Lio/netty/buffer/ByteBuf;", cancellable = true)
    private void writerIndex_511807901(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(511807901L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "limitValue(Ljava/util/function/IntFunction;I)Ljava/util/function/IntFunction;", cancellable = true)
    private static void limitValue__68964082(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-68964082L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readNbt()Lnet/minecraft/nbt/CompoundTag;", cancellable = true)
    private void readNbt__309802966(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-309802966L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readNbt(Lio/netty/buffer/ByteBuf;Lnet/minecraft/nbt/NbtAccounter;)Lnet/minecraft/nbt/Tag;", cancellable = true)
    private static void readNbt_305922638(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(305922638L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readNbt(Lnet/minecraft/nbt/NbtAccounter;)Lnet/minecraft/nbt/Tag;", cancellable = true)
    private void readNbt__1528495727(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1528495727L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readNbt(Lio/netty/buffer/ByteBuf;)Lnet/minecraft/nbt/CompoundTag;", cancellable = true)
    private static void readNbt_1200523239(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1200523239L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "alloc()Lio/netty/buffer/ByteBufAllocator;", cancellable = true)
    private void alloc_1816283335(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1816283335L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readList(Lnet/minecraft/network/codec/StreamDecoder;)Ljava/util/List;", cancellable = true)
    private void readList_1203847585(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1203847585L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "writeResourceKey(Lnet/minecraft/resources/ResourceKey;)V", cancellable = true)
    private void writeResourceKey_1448089257(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1448089257L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "readRegistryKey()Lnet/minecraft/resources/ResourceKey;", cancellable = true)
    private void readRegistryKey_2068911267(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2068911267L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readCollection(Ljava/util/function/IntFunction;Lnet/minecraft/network/codec/StreamDecoder;)Ljava/util/Collection;", cancellable = true)
    private void readCollection__298917312(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-298917312L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readFixedBitSet(I)Ljava/util/BitSet;", cancellable = true)
    private void readFixedBitSet_1367683634(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1367683634L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readBlockPos()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void readBlockPos__632966925(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-632966925L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readBlockPos(Lio/netty/buffer/ByteBuf;)Lnet/minecraft/core/BlockPos;", cancellable = true)
    private static void readBlockPos_298212848(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(298212848L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readContainerId(Lio/netty/buffer/ByteBuf;)I", cancellable = true)
    private static void readContainerId__2097625131(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2097625131L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readContainerId()I", cancellable = true)
    private void readContainerId_1298682200(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1298682200L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readWithCodec(Lcom/mojang/serialization/DynamicOps;Lcom/mojang/serialization/Codec;Lnet/minecraft/nbt/NbtAccounter;)Ljava/lang/Object;", cancellable = true)
    private void readWithCodec__974111874(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-974111874L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "writeByteArray(Lio/netty/buffer/ByteBuf;[B)V", cancellable = true)
    private static void writeByteArray_1096962345(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1096962345L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "writeByteArray([B)Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void writeByteArray_1027276210(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1027276210L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readQuaternion(Lio/netty/buffer/ByteBuf;)Lorg/joml/Quaternionf;", cancellable = true)
    private static void readQuaternion__485918613(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-485918613L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readQuaternion()Lorg/joml/Quaternionf;", cancellable = true)
    private void readQuaternion__53159976(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-53159976L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "writeContainerId(Lio/netty/buffer/ByteBuf;I)V", cancellable = true)
    private static void writeContainerId_268017329(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(268017329L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "writeContainerId(I)V", cancellable = true)
    private void writeContainerId__1820630370(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1820630370L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isContiguous()Z", cancellable = true)
    private void isContiguous_1298698537(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1298698537L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "maxFastWritableBytes()I", cancellable = true)
    private void maxFastWritableBytes_1298682200(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1298682200L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "writeBlockPos(Lnet/minecraft/core/BlockPos;)Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void writeBlockPos_343804927(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(343804927L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "writeBlockPos(Lio/netty/buffer/ByteBuf;Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private static void writeBlockPos_230981004(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(230981004L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "writeVarInt(I)Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void writeVarInt__2083675420(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2083675420L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "writeFixedBitSet(Ljava/util/BitSet;I)V", cancellable = true)
    private void writeFixedBitSet_616007492(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(616007492L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "readByteArray(I)[B", cancellable = true)
    private void readByteArray_236458143(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(236458143L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readByteArray(Lio/netty/buffer/ByteBuf;I)[B", cancellable = true)
    private static void readByteArray_560019932(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(560019932L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readByteArray(Lio/netty/buffer/ByteBuf;)[B", cancellable = true)
    private static void readByteArray_239934987(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(239934987L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readByteArray()[B", cancellable = true)
    private void readByteArray__1848712712(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1848712712L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readVarIntArray()[I", cancellable = true)
    private void readVarIntArray__1848705985(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1848705985L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readVarIntArray(I)[I", cancellable = true)
    private void readVarIntArray_236464870(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(236464870L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "writeFixedSizeLongArray([J)Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void writeFixedSizeLongArray_1732670394(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1732670394L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "writeFixedSizeLongArray(Lio/netty/buffer/ByteBuf;[J)V", cancellable = true)
    private static void writeFixedSizeLongArray_1104350513(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1104350513L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "readFixedSizeLongArray(Lio/netty/buffer/ByteBuf;[J)[J", cancellable = true)
    private static void readFixedSizeLongArray_716552548(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(716552548L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readFixedSizeLongArray([J)[J", cancellable = true)
    private void readFixedSizeLongArray__723920879(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-723920879L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "writeLongArray(Lio/netty/buffer/ByteBuf;[J)V", cancellable = true)
    private static void writeLongArray_1104350513(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1104350513L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "writeLongArray([J)Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void writeLongArray_1732670394(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1732670394L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readResourceKey(Lnet/minecraft/resources/ResourceKey;)Lnet/minecraft/resources/ResourceKey;", cancellable = true)
    private void readResourceKey__2054703321(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2054703321L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readVector3f()Lorg/joml/Vector3f;", cancellable = true)
    private void readVector3f_723830336(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(723830336L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readVector3f(Lio/netty/buffer/ByteBuf;)Lorg/joml/Vector3f;", cancellable = true)
    private static void readVector3f__723073667(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-723073667L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "writeVector3f(Lorg/joml/Vector3f;)V", cancellable = true)
    private void writeVector3f__1777417914(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1777417914L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "writeVector3f(Lio/netty/buffer/ByteBuf;Lorg/joml/Vector3fc;)V", cancellable = true)
    private static void writeVector3f__464184988(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-464184988L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "readLongArray(Lio/netty/buffer/ByteBuf;)[J", cancellable = true)
    private static void readLongArray_239942675(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(239942675L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readLongArray()[J", cancellable = true)
    private void readLongArray__1848705024(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1848705024L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "writeQuaternion(Lio/netty/buffer/ByteBuf;Lorg/joml/Quaternionfc;)V", cancellable = true)
    private static void writeQuaternion__808668428(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-808668428L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "writeQuaternion(Lorg/joml/Quaternionf;)V", cancellable = true)
    private void writeQuaternion__2053886900(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2053886900L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "readWithCodecTrusted(Lcom/mojang/serialization/DynamicOps;Lcom/mojang/serialization/Codec;)Ljava/lang/Object;", cancellable = true)
    private void readWithCodecTrusted__459527248(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-459527248L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "maxWritableBytes()I", cancellable = true)
    private void maxWritableBytes_1298682200(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1298682200L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "writableBytes()I", cancellable = true)
    private void writableBytes_1298682200(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1298682200L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "forEachByteDesc(IILio/netty/util/ByteProcessor;)I", cancellable = true)
    private void forEachByteDesc__62736964(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-62736964L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "forEachByteDesc(Lio/netty/util/ByteProcessor;)I", cancellable = true)
    private void forEachByteDesc__1652887332(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1652887332L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readLenientJsonWithCodec(Lcom/mojang/serialization/Codec;)Ljava/lang/Object;", cancellable = true)
    private void readLenientJsonWithCodec_1618346662(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1618346662L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "writeIntIdList(Lit/unimi/dsi/fastutil/ints/IntList;)V", cancellable = true)
    private void writeIntIdList__945429955(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-945429955L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "writeEnumSet(Ljava/util/EnumSet;Ljava/lang/Class;)V", cancellable = true)
    private void writeEnumSet_1886674178(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1886674178L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "ensureWritable(I)Lio/netty/buffer/ByteBuf;", cancellable = true)
    private void ensureWritable_511807901(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(511807901L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "ensureWritable(IZ)I", cancellable = true)
    private void ensureWritable_280227849(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(280227849L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "ensureWritable(I)Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void ensureWritable__2083675420(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2083675420L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "markWriterIndex()Lio/netty/buffer/ByteBuf;", cancellable = true)
    private void markWriterIndex__1338356700(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1338356700L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "markWriterIndex()Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void markWriterIndex__2123504341(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2123504341L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readShortLE()S", cancellable = true)
    private void readShortLE_1298691810(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1298691810L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "writeMediumLE(I)Lio/netty/buffer/ByteBuf;", cancellable = true)
    private void writeMediumLE_511807901(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(511807901L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "writeMediumLE(I)Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void writeMediumLE__2083675420(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2083675420L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readRetainedSlice(I)Lio/netty/buffer/ByteBuf;", cancellable = true)
    private void readRetainedSlice_511678941(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(511678941L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "writeEither(Lcom/mojang/datafixers/util/Either;Lnet/minecraft/network/codec/StreamEncoder;Lnet/minecraft/network/codec/StreamEncoder;)V", cancellable = true)
    private void writeEither_31911471(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(31911471L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setMediumLE(II)Lio/netty/buffer/ByteBuf;", cancellable = true)
    private void setMediumLE_2032335684(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2032335684L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setMediumLE(II)Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void setMediumLE__848978869(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-848978869L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readCharSequence(ILjava/nio/charset/Charset;)Ljava/lang/CharSequence;", cancellable = true)
    private void readCharSequence_993807790(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(993807790L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "writeShortLE(I)Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void writeShortLE__2083675420(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2083675420L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "writeShortLE(I)Lio/netty/buffer/ByteBuf;", cancellable = true)
    private void writeShortLE_511807901(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(511807901L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "writeMedium(I)Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void writeMedium__2083675420(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2083675420L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "writeMedium(I)Lio/netty/buffer/ByteBuf;", cancellable = true)
    private void writeMedium_511807901(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(511807901L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "retainedDuplicate()Lio/netty/buffer/ByteBuf;", cancellable = true)
    private void retainedDuplicate__1338485660(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1338485660L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "writeWithCodec(Lcom/mojang/serialization/DynamicOps;Lcom/mojang/serialization/Codec;Ljava/lang/Object;)Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void writeWithCodec__1268225596(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1268225596L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "writeCharSequence(Ljava/lang/CharSequence;Ljava/nio/charset/Charset;)I", cancellable = true)
    private void writeCharSequence_934245258(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(934245258L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "markReaderIndex()Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void markReaderIndex__2123504341(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2123504341L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "markReaderIndex()Lio/netty/buffer/ByteBuf;", cancellable = true)
    private void markReaderIndex__1338356700(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1338356700L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readWithCount(Ljava/util/function/Consumer;)V", cancellable = true)
    private void readWithCount_1941436367(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1941436367L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "discardReadBytes()Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void discardReadBytes__2123504341(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2123504341L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "discardReadBytes()Lio/netty/buffer/ByteBuf;", cancellable = true)
    private void discardReadBytes__1338356700(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1338356700L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "writeLongLE(J)Lio/netty/buffer/ByteBuf;", cancellable = true)
    private void writeLongLE_1204909598(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1204909598L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "writeLongLE(J)Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void writeLongLE_1762595237(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1762595237L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "bytesBefore(B)I", cancellable = true)
    private void bytesBefore__1827107510(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1827107510L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "bytesBefore(IIB)I", cancellable = true)
    private void bytesBefore_473850410(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(473850410L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "bytesBefore(IB)I", cancellable = true)
    private void bytesBefore_258063345(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(258063345L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getUnsignedMediumLE(I)I", cancellable = true)
    private void getUnsignedMediumLE__1820642863(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1820642863L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readEnumSet(Ljava/lang/Class;)Ljava/util/EnumSet;", cancellable = true)
    private void readEnumSet__514941464(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-514941464L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "resetReaderIndex()Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void resetReaderIndex__2123504341(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2123504341L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "resetReaderIndex()Lio/netty/buffer/ByteBuf;", cancellable = true)
    private void resetReaderIndex__1338356700(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1338356700L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getUnsignedInt(I)J", cancellable = true)
    private void getUnsignedInt__1820641902(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1820641902L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setCharSequence(ILjava/lang/CharSequence;Ljava/nio/charset/Charset;)I", cancellable = true)
    private void setCharSequence__1140104253(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1140104253L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getCharSequence(IILjava/nio/charset/Charset;)Ljava/lang/CharSequence;", cancellable = true)
    private void getCharSequence__1080541721(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1080541721L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getUnsignedShortLE(I)I", cancellable = true)
    private void getUnsignedShortLE__1820642863(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1820642863L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "retainedSlice(II)Lio/netty/buffer/ByteBuf;", cancellable = true)
    private void retainedSlice_2032206724(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2032206724L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "retainedSlice()Lio/netty/buffer/ByteBuf;", cancellable = true)
    private void retainedSlice__1338485660(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1338485660L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getUnsignedByte(I)S", cancellable = true)
    private void getUnsignedByte__1820633253(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1820633253L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getUnsignedMedium(I)I", cancellable = true)
    private void getUnsignedMedium__1820642863(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1820642863L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "maxCapacity()I", cancellable = true)
    private void maxCapacity_1298682200(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1298682200L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readMediumLE()I", cancellable = true)
    private void readMediumLE_1298682200(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1298682200L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readUnsignedIntLE()J", cancellable = true)
    private void readUnsignedIntLE_1298683161(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1298683161L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "forEachByte(IILio/netty/util/ByteProcessor;)I", cancellable = true)
    private void forEachByte__62736964(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-62736964L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "forEachByte(Lio/netty/util/ByteProcessor;)I", cancellable = true)
    private void forEachByte__1652887332(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1652887332L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "writeJsonWithCodec(Lcom/mojang/serialization/Codec;Ljava/lang/Object;)V", cancellable = true)
    private void writeJsonWithCodec__943630008(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-943630008L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "readIntIdList()Lit/unimi/dsi/fastutil/ints/IntList;", cancellable = true)
    private void readIntIdList__2104056247(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2104056247L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getMediumLE(I)I", cancellable = true)
    private void getMediumLE__1820642863(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1820642863L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getUnsignedIntLE(I)J", cancellable = true)
    private void getUnsignedIntLE__1820641902(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1820641902L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readUnsignedShortLE()I", cancellable = true)
    private void readUnsignedShortLE_1298682200(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1298682200L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readUnsignedMedium()I", cancellable = true)
    private void readUnsignedMedium_1298682200(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1298682200L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readUnsignedMediumLE()I", cancellable = true)
    private void readUnsignedMediumLE_1298682200(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1298682200L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "memoryAddress()J", cancellable = true)
    private void memoryAddress_1298683161(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1298683161L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "resetWriterIndex()Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void resetWriterIndex__2123504341(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2123504341L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "resetWriterIndex()Lio/netty/buffer/ByteBuf;", cancellable = true)
    private void resetWriterIndex__1338356700(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1338356700L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hasMemoryAddress()Z", cancellable = true)
    private void hasMemoryAddress_1298698537(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1298698537L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readGlobalPos()Lnet/minecraft/core/GlobalPos;", cancellable = true)
    private void readGlobalPos__1205432693(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1205432693L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "writeGlobalPos(Lnet/minecraft/core/GlobalPos;)V", cancellable = true)
    private void writeGlobalPos__57431233(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-57431233L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "writeBitSet(Ljava/util/BitSet;)V", cancellable = true)
    private void writeBitSet_2070032575(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2070032575L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "readPublicKey()Ljava/security/PublicKey;", cancellable = true)
    private void readPublicKey_1637188738(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1637188738L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readChunkPos()Lnet/minecraft/world/level/ChunkPos;", cancellable = true)
    private void readChunkPos_371321117(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(371321117L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readChunkPos(Lio/netty/buffer/ByteBuf;)Lnet/minecraft/world/level/ChunkPos;", cancellable = true)
    private static void readChunkPos__1070752144(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1070752144L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "writePublicKey(Ljava/security/PublicKey;)Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void writePublicKey__1129232114(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1129232114L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "writeBlockHitResult(Lnet/minecraft/world/phys/BlockHitResult;)V", cancellable = true)
    private void writeBlockHitResult__550822835(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-550822835L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "readBlockHitResult()Lnet/minecraft/world/phys/BlockHitResult;", cancellable = true)
    private void readBlockHitResult__1717610553(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1717610553L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readVarLong()J", cancellable = true)
    private void readVarLong_1298683161(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1298683161L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "writeVarLong(J)Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void writeVarLong_1762595237(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1762595237L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "writeChunkPos(Lio/netty/buffer/ByteBuf;Lnet/minecraft/world/level/ChunkPos;)V", cancellable = true)
    private static void writeChunkPos_1020696590(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1020696590L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "writeChunkPos(Lnet/minecraft/world/level/ChunkPos;)Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void writeChunkPos_1191137815(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1191137815L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "writeVarIntArray([I)Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void writeVarIntArray__2113600263(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2113600263L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "internalNioBuffer(II)Ljava/nio/ByteBuffer;", cancellable = true)
    private void internalNioBuffer_770323910(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(770323910L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "discardSomeReadBytes()Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void discardSomeReadBytes__2123504341(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2123504341L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "discardSomeReadBytes()Lio/netty/buffer/ByteBuf;", cancellable = true)
    private void discardSomeReadBytes__1338356700(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1338356700L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "nioBufferCount()I", cancellable = true)
    private void nioBufferCount_1298682200(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1298682200L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readableBytes()I", cancellable = true)
    private void readableBytes_1298682200(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1298682200L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readerIndex()I", cancellable = true)
    private void readerIndex_1298682200(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1298682200L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readerIndex(I)Lio/netty/buffer/ByteBuf;", cancellable = true)
    private void readerIndex_511807901(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(511807901L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readerIndex(I)Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void readerIndex__2083675420(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2083675420L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readUUID(Lio/netty/buffer/ByteBuf;)Ljava/util/UUID;", cancellable = true)
    private static void readUUID_927012440(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(927012440L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readUUID()Ljava/util/UUID;", cancellable = true)
    private void readUUID_1671554437(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1671554437L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "nioBuffer()Ljava/nio/ByteBuffer;", cancellable = true)
    private void nioBuffer__1475545434(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1475545434L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "nioBuffer(II)Ljava/nio/ByteBuffer;", cancellable = true)
    private void nioBuffer_770323910(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(770323910L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "refCnt()I", cancellable = true)
    private void refCnt_1298682200(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1298682200L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setBytes(ILio/netty/buffer/ByteBuf;II)Lio/netty/buffer/ByteBuf;", cancellable = true)
    private void setBytes__1248134288(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1248134288L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setBytes(I[B)Lio/netty/buffer/ByteBuf;", cancellable = true)
    private void setBytes_1571002404(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1571002404L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setBytes(ILio/netty/buffer/ByteBuf;I)Lio/netty/buffer/ByteBuf;", cancellable = true)
    private void setBytes_405986289(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(405986289L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setBytes(ILio/netty/buffer/ByteBuf;)Lio/netty/buffer/ByteBuf;", cancellable = true)
    private void setBytes__926128304(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-926128304L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setBytes(I[BII)Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void setBytes__155785141(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-155785141L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setBytes(ILjava/nio/ByteBuffer;)Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void setBytes_924953497(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(924953497L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setBytes(ILjava/io/InputStream;I)I", cancellable = true)
    private void setBytes__577740255(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-577740255L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setBytes(ILjava/nio/channels/ScatteringByteChannel;I)I", cancellable = true)
    private void setBytes_2020577619(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2020577619L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setBytes(ILjava/nio/channels/FileChannel;JI)I", cancellable = true)
    private void setBytes_1472506437(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1472506437L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setBytes(ILio/netty/buffer/ByteBuf;)Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void setBytes__932510889(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-932510889L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setBytes(ILio/netty/buffer/ByteBuf;I)Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void setBytes_477383224(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(477383224L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setBytes(ILio/netty/buffer/ByteBuf;II)Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void setBytes_1234427767(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1234427767L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setBytes(I[B)Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void setBytes_648163627(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(648163627L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setBytes(I[BII)Lio/netty/buffer/ByteBuf;", cancellable = true)
    private void setBytes_1902724932(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1902724932L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setBytes(ILjava/nio/ByteBuffer;)Lio/netty/buffer/ByteBuf;", cancellable = true)
    private void setBytes__454702318(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-454702318L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readLongLE()J", cancellable = true)
    private void readLongLE_1298683161(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1298683161L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getShortLE(I)S", cancellable = true)
    private void getShortLE__1820633253(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1820633253L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readMedium()I", cancellable = true)
    private void readMedium_1298682200(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1298682200L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setIntLE(II)Lio/netty/buffer/ByteBuf;", cancellable = true)
    private void setIntLE_2032335684(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2032335684L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setIntLE(II)Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void setIntLE__848978869(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-848978869L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "nioBuffers()[Ljava/nio/ByteBuffer;", cancellable = true)
    private void nioBuffers__1367332851(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1367332851L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "nioBuffers(II)[Ljava/nio/ByteBuffer;", cancellable = true)
    private void nioBuffers__464859923(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-464859923L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getLongLE(I)J", cancellable = true)
    private void getLongLE__1820641902(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1820641902L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "writeIntLE(I)Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void writeIntLE__2083675420(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2083675420L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "writeIntLE(I)Lio/netty/buffer/ByteBuf;", cancellable = true)
    private void writeIntLE_511807901(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(511807901L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getMedium(I)I", cancellable = true)
    private void getMedium__1820642863(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1820642863L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readVarInt()I", cancellable = true)
    private void readVarInt_1298682200(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1298682200L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readIntLE()I", cancellable = true)
    private void readIntLE_1298682200(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1298682200L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setMedium(II)Lio/netty/buffer/ByteBuf;", cancellable = true)
    private void setMedium_2032335684(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2032335684L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setMedium(II)Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void setMedium__848978869(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-848978869L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "writeZero(I)Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void writeZero__2083675420(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2083675420L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "writeZero(I)Lio/netty/buffer/ByteBuf;", cancellable = true)
    private void writeZero_511807901(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(511807901L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "writeNbt(Lnet/minecraft/nbt/Tag;)Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void writeNbt_1247238763(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1247238763L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "writeNbt(Lio/netty/buffer/ByteBuf;Lnet/minecraft/nbt/Tag;)V", cancellable = true)
    private static void writeNbt_1599278392(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1599278392L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "readSlice(I)Lio/netty/buffer/ByteBuf;", cancellable = true)
    private void readSlice_511678941(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(511678941L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setLongLE(IJ)Lio/netty/buffer/ByteBuf;", cancellable = true)
    private void setLongLE__1569529915(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1569529915L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setLongLE(IJ)Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void setLongLE__1297675508(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1297675508L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getIntLE(I)I", cancellable = true)
    private void getIntLE__1820642863(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1820642863L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setZero(II)Lio/netty/buffer/ByteBuf;", cancellable = true)
    private void setZero_2032335684(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2032335684L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setZero(II)Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void setZero__848978869(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-848978869L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readBitSet()Ljava/util/BitSet;", cancellable = true)
    private void readBitSet_1653092747(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1653092747L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "writeUUID(Lio/netty/buffer/ByteBuf;Ljava/util/UUID;)V", cancellable = true)
    private static void writeUUID__703109002(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-703109002L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "writeUUID(Ljava/util/UUID;)Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void writeUUID_1757937663(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1757937663L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readEither(Lnet/minecraft/network/codec/StreamDecoder;Lnet/minecraft/network/codec/StreamDecoder;)Lcom/mojang/datafixers/util/Either;", cancellable = true)
    private void readEither_1937264617(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1937264617L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readById(Ljava/util/function/IntFunction;)Ljava/lang/Object;", cancellable = true)
    private void readById__1098564274(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1098564274L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "retain()Lio/netty/buffer/ByteBuf;", cancellable = true)
    private void retain__1338356700(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1338356700L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "retain()Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void retain__2123504341(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2123504341L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "retain(I)Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void retain__2083675420(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2083675420L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "retain(I)Lio/netty/util/ReferenceCounted;", cancellable = true)
    private void retain_1659640173(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1659640173L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "retain()Lio/netty/util/ReferenceCounted;", cancellable = true)
    private void retain_1418512646(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1418512646L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "retain(I)Lio/netty/buffer/ByteBuf;", cancellable = true)
    private void retain_511807901(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(511807901L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "writeById(Ljava/util/function/ToIntFunction;Ljava/lang/Object;)Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void writeById_326105409(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(326105409L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setShortLE(II)Lio/netty/buffer/ByteBuf;", cancellable = true)
    private void setShortLE_2032335684(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2032335684L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setShortLE(II)Lnet/minecraft/network/FriendlyByteBuf;", cancellable = true)
    private void setShortLE__848978869(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-848978869L))
            info.setReturnValue(null);
    }


}
