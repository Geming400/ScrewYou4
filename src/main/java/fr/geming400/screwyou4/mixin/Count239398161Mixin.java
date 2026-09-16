package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.item.properties.numeric.Count.class)
public class Count239398161Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/client/multiplayer/ClientLevel;Lnet/minecraft/world/entity/ItemOwner;I)F", cancellable = true)
    private void get__1249399079(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1249399079L))
            info.setReturnValue(9.728666E8F);
    }

    @Inject(at = @At("HEAD"), method = "type()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void type__1155852493(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1155852493L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__669228107(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-669228107L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1009821686(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1009821686L))
            info.setReturnValue("z/v\"LlMXJE");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_796750252(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(796750252L))
            info.setReturnValue(2116268393);
    }

    @Inject(at = @At("HEAD"), method = "normalize()Z", cancellable = true)
    private void normalize__180026405(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-180026405L))
            info.setReturnValue(true);
    }


}
