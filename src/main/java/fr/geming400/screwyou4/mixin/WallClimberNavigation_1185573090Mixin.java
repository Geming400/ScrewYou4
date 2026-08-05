package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.ai.navigation.WallClimberNavigation.class)
public class WallClimberNavigation_1185573090Mixin {
        @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1223847828(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1223847828L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "createPath(Lnet/minecraft/core/BlockPos;I)Lnet/minecraft/world/level/pathfinder/Path;", cancellable = true)
    private void createPath__2051513891(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2051513891L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createPath(Lnet/minecraft/world/entity/Entity;I)Lnet/minecraft/world/level/pathfinder/Path;", cancellable = true)
    private void createPath_748004024(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(748004024L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "moveTo(Lnet/minecraft/world/entity/Entity;D)Z", cancellable = true)
    private void moveTo_89796819(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(89796819L))
            info.setReturnValue(true);
    }


}
