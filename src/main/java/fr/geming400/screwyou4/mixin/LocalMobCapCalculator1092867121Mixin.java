package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.LocalMobCapCalculator.class)
public class LocalMobCapCalculator1092867121Mixin {
        @Inject(at = @At("HEAD"), method = "canSpawn(Lnet/minecraft/world/entity/MobCategory;Lnet/minecraft/world/level/ChunkPos;)Z", cancellable = true)
    private void canSpawn__14989515(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-14989515L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "addMob(Lnet/minecraft/world/level/ChunkPos;Lnet/minecraft/world/entity/MobCategory;)V", cancellable = true)
    private void addMob__1924654179(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1924654179L))
            info.cancel();
    }


}
