package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.pathfinder.FlyNodeEvaluator.class)
public class FlyNodeEvaluator2053331330Mixin {
        @Inject(at = @At("HEAD"), method = "done()V", cancellable = true)
    private void done_2091606069(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2091606069L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "prepare(Lnet/minecraft/world/level/PathNavigationRegion;Lnet/minecraft/world/entity/Mob;)V", cancellable = true)
    private void prepare__1845073147(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1845073147L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getTarget(DDD)Lnet/minecraft/world/level/pathfinder/Target;", cancellable = true)
    private void getTarget_1372584033(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1372584033L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStart()Lnet/minecraft/world/level/pathfinder/Node;", cancellable = true)
    private void getStart_560113820(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(560113820L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getNeighbors([Lnet/minecraft/world/level/pathfinder/Node;Lnet/minecraft/world/level/pathfinder/Node;)I", cancellable = true)
    private void getNeighbors_1404736147(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1404736147L))
            info.setReturnValue(-1232738728);
    }

    @Inject(at = @At("HEAD"), method = "getPathType(Lnet/minecraft/world/level/pathfinder/PathfindingContext;III)Lnet/minecraft/world/level/pathfinder/PathType;", cancellable = true)
    private void getPathType_1114804820(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1114804820L))
            info.setReturnValue(net.minecraft.world.level.pathfinder.PathType.RAIL);
    }


}
