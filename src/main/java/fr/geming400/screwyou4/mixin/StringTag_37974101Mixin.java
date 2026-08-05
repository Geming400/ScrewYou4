package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.nbt.StringTag.class)
public class StringTag_37974101Mixin {
        @Inject(at = @At("HEAD"), method = "value()Ljava/lang/String;", cancellable = true)
    private void value__1097486371(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1097486371L))
            info.setReturnValue("?EB',迡#ﵕ,RxN");
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1423486359(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1423486359L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1097486371(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1097486371L))
            info.setReturnValue("?EB',迡#ﵕ,RxN");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_76236842(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(76236842L))
            info.setReturnValue(85177488);
    }

    @Inject(at = @At("HEAD"), method = "valueOf(Ljava/lang/String;)Lnet/minecraft/nbt/StringTag;", cancellable = true)
    private static void valueOf__1211734924(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1211734924L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "copy()Lnet/minecraft/nbt/Tag;", cancellable = true)
    private void copy_1581390145(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1581390145L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "copy()Lnet/minecraft/nbt/StringTag;", cancellable = true)
    private void copy_964811378(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(964811378L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getId()B", cancellable = true)
    private void getId_76229619(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(76229619L))
            info.setReturnValue(-92);
    }

    @Inject(at = @At("HEAD"), method = "accept(Lnet/minecraft/nbt/StreamTagVisitor;)Lnet/minecraft/nbt/StreamTagVisitor$ValueResult;", cancellable = true)
    private void accept_2018284713(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2018284713L))
            info.setReturnValue(net.minecraft.nbt.StreamTagVisitor.ValueResult.HALT);
    }

    @Inject(at = @At("HEAD"), method = "accept(Lnet/minecraft/nbt/TagVisitor;)V", cancellable = true)
    private void accept_1008129727(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1008129727L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "write(Ljava/io/DataOutput;)V", cancellable = true)
    private void write_621029263(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(621029263L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getType()Lnet/minecraft/nbt/TagType;", cancellable = true)
    private void getType_1454599655(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1454599655L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sizeInBytes()I", cancellable = true)
    private void sizeInBytes_76236346(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(76236346L))
            info.setReturnValue(-1287606587);
    }

    @Inject(at = @At("HEAD"), method = "asString()Ljava/util/Optional;", cancellable = true)
    private void asString_283435522(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(283435522L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "skipString(Ljava/io/DataInput;)V", cancellable = true)
    private static void skipString_465893362(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(465893362L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "quoteAndEscape(Ljava/lang/String;)Ljava/lang/String;", cancellable = true)
    private static void quoteAndEscape_1250716171(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1250716171L))
            info.setReturnValue("m\"<0/lSmB?]寃䦈K ");
    }

    @Inject(at = @At("HEAD"), method = "quoteAndEscape(Ljava/lang/String;Ljava/lang/StringBuilder;)V", cancellable = true)
    private static void quoteAndEscape_847619542(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(847619542L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "escapeWithoutQuotes(Ljava/lang/String;Ljava/lang/StringBuilder;)V", cancellable = true)
    private static void escapeWithoutQuotes_847619542(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(847619542L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "escapeWithoutQuotes(Ljava/lang/String;)Ljava/lang/String;", cancellable = true)
    private static void escapeWithoutQuotes_1250716171(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1250716171L))
            info.setReturnValue("m\"<0/lSmB?]寃䦈K ");
    }


}
