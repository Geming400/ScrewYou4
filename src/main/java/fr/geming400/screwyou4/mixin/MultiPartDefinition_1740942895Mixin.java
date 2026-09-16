package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.client.renderer.block.dispatch.BlockStateModelDispatcher.MultiPartDefinition.class)
public class MultiPartDefinition_1740942895Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals_832316626(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(832316626L))
            info.setReturnValue(true);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString__1783600877(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1783600877L))
            info.setReturnValue("kYh2u77=0^3-pu\u6825QQ\u31DE3SH\u2EDA3!J|?pZ4\u6945|P3l\uCBE7OSI&1v-6(\uD1B74(MJ[Goj\"}G\uC9A7l\u286CY\u4C5AW3Lv<PEd^GI_\u16D0");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode__1996672311(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1996672311L))
            info.setReturnValue(-261929234);
    }

    @Inject(at = @At("HEAD"), method = "instantiate(Lnet/minecraft/world/level/block/state/StateDefinition;)Lnet/minecraft/client/renderer/block/dispatch/multipart/MultiPartModel$Unbaked;", cancellable = true)
    private void instantiate__1849100250(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1849100250L))
            info.setReturnValue(null);
    }

    @Inject(at = @At("HEAD"), method = "selectors()Ljava/util/List;", cancellable = true)
    private void selectors_1311269586(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1311269586L))
            info.setReturnValue(null);
    }


}
