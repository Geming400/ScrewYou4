package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.nbt.ByteArrayTag.class)
public class ByteArrayTag1588086731Mixin {
        @Inject(at = @At("HEAD"), method = "remove(I)Lnet/minecraft/nbt/ByteTag;", cancellable = true)
    private void remove__246424355(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-246424355L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "remove(I)Lnet/minecraft/nbt/Tag;", cancellable = true)
    private void remove_1184631541(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1184631541L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "size()I", cancellable = true)
    private void size_2031818320(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2031818320L))
            info.setReturnValue(-702179296);
    }

    @Inject(at = @At("HEAD"), method = "get(I)Lnet/minecraft/nbt/ByteTag;", cancellable = true)
    private void get_1948691375(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1948691375L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "get(I)Lnet/minecraft/nbt/Tag;", cancellable = true)
    private void get_616501959(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(616501959L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_679459967(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(679459967L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1936457536(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1936457536L))
            info.setReturnValue("\u633D\uC72C]\u8161Z32?VvgUi\uBEE1Z<?1\uAFC3g\uAF45?f");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2145438326(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2145438326L))
            info.setReturnValue(634554415);
    }

    @Inject(at = @At("HEAD"), method = "clear()V", cancellable = true)
    private void clear_802259025(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(802259025L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "copy()Lnet/minecraft/nbt/Tag;", cancellable = true)
    private void copy_21579875(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(21579875L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getId()B", cancellable = true)
    private void getId__70243591(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-70243591L))
            info.setReturnValue(107);
    }

    @Inject(at = @At("HEAD"), method = "accept(Lnet/minecraft/nbt/StreamTagVisitor;)Lnet/minecraft/nbt/StreamTagVisitor$ValueResult;", cancellable = true)
    private void accept_1231046952(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1231046952L))
            info.setReturnValue(net.minecraft.nbt.StreamTagVisitor.ValueResult.HALT);
    }

    @Inject(at = @At("HEAD"), method = "accept(Lnet/minecraft/nbt/TagVisitor;)V", cancellable = true)
    private void accept__121005010(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-121005010L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "write(Ljava/io/DataOutput;)V", cancellable = true)
    private void write__1334448121(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1334448121L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getType()Lnet/minecraft/nbt/TagType;", cancellable = true)
    private void getType__1245751378(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1245751378L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sizeInBytes()I", cancellable = true)
    private void sizeInBytes_1042850252(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1042850252L))
            info.setReturnValue(1315087829);
    }

    @Inject(at = @At("HEAD"), method = "asByteArray()Ljava/util/Optional;", cancellable = true)
    private void asByteArray__681886056(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-681886056L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "addTag(ILnet/minecraft/nbt/Tag;)Z", cancellable = true)
    private void addTag__1458699888(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1458699888L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getAsByteArray()[B", cancellable = true)
    private void getAsByteArray__525527942(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-525527942L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setTag(ILnet/minecraft/nbt/Tag;)Z", cancellable = true)
    private void setTag__18415279(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-18415279L))
            info.setReturnValue(false);
    }


}
