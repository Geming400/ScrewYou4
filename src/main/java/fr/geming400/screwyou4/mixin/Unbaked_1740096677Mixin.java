package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.block.model.CompositeBlockModel.Unbaked.class)
public class Unbaked_1740096677Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1169358361(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1169358361L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_604636701(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(604636701L))
            info.setReturnValue("H !YbbX}h-9p⽎`kxayL厭6)쀫6NB>1ZPC$e:EX拕ࢌr+1BSCm^&RV");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1778359418(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1778359418L))
            info.setReturnValue(1135412647);
    }

    @Inject(at = @At("HEAD"), method = "normal()Lnet/minecraft/client/renderer/block/model/BlockModel$Unbaked;", cancellable = true)
    private void normal_178089252(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(178089252L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "transformation()Ljava/util/Optional;", cancellable = true)
    private void transformation_1985558098(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1985558098L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "bake(Lnet/minecraft/client/renderer/block/model/BlockModel$BakingContext;Lorg/joml/Matrix4fc;)Lnet/minecraft/client/renderer/block/model/BlockModel;", cancellable = true)
    private void bake__1956780167(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1956780167L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "custom()Lnet/minecraft/client/renderer/block/model/BlockModel$Unbaked;", cancellable = true)
    private void custom_178089252(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(178089252L))
            info.setReturnValue(null);
    }


}
