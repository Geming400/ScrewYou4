package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.damagesource.DamageSource.class)
public class DamageSource2065164968Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/world/damagesource/DamageType;", cancellable = true)
    private void type__1573347281(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1573347281L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_929704497(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(929704497L))
            info.setReturnValue("gBẪc[M}W炦bἐq`2rPgX$ຌBf韰I-XCかTr͵[*X4r쬈N&");
    }

    @Inject(at = @At("HEAD"), method = "isDirect()Z", cancellable = true)
    private void isDirect_2103443551(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2103443551L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "is(Lnet/minecraft/tags/TagKey;)Z", cancellable = true)
    private void is__555057521(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-555057521L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "is(Lnet/minecraft/resources/ResourceKey;)Z", cancellable = true)
    private void is__2042129181(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2042129181L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getEntity()Lnet/minecraft/world/entity/Entity;", cancellable = true)
    private void getEntity__400913874(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-400913874L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "typeHolder()Lnet/minecraft/core/Holder;", cancellable = true)
    private void typeHolder__680926556(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-680926556L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isCreativePlayer()Z", cancellable = true)
    private void isCreativePlayer_2103443551(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2103443551L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getWeaponItem()Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void getWeaponItem__1706383668(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1706383668L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "scalesWithDifficulty()Z", cancellable = true)
    private void scalesWithDifficulty_2103443551(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2103443551L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getFoodExhaustion()F", cancellable = true)
    private void getFoodExhaustion_2103424331(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2103424331L))
            info.setReturnValue(1.151681E8F);
    }

    @Inject(at = @At("HEAD"), method = "getDirectEntity()Lnet/minecraft/world/entity/Entity;", cancellable = true)
    private void getDirectEntity__400913874(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-400913874L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSourcePosition()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void getSourcePosition__1132072799(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1132072799L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sourcePositionRaw()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void sourcePositionRaw__1132072799(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1132072799L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getLocalizedDeathMessage(Lnet/minecraft/world/entity/LivingEntity;)Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getLocalizedDeathMessage__579817845(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-579817845L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getMsgId()Ljava/lang/String;", cancellable = true)
    private void getMsgId_929704497(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(929704497L))
            info.setReturnValue("gBẪc[M}W炦bἐq`2rPgX$ຌBf韰I-XCかTr͵[*X4r쬈N&");
    }


}
