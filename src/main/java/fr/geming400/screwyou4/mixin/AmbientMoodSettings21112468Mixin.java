package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.attribute.AmbientMoodSettings.class)
public class AmbientMoodSettings21112468Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1406624727(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1406624727L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1114347507(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1114347507L))
            info.setReturnValue("(Ob@_UsjR>Y- 3s㙭");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_59375210(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(59375210L))
            info.setReturnValue(-1985062207);
    }

    @Inject(at = @At("HEAD"), method = "soundPositionOffset()D", cancellable = true)
    private void soundPositionOffset_59369909(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(59369909L))
            info.setReturnValue(1.0243550032629366E8D);
    }

    @Inject(at = @At("HEAD"), method = "blockSearchExtent()I", cancellable = true)
    private void blockSearchExtent_59374714(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(59374714L))
            info.setReturnValue(-1781914788);
    }

    @Inject(at = @At("HEAD"), method = "soundEvent()Lnet/minecraft/core/Holder;", cancellable = true)
    private void soundEvent_1569988240(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1569988240L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tickDelay()I", cancellable = true)
    private void tickDelay_59374714(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(59374714L))
            info.setReturnValue(-1781914788);
    }


}
