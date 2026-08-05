package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.resources.metadata.animation.FrameSize.class)
public class FrameSize_1254077360Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1655377678(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1655377678L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_118617384(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(118617384L))
            info.setReturnValue("}mUCX$X}{\u8936MF ");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1292340101(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1292340101L))
            info.setReturnValue(-848325620);
    }

    @Inject(at = @At("HEAD"), method = "width()I", cancellable = true)
    private void width_1292339605(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1292339605L))
            info.setReturnValue(-645178201);
    }

    @Inject(at = @At("HEAD"), method = "height()I", cancellable = true)
    private void height_1292339605(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1292339605L))
            info.setReturnValue(-645178201);
    }


}
