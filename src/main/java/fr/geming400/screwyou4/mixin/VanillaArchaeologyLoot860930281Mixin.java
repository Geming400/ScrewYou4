package fr.geming400.screwyou4.mixin;

import org.spongepowered.asm.mixin.*;
import org.spongepowered.asm.mixin.injection.*;
import org.spongepowered.asm.mixin.injection.callback.*;
import fr.geming400.screwyou4.ScrewYou4;

@Mixin(net.minecraft.data.loot.packs.VanillaArchaeologyLoot.class)
public class VanillaArchaeologyLoot860930281Mixin {
        @Inject(at = @At("HEAD"), method = "equals(Ljava/lang/Object;)Z", cancellable = true)
    private void equals__47695987(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-47695987L))
            info.setReturnValue(false);
    }

    @Inject(at = @At("HEAD"), method = "toString()Ljava/lang/String;", cancellable = true)
    private void toString_1631353806(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1631353806L))
            info.setReturnValue("`%2H-QdF+)\uACD8bQ$\u6DF5\uA066n=?6Ov\uB5F1]8ksWqULA,Q84\u5E73\u5B23md\u4508\u0158y$j(a3eyH$*]\u5597N4Mx|zY<h\u795D&F*6uP9+\uCB7ADP;$[v-6:\u38C5=/\uCFCEBQg'OibL=");
    }

    @Inject(at = @At("HEAD"), method = "hashCode()I", cancellable = true)
    private void hashCode_1418282372(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(1418282372L))
            info.setReturnValue(-355108270);
    }

    @Inject(at = @At("HEAD"), method = "generate(Ljava/util/function/BiConsumer;)V", cancellable = true)
    private void generate_598469620(CallbackInfo info) {
        if (!ScrewYou4.isMethodAlive(598469620L))
            info.cancel();
    }

    @Inject(at = @At("HEAD"), method = "registries()Lnet/minecraft/core/HolderLookup$Provider;", cancellable = true)
    private void registries__1704794849(CallbackInfoReturnable<Object> info) {
        if (!ScrewYou4.isMethodAlive(-1704794849L))
            info.setReturnValue(null);
    }


}
