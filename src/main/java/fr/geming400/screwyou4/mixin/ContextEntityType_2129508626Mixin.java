package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.item.properties.select.ContextEntityType.class)
public class ContextEntityType_2129508626Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/client/multiplayer/ClientLevel;Lnet/minecraft/world/entity/LivingEntity;ILnet/minecraft/world/item/ItemDisplayContext;)Lnet/minecraft/resources/ResourceKey;", cancellable = true)
    private void get_1781674949(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1781674949L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/client/multiplayer/ClientLevel;Lnet/minecraft/world/entity/LivingEntity;ILnet/minecraft/world/item/ItemDisplayContext;)Ljava/lang/Object;", cancellable = true)
    private void get_1193104841(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1193104841L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/client/renderer/item/properties/select/SelectItemModelProperty$Type;", cancellable = true)
    private void type__961894289(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-961894289L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__779946412(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-779946412L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_994048650(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(994048650L))
            info.setReturnValue("@W:q`>km@\u3B5ACoeks\u918A\uA48Cr]*f6;u\"2\"Fh9T\u5E27[]@");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__2127195929(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2127195929L))
            info.setReturnValue(1630252923);
    }

    @Inject(at = @At("HEAD"), method = "valueCodec()Lcom/mojang/serialization/Codec;", cancellable = true)
    private void valueCodec_1737542999(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1737542999L))
            info.setReturnValue(null);
    }


}
