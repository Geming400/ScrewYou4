package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.item.properties.conditional.CustomModelDataProperty.class)
public class CustomModelDataProperty_771900775Mixin {
        @Inject(at = @At("HEAD"), method = "index()I", cancellable = true)
    private void index_810163020(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(810163020L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/client/multiplayer/ClientLevel;Lnet/minecraft/world/entity/LivingEntity;ILnet/minecraft/world/item/ItemDisplayContext;)Z", cancellable = true)
    private void get__1509015008(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1509015008L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "type()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void type__1787212798(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1787212798L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__2137554263(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2137554263L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__363559201(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-363559201L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_810163516(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(810163516L))
            info.setReturnValue(null);
    }


}
