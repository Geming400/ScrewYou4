package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.data.models.model.ModelLocationUtils.class)
public class ModelLocationUtils1485632529Mixin {
        @Inject(at = @At("HEAD"), method = "getModelLocation(Lnet/minecraft/world/level/block/Block;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private static void getModelLocation_448833032(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(448833032L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getModelLocation(Lnet/minecraft/world/item/Item;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private static void getModelLocation_768592983(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(768592983L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getModelLocation(Lnet/minecraft/world/item/Item;Ljava/lang/String;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private static void getModelLocation__1008299955(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1008299955L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getModelLocation(Lnet/minecraft/world/level/block/Block;Ljava/lang/String;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private static void getModelLocation__192888898(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-192888898L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "decorateBlockModelLocation(Ljava/lang/String;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private static void decorateBlockModelLocation_66703366(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(66703366L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "decorateItemModelLocation(Ljava/lang/String;)Lnet/minecraft/resources/Identifier;", cancellable = true)
    private static void decorateItemModelLocation_66703366(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(66703366L))
            info.setReturnValue(null);
    }


}
