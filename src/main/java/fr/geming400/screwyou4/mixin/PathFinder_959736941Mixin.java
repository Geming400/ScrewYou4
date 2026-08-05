package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.pathfinder.PathFinder.class)
public class PathFinder_959736941Mixin {
        @Inject(at = @At("HEAD"), method = "setCaptureDebug(Ljava/util/function/BooleanSupplier;)V", cancellable = true)
    private void setCaptureDebug__789896478(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-789896478L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setMaxVisitedNodes(I)V", cancellable = true)
    private void setMaxVisitedNodes__1679005375(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1679005375L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "findPath(Lnet/minecraft/world/level/PathNavigationRegion;Lnet/minecraft/world/entity/Mob;Ljava/util/Set;FIF)Lnet/minecraft/world/level/pathfinder/Path;", cancellable = true)
    private void findPath_1196887315(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1196887315L))
            info.setReturnValue(null);
    }


}
