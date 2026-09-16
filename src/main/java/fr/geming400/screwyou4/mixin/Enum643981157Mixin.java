package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.OptionInstance.Enum.class)
public class Enum643981157Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__264645111(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-264645111L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1414404682(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1414404682L))
            info.setReturnValue("%\u9F40B\u1A831^&&6c,EzG#a]#6x\u2B561V[8@?j\uD68F\uBBAE");
    }

    @Inject(at = @At("HEAD"), method = "values()Ljava/util/List;", cancellable = true)
    private void values_1821902263(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1821902263L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1201333248(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1201333248L))
            info.setReturnValue(-87069472);
    }

    @Inject(at = @At("HEAD"), method = "validateValue(Ljava/lang/Object;)Ljava/util/Optional;", cancellable = true)
    private void validateValue_1258637874(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1258637874L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/Codec;", cancellable = true)
    private void codec__1160728383(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1160728383L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueListSupplier()Lnet/minecraft/client/gui/components/CycleButton$ValueListSupplier;", cancellable = true)
    private void valueListSupplier_1000881428(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1000881428L))
            info.setReturnValue(null);
    }


}
