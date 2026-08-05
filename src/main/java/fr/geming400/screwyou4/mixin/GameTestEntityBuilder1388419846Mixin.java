package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.gametest.framework.GameTestEntityBuilder.class)
public class GameTestEntityBuilder1388419846Mixin {
        @Inject(at = @At("HEAD"), method = "requirePersistence(Z)Lnet/minecraft/gametest/framework/GameTestEntityBuilder;", cancellable = true)
    private void requirePersistence__408270754(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-408270754L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "rotation(Lnet/minecraft/world/level/block/Rotation;)Lnet/minecraft/gametest/framework/GameTestEntityBuilder;", cancellable = true)
    private void rotation_152409813(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(152409813L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "spawnReason(Lnet/minecraft/world/entity/EntitySpawnReason;)Lnet/minecraft/gametest/framework/GameTestEntityBuilder;", cancellable = true)
    private void spawnReason_73797754(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(73797754L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "spawn(I)Ljava/util/List;", cancellable = true)
    private void spawn__2022406243(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2022406243L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "spawn()Lnet/minecraft/world/entity/Entity;", cancellable = true)
    private void spawn__1077658996(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1077658996L))
            info.setReturnValue(null);
    }


}
