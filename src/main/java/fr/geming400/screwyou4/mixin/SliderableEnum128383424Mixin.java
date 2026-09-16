package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.OptionInstance.SliderableEnum.class)
public class SliderableEnum128383424Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__780242844(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-780242844L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_898806949(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(898806949L))
            info.setReturnValue("V*-.\uD715adh:E)[s\u062B0\u3479\uF9D4@q/\u5BE8}\uD059a(&uCI^`v@HM\u4EBBo?@;4Ek\uD6F3Do{x");
    }

    @Inject(at = @At("HEAD"), method = "values()Ljava/util/List;", cancellable = true)
    private void values_1306304530(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1306304530L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_685735515(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(685735515L))
            info.setReturnValue(656737728);
    }

    @Inject(at = @At("HEAD"), method = "next(Ljava/lang/Object;)Ljava/util/Optional;", cancellable = true)
    private void next__1095175291(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1095175291L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "previous(Ljava/lang/Object;)Ljava/util/Optional;", cancellable = true)
    private void previous_1952636553(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1952636553L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "validateValue(Ljava/lang/Object;)Ljava/util/Optional;", cancellable = true)
    private void validateValue_743040141(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(743040141L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fromSliderValue(D)Ljava/lang/Object;", cancellable = true)
    private void fromSliderValue_1396524321(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1396524321L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "toSliderValue(Ljava/lang/Object;)D", cancellable = true)
    private void toSliderValue_1944571720(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1944571720L))
            info.setReturnValue(4.495568001155353E8D);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/Codec;", cancellable = true)
    private void codec__1676326116(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1676326116L))
            info.setReturnValue(null);
    }


}
