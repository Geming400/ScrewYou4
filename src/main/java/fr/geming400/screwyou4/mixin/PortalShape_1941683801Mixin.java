package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.portal.PortalShape.class)
public class PortalShape_1941683801Mixin {
        @Inject(at = @At("HEAD"), method = "isValid()Z", cancellable = true)
    private void isValid_1979962383(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1979962383L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isComplete()Z", cancellable = true)
    private void isComplete_1979962383(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1979962383L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "findPortalShape(Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/core/BlockPos;Ljava/util/function/Predicate;Lnet/minecraft/core/Direction$Axis;)Ljava/util/Optional;", cancellable = true)
    private static void findPortalShape__1518210524(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1518210524L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "findAnyShape(Lnet/minecraft/world/level/BlockGetter;Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/Direction$Axis;)Lnet/minecraft/world/level/portal/PortalShape;", cancellable = true)
    private static void findAnyShape_1111047988(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1111047988L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "findCollisionFreePosition(Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/entity/EntityDimensions;)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private static void findCollisionFreePosition_1624506489(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1624506489L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "createPortalBlocks(Lnet/minecraft/world/level/LevelAccessor;)V", cancellable = true)
    private void createPortalBlocks_2006546675(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(2006546675L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "findEmptyPortalShape(Lnet/minecraft/world/level/LevelAccessor;Lnet/minecraft/core/BlockPos;Lnet/minecraft/core/Direction$Axis;)Ljava/util/Optional;", cancellable = true)
    private static void findEmptyPortalShape_1496002773(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1496002773L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRelativePosition(Lnet/minecraft/util/BlockUtil$FoundRectangle;Lnet/minecraft/core/Direction$Axis;Lnet/minecraft/world/phys/Vec3;Lnet/minecraft/world/entity/EntityDimensions;)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private static void getRelativePosition_1629549410(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1629549410L))
            info.setReturnValue(null);
    }


}
