package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.NaturalSpawner.SpawnState.class)
public class SpawnState_576127723Mixin {
        @Inject(at = @At("HEAD"), method = "getMobCategoryCounts()Lit/unimi/dsi/fastutil/objects/Object2IntMap;", cancellable = true)
    private void getMobCategoryCounts__1028936270(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1028936270L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSpawnableChunkCount()I", cancellable = true)
    private void getSpawnableChunkCount__1811827505(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1811827505L))
            info.setReturnValue(1625854301);
    }


}
