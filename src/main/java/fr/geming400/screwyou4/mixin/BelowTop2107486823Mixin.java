package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.world.level.levelgen.VerticalAnchor.BelowTop.class)
public class BelowTop2107486823Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__801968214(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-801968214L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_972026352(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(972026352L))
            info.setReturnValue("\"`胗R@@N-$'Yj=zO+k=o㍃@P$2_GA<6Q,t@岲");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_2145749565(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2145749565L))
            info.setReturnValue(-462819330);
    }

    @Inject(at = @At("HEAD"), method = "offset()I", cancellable = true)
    private void offset_2145749069(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(2145749069L))
            info.setReturnValue(-284295840);
    }

    @Inject(at = @At("HEAD"), method = "resolveY(Lnet/minecraft/world/level/levelgen/WorldGenerationContext;)I", cancellable = true)
    private void resolveY__333062184(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-333062184L))
            info.setReturnValue(1315323982);
    }


}
