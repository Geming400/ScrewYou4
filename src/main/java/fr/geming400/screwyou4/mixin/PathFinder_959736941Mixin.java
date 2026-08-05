package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.pathfinder.PathFinder.class)
public class PathFinder_959736941Mixin {
        @Inject(at = @At("HEAD"), method = "setMaxVisitedNodes(I)V", cancellable = true)
    private void setMaxVisitedNodes__2121313384(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-2121313384L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setCaptureDebug(Ljava/util/function/BooleanSupplier;)V", cancellable = true)
    private void setCaptureDebug_1006529073(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1006529073L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "findPath(Lnet/minecraft/world/level/PathNavigationRegion;Lnet/minecraft/world/entity/Mob;Ljava/util/Set;FIF)Lnet/minecraft/world/level/pathfinder/Path;", cancellable = true)
    private void findPath_1580665553(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1580665553L))
            info.setReturnValue(null);
    }


}
