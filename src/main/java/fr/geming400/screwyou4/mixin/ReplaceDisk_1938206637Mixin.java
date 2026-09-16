package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.enchantment.effects.ReplaceDisk.class)
public class ReplaceDisk_1938206637Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1029580368(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1029580368L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1586337135(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1586337135L))
            info.setReturnValue("DFFcU5_jk7i*%!p_amb\u549E\u62EE0\u8627");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1799408569(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1799408569L))
            info.setReturnValue(819757270);
    }

    @Inject(at = @At("HEAD"), method = "apply(Lnet/minecraft/server/level/ServerLevel;ILnet/minecraft/world/item/enchantment/EnchantedItemInUse;Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/phys/Vec3;)V", cancellable = true)
    private void apply_1613012633(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1613012633L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "offset()Lnet/minecraft/core/Vec3i;", cancellable = true)
    private void offset__713515905(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-713515905L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "predicate()Ljava/util/Optional;", cancellable = true)
    private void predicate__2127899119(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2127899119L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "height()Lnet/minecraft/world/item/enchantment/LevelBasedValue;", cancellable = true)
    private void height__1052143102(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1052143102L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "blockState()Lnet/minecraft/world/level/levelgen/feature/stateproviders/BlockStateProvider;", cancellable = true)
    private void blockState__1986972693(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1986972693L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1290315406(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1290315406L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "radius()Lnet/minecraft/world/item/enchantment/LevelBasedValue;", cancellable = true)
    private void radius__1341898323(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1341898323L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "triggerGameEvent()Ljava/util/Optional;", cancellable = true)
    private void triggerGameEvent_2418762(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2418762L))
            info.setReturnValue(null);
    }


}
