package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.pathfinder.AmphibiousNodeEvaluator.class)
public class AmphibiousNodeEvaluator_1297129922Mixin {
        @Inject(at = @At("HEAD"), method = "done()V", cancellable = true)
    private void done_1335404660(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1335404660L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "prepare(Lnet/minecraft/world/level/PathNavigationRegion;Lnet/minecraft/world/entity/Mob;)V", cancellable = true)
    private void prepare_1693692740(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1693692740L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getTarget(DDD)Lnet/minecraft/world/level/pathfinder/Target;", cancellable = true)
    private void getTarget_616382624(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(616382624L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStart()Lnet/minecraft/world/level/pathfinder/Node;", cancellable = true)
    private void getStart__196087589(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-196087589L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getNeighbors([Lnet/minecraft/world/level/pathfinder/Node;Lnet/minecraft/world/level/pathfinder/Node;)I", cancellable = true)
    private void getNeighbors_648534738(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(648534738L))
            info.setReturnValue(-1157475276);
    }

    @Inject(at = @At("HEAD"), method = "getPathType(Lnet/minecraft/world/level/pathfinder/PathfindingContext;III)Lnet/minecraft/world/level/pathfinder/PathType;", cancellable = true)
    private void getPathType_358603411(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(358603411L))
            info.setReturnValue(net.minecraft.world.level.pathfinder.PathType.WALKABLE);
    }


}
