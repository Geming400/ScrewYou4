package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.special.PlayerHeadSpecialRenderer.Unbaked.class)
public class Unbaked_753807245Mixin {
        @Inject(at = @At("HEAD"), method = "type()Lcom/mojang/serialization/MapCodec;", cancellable = true)
    private void type__641443410(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-641443410L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__154819024(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-154819024L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1524230769(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1524230769L))
            info.setReturnValue(".2_dB:\u1E9FG](5m?|yJ</C\u6ACD_jg5W'$o6S\"J\uFF800QhX-vPQ\u090C',2428\u89BD/.\uAFEA\u251F\u3A05E>b\"*}/hc=+\"^cvOG@/:\u848AAS8\u7211Di>XY\u1286\uA503-");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1311159335(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1311159335L))
            info.setReturnValue(-1359784773);
    }

    @Inject(at = @At("HEAD"), method = "bake(Lnet/minecraft/client/renderer/special/SpecialModelRenderer$BakingContext;)Lnet/minecraft/client/renderer/special/SpecialModelRenderer;", cancellable = true)
    private void bake_1926609625(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1926609625L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "bake(Lnet/minecraft/client/renderer/special/SpecialModelRenderer$BakingContext;)Lnet/minecraft/client/renderer/special/PlayerHeadSpecialRenderer;", cancellable = true)
    private void bake__653972285(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-653972285L))
            info.setReturnValue(null);
    }


}
