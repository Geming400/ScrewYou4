package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.cow.CowSoundVariant.class)
public class CowSoundVariant_1472069501Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1437385537(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1437385537L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_336609525(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(336609525L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1510332242(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1510332242L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "deathSound()Lnet/minecraft/core/Holder;", cancellable = true)
    private void deathSound__1274022024(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1274022024L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hurtSound()Lnet/minecraft/core/Holder;", cancellable = true)
    private void hurtSound__1274022024(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1274022024L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "ambientSound()Lnet/minecraft/core/Holder;", cancellable = true)
    private void ambientSound__1274022024(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1274022024L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "stepSound()Lnet/minecraft/core/Holder;", cancellable = true)
    private void stepSound__1274022024(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1274022024L))
            info.setReturnValue(null);
    }


}
