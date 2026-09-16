package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.pathfinder.FlyNodeEvaluator.class)
public class FlyNodeEvaluator2053331330Mixin {
        @Inject(at = @At("HEAD"), method = "done()V", cancellable = true)
    private void done__649060877(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-649060877L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "prepare(Lnet/minecraft/world/level/PathNavigationRegion;Lnet/minecraft/world/entity/Mob;)V", cancellable = true)
    private void prepare_1821069406(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1821069406L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getTarget(DDD)Lnet/minecraft/world/level/pathfinder/Target;", cancellable = true)
    private void getTarget_980887400(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(980887400L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPathType(Lnet/minecraft/world/level/pathfinder/PathfindingContext;III)Lnet/minecraft/world/level/pathfinder/PathType;", cancellable = true)
    private void getPathType__1065981121(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1065981121L))
            info.setReturnValue(net.minecraft.world.level.pathfinder.PathType.BLOCKED);
    }

    @Inject(at = @At("HEAD"), method = "getNeighbors([Lnet/minecraft/world/level/pathfinder/Node;Lnet/minecraft/world/level/pathfinder/Node;)I", cancellable = true)
    private void getNeighbors__2014109410(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2014109410L))
            info.setReturnValue(-1651547811);
    }

    @Inject(at = @At("HEAD"), method = "getStart()Lnet/minecraft/world/level/pathfinder/Node;", cancellable = true)
    private void getStart_308658288(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(308658288L))
            info.setReturnValue(null);
    }


}
