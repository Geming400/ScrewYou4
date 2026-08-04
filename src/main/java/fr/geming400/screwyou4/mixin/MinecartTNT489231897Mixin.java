package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.vehicle.minecart.MinecartTNT.class)
public class MinecartTNT489231897Mixin {
        @Inject(at = @At("HEAD"), method = "destroy(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/damagesource/DamageSource;)V", cancellable = true)
    private void destroy_58297524(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(58297524L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_527506636(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(527506636L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getFuse()I", cancellable = true)
    private void getFuse_527494143(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(527494143L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isPrimed()Z", cancellable = true)
    private void isPrimed_527510480(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(527510480L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBlockExplosionResistance(Lnet/minecraft/world/level/Explosion;Lnet/minecraft/world/level/BlockGetter;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;Lnet/minecraft/world/level/material/FluidState;F)F", cancellable = true)
    private void getBlockExplosionResistance_1951856916(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1951856916L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "shouldBlockExplode(Lnet/minecraft/world/level/Explosion;Lnet/minecraft/world/level/BlockGetter;Lnet/minecraft/core/BlockPos;Lnet/minecraft/world/level/block/state/BlockState;F)Z", cancellable = true)
    private void shouldBlockExplode_1313780576(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1313780576L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getPickResult()Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void getPickResult_1012650557(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1012650557L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hurtServer(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/damagesource/DamageSource;F)Z", cancellable = true)
    private void hurtServer_39801566(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(39801566L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "causeFallDamage(DFLnet/minecraft/world/damagesource/DamageSource;)Z", cancellable = true)
    private void causeFallDamage_11090919(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(11090919L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "handleEntityEvent(B)V", cancellable = true)
    private void handleEntityEvent_1696684222(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1696684222L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "primeFuse(Lnet/minecraft/world/damagesource/DamageSource;)V", cancellable = true)
    private void primeFuse_157558437(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(157558437L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getDefaultDisplayBlockState()Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getDefaultDisplayBlockState__1806526969(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1806526969L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "activateMinecart(Lnet/minecraft/server/level/ServerLevel;IIIZ)V", cancellable = true)
    private void activateMinecart_117494766(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(117494766L))
            info.cancel();
    }


}
