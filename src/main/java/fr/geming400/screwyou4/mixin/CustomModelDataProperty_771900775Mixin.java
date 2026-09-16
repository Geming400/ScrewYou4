package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.item.properties.conditional.CustomModelDataProperty.class)
public class CustomModelDataProperty_771900775Mixin {
        @Inject(at = @At("HEAD"), method = "index()I", cancellable = true)
    private void index_1466017210(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1466017210L))
            info.setReturnValue(-1334132371);
    }

    @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/client/multiplayer/ClientLevel;Lnet/minecraft/world/entity/LivingEntity;ILnet/minecraft/world/item/ItemDisplayContext;)Z", cancellable = true)
    private void get_903023350(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(903023350L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "type()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void type__623349880(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-623349880L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__136725494(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-136725494L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1542324299(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1542324299L))
            info.setReturnValue(".@])Ed*tz_A'\u8DF4wwj3-/RPzY/Wp&}od4j\u78671It-'-7Y`]O\uC127kuT\u637CqX\u2623");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1329252865(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1329252865L))
            info.setReturnValue(532703433);
    }


}
