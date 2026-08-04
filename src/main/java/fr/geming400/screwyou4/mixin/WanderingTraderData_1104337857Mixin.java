package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.saveddata.WanderingTraderData.class)
public class WanderingTraderData_1104337857Mixin {
        @Inject(at = @At("HEAD"), method = "spawnDelay()I", cancellable = true)
    private void spawnDelay_1142600102(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1142600102L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setSpawnDelay(I)V", cancellable = true)
    private void setSpawnDelay__1976712468(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1976712468L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setSpawnChance(I)V", cancellable = true)
    private void setSpawnChance__1976712468(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1976712468L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "spawnChance()I", cancellable = true)
    private void spawnChance_1142600102(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1142600102L))
            info.setReturnValue(null);
    }


}
