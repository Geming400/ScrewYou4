package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.resources.metadata.animation.AnimationMetadataSection.class)
public class AnimationMetadataSection149941778Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1535454037(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1535454037L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__985518197(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-985518197L))
            info.setReturnValue("s.48=\u8B0CQ7_7u6\uD26F\uFD0E\u6DA3l\"zdm\u3332|m\u88F9\u74DC\u2E8Cu:oG?1rx]3OAjP\u8118W|`Lam+X[\u646A:s\uB3A3j:u\uBEBAeGUW[DE@7.|\u952FAM9@M=CGH*'WtQU\u1007\uB3AB");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_188204520(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(188204520L))
            info.setReturnValue(980877723);
    }

    @Inject(at = @At("HEAD"), method = "frames()Ljava/util/Optional;", cancellable = true)
    private void frames_395403200(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(395403200L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "calculateFrameSize(II)Lnet/minecraft/client/resources/metadata/animation/FrameSize;", cancellable = true)
    private void calculateFrameSize__2146048551(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2146048551L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "interpolatedFrames()Z", cancellable = true)
    private void interpolatedFrames_188220361(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(188220361L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "defaultFrameTime()I", cancellable = true)
    private void defaultFrameTime_188204024(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(188204024L))
            info.setReturnValue(1184025142);
    }

    @Inject(at = @At("HEAD"), method = "frameHeight()Ljava/util/Optional;", cancellable = true)
    private void frameHeight_395403200(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(395403200L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "frameWidth()Ljava/util/Optional;", cancellable = true)
    private void frameWidth_395403200(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(395403200L))
            info.setReturnValue(null);
    }


}
