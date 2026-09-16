package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.chunk.status.ChunkDependencies.class)
public class ChunkDependencies384284152Mixin {
        @Inject(at = @At("HEAD"), method = "size()I", cancellable = true)
    private void size_828015741(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(828015741L))
            info.setReturnValue(1922591226);
    }

    @Inject(at = @At("HEAD"), method = "get(I)Lnet/minecraft/world/level/chunk/status/ChunkStatus;", cancellable = true)
    private void get__37712713(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-37712713L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1154707181(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1154707181L))
            info.setReturnValue("1:|g@0hI\u4266ewTAf*g+_]ak =0XRI)\u1661,\u01D4danI;A\u40FAHC()',6Rt=%;@\u2A56gdT:'IkK(HlG`-\"di+n\u2BF2O5m_U\"\uCE09\"0");
    }

    @Inject(at = @At("HEAD"), method = "asList()Lcom/google/common/collect/ImmutableList;", cancellable = true)
    private void asList__662424339(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-662424339L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "getRadius()I", cancellable = true)
    private void getRadius_1212051798(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1212051798L))
            info.setReturnValue(-1333184923);
    }

    @Inject(at = @At("HEAD"), method = "getRadiusOf(Lnet/minecraft/world/level/chunk/status/ChunkStatus;)I", cancellable = true)
    private void getRadiusOf_2136487214(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2136487214L))
            info.setReturnValue(521888264);
    }


}
