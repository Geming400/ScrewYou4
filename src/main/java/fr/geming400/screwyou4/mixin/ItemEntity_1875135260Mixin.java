package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.entity.item.ItemEntity.class)
public class ItemEntity_1875135260Mixin {
        @Inject(at = @At("HEAD"), method = "getName()Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getName_1367072111(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1367072111L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "merge(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/item/ItemStack;I)Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private static void merge__1455073104(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1455073104L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSlot(I)Lnet/minecraft/world/entity/SlotAccess;", cancellable = true)
    private void getSlot_369900367(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(369900367L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setTarget(Ljava/util/UUID;)V", cancellable = true)
    private void setTarget_293653743(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(293653743L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getOwner()Lnet/minecraft/world/entity/Entity;", cancellable = true)
    private void getOwner__1974378748(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1974378748L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tick()V", cancellable = true)
    private void tick_1745451601(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1745451601L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "getAge()I", cancellable = true)
    private void getAge_1060351192(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1060351192L))
            info.setReturnValue(-941082279);
    }

    @Inject(at = @At("HEAD"), method = "getItem()Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void getItem_1380969928(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1380969928L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hurtServer(Lnet/minecraft/server/level/ServerLevel;Lnet/minecraft/world/damagesource/DamageSource;F)Z", cancellable = true)
    private void hurtServer_1059847902(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1059847902L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "playerTouch(Lnet/minecraft/world/entity/player/Player;)V", cancellable = true)
    private void playerTouch_1827021739(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1827021739L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "isAttackable()Z", cancellable = true)
    private void isAttackable__1579014170(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1579014170L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getSoundSource()Lnet/minecraft/sounds/SoundSource;", cancellable = true)
    private void getSoundSource__905574838(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-905574838L))
            info.setReturnValue(net.minecraft.sounds.SoundSource.WEATHER);
    }

    @Inject(at = @At("HEAD"), method = "setThrower(Lnet/minecraft/world/entity/Entity;)V", cancellable = true)
    private void setThrower_1167211512(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1167211512L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "dampensVibrations()Z", cancellable = true)
    private void dampensVibrations__293412377(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-293412377L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "setDefaultPickUpDelay()V", cancellable = true)
    private void setDefaultPickUpDelay__865851514(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-865851514L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "restoreFrom(Lnet/minecraft/world/entity/Entity;)V", cancellable = true)
    private void restoreFrom__1126714113(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1126714113L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "ignoreExplosion(Lnet/minecraft/world/level/Explosion;)Z", cancellable = true)
    private void ignoreExplosion_944981875(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(944981875L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getVisualRotationYInDegrees()F", cancellable = true)
    private void getVisualRotationYInDegrees__1814270175(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1814270175L))
            info.setReturnValue(7.097291E8F);
    }

    @Inject(at = @At("HEAD"), method = "getBlockPosBelowThatAffectsMyMovement()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void getBlockPosBelowThatAffectsMyMovement__1321683970(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1321683970L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "setPickUpDelay(I)V", cancellable = true)
    private void setPickUpDelay_1150400780(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1150400780L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hurtClient(Lnet/minecraft/world/damagesource/DamageSource;)Z", cancellable = true)
    private void hurtClient__844642219(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-844642219L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "teleport(Lnet/minecraft/world/level/portal/TeleportTransition;)Lnet/minecraft/world/entity/Entity;", cancellable = true)
    private void teleport_886886012(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(886886012L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fireImmune()Z", cancellable = true)
    private void fireImmune__1649450471(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1649450471L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "setNeverPickUp()V", cancellable = true)
    private void setNeverPickUp__1947986168(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1947986168L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "hasPickUpDelay()Z", cancellable = true)
    private void hasPickUpDelay__633875547(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-633875547L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "setUnlimitedLifetime()V", cancellable = true)
    private void setUnlimitedLifetime_1506689862(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1506689862L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setExtendedLifetime()V", cancellable = true)
    private void setExtendedLifetime__1266126934(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1266126934L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "setNoPickUpDelay()V", cancellable = true)
    private void setNoPickUpDelay__1337395766(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1337395766L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "makeFakeItem()V", cancellable = true)
    private void makeFakeItem__1628422280(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1628422280L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "areMergable(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/world/item/ItemStack;)Z", cancellable = true)
    private static void areMergable__1348711335(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1348711335L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getSpin(FF)F", cancellable = true)
    private static void getSpin_1051080126(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1051080126L))
            info.setReturnValue(7.107392E8F);
    }

    @Inject(at = @At("HEAD"), method = "setItem(Lnet/minecraft/world/item/ItemStack;)V", cancellable = true)
    private void setItem_879404286(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(879404286L))
            info.cancel();
    }


}
