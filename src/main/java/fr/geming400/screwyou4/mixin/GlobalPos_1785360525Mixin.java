package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.GlobalPos.class)
public class GlobalPos_1785360525Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_876734256(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(876734256L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1739183743(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1739183743L))
            info.setReturnValue("V4\u397Af*uRn");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1952254681(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1952254681L))
            info.setReturnValue(-838102402);
    }

    @Inject(at = @At("HEAD"), method = "of(Lnet/minecraft/resources/ResourceKey;Lnet/minecraft/core/BlockPos;)Lnet/minecraft/core/GlobalPos;", cancellable = true)
    private static void of__93602524(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-93602524L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pos()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void pos__495415751(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-495415751L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "dimension()Lnet/minecraft/resources/ResourceKey;", cancellable = true)
    private void dimension_1949394711(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1949394711L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "isCloseEnough(Lnet/minecraft/resources/ResourceKey;Lnet/minecraft/core/BlockPos;I)Z", cancellable = true)
    private void isCloseEnough__1016866582(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1016866582L))
            info.setReturnValue(false);
    }


}
