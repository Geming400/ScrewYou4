package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.saveddata.WanderingTraderData.class)
public class WanderingTraderData_1104337857Mixin {
        @Inject(at = @At("HEAD"), method = "spawnDelay()I", cancellable = true)
    private void spawnDelay_1869177822(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1869177822L))
            info.setReturnValue(1554115112);
    }

    @Inject(at = @At("HEAD"), method = "setSpawnDelay(I)V", cancellable = true)
    private void setSpawnDelay_344609846(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(344609846L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "spawnChance()I", cancellable = true)
    private void spawnChance__760690569(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-760690569L))
            info.setReturnValue(688089494);
    }

    @Inject(at = @At("HEAD"), method = "setSpawnChance(I)V", cancellable = true)
    private void setSpawnChance__64153095(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-64153095L))
            info.cancel();
    }


}
