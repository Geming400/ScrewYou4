package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.monster.skeleton.Stray.class)
public class Stray_154728965Mixin {
        @Inject(at = @At("HEAD"), method = "checkStraySpawnRules(Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/level/ServerLevelAccessor;Lnet/minecraft/world/entity/EntitySpawnReason;Lnet/minecraft/core/BlockPos;Lnet/minecraft/util/RandomSource;)Z", cancellable = true)
    private static void checkStraySpawnRules__1630648103(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1630648103L))
            info.setReturnValue(null);
    }


}
