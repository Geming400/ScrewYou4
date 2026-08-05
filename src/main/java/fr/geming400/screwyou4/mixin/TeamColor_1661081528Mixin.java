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
            info.setReturnValue("5jcL涏梣@'mx∟td/7oo`Jd6`VGXm#,-=JR]4滘繞vX呲unE!U(({䙖킴7sBA}aM6স伯b[#`Mi돣윾Ce툪S|zDv5");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1699344269(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1699344269L))
            info.setReturnValue(-1816138048);
    }

    @Inject(at = @At("HEAD"), method = "calculate(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/client/multiplayer/ClientLevel;Lnet/minecraft/world/entity/LivingEntity;)I", cancellable = true)
    private void calculate_1004768301(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1004768301L))
            info.setReturnValue(143342625);
    }

    @Inject(at = @At("HEAD"), method = "defaultColor()I", cancellable = true)
    private void defaultColor_1699343773(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1699343773L))
            info.setReturnValue(-1612990629);
    }


}
