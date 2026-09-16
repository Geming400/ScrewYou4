package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.nbt.SnbtPrinterTagVisitor.class)
public class SnbtPrinterTagVisitor_1011695981Mixin {
        @Inject(at = @At("HEAD"), method = "pathString()Ljava/lang/String;", cancellable = true)
    private void pathString__900100853(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-900100853L))
            info.setReturnValue("r<nNS'Haa .y8ihgzG\uC516[9#R>w[\u8A08\u1110zK\u1712',M_87Wqm\uA0F5\uA6F7!D3=H-m}\u023FKz!po'V0e>");
    }

    @Inject(at = @At("HEAD"), method = "visit(Lnet/minecraft/nbt/Tag;)Ljava/lang/String;", cancellable = true)
    private void visit__776039350(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-776039350L))
            info.setReturnValue("DYi_&S<\u0A4B_lGl\u0D9B[^lgx\u4F0C\u311DR3");
    }

    @Inject(at = @At("HEAD"), method = "visitDouble(Lnet/minecraft/nbt/DoubleTag;)V", cancellable = true)
    private void visitDouble_1027628300(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1027628300L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "visitByteArray(Lnet/minecraft/nbt/ByteArrayTag;)V", cancellable = true)
    private void visitByteArray_1590592796(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1590592796L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "visitIntArray(Lnet/minecraft/nbt/IntArrayTag;)V", cancellable = true)
    private void visitIntArray__816615490(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-816615490L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "visitLongArray(Lnet/minecraft/nbt/LongArrayTag;)V", cancellable = true)
    private void visitLongArray__877530980(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-877530980L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "visitString(Lnet/minecraft/nbt/StringTag;)V", cancellable = true)
    private void visitString_1370150284(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1370150284L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "visitCompound(Lnet/minecraft/nbt/CompoundTag;)V", cancellable = true)
    private void visitCompound__35047872(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-35047872L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "visitFloat(Lnet/minecraft/nbt/FloatTag;)V", cancellable = true)
    private void visitFloat_1272666748(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1272666748L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "visitLong(Lnet/minecraft/nbt/LongTag;)V", cancellable = true)
    private void visitLong_692375266(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(692375266L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "visitEnd(Lnet/minecraft/nbt/EndTag;)V", cancellable = true)
    private void visitEnd_1888773212(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1888773212L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "visitInt(Lnet/minecraft/nbt/IntTag;)V", cancellable = true)
    private void visitInt_2146512348(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2146512348L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "visitShort(Lnet/minecraft/nbt/ShortTag;)V", cancellable = true)
    private void visitShort__107741572(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-107741572L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "visitList(Lnet/minecraft/nbt/ListTag;)V", cancellable = true)
    private void visitList_626022694(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(626022694L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "visitByte(Lnet/minecraft/nbt/ByteTag;)V", cancellable = true)
    private void visitByte_729909242(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(729909242L))
            info.cancel();
    }


}
