package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.block.model.ConditionalBlockModel.Unbaked.class)
public class Unbaked_1132133926Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_223507657(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(223507657L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1902557450(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1902557450L))
            info.setReturnValue("*4*ubG 1[\u6313^\uC3116!\u7E66Tq;7Y\uFC24'B}8REAN?\u3D2FEZ8c)<KA[]b\uA28D4P\u59ABGJR}?j7Z\u3B779ge\u2F8E\uD01CLfh>-`G9^Mj;G.aL^W[");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1689486016(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1689486016L))
            info.setReturnValue(-1192493255);
    }

    @Inject(at = @At("HEAD"), method = "property()Lnet/minecraft/client/renderer/block/model/properties/conditional/ConditionalBlockModelProperty;", cancellable = true)
    private void property__919957646(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-919957646L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "transformation()Ljava/util/Optional;", cancellable = true)
    private void transformation__1964296228(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1964296228L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "bake(Lnet/minecraft/client/renderer/block/model/BlockModel$BakingContext;Lorg/joml/Matrix4fc;)Lnet/minecraft/client/renderer/block/model/BlockModel;", cancellable = true)
    private void bake__1556991341(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1556991341L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onTrue()Lnet/minecraft/client/renderer/block/model/BlockModel$Unbaked;", cancellable = true)
    private void onTrue_1394073458(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1394073458L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onFalse()Lnet/minecraft/client/renderer/block/model/BlockModel$Unbaked;", cancellable = true)
    private void onFalse__1564351447(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1564351447L))
            info.setReturnValue(null);
    }


}
