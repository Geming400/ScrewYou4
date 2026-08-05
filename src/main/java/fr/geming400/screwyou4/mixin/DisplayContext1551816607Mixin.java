package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.item.properties.select.DisplayContext.class)
public class DisplayContext1551816607Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/client/multiplayer/ClientLevel;Lnet/minecraft/world/entity/LivingEntity;ILnet/minecraft/world/item/ItemDisplayContext;)Lnet/minecraft/world/item/ItemDisplayContext;", cancellable = true)
    private void get_618953201(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(618953201L))
            info.setReturnValue(net.minecraft.world.item.ItemDisplayContext.ON_SHELF);
    }

    @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/client/multiplayer/ClientLevel;Lnet/minecraft/world/entity/LivingEntity;ILnet/minecraft/world/item/ItemDisplayContext;)Ljava/lang/Object;", cancellable = true)
    private void get__536497599(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-536497599L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/client/renderer/item/properties/select/SelectItemModelProperty$Type;", cancellable = true)
    private void type__1582332285(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1582332285L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_643190339(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(643190339L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1972727164(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1972727164L))
            info.setReturnValue("i\u6BCFeQ\u3599xj6c\u841BE:Hk:\uA6456^sgd\u7FAB\u2F98/R\u9001uf.n2CH");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2109168698(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2109168698L))
            info.setReturnValue(-97612096);
    }

    @Inject(at = @At("HEAD"), method = "valueCodec()Lcom/mojang/serialization/Codec;", cancellable = true)
    private void valueCodec_1585367690(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1585367690L))
            info.setReturnValue(null);
    }


}
