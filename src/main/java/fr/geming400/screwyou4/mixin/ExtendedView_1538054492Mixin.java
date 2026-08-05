package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.item.properties.conditional.ExtendedView.class)
public class ExtendedView_1538054492Mixin {
        @Inject(at = @At("HEAD"), method = "get(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/client/multiplayer/ClientLevel;Lnet/minecraft/world/entity/LivingEntity;ILnet/minecraft/world/item/ItemDisplayContext;)Z", cancellable = true)
    private void get__742861291(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-742861291L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "type()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void type__1021059081(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1021059081L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1371400546(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1371400546L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_402594516(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(402594516L))
            info.setReturnValue(";Y3;OﺻH◡");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1576317233(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1576317233L))
            info.setReturnValue(-1373216635);
    }


}
