package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.nbt.NbtIo.class)
public class NbtIo_1473256Mixin {
        @Inject(at = @At("HEAD"), method = "write(Lnet/minecraft/nbt/CompoundTag;Ljava/nio/file/Path;)V", cancellable = true)
    private static void write_1269991804(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1269991804L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "write(Lnet/minecraft/nbt/CompoundTag;Ljava/io/DataOutput;)V", cancellable = true)
    private static void write_245760165(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(245760165L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "parse(Ljava/io/DataInput;Lnet/minecraft/nbt/StreamTagVisitor;Lnet/minecraft/nbt/NbtAccounter;)V", cancellable = true)
    private static void parse_1858539727(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1858539727L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "read(Ljava/nio/file/Path;)Lnet/minecraft/nbt/CompoundTag;", cancellable = true)
    private static void read__532901450(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-532901450L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "read(Ljava/io/DataInput;)Lnet/minecraft/nbt/CompoundTag;", cancellable = true)
    private static void read_1682316618(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1682316618L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "read(Ljava/io/DataInput;Lnet/minecraft/nbt/NbtAccounter;)Lnet/minecraft/nbt/CompoundTag;", cancellable = true)
    private static void read_1798526012(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1798526012L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "parseCompressed(Ljava/nio/file/Path;Lnet/minecraft/nbt/StreamTagVisitor;Lnet/minecraft/nbt/NbtAccounter;)V", cancellable = true)
    private static void parseCompressed_2125386811(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2125386811L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "parseCompressed(Ljava/io/InputStream;Lnet/minecraft/nbt/StreamTagVisitor;Lnet/minecraft/nbt/NbtAccounter;)V", cancellable = true)
    private static void parseCompressed__164833691(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-164833691L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "writeAnyTag(Lnet/minecraft/nbt/Tag;Ljava/io/DataOutput;)V", cancellable = true)
    private static void writeAnyTag__1563461542(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1563461542L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "readUnnamedTag(Ljava/io/DataInput;Lnet/minecraft/nbt/NbtAccounter;)Lnet/minecraft/nbt/Tag;", cancellable = true)
    private static void readUnnamedTag_1034694065(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1034694065L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "writeUnnamedTag(Lnet/minecraft/nbt/Tag;Ljava/io/DataOutput;)V", cancellable = true)
    private static void writeUnnamedTag__1563461542(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1563461542L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "writeCompressed(Lnet/minecraft/nbt/CompoundTag;Ljava/nio/file/Path;)V", cancellable = true)
    private static void writeCompressed_1269991804(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1269991804L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "writeCompressed(Lnet/minecraft/nbt/CompoundTag;Ljava/io/OutputStream;)V", cancellable = true)
    private static void writeCompressed_1930337551(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1930337551L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "readCompressed(Ljava/nio/file/Path;Lnet/minecraft/nbt/NbtAccounter;)Lnet/minecraft/nbt/CompoundTag;", cancellable = true)
    private static void readCompressed_1734154408(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1734154408L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "readCompressed(Ljava/io/InputStream;Lnet/minecraft/nbt/NbtAccounter;)Lnet/minecraft/nbt/CompoundTag;", cancellable = true)
    private static void readCompressed__848657838(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-848657838L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "writeUnnamedTagWithFallback(Lnet/minecraft/nbt/Tag;Ljava/io/DataOutput;)V", cancellable = true)
    private static void writeUnnamedTagWithFallback__1563461542(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1563461542L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "readAnyTag(Ljava/io/DataInput;Lnet/minecraft/nbt/NbtAccounter;)Lnet/minecraft/nbt/Tag;", cancellable = true)
    private static void readAnyTag_1034694065(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1034694065L))
            info.setReturnValue(null);
    }


}
