package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.nbt.SnbtPrinterTagVisitor.class)
public class SnbtPrinterTagVisitor_1011695981Mixin {
        @Inject(at = @At("HEAD"), method = "pathString()Ljava/lang/String;", cancellable = true)
    private void pathString__123764491(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-123764491L))
            info.setReturnValue(")o\"tBD*LNSepS^un',Ih>(hxtcK\u61D0F&\u906CI^8r>^\uBEAA2#\"\u80F2\u23733[\u0456\"m.'S\u50A3mO\u33C31hX\u91B7PlCF%\u6CC4|&/{\u527C\u24D3%B\u1540");
    }

    @Inject(at = @At("HEAD"), method = "visit(Lnet/minecraft/nbt/Tag;)Ljava/lang/String;", cancellable = true)
    private void visit_1859077045(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1859077045L))
            info.setReturnValue("\uD3B3z\"\u68FFV\uC40Cf\uFCBF`QK,Ib\uB073APk\uBDDB_,&K+lt35t\u5CB7+%:@O\uB220&R,\u82CC(Hxwor>\"{UzO\u337FM5p&5P:A _1@}g=dyIDST0\u35575vO3|Bzee");
    }

    @Inject(at = @At("HEAD"), method = "visitCompound(Lnet/minecraft/nbt/CompoundTag;)V", cancellable = true)
    private void visitCompound_1572604202(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1572604202L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "visitList(Lnet/minecraft/nbt/ListTag;)V", cancellable = true)
    private void visitList_1294330013(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1294330013L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "visitByte(Lnet/minecraft/nbt/ByteTag;)V", cancellable = true)
    private void visitByte__1832415481(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1832415481L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "visitLong(Lnet/minecraft/nbt/LongTag;)V", cancellable = true)
    private void visitLong_2107195515(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2107195515L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "visitFloat(Lnet/minecraft/nbt/FloatTag;)V", cancellable = true)
    private void visitFloat__1573824467(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1573824467L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "visitEnd(Lnet/minecraft/nbt/EndTag;)V", cancellable = true)
    private void visitEnd_60527084(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(60527084L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "visitInt(Lnet/minecraft/nbt/IntTag;)V", cancellable = true)
    private void visitInt__1686811392(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1686811392L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "visitShort(Lnet/minecraft/nbt/ShortTag;)V", cancellable = true)
    private void visitShort__655189427(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-655189427L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "visitString(Lnet/minecraft/nbt/StringTag;)V", cancellable = true)
    private void visitString_1291513680(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1291513680L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "visitLongArray(Lnet/minecraft/nbt/LongArrayTag;)V", cancellable = true)
    private void visitLongArray_1104632206(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1104632206L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "visitIntArray(Lnet/minecraft/nbt/IntArrayTag;)V", cancellable = true)
    private void visitIntArray__896051159(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-896051159L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "visitDouble(Lnet/minecraft/nbt/DoubleTag;)V", cancellable = true)
    private void visitDouble_1545947920(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1545947920L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "visitByteArray(Lnet/minecraft/nbt/ByteArrayTag;)V", cancellable = true)
    private void visitByteArray_1112556162(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1112556162L))
            info.cancel();
    }


}
