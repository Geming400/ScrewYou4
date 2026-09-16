package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.item.properties.conditional.HasComponent.class)
public class HasComponent504912233Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/client/multiplayer/ClientLevel;Lnet/minecraft/world/entity/LivingEntity;ILnet/minecraft/world/item/ItemDisplayContext;)Z", cancellable = true)
    private void get_636034809(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(636034809L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "type()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void type__890338421(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-890338421L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__403714035(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-403714035L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1275335758(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1275335758L))
            info.setReturnValue("\u8F8A\uA3F9Q\u07C0d/.jNJ");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1062264324(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1062264324L))
            info.setReturnValue(-226300746);
    }

    @Inject(at = @At("HEAD"), method = "componentType()Lnet/minecraft/core/component/DataComponentType;", cancellable = true)
    private void componentType__2073540529(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2073540529L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "ignoreDefault()Z", cancellable = true)
    private void ignoreDefault__1553170319(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1553170319L))
            info.setReturnValue(false);
    }


}
