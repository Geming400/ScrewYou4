package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.gametest.framework.GameTestEntityBuilder.class)
public class GameTestEntityBuilder1388419846Mixin {
        @Inject(at = @At("HEAD"), method = "requirePersistence(Z)Lnet/minecraft/gametest/framework/GameTestEntityBuilder;", cancellable = true)
    private void requirePersistence__1096539484(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1096539484L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "rotation(Lnet/minecraft/world/level/block/Rotation;)Lnet/minecraft/gametest/framework/GameTestEntityBuilder;", cancellable = true)
    private void rotation__253876269(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-253876269L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "spawnReason(Lnet/minecraft/world/entity/EntitySpawnReason;)Lnet/minecraft/gametest/framework/GameTestEntityBuilder;", cancellable = true)
    private void spawnReason_2108672857(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2108672857L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "spawn(I)Ljava/util/List;", cancellable = true)
    private void spawn__128835838(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-128835838L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "spawn()Lnet/minecraft/world/entity/Entity;", cancellable = true)
    private void spawn_927113905(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(927113905L))
            info.setReturnValue(null);
    }


}
