package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.LivingEntity.Fallsounds.class)
public class Fallsounds_573457055Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__335169214(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-335169214L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1343880579(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1343880579L))
            info.setReturnValue("x\u2308Ks)*zJQ8YulPQi;n");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1130809145(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1130809145L))
            info.setReturnValue(-731378455);
    }

    @Inject(at = @At("HEAD"), method = "big()Lnet/minecraft/sounds/SoundEvent;", cancellable = true)
    private void big_1447180736(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1447180736L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "small()Lnet/minecraft/sounds/SoundEvent;", cancellable = true)
    private void small_1936550425(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1936550425L))
            info.setReturnValue(null);
    }


}
