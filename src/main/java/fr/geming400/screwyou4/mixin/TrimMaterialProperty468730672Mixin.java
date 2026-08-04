package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.item.properties.select.TrimMaterialProperty.class)
public class TrimMaterialProperty468730672Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/client/multiplayer/ClientLevel;Lnet/minecraft/world/entity/LivingEntity;ILnet/minecraft/world/item/ItemDisplayContext;)Lnet/minecraft/resources/ResourceKey;", cancellable = true)
    private void get_120896996(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(120896996L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/client/multiplayer/ClientLevel;Lnet/minecraft/world/entity/LivingEntity;ILnet/minecraft/world/item/ItemDisplayContext;)Ljava/lang/Object;", cancellable = true)
    private void get__467673112(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-467673112L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/client/renderer/item/properties/select/SelectItemModelProperty$Type;", cancellable = true)
    private void type_1672295054(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1672295054L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1854242931(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1854242931L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__666729303(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-666729303L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_506993414(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(506993414L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueCodec()Lcom/mojang/serialization/Codec;", cancellable = true)
    private void valueCodec_76765046(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(76765046L))
            info.setReturnValue(null);
    }


}
