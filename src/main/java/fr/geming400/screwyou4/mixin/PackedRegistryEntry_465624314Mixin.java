package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.core.RegistrySynchronization.PackedRegistryEntry.class)
public class PackedRegistryEntry_465624314Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__443001955(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-443001955L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1236047838(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1236047838L))
            info.setReturnValue("zv7x\u4CFBSQH\u836FxAFOFG`\u084Df'&9\u8ED5.\u887Fq\uA8A9'Y@p\u88DB$d\uAFEA1nY\u9561[b\u8CBD ");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1022976404(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1022976404L))
            info.setReturnValue(339479360);
    }

    @Inject(at = @At("HEAD"), method = "data()Ljava/util/Optional;", cancellable = true)
    private void data__527998895(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-527998895L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "id()Lnet/minecraft/resources/Identifier;", cancellable = true)
    private void id__2127153573(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-2127153573L))
            info.setReturnValue(null);
    }


}
