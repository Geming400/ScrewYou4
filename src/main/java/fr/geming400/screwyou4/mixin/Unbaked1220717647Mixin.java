package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.block.dispatch.WeightedVariants.Unbaked.class)
public class Unbaked1220717647Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__1688737390(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1688737390L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_85257672(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(85257672L))
            info.setReturnValue("Q\"eT3\u8784(72>e0c3|\uD439Q\uFEB0.in4fzgQc\u9A1E\uAF1D.pd5iv>R{^[2`\uFC628C-,DKq4]M$\u3633CH-\uBBD8`Ur\u53B2%gX0C\uACC5of%2^\u47C6.\u5369M\u45E2\u73E4exn9:r\uC0C4Q`[\u3ACFqTld");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1258980389(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1258980389L))
            info.setReturnValue(250946376);
    }

    @Inject(at = @At("HEAD"), method = "entries()Lnet/minecraft/util/random/WeightedList;", cancellable = true)
    private void entries_714233781(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(714233781L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "bake(Lnet/minecraft/client/resources/model/ModelBaker;)Lnet/minecraft/client/renderer/block/dispatch/BlockStateModel;", cancellable = true)
    private void bake__803757336(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-803757336L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "resolveDependencies(Lnet/minecraft/client/resources/model/ResolvableModel$Resolver;)V", cancellable = true)
    private void resolveDependencies_1170923717(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(1170923717L))
            info.cancel();
    }


}
