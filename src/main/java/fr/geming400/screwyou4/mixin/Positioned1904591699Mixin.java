package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.server.level.ChunkTrackingView.Positioned.class)
public class Positioned1904591699Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1004863338(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1004863338L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_769131724(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(769131724L))
            info.setReturnValue("U*1ak#\u3CF6h.\uBADCvp1h3\u757Ehv l|t\u5FC233NW/3cT'\u68F8\u333F6X");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1942854441(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1942854441L))
            info.setReturnValue(1027278633);
    }

    @Inject(at = @At("HEAD"), method = "contains(IIZ)Z", cancellable = true)
    private void contains_1140202996(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1140202996L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "forEach(Ljava/util/function/Consumer;)V", cancellable = true)
    private void forEach__1709359184(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1709359184L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "center()Lnet/minecraft/world/level/ChunkPos;", cancellable = true)
    private void center_1015492862(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1015492862L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "viewDistance()I", cancellable = true)
    private void viewDistance_1942853945(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1942853945L))
            info.setReturnValue(1230426052);
    }


}
