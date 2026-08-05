package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.item.ItemEntity.class)
public class ItemEntity_1875135260Mixin {
        @Inject(at = @At("HEAD"), method = "getName()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getName__301773906(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-301773906L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "merge(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/item/ItemStack;I)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private static void merge_151414248(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(151414248L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSlot(I)Lnet/minecraft/world/entity/SlotAccess;", cancellable = true)
    private void getSlot__18757925(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-18757925L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setTarget(Ljava/util/UUID;)V", cancellable = true)
    private void setTarget_1517579170(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1517579170L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getOwner()Lnet/minecraft/world/entity/Entity;", cancellable = true)
    private void getOwner__590943583(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-590943583L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1913409998(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1913409998L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getAge()I", cancellable = true)
    private void getAge_1913397505(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1913397505L))
            info.setReturnValue(1494694527);
    }

    @Inject(at = @At("HEAD"), method = "getItem()Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void getItem__1896413377(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1896413377L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "teleport(Lnet/minecraft/world/level/portal/TeleportTransition;)Lnet/minecraft/world/entity/Entity;", cancellable = true)
    private void teleport_1441254865(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1441254865L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hurtServer(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/damagesource/DamageSource;F)Z", cancellable = true)
    private void hurtServer_1425705424(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1425705424L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "fireImmune()Z", cancellable = true)
    private void fireImmune_1913413842(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1913413842L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "hurtClient(Lnet/minecraft/world/damagesource/DamageSource;)Z", cancellable = true)
    private void hurtClient_1543466139(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1543466139L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "setThrower(Lnet/minecraft/world/entity/Entity;)V", cancellable = true)
    private void setThrower_1423410599(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1423410599L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setItem(Lnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private void setItem__685300749(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-685300749L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getSpin(FF)F", cancellable = true)
    private static void getSpin_790582646(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(790582646L))
            info.setReturnValue(2.028452E8F);
    }

    @Inject(at = @At("HEAD"), method = "setNeverPickUp()V", cancellable = true)
    private void setNeverPickUp_1913409998(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1913409998L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "areMergable(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private static void areMergable__1174235244(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1174235244L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "hasPickUpDelay()Z", cancellable = true)
    private void hasPickUpDelay_1913413842(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1913413842L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "setUnlimitedLifetime()V", cancellable = true)
    private void setUnlimitedLifetime_1913409998(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1913409998L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setExtendedLifetime()V", cancellable = true)
    private void setExtendedLifetime_1913409998(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1913409998L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setNoPickUpDelay()V", cancellable = true)
    private void setNoPickUpDelay_1913409998(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1913409998L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "makeFakeItem()V", cancellable = true)
    private void makeFakeItem_1913409998(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1913409998L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setPickUpDelay(I)V", cancellable = true)
    private void setPickUpDelay__1205915065(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1205915065L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "playerTouch(Lnet/minecraft/world/entity/player/Player;)V", cancellable = true)
    private void playerTouch__1479230391(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1479230391L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "dampensVibrations()Z", cancellable = true)
    private void dampensVibrations_1913413842(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1913413842L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "restoreFrom(Lnet/minecraft/world/entity/Entity;)V", cancellable = true)
    private void restoreFrom_1423410599(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1423410599L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isAttackable()Z", cancellable = true)
    private void isAttackable_1913413842(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1913413842L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "ignoreExplosion(Lnet/minecraft/world/level/Explosion;)Z", cancellable = true)
    private void ignoreExplosion__435097136(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-435097136L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getSoundSource()Lnet/minecraft/sounds/SoundSource;", cancellable = true)
    private void getSoundSource__417912714(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-417912714L))
            info.setReturnValue(net.minecraft.sounds.SoundSource.WEATHER);
    }

    @Inject(at = @At("HEAD"), method = "setDefaultPickUpDelay()V", cancellable = true)
    private void setDefaultPickUpDelay_1913409998(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1913409998L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getBlockPosBelowThatAffectsMyMovement()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void getBlockPosBelowThatAffectsMyMovement__18251620(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-18251620L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getVisualRotationYInDegrees()F", cancellable = true)
    private void getVisualRotationYInDegrees_1913394622(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1913394622L))
            info.setReturnValue(2.028452E8F);
    }


}
