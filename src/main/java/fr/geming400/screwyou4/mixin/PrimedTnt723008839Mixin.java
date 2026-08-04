package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.item.PrimedTnt.class)
public class PrimedTnt723008839Mixin {
        @Inject(at = @At("HEAD"), method = "getOwner()Lnet/minecraft/world/entity/LivingEntity;", cancellable = true)
    private void getOwner__9229276(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-9229276L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getOwner()Lnet/minecraft/world/entity/Entity;", cancellable = true)
    private void getOwner__1742941043(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1742941043L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_761283578(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(761283578L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getFuse()I", cancellable = true)
    private void getFuse_761271085(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(761271085L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getBlockState()Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void getBlockState__1572750027(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1572750027L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setBlockState(Lnet/minecraft/world/level/block/state/BlockState;)V", cancellable = true)
    private void setBlockState_577716009(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(577716009L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "restoreFrom(Lnet/minecraft/world/entity/Entity;)V", cancellable = true)
    private void restoreFrom_271284179(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(271284179L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isPickable()Z", cancellable = true)
    private void isPickable_761287422(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(761287422L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "teleport(Lnet/minecraft/world/level/portal/TeleportTransition;)Lnet/minecraft/world/entity/Entity;", cancellable = true)
    private void teleport_289128445(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(289128445L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hurtServer(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/damagesource/DamageSource;F)Z", cancellable = true)
    private void hurtServer_273579004(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(273579004L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setFuse(I)V", cancellable = true)
    private void setFuse_1936925811(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1936925811L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getRandomShortFuse(ILnet/minecraft/util/RandomSource;)I", cancellable = true)
    private static void getRandomShortFuse__1188699028(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1188699028L))
            info.setReturnValue(null);
    }


}
