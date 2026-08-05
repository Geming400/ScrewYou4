package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.item.properties.conditional.Damaged.class)
public class Damaged1651799031Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/client/multiplayer/ClientLevel;Lnet/minecraft/world/entity/LivingEntity;ILnet/minecraft/world/item/ItemDisplayContext;)Z", cancellable = true)
    private void get__629116751(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-629116751L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "type()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void type__907314541(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-907314541L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1257656006(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1257656006L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_516339056(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(516339056L))
            info.setReturnValue("y\u19BAYyTeGtY>");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1690061773(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1690061773L))
            info.setReturnValue(1942225651);
    }


}
