package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.nbt.TextComponentTagVisitor.class)
public class TextComponentTagVisitor1022896374Mixin {
        @Inject(at = @At("HEAD"), method = "visit(Lnet/minecraft/nbt/Tag;)Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void visit_1473790046(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1473790046L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "visitCompound(Lnet/minecraft/nbt/CompoundTag;)V", cancellable = true)
    private void visitCompound__23847478(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-23847478L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "visitByte(Lnet/minecraft/nbt/ByteTag;)V", cancellable = true)
    private void visitByte_741109636(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(741109636L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "visitList(Lnet/minecraft/nbt/ListTag;)V", cancellable = true)
    private void visitList_637223088(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(637223088L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "visitByteArray(Lnet/minecraft/nbt/ByteArrayTag;)V", cancellable = true)
    private void visitByteArray_1601793190(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1601793190L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "visitIntArray(Lnet/minecraft/nbt/IntArrayTag;)V", cancellable = true)
    private void visitIntArray__805415096(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-805415096L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "visitDouble(Lnet/minecraft/nbt/DoubleTag;)V", cancellable = true)
    private void visitDouble_1038828694(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1038828694L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "visitLongArray(Lnet/minecraft/nbt/LongArrayTag;)V", cancellable = true)
    private void visitLongArray__866330586(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-866330586L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "visitString(Lnet/minecraft/nbt/StringTag;)V", cancellable = true)
    private void visitString_1381350678(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1381350678L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "visitLong(Lnet/minecraft/nbt/LongTag;)V", cancellable = true)
    private void visitLong_703575660(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(703575660L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "visitShort(Lnet/minecraft/nbt/ShortTag;)V", cancellable = true)
    private void visitShort__96541178(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-96541178L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "visitInt(Lnet/minecraft/nbt/IntTag;)V", cancellable = true)
    private void visitInt__2137254554(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2137254554L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "visitFloat(Lnet/minecraft/nbt/FloatTag;)V", cancellable = true)
    private void visitFloat_1283867142(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1283867142L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "visitEnd(Lnet/minecraft/nbt/EndTag;)V", cancellable = true)
    private void visitEnd_1899973606(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1899973606L))
            info.cancel();
    }


}
