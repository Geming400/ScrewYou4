package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.gametest.framework.GameTestMobBuilder.class)
public class GameTestMobBuilder793525345Mixin {
        @Inject(at = @At("HEAD"), method = "spawn()Lnet/minecraft/world/entity/Entity;", cancellable = true)
    private void spawn_332348364(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(332348364L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "spawn()Lnet/minecraft/world/entity/Mob;", cancellable = true)
    private void spawn__1741546747(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1741546747L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "withNoFreeWill()Lnet/minecraft/gametest/framework/GameTestMobBuilder;", cancellable = true)
    private void withNoFreeWill_1762695353(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1762695353L))
            info.setReturnValue(null);
    }


}
