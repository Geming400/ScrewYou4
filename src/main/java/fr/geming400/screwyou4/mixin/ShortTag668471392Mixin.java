package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.nbt.ShortTag.class)
public class ShortTag668471392Mixin {
        @Inject(at = @At("HEAD"), method = "value()S", cancellable = true)
    private void value_706743248(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(706743248L))
            info.setReturnValue((short) 6346);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_2053983651(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2053983651L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__466989079(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-466989079L))
            info.setReturnValue("NP[2N]Cac:k=0^g\uA4EB(\u0FADw=O\u2479H\uCE5B&(sQE},e`%2|>=qbx;Y;5<\uA2DF6o?ty84\u332F\u8D7Ao_I#^,,%a5V2v;");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_706734134(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(706734134L))
            info.setReturnValue(1423004226);
    }

    @Inject(at = @At("HEAD"), method = "byteValue()B", cancellable = true)
    private void byteValue_706726911(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(706726911L))
            info.setReturnValue(-14);
    }

    @Inject(at = @At("HEAD"), method = "shortValue()S", cancellable = true)
    private void shortValue_706743248(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(706743248L))
            info.setReturnValue((short) 6346);
    }

    @Inject(at = @At("HEAD"), method = "intValue()I", cancellable = true)
    private void intValue_706733638(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(706733638L))
            info.setReturnValue(25596221);
    }

    @Inject(at = @At("HEAD"), method = "longValue()J", cancellable = true)
    private void longValue_706734599(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(706734599L))
            info.setReturnValue(3423024180013906966L);
    }

    @Inject(at = @At("HEAD"), method = "floatValue()F", cancellable = true)
    private void floatValue_706730755(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(706730755L))
            info.setReturnValue(4.347991E8F);
    }

    @Inject(at = @At("HEAD"), method = "doubleValue()D", cancellable = true)
    private void doubleValue_706728833(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(706728833L))
            info.setReturnValue(4.347991001374538E8D);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(S)Lnet/minecraft/nbt/ShortTag;", cancellable = true)
    private static void valueOf__1704722590(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1704722590L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "copy()Lnet/minecraft/nbt/Tag;", cancellable = true)
    private void copy__2083079859(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2083079859L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "copy()Lnet/minecraft/nbt/ShortTag;", cancellable = true)
    private void copy_278127565(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(278127565L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getId()B", cancellable = true)
    private void getId_706726911(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(706726911L))
            info.setReturnValue(-14);
    }

    @Inject(at = @At("HEAD"), method = "accept(Lnet/minecraft/nbt/TagVisitor;)V", cancellable = true)
    private void accept_1638627019(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1638627019L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "accept(Lnet/minecraft/nbt/StreamTagVisitor;)Lnet/minecraft/nbt/StreamTagVisitor$ValueResult;", cancellable = true)
    private void accept__1646185291(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1646185291L))
            info.setReturnValue(net.minecraft.nbt.StreamTagVisitor.ValueResult.BREAK);
    }

    @Inject(at = @At("HEAD"), method = "write(Ljava/io/DataOutput;)V", cancellable = true)
    private void write_1251526555(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1251526555L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getType()Lnet/minecraft/nbt/TagType;", cancellable = true)
    private void getType_2085096947(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2085096947L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "box()Ljava/lang/Number;", cancellable = true)
    private void box_1372219825(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1372219825L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sizeInBytes()I", cancellable = true)
    private void sizeInBytes_706733638(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(706733638L))
            info.setReturnValue(25596221);
    }


}
