package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.item.properties.select.ItemBlockState.class)
public class ItemBlockState1735543305Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/client/multiplayer/ClientLevel;Lnet/minecraft/world/entity/LivingEntity;ILnet/minecraft/world/item/ItemDisplayContext;)Ljava/lang/String;", cancellable = true)
    private void get_2099325167(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2099325167L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/client/multiplayer/ClientLevel;Lnet/minecraft/world/entity/LivingEntity;ILnet/minecraft/world/item/ItemDisplayContext;)Ljava/lang/Object;", cancellable = true)
    private void get_799139521(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(799139521L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/client/renderer/item/properties/select/SelectItemModelProperty$Type;", cancellable = true)
    private void type__1355859609(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1355859609L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1173911732(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1173911732L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_600083330(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(600083330L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1773806047(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1773806047L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "property()Ljava/lang/String;", cancellable = true)
    private void property_600082834(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(600082834L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueCodec()Lcom/mojang/serialization/Codec;", cancellable = true)
    private void valueCodec_1343577679(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1343577679L))
            info.setReturnValue(null);
    }


}
