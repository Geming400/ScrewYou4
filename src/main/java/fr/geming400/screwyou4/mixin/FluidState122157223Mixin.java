package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.material.FluidState.class)
public class FluidState122157223Mixin {
        @Inject(at = @At("HEAD"), method = "isEmpty()Z", cancellable = true)
    private void isEmpty_1181273595(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1181273595L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getType()Lnet/minecraft/world/level/material/Fluid;", cancellable = true)
    private void getType__724931737(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-724931737L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isFull()Z", cancellable = true)
    private void isFull__429428955(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-429428955L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "tick(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;)V", cancellable = true)
    private void tick_899401097(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(899401097L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getShape(Lnet/minecraft/world/level/BlockGetter;Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/phys/shapes/VoxelShape;", cancellable = true)
    private void getShape__196737381(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-196737381L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "typeHolder()Lnet/minecraft/core/Holder;", cancellable = true)
    private void typeHolder_493374045(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(493374045L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "entityInside(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/entity/InsideBlockEffectApplier;)V", cancellable = true)
    private void entityInside__1074902214(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1074902214L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "randomTick(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/core/BlockPos;Lnet/minecraft/util/RandomSource;)V", cancellable = true)
    private void randomTick__270955849(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-270955849L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "animateTick(Lnet/minecraft/world/level/Level;Lnet/minecraft/core/BlockPos;Lnet/minecraft/util/RandomSource;)V", cancellable = true)
    private void animateTick__938715021(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-938715021L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getExplosionResistance()F", cancellable = true)
    private void getExplosionResistance__1460039598(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1460039598L))
            info.setReturnValue(3.455687E8F);
    }

    @Inject(at = @At("HEAD"), method = "isRandomlyTicking()Z", cancellable = true)
    private void isRandomlyTicking_484362835(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(484362835L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "createLegacyBlock()Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void createLegacyBlock_2058146365(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2058146365L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isSource()Z", cancellable = true)
    private void isSource__1425532007(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1425532007L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getAmount()I", cancellable = true)
    private void getAmount__1782039553(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1782039553L))
            info.setReturnValue(-2086079977);
    }

    @Inject(at = @At("HEAD"), method = "getFlow(Lnet/minecraft/world/level/BlockGetter;Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void getFlow_763453557(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(763453557L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDripParticle()Lnet/minecraft/core/particles/ParticleOptions;", cancellable = true)
    private void getDripParticle_422615436(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(422615436L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "canBeReplacedWith(Lnet/minecraft/world/level/BlockGetter;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/material/Fluid;Lnet/minecraft/core/Direction;)Z", cancellable = true)
    private void canBeReplacedWith_1863646315(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1863646315L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getOwnHeight()F", cancellable = true)
    private void getOwnHeight_889178131(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(889178131L))
            info.setReturnValue(3.455687E8F);
    }

    @Inject(at = @At("HEAD"), method = "shouldRenderBackwardUpFace(Lnet/minecraft/world/level/BlockGetter;Lnet/minecraft/core/BlockPos;)Z", cancellable = true)
    private void shouldRenderBackwardUpFace_1402576307(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1402576307L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isSourceOfType(Lnet/minecraft/world/level/material/Fluid;)Z", cancellable = true)
    private void isSourceOfType_400812153(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(400812153L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getHeight(Lnet/minecraft/world/level/BlockGetter;Lnet/minecraft/core/BlockPos;)F", cancellable = true)
    private void getHeight__1755165306(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1755165306L))
            info.setReturnValue(3.455687E8F);
    }

    @Inject(at = @At("HEAD"), method = "getAABB(Lnet/minecraft/world/level/BlockGetter;Lnet/minecraft/core/BlockPos;)Lnet/minecraft/world/phys/AABB;", cancellable = true)
    private void getAABB__1006115742(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1006115742L))
            info.setReturnValue(null);
    }


}
