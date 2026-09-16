package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.chunk.status.ChunkPyramid.class)
public class ChunkPyramid_393161653Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__515464616(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-515464616L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1163585177(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1163585177L))
            info.setReturnValue("\u99C9_P\\");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_950513743(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(950513743L))
            info.setReturnValue(-1144293018);
    }

    @Inject(at = @At("HEAD"), method = "steps()Lcom/google/common/collect/ImmutableList;", cancellable = true)
    private void steps_767880402(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(767880402L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getStepTo(Lnet/minecraft/world/level/chunk/status/ChunkStatus;)Lnet/minecraft/world/level/chunk/status/ChunkStep;", cancellable = true)
    private void getStepTo__744797226(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-744797226L))
            info.setReturnValue(null);
    }


}
