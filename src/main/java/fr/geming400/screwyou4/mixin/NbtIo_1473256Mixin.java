package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.nbt.NbtIo.class)
public class NbtIo_1473256Mixin {
        @Inject(at = @At("HEAD"), method = "write(Lnet/minecraft/nbt/CompoundTag;Ljava/nio/file/Path;)V", cancellable = true)
    private static void write_796375131(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(796375131L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "write(Lnet/minecraft/nbt/CompoundTag;Ljava/io/DataOutput;)V", cancellable = true)
    private static void write__227856508(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-227856508L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "parse(Ljava/io/DataInput;Lnet/minecraft/nbt/StreamTagVisitor;Lnet/minecraft/nbt/NbtAccounter;)V", cancellable = true)
    private static void parse_1062590722(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1062590722L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "read(Ljava/nio/file/Path;)Lnet/minecraft/nbt/CompoundTag;", cancellable = true)
    private static void read__1593071776(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1593071776L))
            info.setReturnValue(new net.minecraft.nbt.CompoundTag());
    }

    @Inject(at = @At("HEAD"), method = "read(Ljava/io/DataInput;)Lnet/minecraft/nbt/CompoundTag;", cancellable = true)
    private static void read__1815565728(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1815565728L))
            info.setReturnValue(new net.minecraft.nbt.CompoundTag());
    }

    @Inject(at = @At("HEAD"), method = "read(Ljava/io/DataInput;Lnet/minecraft/nbt/NbtAccounter;)Lnet/minecraft/nbt/CompoundTag;", cancellable = true)
    private static void read__1244919470(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1244919470L))
            info.setReturnValue(new net.minecraft.nbt.CompoundTag());
    }

    @Inject(at = @At("HEAD"), method = "readCompressed(Ljava/nio/file/Path;Lnet/minecraft/nbt/NbtAccounter;)Lnet/minecraft/nbt/CompoundTag;", cancellable = true)
    private static void readCompressed__1566115567(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1566115567L))
            info.setReturnValue(new net.minecraft.nbt.CompoundTag());
    }

    @Inject(at = @At("HEAD"), method = "readCompressed(Ljava/io/InputStream;Lnet/minecraft/nbt/NbtAccounter;)Lnet/minecraft/nbt/CompoundTag;", cancellable = true)
    private static void readCompressed__77811959(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-77811959L))
            info.setReturnValue(new net.minecraft.nbt.CompoundTag());
    }

    @Inject(at = @At("HEAD"), method = "writeCompressed(Lnet/minecraft/nbt/CompoundTag;Ljava/nio/file/Path;)V", cancellable = true)
    private static void writeCompressed__1206969796(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1206969796L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "writeCompressed(Lnet/minecraft/nbt/CompoundTag;Ljava/io/OutputStream;)V", cancellable = true)
    private static void writeCompressed_982121935(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(982121935L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "readAnyTag(Ljava/io/DataInput;Lnet/minecraft/nbt/NbtAccounter;)Lnet/minecraft/nbt/Tag;", cancellable = true)
    private static void readAnyTag__748570123(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-748570123L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "writeAnyTag(Lnet/minecraft/nbt/Tag;Ljava/io/DataOutput;)V", cancellable = true)
    private static void writeAnyTag__195043033(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-195043033L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "writeUnnamedTagWithFallback(Lnet/minecraft/nbt/Tag;Ljava/io/DataOutput;)V", cancellable = true)
    private static void writeUnnamedTagWithFallback_742676283(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(742676283L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "readUnnamedTag(Ljava/io/DataInput;Lnet/minecraft/nbt/NbtAccounter;)Lnet/minecraft/nbt/Tag;", cancellable = true)
    private static void readUnnamedTag__1569293535(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1569293535L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "parseCompressed(Ljava/nio/file/Path;Lnet/minecraft/nbt/StreamTagVisitor;Lnet/minecraft/nbt/NbtAccounter;)V", cancellable = true)
    private static void parseCompressed_2146816551(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2146816551L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "parseCompressed(Ljava/io/InputStream;Lnet/minecraft/nbt/StreamTagVisitor;Lnet/minecraft/nbt/NbtAccounter;)V", cancellable = true)
    private static void parseCompressed_499488249(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(499488249L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "writeUnnamedTag(Lnet/minecraft/nbt/Tag;Ljava/io/DataOutput;)V", cancellable = true)
    private static void writeUnnamedTag_308857555(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(308857555L))
            info.cancel();
    }


}
