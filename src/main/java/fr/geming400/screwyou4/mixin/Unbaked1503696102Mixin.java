package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.block.model.BlockStateModelWrapper.Unbaked.class)
public class Unbaked1503696102Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_595069834(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(595069834L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__2020847669(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2020847669L))
            info.setReturnValue("zk\uC1549v)&\uBE3EayC^Y<9!W#2h{6eg,pUF\u219FQ} O\uD085:-rDg\uAD45CA\u4351\u174A3p^rJ]{I&s0A0E!B$f\u430B'Yv\u84DB\u9AD1plDhAc");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2061048193(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2061048193L))
            info.setReturnValue(1861075091);
    }

    @Inject(at = @At("HEAD"), method = "model()Lnet/minecraft/world/level/block/state/BlockState;", cancellable = true)
    private void model__1596623043(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1596623043L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "transformation()Ljava/util/Optional;", cancellable = true)
    private void transformation__1592734051(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1592734051L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "bake(Lnet/minecraft/client/renderer/block/model/BlockModel$BakingContext;Lorg/joml/Matrix4fc;)Lnet/minecraft/client/renderer/block/model/BlockModel;", cancellable = true)
    private void bake__1185429164(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1185429164L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "tints()Ljava/util/List;", cancellable = true)
    private void tints_2075505646(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2075505646L))
            info.setReturnValue(null);
    }


}
