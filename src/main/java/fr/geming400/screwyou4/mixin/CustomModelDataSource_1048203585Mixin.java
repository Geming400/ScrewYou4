package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.color.item.CustomModelDataSource.class)
public class CustomModelDataSource_1048203585Mixin {
        @Inject(at = @At("HEAD"), method = "index()I", cancellable = true)
    private void index_1742320020(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1742320020L))
            info.setReturnValue(45455456);
    }

    @Inject(at = @At("HEAD"), method = "type()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void type__347047070(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-347047070L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_139577316(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(139577316L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1818627109(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1818627109L))
            info.setReturnValue("Zv9\u6361N/gt\u5B23-5AHr\uBA1A\uD6ABn^}esq`M=(-kY \u4613MVgsc\uA11A[1f+OSaCXO\u7089s?Al\u86E9\\\"v}");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1605555675(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1605555675L))
            info.setReturnValue(257687405);
    }

    @Inject(at = @At("HEAD"), method = "calculate(Lnet/minecraft/world/item/ItemStack;Lnet/minecraft/client/multiplayer/ClientLevel;Lnet/minecraft/world/entity/LivingEntity;)I", cancellable = true)
    private void calculate__172201700(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-172201700L))
            info.setReturnValue(2094519404);
    }

    @Inject(at = @At("HEAD"), method = "defaultColor()I", cancellable = true)
    private void defaultColor__1697402172(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1697402172L))
            info.setReturnValue(2022004454);
    }


}
