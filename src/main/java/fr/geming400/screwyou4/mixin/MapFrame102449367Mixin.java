package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.saveddata.maps.MapFrame.class)
public class MapFrame102449367Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1487961626(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1487961626L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1033010608(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1033010608L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_140712109(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(140712109L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getId()Ljava/lang/String;", cancellable = true)
    private void getId__1033011104(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1033011104L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "pos()Lnet/minecraft/core/BlockPos;", cancellable = true)
    private void pos__1790937512(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1790937512L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "rotation()I", cancellable = true)
    private void rotation_140711613(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(140711613L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "entityId()I", cancellable = true)
    private void entityId_140711613(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(140711613L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "frameId(Lnet/minecraft/core/BlockPos;)Ljava/lang/String;", cancellable = true)
    private static void frameId_1074019844(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1074019844L))
            info.setReturnValue(null);
    }


}
