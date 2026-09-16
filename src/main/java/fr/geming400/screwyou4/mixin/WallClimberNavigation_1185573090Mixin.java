package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.navigation.WallClimberNavigation.class)
public class WallClimberNavigation_1185573090Mixin {
        @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1055889431(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1055889431L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "moveTo(Lnet/minecraft/world/entity/Entity;D)Z", cancellable = true)
    private void moveTo_283933735(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(283933735L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "createPath(Lnet/minecraft/core/BlockPos;I)Lnet/minecraft/world/level/pathfinder/Path;", cancellable = true)
    private void createPath_337600572(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(337600572L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createPath(Lnet/minecraft/world/entity/Entity;I)Lnet/minecraft/world/level/pathfinder/Path;", cancellable = true)
    private void createPath__424272425(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-424272425L))
            info.setReturnValue(null);
    }


}
