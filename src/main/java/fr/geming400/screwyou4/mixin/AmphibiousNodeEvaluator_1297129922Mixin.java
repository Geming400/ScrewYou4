package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.pathfinder.AmphibiousNodeEvaluator.class)
public class AmphibiousNodeEvaluator_1297129922Mixin {
        @Inject(at = @At("HEAD"), method = "done()V", cancellable = true)
    private void done__1405262286(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1405262286L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "prepare(Lnet/minecraft/world/level/PathNavigationRegion;Lnet/minecraft/world/entity/Mob;)V", cancellable = true)
    private void prepare_1064867997(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1064867997L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getTarget(DDD)Lnet/minecraft/world/level/pathfinder/Target;", cancellable = true)
    private void getTarget_224685991(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(224685991L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getNeighbors([Lnet/minecraft/world/level/pathfinder/Node;Lnet/minecraft/world/level/pathfinder/Node;)I", cancellable = true)
    private void getNeighbors_1524656477(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1524656477L))
            info.setReturnValue(-1905214870);
    }

    @Inject(at = @At("HEAD"), method = "getPathType(Lnet/minecraft/world/level/pathfinder/PathfindingContext;III)Lnet/minecraft/world/level/pathfinder/PathType;", cancellable = true)
    private void getPathType__1822182530(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1822182530L))
            info.setReturnValue(net.minecraft.world.level.pathfinder.PathType.OPEN);
    }

    @Inject(at = @At("HEAD"), method = "getStart()Lnet/minecraft/world/level/pathfinder/Node;", cancellable = true)
    private void getStart__447543121(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-447543121L))
            info.setReturnValue(null);
    }


}
