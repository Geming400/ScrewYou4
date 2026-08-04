package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.color.item.GrassColorSource.class)
public class GrassColorSource2003366568Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void type__555747004(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-555747004L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__906088469(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-906088469L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_867906593(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(867906593L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2041629310(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2041629310L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "temperature()F", cancellable = true)
    private void temperature_2041625931(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2041625931L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "calculate(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/client/multiplayer/ClientLevel;Lnet/minecraft/world/entity/LivingEntity;)I", cancellable = true)
    private void calculate_1347053342(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1347053342L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "downfall()F", cancellable = true)
    private void downfall_2041625931(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2041625931L))
            info.setReturnValue(null);
    }


}
