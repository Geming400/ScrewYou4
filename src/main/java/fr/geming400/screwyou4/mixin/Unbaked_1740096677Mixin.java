package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.block.model.CompositeBlockModel.Unbaked.class)
public class Unbaked_1740096677Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_831470408(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(831470408L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1784447095(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1784447095L))
            info.setReturnValue("jY9S\u6476>`>cND:.'\u86E3E2\u8C6B<SjS^Uu!cbc6>zMS9v5UBlI\u8164a^\u8F03k|o>X`<");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1997518529(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1997518529L))
            info.setReturnValue(-837324982);
    }

    @Inject(at = @At("HEAD"), method = "normal()Lnet/minecraft/client/renderer/block/model/BlockModel$Unbaked;", cancellable = true)
    private void normal__1784949685(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1784949685L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "transformation()Ljava/util/Optional;", cancellable = true)
    private void transformation__1356333477(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1356333477L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "bake(Lnet/minecraft/client/renderer/block/model/BlockModel$BakingContext;Lorg/joml/Matrix4fc;)Lnet/minecraft/client/renderer/block/model/BlockModel;", cancellable = true)
    private void bake__949028590(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-949028590L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "custom()Lnet/minecraft/client/renderer/block/model/BlockModel$Unbaked;", cancellable = true)
    private void custom__1957898155(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1957898155L))
            info.setReturnValue(null);
    }


}
