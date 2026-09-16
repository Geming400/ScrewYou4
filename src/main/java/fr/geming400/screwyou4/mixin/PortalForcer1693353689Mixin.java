package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.portal.PortalForcer.class)
public class PortalForcer1693353689Mixin {
        @Inject(at = @At("HEAD"), method = "findClosestPortalPosition(Lnet/minecraft/core/BlockPos;ZLnet/minecraft/world/level/border/WorldBorder;)Ljava/util/Optional;", cancellable = true)
    private void findClosestPortalPosition_1796137710(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1796137710L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createPortal(Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/Direction$Axis;)Ljava/util/Optional;", cancellable = true)
    private void createPortal__218688050(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-218688050L))
            info.setReturnValue(null);
    }


}
