package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.nbt.StringTagVisitor.class)
public class StringTagVisitor914618231Mixin {
        @Inject(at = @At("HEAD"), method = "build()Ljava/lang/String;", cancellable = true)
    private void build_1074353902(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1074353902L))
            info.setReturnValue("A\u6084\uB66Fg\u8CB6(|zU_f[J\u3593g/\u3BB8&");
    }

    @Inject(at = @At("HEAD"), method = "visitCompound(Lnet/minecraft/nbt/CompoundTag;)V", cancellable = true)
    private void visitCompound__132125621(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-132125621L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "visitByte(Lnet/minecraft/nbt/ByteTag;)V", cancellable = true)
    private void visitByte_632831493(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(632831493L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "visitList(Lnet/minecraft/nbt/ListTag;)V", cancellable = true)
    private void visitList_528944945(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(528944945L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "visitByteArray(Lnet/minecraft/nbt/ByteArrayTag;)V", cancellable = true)
    private void visitByteArray_1493515047(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1493515047L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "visitIntArray(Lnet/minecraft/nbt/IntArrayTag;)V", cancellable = true)
    private void visitIntArray__913693239(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-913693239L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "visitDouble(Lnet/minecraft/nbt/DoubleTag;)V", cancellable = true)
    private void visitDouble_930550551(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(930550551L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "visitLongArray(Lnet/minecraft/nbt/LongArrayTag;)V", cancellable = true)
    private void visitLongArray__974608729(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-974608729L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "visitString(Lnet/minecraft/nbt/StringTag;)V", cancellable = true)
    private void visitString_1273072535(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1273072535L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "visitLong(Lnet/minecraft/nbt/LongTag;)V", cancellable = true)
    private void visitLong_595297517(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(595297517L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "visitShort(Lnet/minecraft/nbt/ShortTag;)V", cancellable = true)
    private void visitShort__204819321(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-204819321L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "visitInt(Lnet/minecraft/nbt/IntTag;)V", cancellable = true)
    private void visitInt_2049434599(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2049434599L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "visitFloat(Lnet/minecraft/nbt/FloatTag;)V", cancellable = true)
    private void visitFloat_1175588999(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1175588999L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "visitEnd(Lnet/minecraft/nbt/EndTag;)V", cancellable = true)
    private void visitEnd_1791695463(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1791695463L))
            info.cancel();
    }


}
