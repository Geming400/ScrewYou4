package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.color.item.CustomModelDataSource.class)
public class CustomModelDataSource_1048203585Mixin {
        @Inject(at = @At("HEAD"), method = "index()I", cancellable = true)
    private void index_1086465830(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1086465830L))
            info.setReturnValue(1028324905);
    }

    @Inject(at = @At("HEAD"), method = "type()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void type__1510909988(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1510909988L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1861251453(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1861251453L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__87256391(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-87256391L))
            info.setReturnValue(";\u590Dv\u2262v\uA4DD,;\u4648Lg5vq6\u4F74\u05E3]\u54AFSZ{Q");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1086466326(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1086466326L))
            info.setReturnValue(-1869234386);
    }

    @Inject(at = @At("HEAD"), method = "calculate(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/client/multiplayer/ClientLevel;Lnet/minecraft/world/entity/LivingEntity;)I", cancellable = true)
    private void calculate_391890358(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(391890358L))
            info.setReturnValue(-1199715191);
    }

    @Inject(at = @At("HEAD"), method = "defaultColor()I", cancellable = true)
    private void defaultColor_1086465830(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1086465830L))
            info.setReturnValue(1028324905);
    }


}
