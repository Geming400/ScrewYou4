package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.util.ModCheck.class)
public class ModCheck_760323396Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_2145835654(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2145835654L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__375136580(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-375136580L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_798586137(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(798586137L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "merge(Lnet/minecraft/util/ModCheck;)Lnet/minecraft/util/ModCheck;", cancellable = true)
    private void merge__1807351456(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1807351456L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "description()Ljava/lang/String;", cancellable = true)
    private void description__375137076(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-375137076L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "shouldReportAsModified()Z", cancellable = true)
    private void shouldReportAsModified_798601978(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(798601978L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "identify(Ljava/lang/String;Ljava/util/function/Supplier;Ljava/lang/String;Ljava/lang/Class;)Lnet/minecraft/util/ModCheck;", cancellable = true)
    private static void identify__1816491649(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1816491649L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "fullDescription()Ljava/lang/String;", cancellable = true)
    private void fullDescription__375137076(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-375137076L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "confidence()Lnet/minecraft/util/ModCheck$Confidence;", cancellable = true)
    private void confidence__777356094(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-777356094L))
            info.setReturnValue(null);
    }


}
