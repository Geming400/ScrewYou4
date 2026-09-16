package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.portal.PortalShape.class)
public class PortalShape_1941683801Mixin {
        @Inject(at = @At("HEAD"), method = "isValid()Z", cancellable = true)
    private void isValid__280437155(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-280437155L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isComplete()Z", cancellable = true)
    private void isComplete__52898452(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-52898452L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getRelativePosition(Lnet/minecraft/util/BlockUtil$FoundRectangle;Lnet/minecraft/core/Direction$Axis;Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/entity/EntityDimensions;)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private static void getRelativePosition_925993591(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(925993591L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "findEmptyPortalShape(Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/Direction$Axis;)Ljava/util/Optional;", cancellable = true)
    private static void findEmptyPortalShape__1680999916(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1680999916L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createPortalBlocks(Lnet/minecraft/world/level/LevelAccessor;)V", cancellable = true)
    private void createPortalBlocks_761787553(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(761787553L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "findCollisionFreePosition(Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/entity/EntityDimensions;)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private static void findCollisionFreePosition__476003641(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-476003641L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "findAnyShape(Lnet/minecraft/world/level/BlockGetter;Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/Direction$Axis;)Lnet/minecraft/world/level/portal/PortalShape;", cancellable = true)
    private static void findAnyShape__1698448122(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1698448122L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "findPortalShape(Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/core/BlockPos;Ljava/util/function/Predicate;Lnet/minecraft/core/Direction$Axis;)Ljava/util/Optional;", cancellable = true)
    private static void findPortalShape_838041480(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(838041480L))
            info.setReturnValue(null);
    }


}
