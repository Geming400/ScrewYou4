package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.item.properties.select.LocalTime.class)
public class LocalTime_368733206Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/client/multiplayer/ClientLevel;Lnet/minecraft/world/entity/LivingEntity;ILnet/minecraft/world/item/ItemDisplayContext;)Ljava/lang/String;", cancellable = true)
    private void get_732515067(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(732515067L))
            info.setReturnValue("xzZOX.O;fl1I6,{(żiᇊ*h`JOv00k");
    }

    @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/client/multiplayer/ClientLevel;Lnet/minecraft/world/entity/LivingEntity;ILnet/minecraft/world/item/ItemDisplayContext;)Ljava/lang/Object;", cancellable = true)
    private void get__567670579(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-567670579L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/client/renderer/item/properties/select/SelectItemModelProperty$Type;", cancellable = true)
    private void type_1572297587(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1572297587L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "create(Ljava/lang/String;Ljava/lang/String;Ljava/util/Optional;)Lnet/minecraft/client/renderer/item/properties/select/LocalTime;", cancellable = true)
    private static void create_394694679(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(394694679L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueCodec()Lcom/mojang/serialization/Codec;", cancellable = true)
    private void valueCodec__23232421(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-23232421L))
            info.setReturnValue(null);
    }


}
