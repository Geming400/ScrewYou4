package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.vehicle.minecart.MinecartTNT.class)
public class MinecartTNT489231897Mixin {
        @Inject(at = @At("HEAD"), method = "destroy(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/damagesource/DamageSource;)V", cancellable = true)
    private void destroy_1436090798(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1436090798L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_359548239(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(359548239L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hurtServer(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/damagesource/DamageSource;F)Z", cancellable = true)
    private void hurtServer__326055956(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-326055956L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "handleEntityEvent(B)V", cancellable = true)
    private void handleEntityEvent_1242980013(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1242980013L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "causeFallDamage(DFLnet/minecraft/world/damagesource/DamageSource;)Z", cancellable = true)
    private void causeFallDamage_1797339066(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1797339066L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "shouldBlockExplode(Lnet/minecraft/world/level/Explosion;Lnet/minecraft/world/level/BlockGetter;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;F)Z", cancellable = true)
    private void shouldBlockExplode__1866947751(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1866947751L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getPickResult()Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void getPickResult_544161233(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(544161233L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBlockExplosionResistance(Lnet/minecraft/world/level/Explosion;Lnet/minecraft/world/level/BlockGetter;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/material/FluidState;F)F", cancellable = true)
    private void getBlockExplosionResistance__2147271701(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2147271701L))
            info.setReturnValue(7.34894E8F);
    }

    @Inject(at = @At("HEAD"), method = "activateMinecart(Lnet/minecraft/server/level/ServerLevel;IIIZ)V", cancellable = true)
    private void activateMinecart_1506043048(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1506043048L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getFuse()I", cancellable = true)
    private void getFuse_466759304(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(466759304L))
            info.setReturnValue(-1844853499);
    }

    @Inject(at = @At("HEAD"), method = "isPrimed()Z", cancellable = true)
    private void isPrimed_1284767137(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1284767137L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "primeFuse(Lnet/minecraft/world/damagesource/DamageSource;)V", cancellable = true)
    private void primeFuse__1537353435(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1537353435L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getDefaultDisplayBlockState()Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getDefaultDisplayBlockState_2077582178(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2077582178L))
            info.setReturnValue(null);
    }


}
