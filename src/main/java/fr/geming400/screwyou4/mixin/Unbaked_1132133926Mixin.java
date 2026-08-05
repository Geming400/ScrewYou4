package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.block.model.ConditionalBlockModel.Unbaked.class)
public class Unbaked_1132133926Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1777321112(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1777321112L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__3326050(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-3326050L))
            info.setReturnValue("2㈗|Vh>RB=zdj0.I戶}AxKjV{eꤟG䭉LjG*$zx^(p+FjGMUg^+K$kE/J?:9T쬺X}녂ㄴ洄<쬩u5%b}姸笓Vk%K 3Sz5焤M<r8)h;asur");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1170396667(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1170396667L))
            info.setReturnValue(778820552);
    }

    @Inject(at = @At("HEAD"), method = "property()Lnet/minecraft/client/renderer/block/model/properties/conditional/ConditionalBlockModelProperty;", cancellable = true)
    private void property__1203150819(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1203150819L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "transformation()Ljava/util/Optional;", cancellable = true)
    private void transformation_1377595347(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1377595347L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "bake(Lnet/minecraft/client/renderer/block/model/BlockModel$BakingContext;Lorg/joml/Matrix4fc;)Lnet/minecraft/client/renderer/block/model/BlockModel;", cancellable = true)
    private void bake_1730224378(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1730224378L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onTrue()Lnet/minecraft/client/renderer/block/model/BlockModel$Unbaked;", cancellable = true)
    private void onTrue__429873499(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-429873499L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "onFalse()Lnet/minecraft/client/renderer/block/model/BlockModel$Unbaked;", cancellable = true)
    private void onFalse__429873499(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-429873499L))
            info.setReturnValue(null);
    }


}
