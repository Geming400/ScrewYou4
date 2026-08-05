package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.wolf.WolfSoundVariant.WolfSoundSet.class)
public class WolfSoundSet_1508532309Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1400922729(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1400922729L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_373072333(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(373072333L))
            info.setReturnValue("% |6\u42E8j_I[;E1\u983F\uBF6A+7>&e\"\u89E9s\uAB85G_k8)$jl'oxXYRXAfoI8Dk9Hi!#Jw\u30A029E%`&Q$#i@6");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1546795050(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1546795050L))
            info.setReturnValue(1836019388);
    }

    @Inject(at = @At("HEAD"), method = "hurtSound()Lnet/minecraft/core/Holder;", cancellable = true)
    private void hurtSound__1237559216(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1237559216L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "deathSound()Lnet/minecraft/core/Holder;", cancellable = true)
    private void deathSound__1237559216(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1237559216L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "ambientSound()Lnet/minecraft/core/Holder;", cancellable = true)
    private void ambientSound__1237559216(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1237559216L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "stepSound()Lnet/minecraft/core/Holder;", cancellable = true)
    private void stepSound__1237559216(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1237559216L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pantSound()Lnet/minecraft/core/Holder;", cancellable = true)
    private void pantSound__1237559216(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1237559216L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "growlSound()Lnet/minecraft/core/Holder;", cancellable = true)
    private void growlSound__1237559216(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1237559216L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "whineSound()Lnet/minecraft/core/Holder;", cancellable = true)
    private void whineSound__1237559216(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1237559216L))
            info.setReturnValue(null);
    }


}
