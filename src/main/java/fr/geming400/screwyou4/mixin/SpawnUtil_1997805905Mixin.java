package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.SpawnUtil.class)
public class SpawnUtil_1997805905Mixin {
        @Inject(at = @At("HEAD"), method = "trySpawnMob(Lnet/minecraft/world/entity/EntityType;Lnet/minecraft/world/entity/EntitySpawnReason;Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/core/BlockPos;IIILnet/minecraft/util/SpawnUtil$Strategy;Z)Ljava/util/Optional;", cancellable = true)
    private static void trySpawnMob_64719981(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(64719981L))
            info.setReturnValue(null);
    }


}
