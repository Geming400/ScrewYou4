package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.biome.MobSpawnSettings.class)
public class MobSpawnSettings_499025348Mixin {
        @Inject(at = @At("HEAD"), method = "getMobs(Lnet/minecraft/world/entity/MobCategory;)Lnet/minecraft/util/random/WeightedList;", cancellable = true)
    private void getMobs__2137605242(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2137605242L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getMobSpawnCost(Lnet/minecraft/world/entity/EntityType;)Lnet/minecraft/world/level/biome/MobSpawnSettings$MobSpawnCost;", cancellable = true)
    private void getMobSpawnCost_469004353(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(469004353L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getCreatureProbability()F", cancellable = true)
    private void getCreatureProbability__1052072666(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1052072666L))
            info.setReturnValue(8.964957E8F);
    }


}
