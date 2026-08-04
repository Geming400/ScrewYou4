package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.nbt.TextComponentTagVisitor.class)
public class TextComponentTagVisitor1022896374Mixin {
        @Inject(at = @At("HEAD"), method = "visit(Lnet/minecraft/nbt/Tag;)Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void visit__1599468471(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1599468471L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "visitByteArray(Lnet/minecraft/nbt/ByteArrayTag;)V", cancellable = true)
    private void visitByteArray_1123756556(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1123756556L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "visitDouble(Lnet/minecraft/nbt/DoubleTag;)V", cancellable = true)
    private void visitDouble_1557148314(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1557148314L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "visitIntArray(Lnet/minecraft/nbt/IntArrayTag;)V", cancellable = true)
    private void visitIntArray__884850765(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-884850765L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "visitCompound(Lnet/minecraft/nbt/CompoundTag;)V", cancellable = true)
    private void visitCompound_1583804596(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1583804596L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "visitLongArray(Lnet/minecraft/nbt/LongArrayTag;)V", cancellable = true)
    private void visitLongArray_1115832600(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1115832600L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "visitString(Lnet/minecraft/nbt/StringTag;)V", cancellable = true)
    private void visitString_1302714074(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1302714074L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "visitByte(Lnet/minecraft/nbt/ByteTag;)V", cancellable = true)
    private void visitByte__1821215087(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1821215087L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "visitEnd(Lnet/minecraft/nbt/EndTag;)V", cancellable = true)
    private void visitEnd_71727478(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(71727478L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "visitInt(Lnet/minecraft/nbt/IntTag;)V", cancellable = true)
    private void visitInt__1675610998(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1675610998L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "visitFloat(Lnet/minecraft/nbt/FloatTag;)V", cancellable = true)
    private void visitFloat__1562624073(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1562624073L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "visitLong(Lnet/minecraft/nbt/LongTag;)V", cancellable = true)
    private void visitLong_2118395909(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2118395909L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "visitList(Lnet/minecraft/nbt/ListTag;)V", cancellable = true)
    private void visitList_1305530407(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1305530407L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "visitShort(Lnet/minecraft/nbt/ShortTag;)V", cancellable = true)
    private void visitShort__643989033(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-643989033L))
            info.cancel();
    }


}
