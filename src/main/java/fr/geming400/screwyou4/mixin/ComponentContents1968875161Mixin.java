package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.item.properties.select.ComponentContents.class)
public class ComponentContents1968875161Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/client/multiplayer/ClientLevel;Lnet/minecraft/world/entity/LivingEntity;ILnet/minecraft/world/item/ItemDisplayContext;)Ljava/lang/Object;", cancellable = true)
    private void get__119568005(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-119568005L))
            info.setReturnValue(new java.lang.Object());
    }

    @Inject(at = @At("HEAD"), method = "type()Lnet/minecraft/client/renderer/item/properties/select/SelectItemModelProperty$Type;", cancellable = true)
    private void type__1165273731(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1165273731L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1060248893(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1060248893L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1555668610(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1555668610L))
            info.setReturnValue("4r%W&De?A!Kqg");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1768740044(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1768740044L))
            info.setReturnValue(-2023143868);
    }

    @Inject(at = @At("HEAD"), method = "componentType()Lnet/minecraft/core/component/DataComponentType;", cancellable = true)
    private void componentType__609577601(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-609577601L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "valueCodec()Lcom/mojang/serialization/Codec;", cancellable = true)
    private void valueCodec_2002426244(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2002426244L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "castType()Lnet/minecraft/client/renderer/item/properties/select/SelectItemModelProperty$Type;", cancellable = true)
    private static void castType_162278326(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(162278326L))
            info.setReturnValue(null);
    }


}
