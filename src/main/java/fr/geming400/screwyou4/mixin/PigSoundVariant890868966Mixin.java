package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.animal.pig.PigSoundVariant.class)
public class PigSoundVariant890868966Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__2018586071(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2018586071L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__244591009(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-244591009L))
            info.setReturnValue("v!,9c0NBDzH2:li|cx<y$");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_929131708(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(929131708L))
            info.setReturnValue(695419863);
    }

    @Inject(at = @At("HEAD"), method = "adultSounds()Lnet/minecraft/world/entity/animal/pig/PigSoundVariant$PigSoundSet;", cancellable = true)
    private void adultSounds_1078786178(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1078786178L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "babySounds()Lnet/minecraft/world/entity/animal/pig/PigSoundVariant$PigSoundSet;", cancellable = true)
    private void babySounds_1078786178(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1078786178L))
            info.setReturnValue(null);
    }


}
