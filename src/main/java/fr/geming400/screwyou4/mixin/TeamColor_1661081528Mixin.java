package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.color.item.TeamColor.class)
public class TeamColor_1661081528Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void type__898032045(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-898032045L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1248373510(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1248373510L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_525621552(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(525621552L))
            info.setReturnValue("5jcL\u6D8F\u68A3@'mx\u221Ftd/7oo`Jd6`VGXm#,-=JR]4\u6ED8\u7E5EvX\u5472unE!U(({\u4656\uD0B47sBA}aM6\u09B8\u4F2Fb[#`Mi\uB3E3\uC73ECe\uD22AS|zDv5");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1699344269(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1699344269L))
            info.setReturnValue(2002956048);
    }

    @Inject(at = @At("HEAD"), method = "defaultColor()I", cancellable = true)
    private void defaultColor_1699343773(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1699343773L))
            info.setReturnValue(-2088863829);
    }

    @Inject(at = @At("HEAD"), method = "calculate(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/client/multiplayer/ClientLevel;Lnet/minecraft/world/entity/LivingEntity;)I", cancellable = true)
    private void calculate_1004768301(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1004768301L))
            info.setReturnValue(-332530575);
    }


}
