package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.boss.enderdragon.EndCrystal.class)
public class EndCrystal206326363Mixin {
        @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_76642705(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(76642705L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "kill(Lnet/minecraft/server/level/ServerLevel;)V", cancellable = true)
    private void kill_580032577(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(580032577L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hurtServer(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/damagesource/DamageSource;F)Z", cancellable = true)
    private void hurtServer__608960994(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-608960994L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "isPickable()Z", cancellable = true)
    private void isPickable__1346208019(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1346208019L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "shouldRenderAtSqrDistance(D)Z", cancellable = true)
    private void shouldRenderAtSqrDistance_1160568403(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1160568403L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getPickResult()Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void getPickResult_261255699(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(261255699L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBeamTarget()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void getBeamTarget__1777913722(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1777913722L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "showsBottom()Z", cancellable = true)
    private void showsBottom_1623892433(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1623892433L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "setShowBottom(Z)V", cancellable = true)
    private void setShowBottom_1091659554(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1091659554L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setBeamTarget(Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private void setBeamTarget__264919420(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-264919420L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hurtClient(Lnet/minecraft/world/damagesource/DamageSource;)Z", cancellable = true)
    private void hurtClient_1781516181(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1781516181L))
            info.setReturnValue(true);
    }


}
