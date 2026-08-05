package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.material.FluidState.class)
public class FluidState122157223Mixin {
        @Inject(at = @At("HEAD"), method = "isEmpty()Z", cancellable = true)
    private void isEmpty_160435806(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(160435806L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getType()Lnet/minecraft/world/level/material/Fluid;", cancellable = true)
    private void getType__1692244041(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1692244041L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isFull()Z", cancellable = true)
    private void isFull_160435806(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(160435806L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "tick(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)V", cancellable = true)
    private void tick_734588268(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(734588268L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getShape(Lnet/minecraft/world/level/BlockGetter;Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/phys/shapes/VoxelShape;", cancellable = true)
    private void getShape_1787525168(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1787525168L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getHeight(Lnet/minecraft/world/level/BlockGetter;Lnet/minecraft/core/BlockPos;)F", cancellable = true)
    private void getHeight__455390973(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-455390973L))
            info.setReturnValue(5.750803E8F);
    }

    @Inject(at = @At("HEAD"), method = "randomTick(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/core/BlockPos;Lnet/minecraft/util/RandomSource;)V", cancellable = true)
    private void randomTick_1938209719(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1938209719L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "typeHolder()Lnet/minecraft/core/Holder;", cancellable = true)
    private void typeHolder_1671032995(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1671032995L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAABB(Lnet/minecraft/world/level/BlockGetter;Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/phys/AABB;", cancellable = true)
    private void getAABB_82309592(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(82309592L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "animateTick(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/util/RandomSource;)V", cancellable = true)
    private void animateTick_805035861(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(805035861L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "entityInside(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/entity/InsideBlockEffectApplier;)V", cancellable = true)
    private void entityInside_253125721(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(253125721L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getExplosionResistance()F", cancellable = true)
    private void getExplosionResistance_160416586(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(160416586L))
            info.setReturnValue(5.750803E8F);
    }

    @Inject(at = @At("HEAD"), method = "isRandomlyTicking()Z", cancellable = true)
    private void isRandomlyTicking_160435806(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(160435806L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "createLegacyBlock()Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void createLegacyBlock_2121365653(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2121365653L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getOwnHeight()F", cancellable = true)
    private void getOwnHeight_160416586(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(160416586L))
            info.setReturnValue(5.750803E8F);
    }

    @Inject(at = @At("HEAD"), method = "canBeReplacedWith(Lnet/minecraft/world/level/BlockGetter;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/material/Fluid;Lnet/minecraft/core/Direction;)Z", cancellable = true)
    private void canBeReplacedWith__1156988364(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1156988364L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isSourceOfType(Lnet/minecraft/world/level/material/Fluid;)Z", cancellable = true)
    private void isSourceOfType__1887531217(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1887531217L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "shouldRenderBackwardUpFace(Lnet/minecraft/world/level/BlockGetter;Lnet/minecraft/core/BlockPos;)Z", cancellable = true)
    private void shouldRenderBackwardUpFace__455371753(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-455371753L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getDripParticle()Lnet/minecraft/core/particles/ParticleOptions;", cancellable = true)
    private void getDripParticle__1946803845(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1946803845L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getFlow(Lnet/minecraft/world/level/BlockGetter;Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void getFlow__1694270823(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1694270823L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getAmount()I", cancellable = true)
    private void getAmount_160419469(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(160419469L))
            info.setReturnValue(-1115504163);
    }

    @Inject(at = @At("HEAD"), method = "isSource()Z", cancellable = true)
    private void isSource_160435806(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(160435806L))
            info.setReturnValue(true);
    }


}
