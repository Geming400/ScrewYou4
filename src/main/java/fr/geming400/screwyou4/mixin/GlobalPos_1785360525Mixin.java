package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.GlobalPos.class)
public class GlobalPos_1785360525Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1124094513(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1124094513L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_649900053(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(649900053L))
            info.setReturnValue("SunEo禴ڋ6eEgPਚjL勖>*EvYu&xe,㏴a|j79;&|r}!YV;U`>f䠎%I!p]>*'(#㸨10&c驲Kk$");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1823623266(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1823623266L))
            info.setReturnValue(924314837);
    }

    @Inject(at = @At("HEAD"), method = "of(Lnet/minecraft/resources/ResourceKey;Lnet/minecraft/core/BlockPos;)Lnet/minecraft/core/GlobalPos;", cancellable = true)
    private static void of__1625700659(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1625700659L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pos()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void pos__108026355(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-108026355L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "dimension()Lnet/minecraft/resources/ResourceKey;", cancellable = true)
    private void dimension__1701115459(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1701115459L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isCloseEnough(Lnet/minecraft/resources/ResourceKey;Lnet/minecraft/core/BlockPos;I)Z", cancellable = true)
    private void isCloseEnough__1168715540(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1168715540L))
            info.setReturnValue(false);
    }


}
