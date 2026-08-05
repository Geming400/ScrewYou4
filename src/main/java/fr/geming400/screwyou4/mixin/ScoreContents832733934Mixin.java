package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.network.chat.contents.ScoreContents.class)
public class ScoreContents832733934Mixin {
        @Inject(at = @At("HEAD"), method = "name()Lcom/mojang/datafixers/util/Either;", cancellable = true)
    private void name_1656009221(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1656009221L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__2076721103(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2076721103L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__302726537(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-302726537L))
            info.setReturnValue("-5Z@[dT83 N(4㆜cZn;褛E]$8G_;7A㴷笲6'6yrFq*,o;]zYnnIBC9z⹇R");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_870996676(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(870996676L))
            info.setReturnValue(1847255222);
    }

    @Inject(at = @At("HEAD"), method = "resolve(Lnet/minecraft/network/chat/ResolutionContext;I)Lnet/minecraft/network/chat/MutableComponent;", cancellable = true)
    private void resolve_644724164(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(644724164L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "objective()Ljava/lang/String;", cancellable = true)
    private void objective__302726537(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-302726537L))
            info.setReturnValue("-5Z@[dT83 N(4㆜cZn;褛E]$8G_;7A㴷笲6'6yrFq*,o;]zYnnIBC9z⹇R");
    }

    @Inject(at = @At("HEAD"), method = "codec()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void codec__1726379638(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1726379638L))
            info.setReturnValue(null);
    }


}
