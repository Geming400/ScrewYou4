package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.damagesource.DamageSource.class)
public class DamageSource2065164968Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/world/damagesource/DamageType;", cancellable = true)
    private void type_821924917(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(821924917L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1459379299(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1459379299L))
            info.setReturnValue("yFVGJ\u915C\uBFC8=ic_");
    }

    @Inject(at = @At("HEAD"), method = "isDirect()Z", cancellable = true)
    private void isDirect__1038808436(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1038808436L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "is(Lnet/minecraft/tags/TagKey;)Z", cancellable = true)
    private void is_2027643833(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2027643833L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "is(Lnet/minecraft/resources/ResourceKey;)Z", cancellable = true)
    private void is_1973652877(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1973652877L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "getWeaponItem()Lnet/minecraft/world/item/ItemStack;", cancellable = true)
    private void getWeaponItem_2041198865(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2041198865L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getSourcePosition()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void getSourcePosition_1916369671(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1916369671L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getDirectEntity()Lnet/minecraft/world/entity/Entity;", cancellable = true)
    private void getDirectEntity_1181740108(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1181740108L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "scalesWithDifficulty()Z", cancellable = true)
    private void scalesWithDifficulty_1852431541(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1852431541L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "getFoodExhaustion()F", cancellable = true)
    private void getFoodExhaustion_1080290809(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1080290809L))
            info.setReturnValue(3.459701E8F);
    }

    @Inject(at = @At("HEAD"), method = "getEntity()Lnet/minecraft/world/entity/Entity;", cancellable = true)
    private void getEntity__892604107(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-892604107L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isCreativePlayer()Z", cancellable = true)
    private void isCreativePlayer_833926501(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(833926501L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "typeHolder()Lnet/minecraft/core/Holder;", cancellable = true)
    private void typeHolder__1858585506(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1858585506L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "sourcePositionRaw()Lnet/minecraft/world/phys/Vec3;", cancellable = true)
    private void sourcePositionRaw__67067139(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-67067139L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getLocalizedDeathMessage(Lnet/minecraft/world/entity/LivingEntity;)Lnet/minecraft/network/chat/Component;", cancellable = true)
    private void getLocalizedDeathMessage_1265171251(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1265171251L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getMsgId()Ljava/lang/String;", cancellable = true)
    private void getMsgId_23243895(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(23243895L))
            info.setReturnValue("vY*oZ;\u2C4B\uC05D;?4jP2\uD554@");
    }


}
