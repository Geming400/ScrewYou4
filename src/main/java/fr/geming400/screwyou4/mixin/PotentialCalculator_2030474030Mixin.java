package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.PotentialCalculator.class)
public class PotentialCalculator_2030474030Mixin {
        @Inject(at = @At("HEAD"), method = "getPotentialEnergyChange(Lnet/minecraft/core/BlockPos;D)D", cancellable = true)
    private void getPotentialEnergyChange__1304930834(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1304930834L))
            info.setReturnValue(2.952394002684254E8D);
    }

    @Inject(at = @At("HEAD"), method = "addCharge(Lnet/minecraft/core/BlockPos;D)V", cancellable = true)
    private void addCharge__1304913536(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1304913536L))
            info.cancel();
    }


}
