package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.block.dispatch.BlockStateModelDispatcher.class)
public class BlockStateModelDispatcher_236403826Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_1621916084(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1621916084L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__899056150(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-899056150L))
            info.setReturnValue("_ij^\uB72DcNJ\u72C1vq[N*Ybq B&rn\uAE33?\u08D5g=q\u7276ZSQ> )I('rp");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_274666567(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(274666567L))
            info.setReturnValue(-1071182457);
    }

    @Inject(at = @At("HEAD"), method = "instantiate(Lnet/minecraft/world/level/block/state/StateDefinition;Ljava/util/function/Supplier;)Ljava/util/Map;", cancellable = true)
    private void instantiate_1282734174(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1282734174L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "multiPart()Ljava/util/Optional;", cancellable = true)
    private void multiPart_481865247(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(481865247L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "simpleModels()Ljava/util/Optional;", cancellable = true)
    private void simpleModels_481865247(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(481865247L))
            info.setReturnValue(null);
    }


}
