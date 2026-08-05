package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.golem.CopperGolemOxidationLevel.class)
public class CopperGolemOxidationLevel_1558984952Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1350470086(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1350470086L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_423524976(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(423524976L))
            info.setReturnValue("\uB52E-H\u101A)A<CU\u68C6f'y@,aK-^\u6ACC(l!jBHj9h\u57B2N1ja`T%{a\uAB9AL V7zJvAWx%ryoi/@qI]");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1597247693(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1597247693L))
            info.setReturnValue(-937331420);
    }

    @Inject(at = @At("HEAD"), method = "hurtSound()Lnet/minecraft/sounds/SoundEvent;", cancellable = true)
    private void hurtSound__1645769447(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1645769447L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "deathSound()Lnet/minecraft/sounds/SoundEvent;", cancellable = true)
    private void deathSound__1645769447(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1645769447L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "texture()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void texture__884081602(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-884081602L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "spinHeadSound()Lnet/minecraft/sounds/SoundEvent;", cancellable = true)
    private void spinHeadSound__1645769447(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1645769447L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "stepSound()Lnet/minecraft/sounds/SoundEvent;", cancellable = true)
    private void stepSound__1645769447(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1645769447L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "eyeTexture()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void eyeTexture__884081602(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-884081602L))
            info.setReturnValue(null);
    }


}
