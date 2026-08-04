package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.chicken.ChickenSoundVariant.ChickenSoundSet.class)
public class ChickenSoundSet_635833639Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_2021345897(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2021345897L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__499626337(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-499626337L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_674096380(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(674096380L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hurtSound()Lnet/minecraft/core/Holder;", cancellable = true)
    private void hurtSound__2110257886(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2110257886L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "deathSound()Lnet/minecraft/core/Holder;", cancellable = true)
    private void deathSound__2110257886(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2110257886L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "ambientSound()Lnet/minecraft/core/Holder;", cancellable = true)
    private void ambientSound__2110257886(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2110257886L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "stepSound()Lnet/minecraft/core/Holder;", cancellable = true)
    private void stepSound__2110257886(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2110257886L))
            info.setReturnValue(null);
    }


}
