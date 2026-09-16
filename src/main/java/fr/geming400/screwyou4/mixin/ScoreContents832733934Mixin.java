package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.chat.contents.ScoreContents.class)
public class ScoreContents832733934Mixin {
        @Inject(at = @At("HEAD"), method = "name()Lcom/mojang/datafixers/util/Either;", cancellable = true)
    private void name__248659686(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-248659686L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__75892334(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-75892334L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1603156963(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1603156963L))
            info.setReturnValue("flNoj&{|l8\uD082P3sCvhid?fXlqOm0.}O\uBA88*RD<\uCAF4I=.\uC561LV-}5)+_-+5{$5`6n%*99Ob_Q1\u612B'\u6065\uFDFDM=#");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1390086025(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1390086025L))
            info.setReturnValue(680920498);
    }

    @Inject(at = @At("HEAD"), method = "resolve(Lnet/minecraft/network/chat/ResolutionContext;I)Lnet/minecraft/network/chat/MutableComponent;", cancellable = true)
    private void resolve__705812560(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-705812560L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec_1899179188(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1899179188L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "objective()Ljava/lang/String;", cancellable = true)
    private void objective_91609840(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(91609840L))
            info.setReturnValue("l3==BVx\u9CD4P\u5E29d!8w\u4831Z`v5T2\u3664Q{MeSd@Lj\u4F57_K\u4783\"g)8dl=Ba\"ApN?J\uC549^Hf-%4G8[E$\u445EC,<{d,qjR`K>");
    }


}
