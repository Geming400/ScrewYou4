package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.cow.CowSoundVariant.class)
public class CowSoundVariant_1472069501Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_563443232(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(563443232L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__2052474271(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2052474271L))
            info.setReturnValue(" 4\u97F5I# tB^f\uBF0Eg,+cOv");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2029421591(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2029421591L))
            info.setReturnValue(414092645);
    }

    @Inject(at = @At("HEAD"), method = "hurtSound()Lnet/minecraft/core/Holder;", cancellable = true)
    private void hurtSound__1307889352(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1307889352L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "deathSound()Lnet/minecraft/core/Holder;", cancellable = true)
    private void deathSound__1107941091(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1107941091L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "stepSound()Lnet/minecraft/core/Holder;", cancellable = true)
    private void stepSound_1736593781(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1736593781L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "ambientSound()Lnet/minecraft/core/Holder;", cancellable = true)
    private void ambientSound__855488703(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-855488703L))
            info.setReturnValue(null);
    }


}
