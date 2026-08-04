package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.SulfurCubeArchetype.SoundSettings.class)
public class SoundSettings_136076941Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1521589199(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1521589199L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__999383035(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-999383035L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_174339682(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(174339682L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hitSound()Lnet/minecraft/core/Holder;", cancellable = true)
    private void hitSound_1684952712(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1684952712L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pushSound()Lnet/minecraft/core/Holder;", cancellable = true)
    private void pushSound_1684952712(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1684952712L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pushSoundImpulseThreshold()F", cancellable = true)
    private void pushSoundImpulseThreshold_174336303(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(174336303L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pushSoundCooldown()F", cancellable = true)
    private void pushSoundCooldown_174336303(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(174336303L))
            info.setReturnValue(null);
    }


}
