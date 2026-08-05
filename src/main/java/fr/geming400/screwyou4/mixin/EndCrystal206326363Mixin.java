package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.boss.enderdragon.EndCrystal.class)
public class EndCrystal206326363Mixin {
        @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_244601102(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(244601102L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "kill(Lnet/minecraft/server/level/ServerLevel;)V", cancellable = true)
    private void kill__772082977(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-772082977L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hurtClient(Lnet/minecraft/world/damagesource/DamageSource;)Z", cancellable = true)
    private void hurtClient__125342757(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-125342757L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "isPickable()Z", cancellable = true)
    private void isPickable_244604946(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(244604946L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "shouldRenderAtSqrDistance(D)Z", cancellable = true)
    private void shouldRenderAtSqrDistance_1415629574(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1415629574L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getPickResult()Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void getPickResult_729745023(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(729745023L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hurtServer(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/damagesource/DamageSource;F)Z", cancellable = true)
    private void hurtServer__243103472(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-243103472L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getBeamTarget()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void getBeamTarget__1687060516(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1687060516L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "showsBottom()Z", cancellable = true)
    private void showsBottom_244604946(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(244604946L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "setBeamTarget(Lnet/minecraft/core/BlockPos;)V", cancellable = true)
    private void setBeamTarget_375092962(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(375092962L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setShowBottom(Z)V", cancellable = true)
    private void setShowBottom_1435943192(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1435943192L))
            info.cancel();
    }


}
