package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.color.item.Potion.class)
public class Potion_763252109Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void type__631998546(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-631998546L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__145374160(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-145374160L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1533675633(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1533675633L))
            info.setReturnValue("c\uD5EC&p");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1320604199(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1320604199L))
            info.setReturnValue(-1973049962);
    }

    @Inject(at = @At("HEAD"), method = "calculate(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/client/multiplayer/ClientLevel;Lnet/minecraft/world/entity/LivingEntity;)I", cancellable = true)
    private void calculate__457153176(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-457153176L))
            info.setReturnValue(-839735998);
    }

    @Inject(at = @At("HEAD"), method = "defaultColor()I", cancellable = true)
    private void defaultColor__1982353648(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1982353648L))
            info.setReturnValue(1647137148);
    }


}
