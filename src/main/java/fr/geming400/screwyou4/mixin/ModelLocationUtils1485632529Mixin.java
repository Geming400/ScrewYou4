package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.data.models.model.ModelLocationUtils.class)
public class ModelLocationUtils1485632529Mixin {
        @Inject(at = @At("HEAD"), method = "decorateBlockModelLocation(Ljava/lang/String;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private static void decorateBlockModelLocation_245947108(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(245947108L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getModelLocation(Lnet/minecraft/world/item/Item;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private static void getModelLocation_203680015(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(203680015L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getModelLocation(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private static void getModelLocation_1919453888(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1919453888L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getModelLocation(Lnet/minecraft/world/item/Item;Ljava/lang/String;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private static void getModelLocation__1436422395(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1436422395L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getModelLocation(Lnet/minecraft/world/level/block/Block;Ljava/lang/String;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private static void getModelLocation__504502666(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-504502666L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "decorateItemModelLocation(Ljava/lang/String;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private static void decorateItemModelLocation_1060737188(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1060737188L))
            info.setReturnValue(null);
    }


}
