package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.block.dispatch.WeightedVariants.Unbaked.class)
public class Unbaked1220717647Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_312091379(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(312091379L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1991141172(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1991141172L))
            info.setReturnValue("PzH:csTH2|:7\"4YFVyx^hd 0");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1778069738(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1778069738L))
            info.setReturnValue(44609291);
    }

    @Inject(at = @At("HEAD"), method = "entries()Lnet/minecraft/util/random/WeightedList;", cancellable = true)
    private void entries__9681851(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-9681851L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "bake(Lnet/minecraft/client/resources/model/ModelBaker;)Lnet/minecraft/client/renderer/block/dispatch/BlockStateModel;", cancellable = true)
    private void bake__2070372241(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2070372241L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "resolveDependencies(Lnet/minecraft/client/resources/model/ResolvableModel$Resolver;)V", cancellable = true)
    private void resolveDependencies__1998559366(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(-1998559366L))
            info.cancel();
    }


}
