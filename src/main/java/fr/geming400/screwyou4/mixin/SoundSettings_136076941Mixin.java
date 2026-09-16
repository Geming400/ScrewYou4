package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.SulfurCubeArchetype.SoundSettings.class)
public class SoundSettings_136076941Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__772549328(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-772549328L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_906500465(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(906500465L))
            info.setReturnValue("\u1FBEIyR'b(\u6194T)\u5369D(is");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_693429031(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(693429031L))
            info.setReturnValue(-1495994166);
    }

    @Inject(at = @At("HEAD"), method = "hitSound()Lnet/minecraft/core/Holder;", cancellable = true)
    private void hitSound_1565238732(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1565238732L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pushSound()Lnet/minecraft/core/Holder;", cancellable = true)
    private void pushSound__1865561645(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1865561645L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pushSoundImpulseThreshold()F", cancellable = true)
    private void pushSoundImpulseThreshold_939181284(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(939181284L))
            info.setReturnValue(9.90779E8F);
    }

    @Inject(at = @At("HEAD"), method = "pushSoundCooldown()F", cancellable = true)
    private void pushSoundCooldown__1915716465(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1915716465L))
            info.setReturnValue(9.90779E8F);
    }


}
