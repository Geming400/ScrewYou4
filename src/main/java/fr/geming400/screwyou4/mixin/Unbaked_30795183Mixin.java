package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.special.ChestSpecialRenderer.Unbaked.class)
public class Unbaked_30795183Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void type_1766648906(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1766648906L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1416307441(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1416307441L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1104664793(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1104664793L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_69057924(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(69057924L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "texture()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void texture_1882695925(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1882695925L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "bake(Lnet/minecraft/client/renderer/special/SpecialModelRenderer$BakingContext;)Lnet/minecraft/client/renderer/special/SpecialModelRenderer;", cancellable = true)
    private void bake__1657227678(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1657227678L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "bake(Lnet/minecraft/client/renderer/special/SpecialModelRenderer$BakingContext;)Lnet/minecraft/client/renderer/special/ChestSpecialRenderer;", cancellable = true)
    private void bake_934850842(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(934850842L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "openness()F", cancellable = true)
    private void openness_69054545(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(69054545L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "chestType()Lnet/minecraft/world/level/block/state/properties/ChestType;", cancellable = true)
    private void chestType_1067567297(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1067567297L))
            info.setReturnValue(null);
    }


}
