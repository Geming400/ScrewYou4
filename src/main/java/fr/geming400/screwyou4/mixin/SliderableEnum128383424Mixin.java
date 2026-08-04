package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.OptionInstance.SliderableEnum.class)
public class SliderableEnum128383424Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1513895683(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1513895683L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1007076551(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1007076551L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "values()Ljava/util/List;", cancellable = true)
    private void values_1754720240(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1754720240L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_166646166(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(166646166L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "next(Ljava/lang/Object;)Ljava/util/Optional;", cancellable = true)
    private void next__881473454(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-881473454L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "previous(Ljava/lang/Object;)Ljava/util/Optional;", cancellable = true)
    private void previous__881473454(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-881473454L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "validateValue(Ljava/lang/Object;)Ljava/util/Optional;", cancellable = true)
    private void validateValue__881473454(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-881473454L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toSliderValue(Ljava/lang/Object;)D", cancellable = true)
    private void toSliderValue_1513874045(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1513874045L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fromSliderValue(D)Ljava/lang/Object;", cancellable = true)
    private void fromSliderValue__992453913(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-992453913L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/Codec;", cancellable = true)
    private void codec__263582202(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-263582202L))
            info.setReturnValue(null);
    }


}
