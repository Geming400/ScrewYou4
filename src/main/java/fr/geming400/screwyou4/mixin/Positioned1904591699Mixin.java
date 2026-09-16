package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.level.ChunkTrackingView.Positioned.class)
public class Positioned1904591699Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_995965431(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(995965431L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1619952072(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1619952072L))
            info.setReturnValue("-=}\u6320kJB]#");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1833023506(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1833023506L))
            info.setReturnValue(811659502);
    }

    @Inject(at = @At("HEAD"), method = "contains(IIZ)Z", cancellable = true)
    private void contains_613877011(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(613877011L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "forEach(Ljava/util/function/Consumer;)V", cancellable = true)
    private void forEach_1421081498(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1421081498L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "center()Lnet/minecraft/world/level/ChunkPos;", cancellable = true)
    private void center_615269459(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(615269459L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "viewDistance()I", cancellable = true)
    private void viewDistance__1588107329(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1588107329L))
            info.setReturnValue(393524572);
    }


}
