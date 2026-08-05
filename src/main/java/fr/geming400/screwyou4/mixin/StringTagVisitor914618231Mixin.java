package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.nbt.StringTagVisitor.class)
public class StringTagVisitor914618231Mixin {
        @Inject(at = @At("HEAD"), method = "build()Ljava/lang/String;", cancellable = true)
    private void build__220842240(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-220842240L))
            info.setReturnValue("d3w^v腍vn(e#xb7?/u=+3KXI21^a>5C-ꎟ:}=&^5a@6eMukQ*BzJ");
    }

    @Inject(at = @At("HEAD"), method = "visitIntArray(Lnet/minecraft/nbt/IntArrayTag;)V", cancellable = true)
    private void visitIntArray__993128908(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-993128908L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "visitByteArray(Lnet/minecraft/nbt/ByteArrayTag;)V", cancellable = true)
    private void visitByteArray_1015478413(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1015478413L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "visitLongArray(Lnet/minecraft/nbt/LongArrayTag;)V", cancellable = true)
    private void visitLongArray_1007554457(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1007554457L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "visitDouble(Lnet/minecraft/nbt/DoubleTag;)V", cancellable = true)
    private void visitDouble_1448870171(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1448870171L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "visitString(Lnet/minecraft/nbt/StringTag;)V", cancellable = true)
    private void visitString_1194435931(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1194435931L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "visitEnd(Lnet/minecraft/nbt/EndTag;)V", cancellable = true)
    private void visitEnd__36550665(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-36550665L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "visitLong(Lnet/minecraft/nbt/LongTag;)V", cancellable = true)
    private void visitLong_2010117766(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2010117766L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "visitFloat(Lnet/minecraft/nbt/FloatTag;)V", cancellable = true)
    private void visitFloat__1670902216(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1670902216L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "visitInt(Lnet/minecraft/nbt/IntTag;)V", cancellable = true)
    private void visitInt__1783889141(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1783889141L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "visitShort(Lnet/minecraft/nbt/ShortTag;)V", cancellable = true)
    private void visitShort__752267176(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-752267176L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "visitCompound(Lnet/minecraft/nbt/CompoundTag;)V", cancellable = true)
    private void visitCompound_1475526453(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1475526453L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "visitList(Lnet/minecraft/nbt/ListTag;)V", cancellable = true)
    private void visitList_1197252264(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1197252264L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "visitByte(Lnet/minecraft/nbt/ByteTag;)V", cancellable = true)
    private void visitByte__1929493230(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1929493230L))
            info.cancel();
    }


}
