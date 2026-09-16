package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.pig.PigSoundVariant.PigSoundSet.class)
public class PigSoundSet1748797675Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_840171407(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(840171407L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1775746096(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1775746096L))
            info.setReturnValue("7G)08i6E)}]su`J\uAEEF*:`|I\uBBBD\u8C6F(5?fJ\"E8,3");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1988817530(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1988817530L))
            info.setReturnValue(-783523466);
    }

    @Inject(at = @At("HEAD"), method = "deathSound()Lnet/minecraft/core/Holder;", cancellable = true)
    private void deathSound__831212916(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-831212916L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hurtSound()Lnet/minecraft/core/Holder;", cancellable = true)
    private void hurtSound__1031161177(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1031161177L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "ambientSound()Lnet/minecraft/core/Holder;", cancellable = true)
    private void ambientSound__578760528(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-578760528L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "eatSound()Lnet/minecraft/core/Holder;", cancellable = true)
    private void eatSound_1473512816(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1473512816L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "stepSound()Lnet/minecraft/core/Holder;", cancellable = true)
    private void stepSound_2013321956(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2013321956L))
            info.setReturnValue(null);
    }


}
