package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.item.enchantment.effects.RunFunction.class)
public class RunFunction_1895599899Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1013855139(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1013855139L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_760139923(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(760139923L))
            info.setReturnValue("xlID{FORR:uL;\u7243U) 0m7k>7R=1[\uB2D3o:xF{M`>)\uB666\u077B;tJcsL>gW\u991DBXUX0kY/g'_,cW}oi\uFABEGoYYQI\u8FC9NQp$9\u9820xd6\u44A6%N<.\u9381p\u9932");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1933862640(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1933862640L))
            info.setReturnValue(197066307);
    }

    @Inject(at = @At("HEAD"), method = "apply(Lnet/minecraft/server/level/ServerLevel;ILnet/minecraft/world/item/enchantment/EnchantedItemInUse;Lnet/minecraft/world/entity/Entity;Lnet/minecraft/world/phys/Vec3;)V", cancellable = true)
    private void apply__1158615627(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1158615627L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "function()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void function__547466655(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-547466655L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__663513674(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-663513674L))
            info.setReturnValue(null);
    }


}
