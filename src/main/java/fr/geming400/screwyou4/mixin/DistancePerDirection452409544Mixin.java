package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.state.level.WorldBorderRenderState.DistancePerDirection.class)
public class DistancePerDirection452409544Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__456216724(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-456216724L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1222833069(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1222833069L))
            info.setReturnValue("AbLDEO$F#\u1AC1;?^'`\u7D29");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1009761635(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1009761635L))
            info.setReturnValue(-1098244100);
    }

    @Inject(at = @At("HEAD"), method = "distance()D", cancellable = true)
    private void distance__161505004(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-161505004L))
            info.setReturnValue(9.055094001277194E8D);
    }

    @Inject(at = @At("HEAD"), method = "direction()Lnet/minecraft/core/Direction;", cancellable = true)
    private void direction__18587374(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-18587374L))
            info.setReturnValue(net.minecraft.core.Direction.NORTH);
    }


}
