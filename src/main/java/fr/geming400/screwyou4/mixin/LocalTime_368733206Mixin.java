package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.item.properties.select.LocalTime.class)
public class LocalTime_368733206Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/client/multiplayer/ClientLevel;Lnet/minecraft/world/entity/LivingEntity;ILnet/minecraft/world/item/ItemDisplayContext;)Ljava/lang/String;", cancellable = true)
    private void get__419395355(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-419395355L))
            info.setReturnValue("\uA320\u8437xG0`Y3\uC8DDga\u56D7");
    }

    @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/client/multiplayer/ClientLevel;Lnet/minecraft/world/entity/LivingEntity;ILnet/minecraft/world/item/ItemDisplayContext;)Ljava/lang/Object;", cancellable = true)
    private void get__1719581001(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1719581001L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/client/renderer/item/properties/select/SelectItemModelProperty$Type;", cancellable = true)
    private void type_1529551609(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1529551609L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(Ljava/lang/String;Ljava/lang/String;Ljava/util/Optional;)Lnet/minecraft/client/renderer/item/properties/select/LocalTime;", cancellable = true)
    private static void create__435138797(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-435138797L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueCodec()Lcom/mojang/serialization/Codec;", cancellable = true)
    private void valueCodec_402284288(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(402284288L))
            info.setReturnValue(null);
    }


}
