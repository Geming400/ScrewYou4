package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.gametest.framework.GameTestMobBuilder.class)
public class GameTestMobBuilder793525345Mixin {
        @Inject(at = @At("HEAD"), method = "withNoFreeWill()Lnet/minecraft/gametest/framework/GameTestMobBuilder;", cancellable = true)
    private void withNoFreeWill_578126782(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(578126782L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "spawn()Lnet/minecraft/world/entity/Entity;", cancellable = true)
    private void spawn__1672424537(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1672424537L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "spawn()Lnet/minecraft/world/entity/Mob;", cancellable = true)
    private void spawn_1984170250(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1984170250L))
            info.setReturnValue(null);
    }


}
