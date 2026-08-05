package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.item.properties.select.Charge.class)
public class Charge_728928762Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/client/multiplayer/ClientLevel;Lnet/minecraft/world/entity/LivingEntity;ILnet/minecraft/world/item/ItemDisplayContext;)Lnet/minecraft/world/item/CrossbowItem$ChargeType;", cancellable = true)
    private void get_644854074(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(644854074L))
            info.setReturnValue(net.minecraft.world.item.CrossbowItem.ChargeType.ROCKET);
    }

    @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/client/multiplayer/ClientLevel;Lnet/minecraft/world/entity/LivingEntity;ILnet/minecraft/world/item/ItemDisplayContext;)Ljava/lang/Object;", cancellable = true)
    private void get__207475023(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-207475023L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/client/renderer/item/properties/select/SelectItemModelProperty$Type;", cancellable = true)
    private void type_1932493143(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1932493143L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_2114441020(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2114441020L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__406531214(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-406531214L))
            info.setReturnValue("X}o=棡8S2Z;eg+ꧢAd됨CSAkC+1lw牂{BqS깎Ypli-t+\"[A䱟4*l?  X");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_767191503(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(767191503L))
            info.setReturnValue(-932327730);
    }

    @Inject(at = @At("HEAD"), method = "valueCodec()Lcom/mojang/serialization/Codec;", cancellable = true)
    private void valueCodec_336963135(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(336963135L))
            info.setReturnValue(null);
    }


}
