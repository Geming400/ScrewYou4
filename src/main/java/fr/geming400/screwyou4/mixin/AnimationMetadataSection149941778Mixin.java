package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.resources.metadata.animation.AnimationMetadataSection.class)
public class AnimationMetadataSection149941778Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__758684490(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-758684490L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_920365303(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(920365303L))
            info.setReturnValue("m`T3\u798D*YVFU9M#l\u89CDsGf\"`_L},&W(}<8TxfQV\u94CEh!r\uD020<$\u93FA3@05w03S \uAFA8]\u02DCr");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_707293869(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(707293869L))
            info.setReturnValue(-2089103553);
    }

    @Inject(at = @At("HEAD"), method = "frames()Ljava/util/Optional;", cancellable = true)
    private void frames__2061905306(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2061905306L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "frameHeight()Ljava/util/Optional;", cancellable = true)
    private void frameHeight_768566452(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(768566452L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "frameWidth()Ljava/util/Optional;", cancellable = true)
    private void frameWidth__9005799(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-9005799L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "interpolatedFrames()Z", cancellable = true)
    private void interpolatedFrames_585701216(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(585701216L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "defaultFrameTime()I", cancellable = true)
    private void defaultFrameTime__1553266945(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1553266945L))
            info.setReturnValue(475824669);
    }

    @Inject(at = @At("HEAD"), method = "calculateFrameSize(II)Lnet/minecraft/client/resources/metadata/animation/FrameSize;", cancellable = true)
    private void calculateFrameSize_730403473(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(730403473L))
            info.setReturnValue(null);
    }


}
